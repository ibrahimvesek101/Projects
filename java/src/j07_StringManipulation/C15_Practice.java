package j07_StringManipulation;

import java.util.Scanner;

public class C15_Practice {
    public static void main(String[] args) {
        /*
        Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
        sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
        1-en az 8 karakter uzunlugunda,
        2-ilk harf buyuk,
        3-son harf kucuk,
        4-boşluk içermemeli
         */


        Scanner input = new Scanner(System.in);
        System.out.print("Agam password giresen : ");
        String password = input.nextLine();

        if (password.length() >= 8 &&//password 8 karakterden buyuk ve eşit olma şartı
                !password.contains(" ") && //password " " içermeme şartı
                Character.isUpperCase(password.charAt(0)) &&//password ilk harf buyuk olma şartı
                Character.isLowerCase(password.charAt(password.length() - 1)) //password son harf kucuk olma şartı
        ) {
            System.out.println("gayet başarılı DEWAMKEEE :)");
        } else System.out.println("Çok başarısız :( agam yeni password giresen");

    }


}
