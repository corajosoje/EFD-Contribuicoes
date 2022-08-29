package br.com.jefferson.efd.util;

import br.com.jefferson.efd.config.xmlversion;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.xml.bind.JAXB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class ObjectFactory {

    public static final SimpleDateFormat UTC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
    public static final SimpleDateFormat dataSimples = new SimpleDateFormat("dd/MM/yyyy");
    private static ObjectFactory facotory = null;
    private static Properties vConfigProperties = null, vJPAProperties = null;

    private static xmlversion layout = null;

    public static ObjectFactory getInstance() {
        if (facotory == null) {
            facotory = new ObjectFactory();
        }
        return facotory;
    }

    public static Logger getLogger(Object classe) {
        System.out.println("Logger " + classe.getClass().getName());
        return LogManager.getLogger(classe.getClass().getName());
    }

    public static Logger getLogger(String logger) {
        return LogManager.getLogger(logger);
    }

    public static String getConfigPropertie(String chave) {
        if (vConfigProperties == null) {
            vConfigProperties = LeitorProperties.lerConfigProperties();
        }
        return vConfigProperties.getProperty(chave);
    }

    public static String getJPAPropertie(String chave) {
        if (vJPAProperties == null) {
            vJPAProperties = LeitorProperties.lerJPAProperties();
        }
        return vJPAProperties.getProperty(chave);
    }

    public static EntityManager getEntityManager() {
        return JPAConfiguration.getEntityManager();
    }

    public static xmlversion getLayout() {
        if (layout == null) {
            layout = JAXB.unmarshal(new File("config/layout-efd.xml"), xmlversion.class);
        }
        return layout;
    }
}
