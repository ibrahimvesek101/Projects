package MethodCreation.Part2;

import java.util.Scanner;

public class Task01 {
    static Scanner scan = new Scanner(System.in);
    static String tersCevrilmis="";
    public static void main(String[] args) {

        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD
            create ediniz

            input:1453
            output:3541
         */
        tersCevir();

    } // main bitişi

    private static void tersCevir() {
        System.out.println("sayı giriniz");
        int sayı=scan.nextInt();
        String str= String.valueOf(sayı);
        for (int i = str.length()-1; i>=0; i--) {
            tersCevrilmis=tersCevrilmis+=str.charAt(i);
        }
        System.out.println(tersCevrilmis);

    }

}

