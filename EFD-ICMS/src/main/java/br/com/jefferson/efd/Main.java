package br.com.jefferson.efd;//Main

import br.com.jefferson.efd.exception.ScriptExeption;
import br.com.jefferson.efd.processamento.Leitor;
import br.com.jefferson.efd.processamento.ToSqlScript;
import br.com.jefferson.efd.util.ObjectFactory;
import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class Main {

    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(Main.class.getName());
    private static Leitor leitor;

    public static void main(String args[]) {

        if (args.length > 0) {
            log.debug("Detectado " + args.length + " Argumento(s) na inicializacao");
            File file = new File(args[0]);

            if (file.isDirectory()) {
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
                                if (args[2] == null) {
                                    destino = new File(arquivo.getPath().replace(".txt", ".sql"));
                                } else {
                                    destino = new File(args[2] + separator + arquivo.getName().replace(".txt", ".sql"));
                                }
                                gerar.gerarScript(destino);
                                log.info("Script sql gerado com sucesso");

                            }
                        } catch (IOException | ScriptExeption ex) {
                            log.error("Não foi possivel processar arquivo: " + arquivo.getName(), ex);
                        }
                    }
                } else {
                    log.warn("Nenhum arquivo Sped encontrado");
                }
            } else {
                log.warn("Não é um diretório passado no argumento");
            }

        } else {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainFrame().setVisible(true);
                }
            });
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
