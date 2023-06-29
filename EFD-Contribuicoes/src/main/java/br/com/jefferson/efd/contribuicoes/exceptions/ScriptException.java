package br.com.jefferson.efd.contribuicoes.exceptions;

import org.apache.logging.log4j.LogManager;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class ScriptException extends Exception {

    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(ScriptException.class.getName());

    public ScriptException(String message) {
        super(message);
        log.error(message);
    }

    public ScriptException(Throwable ex) {
        super(ex);
        log.error(ex);
    }

    public ScriptException(String message, Throwable ex) {
        super(message, ex);
        log.error(message, ex);
    }
}
