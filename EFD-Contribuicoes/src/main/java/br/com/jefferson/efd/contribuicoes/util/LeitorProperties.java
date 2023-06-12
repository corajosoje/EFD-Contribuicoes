package br.com.jefferson.efd.contribuicoes.util;//LeitorProperties

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class LeitorProperties {

    private static Properties configProps, JPAProps;
    private static final Logger log = LogManager.getLogger(LeitorProperties.class.getClass().getName());

    public static Properties getConfigProperties() {
        return configProps;
    }

    public static Properties getJPAProperties() {
        return JPAProps;
    }

    public static Properties lerConfigProperties() {
        File arquivo = new File("config");
        if (!arquivo.exists()) {
            arquivo.mkdir();
        }
        arquivo = new File("config/aplication.properties");
        if (!arquivo.exists()) {
            gerarPadraoService(arquivo);
        }
        if (arquivo.canRead() && arquivo.getName().endsWith(".properties")) {
            configProps = new Properties();

            try ( InputStream in = new FileInputStream(arquivo);) {
                configProps.load(in);
                in.close();
            } catch (IOException ex) {
                log.error("Não foi possivel ler arquivo de config", ex);
            }

            return configProps;
        } else {
            throw new RuntimeException("Não foi possivel ler o arquivo " + arquivo.getAbsolutePath());
        }
    }

    public static Properties lerJPAProperties() {
        File arquivo = new File("config");
        if (!arquivo.exists()) {
            arquivo.mkdir();
        }
        arquivo = new File("config/bd.properties");
        if (!arquivo.exists()) {
            gerarPadraoJPA(arquivo);
        }
        if (arquivo.canRead() && arquivo.getName().endsWith(".properties")) {
            JPAProps = new Properties();

            try ( InputStream in = new FileInputStream(arquivo);) {
                JPAProps.load(in);
                in.close();
            } catch (IOException ex) {
                log.error("Não foi possivel ler arquivo de config", ex);
            }

            return JPAProps;
        } else {
            throw new RuntimeException("Não foi possivel ler o arquivo " + arquivo.getAbsolutePath());
        }
    }

    private static void gerarPadraoService(File arquivo) {
        try {
            log.debug("Gerando arquivo padrão de configurações");
            try ( PrintWriter gravarArq = new PrintWriter(arquivo)) {
                gravarArq.println("#Arquivo de configurações");
                gravarArq.println("");
                gravarArq.println("#Recomendado 1000000");
                gravarArq.println("prop.contrib.script.limitelinha = 1000000");
                gravarArq.println("");
                gravarArq.println("#Recomendado 30");
                gravarArq.println("prop.contrib.script.limiteGO = 30");

                gravarArq.flush();
            }
        } catch (Exception ex) {
            log.error("Não foi possivel criar arquivo padrão de config", ex);
            throw new RuntimeException("Não foi possivel criar arquivo padrão de config", ex);
        }

    }

    private static void gerarPadraoJPA(File arquivo) {
        try {
            log.debug("Gerando arquivo padrão de configurações");
            try ( PrintWriter gravarArq = new PrintWriter(arquivo)) {
                gravarArq.println("#Arquivo de configurações do Banco de dados");
                gravarArq.println("#MYSQL8");
                gravarArq.println("");
                gravarArq.println("#IP do Servidor");
                gravarArq.println("prop.contrib.server.ip=127.0.0.1");
                gravarArq.println("");
                gravarArq.println("#Usuario");
                gravarArq.println("prop.contrib.server.user=jefferson");
                gravarArq.println("");
                gravarArq.println("#Senha do Usuario");
                gravarArq.println("prop.contrib.server.password=JehLeonheart2");
                gravarArq.println("");
                gravarArq.println("#Porta");
                gravarArq.println("prop.contrib.server.port=3306");
                gravarArq.println("");
                gravarArq.println("#Schema -Será desativados em versão futura");
                gravarArq.println("prop.contrib.server.schema=efdicms");
                gravarArq.println("");
                gravarArq.println("#Unidade de persistencia -Será desativados em versão futura");
                gravarArq.println("prop.contrib.server.persistenceUnit=PUEFD-Fiscal");

                gravarArq.flush();
            }
        } catch (Exception ex) {
            log.error("Não foi possivel criar arquivo padrão de config", ex);
            throw new RuntimeException("Não foi possivel criar arquivo padrão de config", ex);
        }

    }
}
