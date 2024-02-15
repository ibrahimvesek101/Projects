package IfElse;

import java.util.Scanner;

public class ifElse10 {
    public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 sayi 3 basamakli ise console ' a 3 basamakli yazdirin
		 sayi 2 basamakli ise console'a 2 basmakli yazdirin
		 sayi 3 basamakli yada 2 basamakli degilse ikiside degil yazdirin
		 */

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        // 99 dan büyük ve 1000 den küçük, 100 e eşit veya küçük 999 a eşit veya küçük
        // 10 la 99
        if (sayi>=100 && sayi<=999) {
            System.out.println("üç basamaklı");
        } else if (sayi>=10 && sayi<=99) {
            System.out.println("2 basamaklı");
        } else {
            System.out.println("ikiside degil");
        }
    }
}
