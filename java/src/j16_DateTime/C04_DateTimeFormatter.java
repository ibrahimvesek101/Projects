package j16_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt= LocalDateTime.now();// sistemiden mevcut date ve tiem datası ldt'ye atandı
        System.out.println("ldt = " + ldt);// 2023-02-24T21:45:32.610425

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd - MM - YY");//tarih print edecek format tanımlandı
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("HH : mm : ss");//zaman print edecek format tanımlandı
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh : mm : ss");//zaman print edecek format tanımlandı

        System.out.println("dtf1.format(ldt) = " + dtf1.format(ldt));// 24 - 02 - 23
        System.out.println("dtf2.format(ldt) = " + dtf2.format(ldt));// 21 : 58 : 46
        System.out.println("dtf3.format(ldt) = " + dtf3.format(ldt));// 09 : 59 : 59
/*
		 format->
		 GUN
		 d : basta 0 varsa 0 yazmadan gun numarasi yazılır
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi yazar
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa 0 yazmadan ay numarasi yazılır
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
		 MMM : Ay isminin ilk 3 harfi yazılır
		 MMMM : Ay isminin tamami yazılır

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini yazılır

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati 2 gibi yazar

		 hh :  12 saat dilimine gore 2 rakam olarak yazılır
		 h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

		 m : minute tek rakamlari 8 gibi  tek yazlır
		 mm: tek rakamlari 08 gibi yazılır

		 a yazarsak AM veya PM degerini yazar


		 */

    }
}
