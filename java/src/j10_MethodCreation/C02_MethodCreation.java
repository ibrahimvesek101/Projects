package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz
        int toplam = 0;//boş kutu
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " sayı giriniz :");
            toplam += input.nextInt();
        }
        System.out.println(ortalamaHesapla(toplam));//3 int p'li method call edildi
        ortalamaHesapla1(toplam);
    }//main sonu

    private static int ortalamaHesapla(int sayı) {

        return (sayı) / 3;
    }

    private static void ortalamaHesapla1(int sayı) {

        System.out.println("ben hesapla1 methoduyum "+((sayı) / 3));
    }

}//class sonu
