package MethodCreation.Part2;

import java.util.Scanner;

public class Task05 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
            // task26
            // task-> Girilen bir ifadenin tekrarlı
            // karakterleri yalnızca 1 kez print eden METHOD create ediniz
            // input-> javacanlara selam olsun
            // output-> javcnlr semou
            tekrarsizPrintEt();
    }

    private static void tekrarsizPrintEt() {
        System.out.println("metin giriniz");
        String str= scan.nextLine();
        String tekrarsiz="";
        for (int i=0; i<str.length(); i++) {
            if (!tekrarsiz.contains("" + str.charAt(i))) {
                tekrarsiz+=""+str.charAt(i);
            }
        }
        System.out.println(tekrarsiz);
    }
}
