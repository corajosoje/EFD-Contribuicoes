package teste.br.com.jefferson.efd;

import br.com.jefferson.efd.blocos.Reg0000;
import br.com.jefferson.efd.blocos.Reg0001;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author 88717
 */
public class Simples {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Reg0000 reg = new Reg0000();
        Class forname = reg.getClass();
        System.out.println("CanonicalName: " + forname.getCanonicalName());
        System.out.println("Name: " + forname.getName());
        System.out.println("PackageName: " + forname.getPackageName());
        System.out.println("SimpleName: " + forname.getSimpleName());
        System.out.println("TypeName: " + forname.getTypeName());

        Reg0001 reg0001 = new Reg0001();
        Method method = reg0001.getClass().getMethod("getReg0015");
        
        System.out.println("Teste IF Ternario");
        String teste = "sqlserver";
        System.out.println((teste.equals("sqlserver"))?";database=":"/");
        
        System.out.println("Teste Separator");
        System.out.println("Esse é o File.separator: " + File.separator);
        System.out.println("Esse é o File.pathSeparator: " + File.pathSeparator);
    }
}
