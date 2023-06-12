package teste.br.com.jefferson.efd.contribuicoes;

import br.com.jefferson.efd.contribuicoes.util.ObjectFactory;

/**
 *
 * @author 88717
 */
public class Basicos {

    public static void main(String[] args) {
        String prop = ObjectFactory.getConfigPropertie("prop.contrib.script.limiteGO");
        System.out.println(prop);
        int parseInt = Integer.parseInt(prop);
        System.out.println(parseInt);
    }
}
