package teste.br.com.jefferson.efd;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 88717
 */
public class SimplesFile {

    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static void main(String[] args) {
        FileTeste(args);
    }

    public static void FormatterTest(String[] args) {
        Date data = new Date();
        System.out.println("Data formatada: " + sdf.format(data));
    }

    public static void FileTeste(String[] args) {
        String pathname = "D:\\SpedFisia\\59546515000487-421085072118-20220201-20220228-1-F1EAE02CA1F1D9F2B222D5984DEB50BDF9C793DF-SPED-EFD.txt";
        File file = new File(pathname);
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("AbsolutePath: " + file.getAbsolutePath());
        System.out.println("Parent: " + file.getParent());
    }
}
