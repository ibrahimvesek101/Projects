package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // LocalTime -> saat-dakika-saniye datalarını tutar.


       LocalTime suAn= LocalTime.now();//sistemden mevcut zaman bilgisi suAn'a atandı
       System.out.println("suAn = " + suAn);// 21:15:36.692791

       System.out.println("suAn.getHour() = " + suAn.getHour());// 21
       System.out.println("suAn.getMinute() = " + suAn.getMinute());// 16
       System.out.println("suAn.getSecond() = " + suAn.getSecond());// 51
       System.out.println("suAn.getNano() = " + suAn.getNano());// 126628000

       //// tanımlanan bir Time'in öncesi -> minus() ve sonrası -> plus() gitme...
       LocalTime time1=LocalTime.of(17,23,53);
       System.out.println("time1.plusHours(3).minusMinutes(83).plusSeconds(100) = " + time1.plusHours(3).minusMinutes(83).plusSeconds(100));// 19:02:33

        LocalTime loopBası=LocalTime.now();//loop başalamadan mevcut time alındı
        System.out.println("loopBası.getNano() = " + loopBası.getNano());
        int  sayi=0;

        for (int i = 0; i < 10; i++) {
            sayi+=i;
        }

        LocalTime loopsonu=LocalTime.now();//loop bittikten sonraki mevcut time alındı
        System.out.println("loopsonu.getNano() = " + loopsonu.getNano());
        System.out.println("Loop çalışma suresi : " + (loopsonu.getNano() - loopBası.getNano()));


    }
}
