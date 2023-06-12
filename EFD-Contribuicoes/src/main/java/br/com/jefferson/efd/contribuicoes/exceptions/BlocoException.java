package br.com.jefferson.efd.contribuicoes.exceptions;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class BlocoException extends RuntimeException {

    public BlocoException(String message) {
        super(message);
    }

    public BlocoException(Throwable ex) {
        super(ex);
    }

    public BlocoException(String message, Throwable ex) {
        super(message, ex);
    }

}
