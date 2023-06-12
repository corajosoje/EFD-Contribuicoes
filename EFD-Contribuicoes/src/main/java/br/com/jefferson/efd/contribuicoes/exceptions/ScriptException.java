package br.com.jefferson.efd.contribuicoes.exceptions;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class ScriptException extends Exception {

    public ScriptException(String message) {
        super(message);
    }

    public ScriptException(Throwable ex) {
        super(ex);
    }

    public ScriptException(String message, Throwable ex) {
        super(message, ex);
    }
}
