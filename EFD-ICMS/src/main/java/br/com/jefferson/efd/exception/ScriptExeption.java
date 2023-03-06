package br.com.jefferson.efd.exception;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class ScriptExeption extends Exception {

    public ScriptExeption(String message) {
        super(message);
    }

    public ScriptExeption(Throwable ex) {
        super(ex);
    }

    public ScriptExeption(String message, Throwable ex) {
        super(message, ex);
    }
}
