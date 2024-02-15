package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = "); //Ahmet Emin Yilmaz
        String adAd2Soyad = scan.nextLine();


        /*Ahmet Emin Yılmaz
         A : adAd2Soyad.CharAt(0);
         E : 1.boşluk karakterinin indexinin 1 fazlası
         Y : Son boşluğun indexinin 1 fazlası */

        //en kısa kod:
        System.out.println(adAd2Soyad.charAt(0) + "." + adAd2Soyad.charAt(adAd2Soyad.indexOf(" ") + 1) + "." + adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1) + ".");
        //A.E.Y.

        //1. yöntem:
        char adIlkHarf = adAd2Soyad.charAt(0);
        char ad2IlkHarf = adAd2Soyad.charAt(adAd2Soyad.indexOf(" ") + 1);
        char soyadIlkHarf = adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1);

        // 2.Yöntem:
        int ilkBoslukIndex = adAd2Soyad.indexOf(" ");
        int sonBoslukIndex = adAd2Soyad.lastIndexOf(" ");

        ad2IlkHarf = adAd2Soyad.charAt(ilkBoslukIndex + 1);
        soyadIlkHarf = adAd2Soyad.charAt(sonBoslukIndex + 1);
        /*****************************************************/
        System.out.println(adIlkHarf + "." + ad2IlkHarf + "." + soyadIlkHarf + ".");     //A.E.Y.
        /*
        // Kullanıcıdan alacağınız, 4 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz Gül -> A.E.Y.G. formatıyla yazdırınız.

        char ilkHarf = adSoyad.toUpperCase().charAt(0);
        char ikinciHarf = adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ") + 1);
        char ucuncuHarf = adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ", adSoyad.indexOf(" ") + 1) + 1);
        char dorduncuHarf = adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ") + 1);
        System.out.println(ilkHarf + "." + ikinciHarf + "." + ucuncuHarf + "." + dorduncuHarf);
        scan.close();
         */
    }
}
