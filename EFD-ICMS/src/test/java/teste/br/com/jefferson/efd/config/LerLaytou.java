package teste.br.com.jefferson.efd.config;

import br.com.jefferson.efd.config.xmlversion;
import java.io.File;
import javax.xml.bind.JAXB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class LerLaytou {

    private static final Logger log = LogManager.getLogger("LoggerTest");

    public static void main(String[] args) {
        xmlversion layout = JAXB.unmarshal(new File("config/layout-efd.xml"), xmlversion.class);
        log.trace("Versão do laytou: " + layout.getVersao());
        xmlversion.Registro registro = layout.getRegistro("C170");
        log.trace("Quantidade de campos: " + registro.getCampo().size());
        log.trace("Perfis aceitos para o registro: " + registro.getPerfil());
        log.trace("Nivel do registro: " + registro.getNivel());
        /*
        for (xmlversion.Campo campo : registro.getCampo()) {
            log.trace("Coluna da tabela: "+campo.getColuna());
            log.trace("Posição do campo no registro: "+campo.getPosicao());
            
            log.trace("Tipo de Dado: "+campo.getTipo());
        }
*/
    }
}
