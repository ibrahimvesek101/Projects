package IfElse;

import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
         /*  int number 8. satırda.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        // ikiye tam olarak bölündüğünde kalan 0

        if (number%2==0) {
            System.out.println("number is a EVEN number");
        }
        if (number%2!=0) {
            System.out.println("number is a ODD number");
        }




    }
}
