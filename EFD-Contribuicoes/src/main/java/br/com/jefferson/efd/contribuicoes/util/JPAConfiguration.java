package br.com.jefferson.efd.contribuicoes.util;//JPAConfiguration


import br.com.jefferson.efd.contribuicoes.exceptions.DaoException;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class JPAConfiguration {

    private static EntityManagerFactory emf = null;
    private static Logger log = ObjectFactory.getLogger(JPAConfiguration.class.getName());

    public static EntityManager getEntityManager() {
        if (emf == null) {
            createEntityManagerFactory();
        }
        if (emf.isOpen()) {
            return emf.createEntityManager();
        } else {
            createEntityManagerFactory();
            return emf.createEntityManager();
        }
    }

    public static EntityManagerFactory createEntityManagerFactory() {
        log.info("Criando EntityManagerFactory");
        Map<String, Object> properties = new HashMap<>();

        String conectionsql = "jdbc:" + ObjectFactory.getJPAPropertie("prop.contrib.server.name") + "://" + ObjectFactory.getJPAPropertie("prop.contrib.server.ip") + ":"
                + ObjectFactory.getJPAPropertie("prop.contrib.server.port")
                + ((ObjectFactory.getJPAPropertie("prop.contrib.server.name").equals("sqlserver")) ? ";databaseName=" : "/")
                + ObjectFactory.getJPAPropertie("prop.contrib.server.schema")
                + ObjectFactory.getJPAPropertie("prop.contrib.server.connectionOptions");

        log.info("Conection String " + conectionsql);

        properties.put("javax.persistence.jdbc.url", conectionsql);
        properties.put("javax.persistence.jdbc.user", ObjectFactory.getJPAPropertie("prop.contrib.server.user"));
        properties.put("javax.persistence.jdbc.password", ObjectFactory.getJPAPropertie("prop.contrib.server.password"));
        //properties.put("hibernate.connection.useSSL", "false");
        //properties.put("hibernate.connection.serverTimezone", TimeZone.getTimeZone("America/Sao_Paulo"));
        //properties.put("hibernate.jdbc.time_zone", TimeZone.getTimeZone("America/Sao_Paulo"));
        //properties.put("spring.jpa.properties.hibernate.jdbc.time_zone", "UTC");
        //properties.put("openjpa.MetaDataFactory", "jpa(Types=" + classNames + ")");

        //properties.put("hibernate.show_sql", "true");
        //properties.put("hibernate.hbm2ddl.auto", "update");
        //properties.put("javax.persistence.schema-generation.database.action", "create");
        //properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL55Dialect");
        //properties.put("javax.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
        //properties.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        emf = Persistence.createEntityManagerFactory(ObjectFactory.getJPAPropertie("prop.contrib.server.persistenceUnit"), properties);
        return emf;

    }

    public static <T> T getTransientObject(Class<T> classe, Object id) throws DaoException {
        EntityManager manager = null;
        try {
            manager = getEntityManager();
            return manager.find(classe, id);
        } finally {
            manager.close();
        }
    }

    public static void main(String[] args) {
        JPAConfiguration.createEntityManagerFactory();
        EntityManager entityManager = JPAConfiguration.getEntityManager();
        entityManager.close();
        JPAConfiguration.createEntityManagerFactory().close();
        System.out.println("exit");
    }
}
