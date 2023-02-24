package teste.br.com.jefferson.efd;

/**
 *
 * @author 88717
 */
public class SplitString {

    public static void main(String[] args) {
        String linha = "|D100|0|1|F124363|57|00|002||2743|35220427283442000149570020000027431638875870|28042022|12052022|0||8,43|0|0|8,43|8,43|1,01|0|02IP6|2102505007|3550308|3518800|";

        String[] split = linha.split("\\|");
        for (int i = 0; i < split.length; i++) {
            String string = split[i];
            System.out.println("Campo: " + (i + 1) + " Valor: " + string);
        }
    }
}
