package br.com.jefferson.efd.contribuicoes.exceptions;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class LeitorException extends RuntimeException {

    public LeitorException(String message) {
        super(message);
    }

    public LeitorException(Throwable ex) {
        super(ex);
    }

    public LeitorException(String message, Throwable ex) {
        super(message, ex);
    }
}
