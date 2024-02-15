package ForLoop;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */

        Scanner sc = new Scanner(System.in);
        int toplam=0;

        for (int i=1; i<=5; i++) {
            System.out.println("Sayı giriniz");
            int sayi=sc.nextInt();
            if (sayi<=10 || sayi>=20){
                toplam=toplam+sayi; // toplam+=sayı
            }

        }
        System.out.println(toplam);



    }
}
