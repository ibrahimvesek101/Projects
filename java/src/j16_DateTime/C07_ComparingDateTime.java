package j16_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {
        LocalDate böğüün = LocalDate.now();
        LocalDate falanGun = böğüün.plusDays(58);
        LocalDate feşmekanGun = böğüün.minusDays(23);
        LocalDate abdiBey = LocalDate.of(1983, 10, 8);

        System.out.println("böğüün = " + böğüün);//böğüün = 2023-02-24
        System.out.println("falanGun = " + falanGun);//falanGun = 2023-04-23
        System.out.println("feşmekanGun = " + feşmekanGun);//feşmekanGun = 2023-02-01
        System.out.println("abdiBey = " + abdiBey);//abdiBey = 1983-10-08

        System.out.println("böğüün.isAfter(abdiBey) = " + böğüün.isAfter(abdiBey));//True
        System.out.println("abdiBey.isBefore(feşmekanGun) = " + abdiBey.isBefore(feşmekanGun));//True
        System.out.println("falanGun.isBefore(feşmekanGun) = " + falanGun.isBefore(feşmekanGun));//False

        System.out.println("böğüün.isLeapYear() = " + böğüün.isLeapYear());//false

        System.out.println("böğüün.compareTo(abdiBey) = " + böğüün.compareTo(abdiBey));//40
        System.out.println("böğüün.compareTo(falanGun) = " + böğüün.compareTo(falanGun));// -2
        System.out.println("falanGun.compareTo(feşmekanGun) = " + falanGun.compareTo(feşmekanGun));// 2

        int ebikGabık = böğüün.compareTo(abdiBey);
        System.out.println("ebikGabık = " + ebikGabık);
        /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */
    }
}
