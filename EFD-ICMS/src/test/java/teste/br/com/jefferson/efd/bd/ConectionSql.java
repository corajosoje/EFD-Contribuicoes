package teste.br.com.jefferson.efd.bd;

import br.com.jefferson.efd.blocos.Reg0000;
import br.com.jefferson.efd.util.ObjectFactory;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author 88717
 */
public class ConectionSql {

    private static EntityManagerFactory emf = null;
    private static Logger log = ObjectFactory.getLogger("LoggerTest");

    public static void main(String[] args) {
        log.trace("Criando EntityManagerFactory");
        Map<String, Object> properties = new HashMap<>();

        String conectionsql = "jdbc:" + ObjectFactory.getJPAPropertie("prop.server.name") + "://" + ObjectFactory.getJPAPropertie("prop.server.ip") + ":"
                + ObjectFactory.getJPAPropertie("prop.server.port")
                + ((ObjectFactory.getJPAPropertie("prop.server.name").equals("sqlserver")) ? ";databaseName=" : "/")
                + ObjectFactory.getJPAPropertie("prop.server.schema")
                + ObjectFactory.getJPAPropertie("prop.server.connectionOptions");
        conectionsql = "jdbc:sqlserver://STAN01\\PSQL32.dc.sbnet,1433:1433;databaseName=EFDICMS;encrypt=false;sslProtocol=TLSv1.2";

        log.debug("Conection String " + conectionsql);

        properties.put("javax.persistence.jdbc.url", conectionsql);
        properties.put("javax.persistence.jdbc.user", ObjectFactory.getJPAPropertie("prop.server.user"));
        properties.put("javax.persistence.jdbc.password", ObjectFactory.getJPAPropertie("prop.server.password"));
        emf = Persistence.createEntityManagerFactory(ObjectFactory.getJPAPropertie("prop.server.persistenceUnit"), properties);
        log.trace("Criando EntityManager");
        EntityManager entityManager = emf.createEntityManager();
        String hashCode = "huaishiudhasiuh";
        Reg0000 verif = entityManager.createNamedQuery("Reg0000.findByHashfile", Reg0000.class).setParameter("hash", hashCode).getSingleResult();

        System.out.println(verif == null);

    }
}
