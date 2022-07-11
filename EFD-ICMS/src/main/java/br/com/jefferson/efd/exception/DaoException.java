package br.com.jefferson.efd.exception;

/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
public class DaoException extends Exception {

    public DaoException(String message) {
        super(message);
    }

    public DaoException(Throwable ex) {
        super(ex);
    }

    public DaoException(String message, Throwable ex) {
        super(message, ex);
    }

}
