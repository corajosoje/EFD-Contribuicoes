/**
 * @version 1.0
 * @author Jefferson Oliveira
 */
package br.com.jefferson.efd.contribuicoes.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Jefferson oliveira
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Campos {

    int versao() default 1;
    int posicao() default 1;
    char tipo();
}
