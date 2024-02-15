package j26_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
  Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Agam password giresen : ");
        String password = input.nextLine();

        try {
            if (password.length() < 6 || password.length() > 10) {
                throw new IllegalArgumentException("Agam pass'ın 6'dan az yada 10'dan coğğğ");
            } else System.out.println("agam pass gayet başarılı :) ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Agam tekrar giresen ");

            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");

    }
}
