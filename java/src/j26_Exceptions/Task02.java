package j26_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
           /*
    Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
    edip mainde kontrol ediniz.

    Trick->
    sicaklikKontrol(int sıcaklık){
     throw new IOException("AGAM haba buz gibi dışarı çıkma");
            */
        Scanner input = new Scanner(System.in);
        System.out.print("Agam sıcaklık giresen : ");
        int havaSıcaklık = input.nextInt();
        try {
            sicaklikKontrol(havaSıcaklık);//meth call denenecek throw çalılırsa catche gidecek
        } catch (Exception e) {
            System.out.println(e.getMessage()+ " Agam hava soğuk çıkma dedik şimdi buz kırıyorsun");
            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");

    }//main sonu
    public static void sicaklikKontrol(int sıcaklık) throws IOException {
        if (sıcaklık < 10) {
            throw new IOException("AGAM hava buz gibi dışarı çıkma");
        } else System.out.println("Agam hava gayet başarılı ");
    }

}//Class sonu
