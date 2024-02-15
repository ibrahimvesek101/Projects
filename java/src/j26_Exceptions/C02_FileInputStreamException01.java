package j26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    public static void main(String[] args) throws IOException {//meth signiture level exception java zorunlu ekledi
    //public static void main(String[] args) throws FileNotFoundException {
        //FileInputStream fis=new FileInputStream("/Users/haluk.../IdeaProjects/javaLearn/src/j26_Exceptions/ebikGabık");
        FileInputStream fis=new FileInputStream("/Users/haluk.../IdeaProjects/javaLearn/src/j26_Exceptions/ebikGabık");
//fis path(yolu) verilen file erişim sağlaya obj.
//FileNotFoundException ->ulaşılması gereken file path(adres yol) yanlışşsa istisnası
        int k;
        while ((k=fis.read())!=-1){//fis.read() meth ile ulaşılan file'daki ascii değerlerin -1 olmama sartı(ascii=-1 olmayan karakter verir)
            System.out.print((char) k);
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");
    }//main sonu
}//class sonu
