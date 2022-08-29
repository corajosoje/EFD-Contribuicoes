package teste.br.com.jefferson.efd.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author 88717
 */
public class Gethash {

    public static void main(String[] args) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        File f = new File("C:\\Users\\88717\\Documents\\NetBeansProjects\\EFD-ICMS\\EFD-ICMS\\"
                + "exemplos\\59546515000134-142595262117-20211201-20211231-1-"
                + "74E6223D58110D962A1CD3B47E64185005653230-SPED-EFD.txt");
        InputStream is = new FileInputStream(f);
        byte[] buffer = new byte[8192];
        int read = 0;
        try {
            while ((read = is.read(buffer)) > 0) {
                digest.update(buffer, 0, read);
            }
            byte[] md5sum = digest.digest();
            BigInteger bigInt = new BigInteger(1, md5sum);
            String output = bigInt.toString(16);
            System.out.println("MD5: " + output);
        } catch (IOException e) {
            throw new RuntimeException("Unable to process file for MD5", e);
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException("Unable to close input stream for MD5 calculation", e);
            }
        }
    }
}
