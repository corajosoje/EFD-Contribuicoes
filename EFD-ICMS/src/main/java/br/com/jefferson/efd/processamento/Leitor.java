package br.com.jefferson.efd.processamento;//Leitor

import br.com.jefferson.efd.util.ObjectFactory;
import br.com.jefferson.efd.util.Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.persistence.EntityManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class Leitor {

    private static final Logger log = LogManager.getLogger(Leitor.class.getName());

    public static void processarArquivo(File arquivo) throws IOException {

        EntityManager entityManager = ObjectFactory.getEntityManager();

        log.trace("Iniciando Reader");

        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        int count = (int) reader.lines().count();
        log.trace("Processando " + count + " linhas do arquivo " + arquivo.getName());
        log.trace("Iniciando Manager");
        DaoRegistro registro = new DaoRegistro(entityManager);
        String hashCode = Util.getHash(arquivo);
        reader = new BufferedReader(new FileReader(arquivo));
        String conteudo = reader.readLine();
        int linha = 1;

        log.trace("Primeira linha: " + conteudo);
        log.trace("Iniciando transação");
        entityManager.getTransaction().begin();
        while (true) {
            if (conteudo != null) {
                log.trace("Linha: " + linha + " - Registro: " + conteudo);
                registro.persist(conteudo, hashCode, linha);

            } else {
                break;
            }
            conteudo = reader.readLine();
            linha++;
        }
        log.trace("Processo finalizado");

        entityManager.getTransaction().commit();

        log.trace("Fechando Manager");
        entityManager.close();
        reader.close();

    }
}
