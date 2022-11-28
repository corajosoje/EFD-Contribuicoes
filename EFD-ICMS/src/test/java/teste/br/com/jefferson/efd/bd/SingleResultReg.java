
package teste.br.com.jefferson.efd.bd;

import br.com.jefferson.efd.blocos.Reg0000;
import br.com.jefferson.efd.util.ObjectFactory;
import javax.persistence.EntityManager;

/**
 *
 * @author 88717
 */
public class SingleResultReg {

    public static void main(String[] args) {
        EntityManager entityManager = ObjectFactory.getEntityManager();
        System.out.println("Verificando duplicidade");
        String hashCode = "huaishiudhasiuh";
        Reg0000 verif= entityManager.createNamedQuery("Reg0000.findByHash", Reg0000.class).setParameter("hash", hashCode).getSingleResult();
        
        System.out.println(verif==null);
    }
}
