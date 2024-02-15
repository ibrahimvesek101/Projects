package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Task->
           girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam yilini   gir : ");
        int yil = sc.nextInt();

          // 4'un katı       100'un katı olmaması    400'un katı olması
        if ((yil%4==0)       &&  (yil %100!=0)  ||   (yil%400==0) ){
            System.out.println("girdiğiniz yil artık yıl  :-)");
        }else {
            System.out.println("giridiğinz yıl artık yıl değildir  :-(");
        }

        System.out.println((yil % 4 == 0) && (yil % 100 != 0) || (yil % 400 == 0) ? "girdiğiniz yil artık yıl  :-)" : "giridiğinz yıl artık yıl değildir  :-(");


    }
}
