package teste.br.com.jefferson.efd;

import br.com.jefferson.efd.blocos.Reg0000;
import br.com.jefferson.efd.blocos.RegD100;
import br.com.jefferson.efd.processamento.Leitor;
import br.com.jefferson.efd.util.JPAConfiguration;
import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author 88717
 */
public class VerificaçãoEFD {

    private static final Logger log = LogManager.getLogger("LoggerTest");

    public static void main(String[] args) throws IOException {
        File arquivoSped = new File("exemplos\\08046796000125-0010365990086-20220501-20220531-0-8F71FC52DB88D5BB5EF9FB6876BB39A6710FFC75-SPED-EFD2.txt");
        log.info("Criando Manager");
        JPAConfiguration.createEntityManagerFactory();
        log.info("Processando arquivo: " + arquivoSped.getName());
        Leitor leitor = new Leitor(arquivoSped);
        processarArquivo(leitor);

        Reg0000 sped = leitor.getSped();
        //verifD100(sped);
        log.info("Gravando no banco");
        leitor.gravar();
        leitor.close();
        log.info("Processo finalizado");
    }

    private static void verifD100(Reg0000 sped) {
        RegD100 d100 = sped.getRegD001().getRegD100().get(0);
        log.info("Linha: " + d100.getLinha());
        
        log.info("Chave: " + d100.getChvCte());
        log.info("Valor Total: " + d100.getVlDoc());
        log.info("Base ICMS: " + d100.getVlBcIcms() );

        log.info("Municipio Origem: " + d100.getCodMunOrig());
    }

    private static void processarArquivo(Leitor leitor) throws IOException {
        for (int i = 0; i < leitor.getLinhas(); i++) {
            String conteudo = leitor.getlinha();

            if (conteudo == null) {
            } else if (Leitor.verificaLinhaSped(conteudo)) {
                //log.trace("Linha: " + (i + 1) + " - Registro: " + conteudo);
                leitor.processarLinha(conteudo, i + 1);
            }

        }
    }
}
