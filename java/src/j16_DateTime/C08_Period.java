package j16_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // Period-> iki tarih arasındaki geçen tekrarlanan datayı tutar

        LocalDate bugun = LocalDate.now();
        LocalDate abdiBey = LocalDate.of(1983, 10, 8);

        Period p1 = Period.between(abdiBey, bugun);
        System.out.println("p1 = " + p1);// P39Y4M16D
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths());//472
        System.out.println("p1.getDays() = " + p1.getDays());//16
        System.out.println("p1.getYears() = " + p1.getYears());// 39

        System.out.println("   ***   ");
        System.out.println("bugun = " + bugun);//bugun = 2023-02-24

        Period period9Gun = Period.ofDays(9);//9 gun bir tekrarlayan period tanımlandı
        Period period7ay = Period.ofMonths(7);//7 ayda bir tekrarlayan period tanımlandı
      // Period periodX = Period.ofMonths(7).ofDays(1);//1 günde bir tekrarlanan period
        //Trick -> period tanımlamadan birden çok zaman parametresi tanımlanırsa son
        // parametre çalışır diğerlerini ezer
        bugun.minus(period7ay);//bugunun  7 ay öncesi
        System.out.println("period7ay sonrası bugun = " + bugun);//bugun = 2023-02-24

        bugun = bugun.plus(period9Gun);//bugunun 9 gun sonrası atandı
        System.out.println("period9Gun sonrası bugun = " + bugun);//bugun = 2023-03-05

        // task-> 2.01.2023 de tarihinde başlayan kurusun suresi 9 ay olduguna göre kurs bitiş tarihini print eden code create ediniz

        LocalDate kursBasla = LocalDate.of(2023, 1, 2);
        Period kursSure = Period.ofMonths(9);
        System.out.println("kurs bitis : " + kursBasla.plus(kursSure).format(DateTimeFormatter.ISO_LOCAL_DATE));//kurs bitis : 2023-10-02
        // ISO -> International Organization for Standardization
    }
}
