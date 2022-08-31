package br.com.jefferson.efd.util;//Util

import br.com.jefferson.efd.exception.LeitorExeption;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class Util {

    private static final Logger log = LogManager.getLogger(Util.class.getName());

    public static String getHash(File arquivo) {
        log.trace("Gerando hash");
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");

            InputStream is = new FileInputStream(arquivo);
            byte[] buffer = new byte[8192];
            int read = 0;
            while ((read = is.read(buffer)) > 0) {
                digest.update(buffer, 0, read);
            }
            byte[] md5sum = digest.digest();
            BigInteger bigInt = new BigInteger(1, md5sum);
            String output = bigInt.toString(16);
            log.trace("MD5: " + output);
            try {
                is.close();
            } catch (IOException e) {
                //throw new RuntimeException("Unable to close input stream for MD5 calculation", e);
            }
            log.debug("Hash Code gerado: " + output);
            return output;
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new LeitorExeption("Unable to process file for MD5", e);
        }
    }

    public static boolean verificarArquivoSped(File fileTxt) {
        log.debug("Iniciando verificação dos arquivos que são SPED");
        try {
            log.debug("Verificando arquivo: " + fileTxt.getAbsolutePath());
            String fistLine = Files.readAllLines(Paths.get(fileTxt.getAbsolutePath()), StandardCharsets.ISO_8859_1).get(0);
            if (fistLine == null || fistLine.length() < 7) {
                return false;
            } else if (!fistLine.substring(0, 1).equals("|")
                    || !fistLine.substring(5, 6).equals("|")
                    || !fistLine.substring(fistLine.length() - 1).equals("|")) {
                return false;
            } else {
                return true;
            }
        } catch (IOException ex) {
            throw new LeitorExeption("Não foi possivel fazer verificação do arquivo SPED", ex);
        }

    }
}
