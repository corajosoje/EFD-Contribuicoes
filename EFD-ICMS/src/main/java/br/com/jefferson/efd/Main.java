package br.com.jefferson.efd;//Main

import br.com.jefferson.efd.processamento.Leitor;
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

    public static void main(String args[]) {

        if (args.length > 0) {
            File file = new File(args[0]);

            if (file.isDirectory()) {
                File arquivos[] = file.listFiles(ObjectFactory.getSpedFileFilter());
                if (arquivos.length > 0) {
                    for (File arquivo : arquivos) {
                        try {
                            log.info("Processando arquivo: " + arquivo.getName());
                            Leitor.processarArquivo(arquivo);
                            log.debug("Movendo arquivo: " + arquivo.getName());
                            Path path = Paths.get(arquivo.getAbsolutePath());
                            try {
                                Files.move(path,
                                        Paths.get(path.getParent().toString() + "\\importado\\" + path.getFileName()),
                                        java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                                log.info("Processando do arquivo finalizado");
                            } catch (Exception ex) {
                                log.error("Não foi possivel mover arquivo: " + arquivo.getName(), ex);
                            }
                        } catch (IOException ex) {
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

}
