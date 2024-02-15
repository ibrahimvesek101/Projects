package IfElse;

import java.util.Scanner;

public class ifElse11 {
    public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz ");
        char ch =scan.next().charAt(0);
        // küçük harf mi değil mi
        if (ch>='a' && ch<='z') {
            if (ch=='a') {
                System.out.println("ilk küçük harf");
            } else {
                System.out.println("ilk küçük harf değil");
            }
        } else if (ch>='A' && ch<='Z') {
            if (ch == 'Z') {
                System.out.println("Son büyük harf");
            } else {
                System.out.println("Son büyük harf değil");
            }

        }

    }
}
