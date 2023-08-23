package teste.br.com.jefferson.efd.contribuicoes;

import br.com.jefferson.sped.util.ObjectFactory;

/**
 *
 * @author 88717
 */
public class Basicos {

    public static void main(String[] args) {
        String prop = ObjectFactory.getConfigPropertie("prop.sped.script.limiteGO");
        System.out.println(prop);
        int parseInt = Integer.parseInt(prop);
        System.out.println(parseInt);
        
        System.out.println(System.getProperty("user.home"));
    }
}
