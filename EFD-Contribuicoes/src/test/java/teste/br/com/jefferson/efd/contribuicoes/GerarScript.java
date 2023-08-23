package teste.br.com.jefferson.efd.contribuicoes;

import br.com.jefferson.efd.contribuicoes.blocos.Reg0000;
import br.com.jefferson.sped.processamento.Leitor;
import br.com.jefferson.sped.processamento.ToSqlScript;
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

        Reg0000 reg = new Reg0000();
        reg.setLinha(1);
        reg.setReg("0000");
        reg.setCodVer("016");
        reg.setTipoEscrit("0");
        reg.setDtFin(new Date(2022, 12, 01));
        reg.setDtIni(new Date(2022, 12, 31));
        reg.setNome("NIKE DO BRASIL COMERCIO E PARTICIPACOES LTDA");
        reg.setCnpj("59546515001530");
        //reg.setCpf("");
        reg.setUf("SP");
        reg.setIndNatPj("581");
        reg.setCodMun("3543402");
        reg.setSuframa("20001481");
        reg.setIndSitEsp(1);
        reg.setIndAtiv(1);

        String dir = "D:\\";
        String file = "PISCOFINS_20221201_20221231_59546515000134_Original_20230213152511_493209F923D8090481756D61B7687EA97A5B7333";
        String prefixo = ".txt";
        File arquivo = new File(dir + file + prefixo);
        Leitor leitor = new Leitor(arquivo,new Reg0000(),"br.com.jefferson.efd.contribuicoes.blocos");
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
        ToSqlScript gerar = new ToSqlScript(leitor.getSped(),"epc");
        gerar.gerarScript(new File(arquivo.getPath().replace(".txt", ".sql")));

        //ToSqlScript gerar = new ToSqlScript(reg);
        System.out.println(gerar.sqlScript(reg));

    }
}
