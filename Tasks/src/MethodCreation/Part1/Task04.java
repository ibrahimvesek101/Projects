package MethodCreation.Part1;

import java.util.Scanner;


public class Task04 {
         /*
         Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
         çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */

    public static void main(String[] args) {
        System.out.println("yapmak istediğiniz işlemi seçiniz");
        System.out.println("bakiye öğrenmek ->1 \n para yatırma->2 \n para çekme->3 \n çıkış->4");
        secim();
    } // main bitişi
    static Scanner scan= new Scanner(System.in);
    static int bakiye=1000;
    private static void secim() {
        int secim =scan.nextInt();
        switch (secim) {
            case 1:
                bakiyeOgren();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                cikıs();
                break;
            default:
                System.out.println("gecersiz seçim");
                secim();
        }


    }
    private static void cikıs() {
        System.out.println("çıkış yapıldı");
    }

    private static void paraCek() {
        System.out.println("ne kadar para çekeceksinzi?");
        int cekilecekPara=scan.nextInt();
        if (bakiye>cekilecekPara) {
            bakiye-=cekilecekPara;
            System.out.println("para çekildi yeni bakiye "+bakiye);
        } else System.out.println("yetersiz bakiye");
        devam();
    }

    private static void paraYatir() {
        System.out.println("ne kadar para yatıracaksınız?");
        int yatirilanPara=scan.nextInt();
        bakiye+=yatirilanPara;
        System.out.println("para yatırıldı yeni bakiye "+bakiye);
        devam();
    }

    private static void bakiyeOgren() {
        System.out.println(bakiye);
        devam();
    }

    private static void devam() {
        System.out.println("işleme devam etmek için ->1 \n çıkış için->2");
        int karar= scan.nextInt();
        if (karar==1) {
            System.out.println("bakiye öğrenmek ->1 \n para yatırma->2 \n para çekme->3 \n çıkış->4");
            secim();
        } else if(karar==2) {
            cikıs();
        } else System.out.println("geçersiz sayı");
    }

}
