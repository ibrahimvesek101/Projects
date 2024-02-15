package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true


    }
}

