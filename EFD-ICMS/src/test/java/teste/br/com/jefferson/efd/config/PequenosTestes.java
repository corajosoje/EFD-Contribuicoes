package teste.br.com.jefferson.efd.config;

import br.com.jefferson.efd.exception.LeitorExeption;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TimeZone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author 88717
 */
public class PequenosTestes {

    private static final Logger log = LogManager.getLogger("LoggerTest");

    public static void main(String[] args) throws Exception {
        String sped = "D:\\Receita BX\\Arquivos Centauro\\Escrituração Fiscal Digital\\06347409000165\\2022\\06347409002613-78187786-20220501-20220531-0-19EF5FE772E5259C1371AF871F801C3B935A8B53-SPED-EFD.txt";
        File file = new File(sped);
        System.out.println("Resultado: " + verificarArquivoSped(file));
    }

    public static boolean verificarArquivoSped(File fileTxt) {
        try {
            log.debug("Verificando arquivo: " + fileTxt.getAbsolutePath());
            String fistLine = Files.readAllLines(Paths.get(fileTxt.getAbsolutePath()),StandardCharsets.ISO_8859_1).get(0);
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
