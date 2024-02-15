package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner input = new Scanner(System.in);
        System.out.print("gakgom hele bi sayi giresen ha :");
        int sayi = input.nextInt();//haluk girdiğisayi

        boolean asalMi = true;//furkanın elindeki bayrak havada

        for (int i = 2; i < sayi; i++) {//suzanın girilen sayı tekrarı
            if (sayi % i == 0) {//döngüdeki her bir tekara girilen sayıyı tam bölme şartı
                asalMi = false;//bölen sayı bulundugu için asallık flase atandı
                break;
            }
        }
        if (asalMi) {
            System.out.println("gakgom girilen sayi ASAL :) ");
        } else System.out.println("gakgom girilen sayi ASAL değılll :( ");
    }
}
