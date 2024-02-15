package SwitchCase;

import java.util.Scanner;

public class switch04 {
    public static void main(String[] args) {
        // kullanicidan VIP (Very Important Person) kisaltmasinda hangi harfin anlamini
        // istedigi soralim
        // girilen harfin aciklamasini yazdiralim
        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        String str= scan.next();

        switch (str) {
            case "v":
            case "V":
                System.out.println("very");
                break;
            case "i":
            case "I":
                System.out.println("important");
                break;
            case "p":
            case "P":
                System.out.println("person");
                break;
            default:
                System.out.println("geçersiz harf");
        }
    }
}
