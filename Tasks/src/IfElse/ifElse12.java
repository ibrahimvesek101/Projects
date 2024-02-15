package IfElse;

import java.util.Scanner;

public class ifElse12 {
    public static void main(String[] args) {
        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınız giriniz");
        int yas = scan.nextInt();

        if (yas<0) {
            System.out.println("geçersiz yaş");
        } else if (yas<5) {
            System.out.println("bebek");
        } else if (yas<13) {
            System.out.println("cocuk");
        } else if (yas<21) {
            System.out.println("genç");
        } else if (yas<31) {
            System.out.println("yetişkin");
        } else {
            System.out.println("Tanimlanmamis evre");
        }

    }
}
