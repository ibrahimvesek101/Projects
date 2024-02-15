package MethodCreation.Part1;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesaiye başlama saatinizi girin");
        double start= scan.nextDouble();
        System.out.println("Mesai bitiş saatinizi yazınız");
        double finish= scan.nextDouble();
        System.out.println("mesai ücreti");
        double ucret=scan.nextDouble();
        System.out.println("fazla mesai ucret katsayısını yazınız");
        double ucretKatsayısı=scan.nextDouble();

        System.out.println(ucretHesaplama(9.0, 20.0, 40.0, 1.8));
        System.out.println(ucretHesaplama(start, finish, ucret, ucretKatsayısı));
    }

    private static double ucretHesaplama(double baslama, double bitis, double mesaiUcret, double katsayi) {
    double a= (17-baslama)*mesaiUcret;
    double b= (bitis-17)*mesaiUcret*katsayi;
    return a+b;
    }


}
