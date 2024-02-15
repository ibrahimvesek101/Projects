package j26_Exceptions;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
        'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
        int v = vize
        int f = final

        Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
        Diğer durumlarda ise,
        vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
        vizeye 120, finale 80 girin.

        Programın çalışmasını sağlayın. (handle edin)
         */
        Scanner input = new Scanner(System.in);
        int vize;
        int finale;

        while (true) {
            try {
                System.out.print("Agam vize notu giresen : ");
                vize = input.nextInt();
                if (vize < 0 || vize > 100) {
                    throw new ArithmeticException("Notlar 0-100 arasında olmalı");
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Hatalı giriş yaptınız  " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Agam final notu giresen : ");
                finale = input.nextInt();
                if (finale < 0 || finale > 100) {
                    throw new ArithmeticException("Notlar 0-100 arasında olmalı");
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Hatalı giriş yaptınız  " + e.getMessage());
            }
        }

        System.out.println("ortalamanız : " + ortalamaHesapla(vize, finale));

    }//main sonu

    private static double ortalamaHesapla(int vize, int finale) {

        return (vize * 0.4) + (finale * 0.6);

    }


}//Class sonu



































