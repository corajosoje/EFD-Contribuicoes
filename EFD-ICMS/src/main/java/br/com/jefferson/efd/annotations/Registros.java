/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
package br.com.jefferson.efd.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author Jefferson oliveira
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Registros {

    int nivel() default 0;
}
