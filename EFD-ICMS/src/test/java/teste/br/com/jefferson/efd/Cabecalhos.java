package teste.br.com.jefferson.efd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 88717
 */
public class Cabecalhos {

    public static void main(String[] args) throws IOException {
        String folder = args[0];//"D:\\Receita BX\\Arquivos Centauro\\Escrituração Fiscal Digital\\06347409000165";

        BufferedReader reader = null;
        for (File file : new File(folder).listFiles()) {
            try {
                reader = new BufferedReader(new FileReader(file));
                String conteudo = reader.readLine();
                
                System.out.println(conteudo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cabecalhos.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(Cabecalhos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
