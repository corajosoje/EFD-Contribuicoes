package teste.br.com.jefferson.efd.config;

import java.lang.reflect.Method;

/**
 *
 * @author 88717
 */
public class LerArquivoSped {

    public static void main(String[] args) throws Exception {
        String registro1 = "|0150|1-21174348000175|ENTRE PONTOS LOGISTICA LTDA|1058|21174348000175||145924150112|3550308||RUA ANTONIO RAPOSO|212||LAPA|";
        String registro2 = "|0150|1-5078179|LAMACE COMERCIO, IMPORT.E|1058|02640640000191||653045110119|3550605||RUA ALVARO PINTO DUARTE, 278||||";
        String registro3 = "|C170|1|5-G4205|BR-ADESIVO-GNRB|1|EA|300|0|0|040|2556|AA|0|0|0|0|0|0|0|01||0|0|0|08|0|0|0|0|0|08|0|0|0|0|0|0068000000|0|";
        String registro4 = "|SBRCAAEPDR0€	*†H†÷";

        if (registro4.substring(0, 1).equals("|")&& registro4.substring(registro4.length()-1).equals("|")) {
            String[] campos = registro3.split("\\|", -1);
            System.out.println(campos.length);
            for (int i = 0; i < campos.length; i++) {
                String campo = campos[i];
                System.out.println("Campo " + i + " valor: " + campos[i]);
                if (campos[i].equals("")) {
                    System.out.println("Campo Vazio");
                }
            }

            Class<?> forName = Class.forName("br.com.jefferson.efd.blocos.Reg" + campos[1]);
            Object newInstance = forName.getConstructor().newInstance();
            System.out.println(newInstance);

            String metodo = "Reg";
            Method method = forName.getMethod("setReg", String.class);
            method.invoke(newInstance, campos[1]);

            method = forName.getMethod("get" + metodo);
            System.out.println(method.invoke(newInstance));
        } else {
            System.out.println("Não é registro Sped");
        }
    }
}
