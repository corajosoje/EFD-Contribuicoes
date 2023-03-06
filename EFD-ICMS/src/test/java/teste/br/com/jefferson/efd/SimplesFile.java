
package teste.br.com.jefferson.efd;

import java.io.File;

/**
 *
 * @author 88717
 */
public class SimplesFile {
    public static void main(String[] args) {
        String pathname = "D:\\SpedFisia\\59546515000487-421085072118-20220201-20220228-1-F1EAE02CA1F1D9F2B222D5984DEB50BDF9C793DF-SPED-EFD.txt";
        File file = new File(pathname);
        System.out.println("Name: "+file.getName());
        System.out.println("Path: "+file.getPath());
        System.out.println("AbsolutePath: "+file.getAbsolutePath());
        System.out.println("Parent: "+file.getParent());
    }
}
