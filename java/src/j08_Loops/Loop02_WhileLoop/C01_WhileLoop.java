package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
        net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
         */
        //task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.
        System.out.println("   ***   Task01   ***   ");
        int basla = 3;//while başlangıç değeri

        while (basla <= 20) {//basla 20den kucuk eşit oldugu surece sartı->true while body action alır
            System.out.print(basla + " ");//3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
            basla++;//while loop değişim komutu
        }

        // task02-> 7 kere javaCAN print eden code create ediniz
        System.out.println("   ***   Task02   ***   ");

        int b = 1;
        while (b <= 7) {
            System.out.println(b + ". javaCAN");
            b++;
        }
        // task03->2 basamaklı tek sayıları print eden code create ediniz
        System.out.println("   ***   Task03   ***   ");
        int bs = 10;
        while (bs <= 99) {

            if (bs % 2 == 1) {
                System.out.print(bs + " ");
            }

            bs++;//her döngüde 1 artacak
        }

        // task04->bir basamaklı sayma sayılarını aynı satırda print eden code create ediniz
        System.out.println("   ***   Task04   ***   ");

        int c = 1;
        while (c < 10) {
            System.out.print(c + " ");
            c++;
        }

        // task05->girilen ifadeyi tersten  print eden code create ediniz
        System.out.println("   ***   Task05   ***   ");

        Scanner sc = new Scanner(System.in);

     //  System.out.print("gakgom bişey girisin : ");
     //  String bişey = sc.nextLine();
     //  int bişeyUzunluk = bişey.length();
     //  while (bişeyUzunluk >= 1) {
     //      System.out.print(bişey.charAt(bişeyUzunluk - 1));
     //      bişeyUzunluk--;
     //  }

        // task06->girilen tamsayıya kadar sayıların toplamını  print eden code create ediniz
      // System.out.println("   ***   Task06   ***   ");

       System.out.print("gakgom bisayi girisin : ");

        int biSayı = sc.nextInt();
        int toplam = 0;

     //  while (biSayı >= 0) {
     //      toplam += biSayı;
     //      biSayı--;
     //  }
     //  System.out.println("toplam = " + toplam);

        // task07->girilen tamsayının faktöriyelini  print eden code create ediniz
        System.out.println("   ***   Task07   ***   ");
        int faktoriyel=1;

        while (biSayı > 0) {
            faktoriyel*= biSayı;
            biSayı--;
        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
