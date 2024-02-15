package WhileLoop.Part1;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //	Kullanici yanlislikla negatif sayi girerse o sayiyi dikkate almayin
        //	ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //	yanlislikla kac negative sayi girdigini
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan =new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNegatif=0;

        do {
            System.out.println("Lütfen pozitif bir sayı girin \n bitirmek için" +
                    "0 a basın");
            sayi=scan.nextInt();

            if (sayi<0) {
                System.out.println("Negatif sayi giremezsiniz");
                sayacNegatif++;
            } else if (sayi>0){
                toplam+=sayi;
                sayacPozitif++;
            }
        } while (sayi!=0);

        System.out.println("girilen negatif sayıların adedi " +sayacNegatif);
        System.out.println("girilen pozitif sayıların adedi " +sayacPozitif);
        System.out.println("girilen pozitif sayıların toplamı "+ toplam);







    }
}
