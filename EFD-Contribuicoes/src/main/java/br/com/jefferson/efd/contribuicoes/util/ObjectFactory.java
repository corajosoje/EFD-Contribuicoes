package br.com.jefferson.efd.contribuicoes.util;//ObjectFactory

import java.io.File;
import java.io.FileFilter;
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

    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(ObjectFactory.class.getName());
    public static final SimpleDateFormat UTC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
    public static final SimpleDateFormat dataSimples = new SimpleDateFormat("dd/MM/yyyy");
    private static ObjectFactory facotory = null;
    private static Properties vConfigProperties = null, vJPAProperties = null;
    private static final FileFilter spedFileFilter = new FileFilter() {

        @Override
        public boolean accept(File pathname) {
            if (pathname.getName().endsWith(".txt")) {
                return Util.verificarArquivoSped(pathname);
            }
            return false;
        }
    };

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

    public static FileFilter getSpedFileFilter() {
        log.info("Iniciando verificação dos arquivos que são SPED");
        return ObjectFactory.spedFileFilter;
    }
}
