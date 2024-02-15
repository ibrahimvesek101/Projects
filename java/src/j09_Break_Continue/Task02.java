package j09_Break_Continue;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // Task-> girilen 7 tamsyının 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.

        Scanner input = new Scanner(System.in);


        int toplam=0;

        for (int i = 1; i < 8; i++) {//i=1,2,3,4,5,6,7 için  loop tanımlandı
            System.out.print(i+". sayıyı gakgom hele giresen ha :");
            int sayi = input.nextInt();

            if (sayi>10&&sayi<20){//girilen sayının 10-20 arası olma şartı
                System.out.println("Gakgom girdigin sayi :"+sayi+"-> 10-20 arası toplamirem haa :( ");
                continue;
            }
            toplam+=sayi;//sartı 10-20 arası olmayan->if e girmeyen sayı toplma eklendi
        }
        System.out.println("toplam sayı :"+toplam);
    }
}
