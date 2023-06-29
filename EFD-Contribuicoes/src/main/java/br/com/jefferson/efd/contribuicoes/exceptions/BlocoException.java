package br.com.jefferson.efd.contribuicoes.exceptions;

import org.apache.logging.log4j.LogManager;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class BlocoException extends RuntimeException {

    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(BlocoException.class.getName());

    public BlocoException(String message) {
        super(message);
        log.error(message);
    }

    public BlocoException(Throwable ex) {
        super(ex);
        log.error(ex);
    }

    public BlocoException(String message, Throwable ex) {
        super(message, ex);
        log.error(message, ex);
    }

}
