package j05_ifStatementTernaryOperator;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
       /*
       Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
       Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir
       Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur
        */
        // Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.
        System.out.println("   ***  task01   ***   ");
        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz :");
        int sayi1 = input.nextInt();

        System.out.println("   ***  if blok   ***   ");

        if (sayi1 % 2 == 0) {
            System.out.println("agam sayi CIFT :) ");
        } else System.out.println("agam sayi TEK :( ");

        System.out.println("   ***  ternary blok   ***   ");
        // condition(şart)  ?(if-ise) şart true olunca yapılacak action    :   (else-değilse) şart false olunca yapılacak action
        String sonuc = sayi1 % 2 == 0 ? "agam sayi CIFT :) " : "agam sayi TEK :( ";//bu komutun çıktısı String Type variable'dır
        System.out.println(sonuc);
        System.out.println(sayi1 % 2 == 0 ? "agam sayi CIFT :) " : "agam sayi TEK :( ");
/*
 ahan da Trick02-> ternary operator action sonucu true veya false sonucuna göre bir cıktıverir.
 Eğer bu çıktı data Type'na göre bir variable atanmazsa CTE verir.
 Çözüm olarak ya print komutuna alınmalı yada bir variable atanmalı
 */
// Task02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.
        System.out.println("   ***  task02   ***   ");
        System.out.println("   ***  if blok   ***   ");

        if (sayi1> 0) {
            System.out.println("agam sayi POZİTİF :) ");
        } else System.out.println("agam sayi pozitif DEĞİL :( ");

        System.out.println("   ***  ternary blok   ***   ");
        // condition(şart)  ?(if-ise) şart true olunca yapılacak action    :   (else-değilse) şart false olunca yapılacak action
        String snc = sayi1> 0 ? "agam sayi POZİTİF :) " : "agam sayi pozitif DEĞİL :( ";//bu komutun çıktısı String Type variable'dır
        System.out.println(snc);

        // Task03-> girilen iki tamsayının buyugunu print eden code create ediniz.
        System.out.println("   ***  task03   ***   ");
        System.out.println("agam ikinci sayı da gir gari : ");
        int sayi2=input.nextInt();

        System.out.println("buyuk sayı : "+(sayi1 < sayi2 ? sayi2 : sayi1));

        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.
        System.out.println("   ***  task04   ***   ");

     // int  bişey = ((sayi1 < 0 && sayi2 > 0) || (sayi1 < 0 && sayi2 < 0)) ? sayi1 + sayi2 : "agam DEWAMKEEE";
     // String  baskaBişey = ((sayi1 < 0 && sayi2 > 0) || (sayi1 < 0 && sayi2 < 0)) ? sayi1 + sayi2 : "agam DEWAMKEEE";
      Object bambaskaBişey = ((sayi1 < 0 && sayi2 > 0) || (sayi1 > 0 && sayi2 < 0)) ? (sayi1 + sayi2) : "agam DEWAMKEEE";
        System.out.println("task04 : "+bambaskaBişey);
        // ahan da TRick-> java Class'ların hepsini kapsayan(parent) Object Class(Hz.Adem) denir.


    }//main sonu


}//class sonu

