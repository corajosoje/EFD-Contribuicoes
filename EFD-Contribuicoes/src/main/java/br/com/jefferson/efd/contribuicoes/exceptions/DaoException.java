package br.com.jefferson.efd.contribuicoes.exceptions;

import org.apache.logging.log4j.LogManager;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class DaoException extends Exception {

    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(DaoException.class.getName());

    public DaoException(String message) {
        super(message);
        log.error(message);
    }

    public DaoException(Throwable ex) {
        super(ex);
        log.error(ex);
    }

    public DaoException(String message, Throwable ex) {
        super(message, ex);
        log.error(message, ex);
    }

}
