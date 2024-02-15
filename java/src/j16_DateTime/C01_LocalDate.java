package j16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        //LocalDate -> sadece gün-ay-yıl datalarını tutar..
        LocalDate bugun = LocalDate.now();//sistemden mevcut tarih datası bugun'e atandı
        System.out.println("bugun = " + bugun);//bugun = 2023-02-24

        System.out.println("bugun.getYear() = " + bugun.getYear());// 2023
        System.out.println("bugun.getMonth() = " + bugun.getMonth());// FEBRUARY
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());// 2
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());// 24
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());// FRIDAY
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());// 55
        System.out.println("   ***   ");
        LocalDate date1 = LocalDate.of(2016, 3, 23);
        LocalDate date2 = LocalDate.of(2014, Month.MAY, 19);

        // tanımlanan bir date'in öncesi -> minus() ve sonrası -> plus() gitme...
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date1.plusDays(45) = " + date1.plusDays(45));//
        System.out.println("date2.minusWeeks(33) = " + date2.minusWeeks(33));
        System.out.println(bugun.plusDays(11).minusWeeks(7).plusMonths(3).minusYears(5));//


    }
}
