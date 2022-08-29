package br.com.jefferson.efd.exception;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class LeitorExeption extends RuntimeException {

    public LeitorExeption(String message) {
        super(message);
    }

    public LeitorExeption(Throwable ex) {
        super(ex);
    }

    public LeitorExeption(String message, Throwable ex) {
        super(message, ex);
    }
}
