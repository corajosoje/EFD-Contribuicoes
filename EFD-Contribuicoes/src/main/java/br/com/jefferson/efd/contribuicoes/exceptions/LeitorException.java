package br.com.jefferson.efd.contribuicoes.exceptions;

import org.apache.logging.log4j.LogManager;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class LeitorException extends RuntimeException {

    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(LeitorException.class.getName());

    public LeitorException(String message) {
        super(message);
        log.error(message);
    }

    public LeitorException(Throwable ex) {
        super(ex);
        log.error(ex);
    }

    public LeitorException(String message, Throwable ex) {
        super(message, ex);
        log.error(message, ex);
    }
}
