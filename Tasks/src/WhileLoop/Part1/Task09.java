package WhileLoop.Part1;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz?");
        int sayiAdedi=scan.nextInt();
        int sayi =0;
        int toplam=0;
        int sayac=1;

        while (sayac<=sayiAdedi) {
            System.out.println("Lütfen bir sayı giriniz");
            sayi =scan.nextInt();
            toplam+=sayi;
            sayac++;
        }

        System.out.println("girilen " +sayiAdedi + " sayının toplamı: "+ toplam);





    }

}
