package teste.br.com.jefferson.efd.config;

import br.com.jefferson.efd.config.xmlversion;
import br.com.jefferson.efd.util.ObjectFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author 88717
 */
public class LayoutXClasse {

    private static final Logger log = LogManager.getLogger("LoggerTest");

    public static void main(String[] args) throws Exception {
        xmlversion layout = ObjectFactory.getLayout();
        List<xmlversion.Registro> registros = layout.getRegistro();
        System.out.println("Validação de campos");
        for (xmlversion.Registro registro : registros) {
            List<xmlversion.Campo> campos = registro.getCampo();

            for (xmlversion.Campo campo : campos) {
                //log.trace("Validando Campo: " + campo.getColuna() + " do registro " + registro.getCodigo());
                try {
                    Class<?> forName = Class.forName("br.com.jefferson.efd.blocos.Reg" + registro.getCodigo());
                    Field declaredField = forName.getDeclaredField(priMaiusculaField(campo.getColuna()));
                    //log.trace("Classe do campo:" + declaredField.getType().getName() + " Tipo no layout :" + campo.getTipo());

                    String msg = "Registro: " + registro.getCodigo() + " Campo: " + campo.getColuna()
                            + " Classe :" + declaredField.getType().getName() + " layout :" + campo.getTipo();

                    if (campo.getTipo().equals("C") && !declaredField.getType().getName().equals(String.class.getName())) {
                        System.out.println(msg);
                        //throw new RuntimeException("Campo não bate com o layout");
                    } else if (campo.getTipo().equals("D") && !declaredField.getType().getName().equals(Date.class.getName())) {
                        System.out.println(msg);
                        //throw new RuntimeException("Campo não bate com o layout");
                    } else if (campo.getTipo().equals("I") && !declaredField.getType().getName().equals(int.class.getName())) {
                        System.out.println(msg);
                        //throw new RuntimeException("Campo não bate com o layout");
                    } else if (campo.getTipo().equals("R") && !declaredField.getType().getName().equals(BigDecimal.class.getName())) {
                        System.out.println(msg);
                        //throw new RuntimeException("Campo não bate com o layout");int
                    }
                } catch (java.lang.NoSuchFieldException r) {
                    System.out.println("Registro: " + registro.getCodigo() + " Campo: " + campo.getColuna() + " não existe");
                }
            }

        }
        System.out.println("Fim da validação de campos");
        System.out.println("Validação de Metodos");
        Method method;
        for (xmlversion.Registro registro : registros) {
            List<xmlversion.Campo> campos = registro.getCampo();
            for (xmlversion.Campo campo : campos) {
                Class<?> forName = Class.forName("br.com.jefferson.efd.blocos.Reg" + registro.getCodigo());
                try {
                    method = forName.getMethod("get" + priMaiusculaMethod(campo.getColuna()));
                } catch (java.lang.NoSuchMethodException r) {
                    System.out.println("Registro: " + registro.getCodigo() + " Campo: " + campo.getColuna() + " não existe metodo GET");
                }
                try {
                    String metodo = "set" + priMaiusculaMethod(campo.getColuna());
                    switch (campo.getTipo()) {
                        case "C": {
                            method = forName.getMethod(metodo, String.class);
                            break;
                        }
                        case "I": {
                            method = forName.getMethod(metodo, int.class);
                            break;
                        }
                        case "R": {
                            method = forName.getMethod(metodo, BigDecimal.class);
                            break;
                        }
                        case "D": {

                            method = forName.getMethod(metodo, Date.class);
                            break;
                        }
                        default:
                            log.error("Campo tipo " + campo.getTipo() + " não é reconhecido");
                    }
                } catch (java.lang.NoSuchMethodException r) {
                    System.out.println("Registro: " + registro.getCodigo() + " Campo: " + campo.getColuna() + " não existe metodo SET");
                }

            }
        }
        System.out.println("Fim da validação de metodos");
    }

    private static String priMaiusculaField(String word) {
        String compose = "";

        for (String print : word.split("_")) {
            compose = compose + print.substring(0, 1).toUpperCase() + print.substring(1).toLowerCase() + "_";
        }
        compose = compose.replace("_", "");
        return compose.substring(0, 1).toLowerCase() + compose.substring(1);
    }

    private static String priMaiusculaMethod(String word) {
        String compose = "";

        for (String print : word.split("_")) {
            compose = compose + print.substring(0, 1).toUpperCase() + print.substring(1).toLowerCase() + "_";
        }
        return compose.replace("_", "");
    }
}
