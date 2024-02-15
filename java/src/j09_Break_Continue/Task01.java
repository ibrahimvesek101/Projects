package j09_Break_Continue;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("gakgom hele biseyler  giresen ha :");
        String biSey = input.nextLine();
        int aSayisi = 0;

        for (int i = 0; i < biSey.length(); i++) {

            if (biSey.charAt(i) == 'a') {//döngüdeki biSey karakterlerinin 'a' olma şartı
                aSayisi++;
            } else if (biSey.charAt(i) == 'c') {//döngüdeki biSey karakterlerinin 'c' olma şartı
                break;
            }
            System.out.println("loopdaki kontrole giren karakterler : " + biSey.charAt(i));
        }
        System.out.println();
        System.out.println("Gakgom giridgin biSeydeki a sayisi :" + aSayisi + " kadar ");
    }
}
