package WhileLoop.Part2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı
        // adetini ve toplamını print eden code create edinz
        Scanner scan = new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayiAdedi=0;

        while (toplam<333) {
            System.out.println("lütfen bir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayiAdedi++;
        }
        System.out.println("sayıların toplamı: "+toplam+" toplam girilen sayı adedi:" +sayiAdedi);



    }
}

