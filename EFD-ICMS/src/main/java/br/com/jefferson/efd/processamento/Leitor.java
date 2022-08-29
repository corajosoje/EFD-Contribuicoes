package br.com.jefferson.efd.processamento;//Leitor

import br.com.jefferson.efd.exception.LeitorExeption;
import br.com.jefferson.efd.util.ObjectFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.EntityManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
@Deprecated
public class Leitor {

    private BufferedReader buffRead = null;
    private static final Logger log = LogManager.getLogger(Leitor.class.getName());

    public static void main(String[] args) throws IOException {

        String arquivo = "D:\\Receita BX\\Arquivos Centauro\\Escrituração Fiscal Digital\\06347409000165\\"
                + "06347409031044-063483963-20200201-20200229-0-2570BD99341C0E765FC84454972E947338268766-SPED-EFD.txt";
        File file = new File(arquivo);

        Leitor leitor = new Leitor();
        leitor.read(file);

        String hashCode = leitor.getHash(file);

        EntityManager entityManager = ObjectFactory.getEntityManager();
        DaoRegistro registro = new DaoRegistro(entityManager);

        String conteudo = leitor.buffRead.readLine();
        int linha = 1, idpai = 0;

        entityManager.getTransaction().begin();
        while (true) {
            if (conteudo != null) {
                log.trace("Linha: " + linha + " - Registro: " + conteudo);
                /*
                exemplo retorno
                1-|0000|015|1|01122021|31122021|NIKE DO BRASIL COMERCIO E PARTICIPACOES LTDA|59546515000134||SP|142595262117|3518800|||A|0|
                 */

                registro.persist(conteudo, hashCode, linha);

            } else {
                break;
            }
            conteudo = leitor.buffRead.readLine();
            linha++;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        leitor.fechar();
    }

    public void processamento(File path) throws IOException {
        EntityManager entityManager = ObjectFactory.getEntityManager();
        DaoRegistro registro = new DaoRegistro(entityManager);
        String hashCode = getHash(path);
        String conteudo = this.buffRead.readLine();
        int linha = 1;

        entityManager.getTransaction().begin();
        try ( BufferedReader reader = new BufferedReader(new FileReader(path))) {

            while (true) {
                if (conteudo != null) {
                    log.trace("Linha: " + linha + " - Registro: " + conteudo);

                    registro.persist(conteudo, hashCode, linha);

                } else {
                    break;
                }
                conteudo = reader.readLine();
                linha++;
            }

        } finally {

        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    private BufferedReader getReader() {
        return this.buffRead;
    }

    public void read(File path) throws IOException {
        log.debug("Lendo o arquivo: " + path.getName());
        this.buffRead = new BufferedReader(new FileReader(path));
    }

    public void fechar() throws IOException {
        log.debug("Fechando BufferReader");
        this.buffRead.close();
    }

    private String getHash(File arquivo) {
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
}
