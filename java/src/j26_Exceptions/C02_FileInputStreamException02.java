package j26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {

        try {//outher try blok-> file erişme exception
            FileInputStream fis = new FileInputStream("/Users/haluk.../IdeaProjects/javaLearn/src/j26_Exceptions/ebikGabık");
            int k;//erişilen file her bir karakterin ascii değeri atanacagı boşkutu atnımlandı

            try {// inner try blok-> erişilen file daki data okuma exception
                while ((k = fis.read()) !=-1) {
                    System.out.print( (char) k);
                }
                System.out.println("Agam inner try'den selamkeee :)");
            } catch (IOException e) {//inner catch blok
                System.out.println("agam dosya okunmuyor boş :( ");
                System.out.println("Agam inner catch'den selamkeee :)");
            }
            System.out.println("Agam outher try'den selamkeee :)");
        } catch (FileNotFoundException e) {//auther catch blok
            System.out.println("Agam dosyaya ulaşılamıyor ");
            System.out.println("Agam outher catch'den selamkeee :)");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");
    }
}
