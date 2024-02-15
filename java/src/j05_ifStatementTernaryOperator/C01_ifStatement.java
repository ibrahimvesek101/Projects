package j05_ifStatementTernaryOperator;

public class C01_ifStatement {//class bası

    // if statement blok belli durum ve aksiyonları belirli şarta bağlı
    // olarak çalıştırmak için kullanılır
    public static void main(String[] args) {//main bası

        int abdiYas = 33;//int data type'da abdiYas adsında değeri 33 olan variable create edildi.
        int mstfYas = 41;
        if (abdiYas == mstfYas) {//abdiYas ile mstfYas eşitliği kontrol edildi
            System.out.println("yasdas arkadaslar  :)");
            System.out.println("yoksam siz gardeş misiniz ? :-)");
        }
        if (mstfYas >= 40) {//mstfYas 40'a eşit veya buyuk kontrolu yapıldı
            System.out.println("mıstaaa bey 40 yas dırt yas :)");
        }

        // bağımsız if blok ları sadece kendi scope(kapsam) run eder.
        // Birden fazla if blok  hepsinin body çalışabileceği gibi şart sağlanmazsa hiç biri de çalışmayabilir.

        if (abdiYas + mstfYas > 10) {
            System.out.println("bir asırlık yas :)");
            //if blok'da {} kullanılmazsa (bad practice) ilk; kadar komut if ile çalışır sonrası if'den bağımsız run olur.
            System.out.println("agam dewamkee code sorunsuz run oldu  :)");
        }


    }//main sonu
}//class sonu
