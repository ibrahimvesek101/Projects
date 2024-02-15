package IfElse;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        /* str bir String'dir.
        Eğer String Orange'ye eşit ise ve uzunluğu 6'ya eşit ise "Orange has six letters" yazdırınız.
        Eğer String Apple'ye eşit ise ve uzunluğu 5'ya eşit ise "Apple has five letters" yazdırınız.
        Eğer String Orange'yi kapsıyorsa ve uzunluğu 10'dan fazla ise
        "String contain orange and length is more then 10" yazdırınız.
        Not: Uzunluk derken ingilizcedeki "length" yani karakter sayısından bahsediliyor.  */

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // str== Orange VE karakter uzunluğu 6 ysa

        if (str.equals("Orange") && str.length()==6) {
            System.out.println("Orange has six letters");
        }

        if (str.equals("Apple") && str.length()==5) {
            System.out.println("Apple has five letters");
        }

        if (str.contains("Orange") && str.length()>10) {
            System.out.println("String contain orange and length is more then 10");
        }





    }
}
