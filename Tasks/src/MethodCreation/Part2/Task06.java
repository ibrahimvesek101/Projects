package MethodCreation.Part2;

import java.util.Scanner;


public class Task06 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini
         ekrana yazdıran programı yazınız.
         şekil, sayı1, sayı2
	 */
        System.out.println("kare, dikdörtgen,üçgen birini seçiniz : ");
        String sekil = sc.next().toLowerCase();
        System.out.println("1. sayıyı giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        int sayi2 = sc.nextInt();
        secim(sekil,sayi1,sayi2);

    }

    private static void secim(String sekil, int sayi1, int sayi2) {
        switch (sekil) {
            case "kare":
                kareAlan(sayi1);
                kareCevre(sayi1);
                break;
            case "dikdörtgen":
                dikdortgenAlan(sayi1, sayi2);
                dikdortgenCevre(sayi1, sayi2);
                break;
            case "üçgen":
                ucgenAlan(sayi1);
                ucgenCevre(sayi1);
        }
    }

    private static void ucgenCevre(int sayi1) {
        System.out.println("ucgen cevre :"+(sayi1*3));
    }

    private static void ucgenAlan(int sayi1) {
        System.out.println("üçgenin yüksekliğini giriniz");
        int yukseklik=sc.nextInt();
        System.out.println("ucgen alanı :"+((yukseklik*sayi1)/2));
    }

    private static void dikdortgenCevre(int sayi1, int sayi2) {
        System.out.println("dikdörtgen çevresi : "+ ((sayi2+sayi1)*2));
    }

    private static void dikdortgenAlan(int sayi1, int sayi2) {
        System.out.println("dikdortgen Alanı : "+(sayi2*sayi1));
    }

    private static void kareCevre(int sayi1) {
        System.out.println("kare cevre: " +(sayi1*4));
    }

    private static void kareAlan(int sayi1) {
        System.out.println("kare alan: " +(sayi1*sayi1));

    }
}
