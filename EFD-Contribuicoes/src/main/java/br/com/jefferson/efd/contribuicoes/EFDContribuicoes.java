/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.com.jefferson.efd.contribuicoes;//.EFDContribuicoes

import br.com.jefferson.efd.contribuicoes.exceptions.ScriptException;
import br.com.jefferson.efd.contribuicoes.processamento.Leitor;
import br.com.jefferson.efd.contribuicoes.processamento.ToSqlScript;
import br.com.jefferson.efd.contribuicoes.util.JPAConfiguration;
import br.com.jefferson.efd.contribuicoes.util.ObjectFactory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.logging.log4j.LogManager;

/**
 * @version 2.0
 * @author Jefferson Oliveira
 */
public class EFDContribuicoes {

    static {
        System.setProperty("log4j2.configurationFile", "./config/log4j2.xml");
    }
    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(EFDContribuicoes.class.getName());
    private static Leitor leitor;
    private static String separator = File.separator;

    public static void main(String args[]) {
        try {
            if (args.length > 0) {

                log.debug("Detectado " + args.length + " Argumento(s) na inicializacao");

                switch (args[0]) {
                    case "0":
                        JPAConfiguration.createEntityManagerFactory().close();
                        System.out.println("exit");
                        System.exit(0);
                        break;
                    case "1":
                        if (args.length > 1) {
                            if (args[1] == null || args[1].isBlank()) {
                                System.out.println("Segundo parametro é obrigatório");
                            } else {
                                gravarSPEDBanco(args[1]);
                            }
                        } else {
                            System.out.println("Segundo parametro é obrigatório");
                        }
                        break;
                    case "2":
                        if (args.length > 1) {
                            if (args[1] == null || args[1].isBlank()) {
                                System.out.println("Segundo parametro é obrigatório");
                            } else {
                                if (args.length > 2) {
                                    if (args[2] == null || args[2].isBlank() || args[1].equals(args[2])) {
                                        gerarScritSQL(args[1]);
                                    } else {
                                        gerarScritSQL(args[1], args[2]);
                                    }
                                } else {
                                    gerarScritSQL(args[1]);
                                }

                            }
                        } else {
                            System.out.println("Segundo parametro é obrigatório");
                        }
                        break;
                    default:
                        System.out.println("Nenhum Frame implementado");
                        System.out.println("Função 0 - Gerar tabelas no banco de dados ");
                        System.out.println("Função 1 - Processamento para banco de dados - 1;Pasta com arquivos SPED");
                        System.out.println("Funcao 2 - Gerar script SQL - 2;Pasta com arquivos sped;[pasta destino]");
                }

            } else {
                System.out.println("Nenhum Frame implementado");
                System.out.println("Função 0 - Gerar tabelas no banco de dados ");
                System.out.println("Função 1 - Processamento para banco de dados - 1;Pasta com arquivos SPED");
                System.out.println("Funcao 2 - Gerar script SQL - 2;Pasta com arquivos sped;[pasta destino]");

            }
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }

    private static void gerarScritSQL(String folder, String fileDestino) throws ScriptException {

        File file = new File(folder);
        File destino = new File(fileDestino);

        if (!file.exists()) {
            throw new ScriptException("Pasta origem não existe");
        }
        if (!file.isDirectory()) {
            throw new ScriptException("Parametro origem não é uma pasta");
        }
        if (!file.canRead()) {
            throw new ScriptException("Não é possivel Ler na pasta origem");
        }
        if (!destino.exists()) {
            throw new ScriptException("Pasta destino não existe");
        }
        if (!destino.isDirectory()) {
            throw new ScriptException("Parametro destino não é uma pasta");
        }
        if (!destino.canWrite()) {
            throw new ScriptException("Não é possivel escrever na pasta destino");
        }

        log.debug("Filtrando arquivos Sped");
        File arquivos[] = file.listFiles(ObjectFactory.getSpedFileFilter());
        log.info("Listado(s) " + arquivos.length + " arquivos");
        if (arquivos.length > 0) {
            for (File arquivoSPED : arquivos) {
                try {
                    log.info("Processando arquivo: " + arquivoSPED.getName());
                    leitor = new Leitor(arquivoSPED);

                    log.info("Abrindo arquivo, quantidade de linhas: " + leitor.getLinhas());
                    processarArquivo(leitor);
                    //log.info("Iniciando gerador de Scripts");
                    ToSqlScript gerar = new ToSqlScript(leitor.getSped());

                    gerar.gerarScript(new File(fileDestino + separator + arquivoSPED.getName().replace(".txt", ".sql")));
                    log.info("Script sql gerado com sucesso");

                    try {
                        log.info("Movendo arquivo: " + arquivoSPED.getName());
                        moverArquivoProcessado(arquivoSPED);
                    } catch (Exception ex) {
                        log.warn("Não foi possivel mover arquivo: " + arquivoSPED.getName() + " " + ex.getMessage(), ex);
                    }
                } catch (IOException | ScriptException ex) {
                    log.error("Não foi possivel processar arquivo: " + arquivoSPED.getName(), ex);
                }
            }
        } else {
            log.warn("Nenhum arquivo Sped encontrado");
        }

    }

    private static void gerarScritSQL(String folder) throws ScriptException {

        File file = new File(folder);

        if (!file.exists()) {
            throw new ScriptException("Pasta origem não existe");
        }
        if (!file.isDirectory()) {
            throw new ScriptException("Parametro origem não é uma pasta");
        }
        if (!file.canRead()) {
            throw new ScriptException("Não é possivel Ler na pasta origem");
        }

        log.debug("Filtrando arquivos Sped");
        File arquivos[] = file.listFiles(ObjectFactory.getSpedFileFilter());
        log.info("Listado(s) " + arquivos.length + " arquivos");
        if (arquivos.length > 0) {
            for (File arquivoSPED : arquivos) {
                try {
                    log.info("Processando arquivo: " + arquivoSPED.getName());
                    leitor = new Leitor(arquivoSPED);

                    log.info("Abrindo arquivo, quantidade de linhas: " + leitor.getLinhas());
                    processarArquivo(leitor);
                    //log.info("Iniciando gerador de Scripts");
                    ToSqlScript gerar = new ToSqlScript(leitor.getSped());

                    gerar.gerarScript(new File(folder + separator + "sql" + separator + arquivoSPED.getName().replace(".txt", ".sql")));
                    log.info("Script sql gerado com sucesso");

                    try {
                        log.info("Movendo arquivo: " + arquivoSPED.getName());
                        moverArquivoProcessado(arquivoSPED);
                    } catch (Exception ex) {
                        log.warn("Não foi possivel mover arquivo: " + arquivoSPED.getName() + " " + ex.getMessage(), ex);
                    }
                } catch (IOException | ScriptException ex) {
                    log.error("Não foi possivel processar arquivo: " + arquivoSPED.getName(), ex);
                }
            }
        } else {
            log.warn("Nenhum arquivo Sped encontrado");
        }

    }

    private static void gravarSPEDBanco(String folder) throws ScriptException {
        File file = new File(folder);
        if (!file.exists()) {
            throw new ScriptException("Pasta origem não existe");
        }
        if (!file.isDirectory()) {
            throw new ScriptException("Parametro origem não é uma pasta");
        }
        if (!file.canRead()) {
            throw new ScriptException("Não é possivel Ler na pasta origem");
        }
        log.debug("Filtrando arquivos Sped");
        File arquivos[] = file.listFiles(ObjectFactory.getSpedFileFilter());
        log.info("Listado(s) " + arquivos.length + " arquivos");
        if (arquivos.length > 0) {
            for (File arquivo : arquivos) {
                try {
                    log.info("Processando arquivo: " + arquivo.getName());
                    leitor = new Leitor(arquivo);

                    // Processamento para banco de dados
                    if (!leitor.verificarDuplicidade()) {
                        log.info("Arquivo nao duplicado, quantidade de linhas: " + leitor.getLinhas());
                        processarArquivo(leitor);
                        log.info("Gravando Arquivo ...");
                        leitor.gravar();
                        log.info("Gravacao finalizada!");
                    } else {
                        log.info("Arquivo Duplicado");
                    }

                    leitor.close();
                    //fim do processamento

                    try {
                        log.info("Movendo arquivo: " + arquivo.getName());
                        moverArquivoProcessado(arquivo);
                    } catch (Exception ex) {
                        log.warn("Não foi possivel mover arquivo: " + arquivo.getName() + " " + ex.getMessage(), ex);
                    }
                    log.info("Processamento do arquivo finalizado");
                } catch (IOException ex) {
                    log.error("Não foi possivel processar arquivo: " + arquivo.getName(), ex);
                }
            }
        } else {
            log.warn("Nenhum arquivo Sped encontrado");
        }

    }

    private static void moverArquivoProcessado(File arquivoSped) throws IOException {
        Path path = Paths.get(arquivoSped.getAbsolutePath());
        File pasta = new File(path.getParent().toString() + separator + "processado");

        if (!pasta.exists()) {
            pasta.mkdir();
        }
        Files.move(path,
                Paths.get(path.getParent().toString() + separator + "processado" + separator + path.getFileName()),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }

    private static void processarArquivo(Leitor leitor) throws IOException {
        for (int i = 0; i < leitor.getLinhas(); i++) {
            String conteudo = leitor.getlinha();

            if (conteudo == null) {
            } else if (Leitor.verificaLinhaSped(conteudo)) {
                log.trace("Linha: " + (i + 1) + " - Registro: " + conteudo);
                leitor.processarLinha(conteudo, (i + 1));
            }

        }
    }
}
