package teste.br.com.jefferson.efd;

import br.com.jefferson.efd.blocos.Reg0000;
import br.com.jefferson.efd.processamento.Leitor;
import br.com.jefferson.efd.processamento.ToSqlScript;
import java.io.File;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author 88717
 */
public class GerarScript {

    private static final Logger log = LogManager.getLogger("LoggerTest");

    public static void main(String[] args) throws Exception {
        String registro = "|0000|016|0|01122022|31122022|NIKE DO BRASIL COMERCIO E PARTICIPACOES LTDA|59546515001530||SP|582571400111|3543402|20001481||A|1|";

        Reg0000 reg = new Reg0000("Testearquivo");
        reg.setLinha(1);
        reg.setReg("0000");
        reg.setCodVer("016");
        reg.setCodFin("0");
        reg.setDtFin(new Date(2022, 12, 01));
        reg.setDtIni(new Date(2022, 12, 31));
        reg.setNome("NIKE DO BRASIL COMERCIO E PARTICIPACOES LTDA");
        reg.setCnpj("59546515001530");
        //reg.setCpf("");
        reg.setUf("SP");
        reg.setIe("582571400111");
        reg.setCodMun("3543402");
        reg.setSuframa("20001481");
        reg.setIndPerfil("");
        reg.setIndAtiv(1);
        reg.setIm("algum");

        String dir = "D:\\SpedFisia\\";
        File arquivo = new File(dir + "59546515000487-421085072118-20221201-20221231-1-628E7CC389A998762A1AB37E01F5A4698173F3B3-SPED-EFD.txt");
        Leitor leitor = new Leitor(arquivo);
        log.info("iniciando o Leitor de arquivo Sped");
        log.info("Preenchendo objeto Sped");
        for (int i = 0; i < leitor.getLinhas(); i++) {
            String conteudo = leitor.getlinha();

            if (conteudo == null) {
            } else if (Leitor.verificaLinhaSped(conteudo)) {
                //log.trace("Linha: " + (i + 1) + " - Registro: " + conteudo);
                leitor.processarLinha(conteudo, (i + 1));
            }

        }
        log.info("Iniciando gerador de Scripts");
        ToSqlScript gerar = new ToSqlScript(leitor.getSped());
        gerar.gerarScript(new File(arquivo.getPath().replace(".txt", ".sql")));

        //ToSqlScript gerar = new ToSqlScript(reg);
        System.out.println(gerar.sqlScript(reg));

    }
}
