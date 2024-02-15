package IfElse;

import java.util.Scanner;

public class ifElse7 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
“Eşkenar üçgen�? yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen�?
yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın�?
		 */

        Scanner scan = new Scanner(System.in);
        int k1=scan.nextInt();
        int k2=scan.nextInt();
        int k3=scan.nextInt();
        // k1==k2 VEYA k1==k3 VEYA k2=k3

        if (k1==k2 && k1==k3 && k2==k3) {
            System.out.println("eşkenar üçgen");
        } else if (k1==k2 || k1==k3 || k2==k3) {
            System.out.println("ikizkenar üçgen");
        } else {
            System.out.println("çeşitkenar üçgen");
        }

    }
}
