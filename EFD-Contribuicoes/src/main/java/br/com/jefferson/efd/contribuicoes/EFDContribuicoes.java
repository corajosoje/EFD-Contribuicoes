/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.com.jefferson.efd.contribuicoes;//.EFDContribuicoes

import br.com.jefferson.efd.contribuicoes.exceptions.LeitorException;
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
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class EFDContribuicoes {

    static {
        System.setProperty("log4j2.configurationFile", "./config/log4j2.xml");
    }
    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(EFDContribuicoes.class.getName());
    private static Leitor leitor;

    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                log.debug("Detectado " + args.length + " Argumento(s) na inicializacao");
                if (args[0].equals("0")) {
                    JPAConfiguration.createEntityManagerFactory().close();
                    System.out.println("exit");
                    System.exit(0);
                }

                File file = new File(args[0]);
                if (!file.isDirectory()) {
                    throw new LeitorException("O primeiro argumento deve ser uma pasta");
                }

                String separator = File.separator;
                log.debug("Filtrando arquivos Sped");
                File arquivos[] = file.listFiles(ObjectFactory.getSpedFileFilter());
                log.info("Listado(s) " + arquivos.length + " arquivos");
                if (arquivos.length > 0) {
                    for (File arquivo : arquivos) {
                        try {
                            log.info("Processando arquivo: " + arquivo.getName());
                            leitor = new Leitor(arquivo);
                            if (args[1].equals("1")) {
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
                                log.info("Movendo arquivo: " + arquivo.getName());
                                Path path = Paths.get(arquivo.getAbsolutePath());

                                try {
                                    File pasta = new File(path.getParent().toString() + separator + "importado");

                                    if (!pasta.exists()) {
                                        pasta.mkdir();
                                    }
                                    Files.move(path,
                                            Paths.get(path.getParent().toString() + separator + "importado" + separator + path.getFileName()),
                                            java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                                    log.info("Processamento do arquivo finalizado");

                                } catch (Exception ex) {
                                    log.error("Não foi possivel mover arquivo: " + arquivo.getName() + " " + ex.getMessage(), ex);
                                }
                            } else if (args[1].equals("2")) {
                                log.info("Abrindo arquivo, quantidade de linhas: " + leitor.getLinhas());
                                processarArquivo(leitor);
                                //log.info("Iniciando gerador de Scripts");
                                ToSqlScript gerar = new ToSqlScript(leitor.getSped());
                                File destino = null;
                                if (args.length == 2 || args[2] == null) {
                                    destino = new File(arquivo.getPath().replace(".txt", ".sql"));
                                } else {
                                    destino = new File(args[2] + separator + arquivo.getName().replace(".txt", ".sql"));
                                }
                                gerar.gerarScript(destino);
                                log.info("Script sql gerado com sucesso");

                            } else {
                                throw new LeitorException("Funcao não implementada");
                            }
                        } catch (IOException | ScriptException ex) {
                            log.error("Não foi possivel processar arquivo: " + arquivo.getName(), ex);
                        }
                    }
                } else {
                    log.warn("Nenhum arquivo Sped encontrado");
                }

            } else {
                System.out.println("Nenhum Frame implementado");
                System.out.println("Função 0 - Gerar tabelas no banco de dados ");
                System.out.println("Função 1 - Processamento para banco de dados (Pasta com arquivos sped) 1");
                System.out.println("Funcao 2 - Gerar script SQL (Pasta com arquivos sped) 2 [pasta destino]");

            }
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
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
