package J99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinct {
    public static void main(String[] args) {
         List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
       // List<String> yemahhh = new ArrayList<>(Arrays.asList("bicibici", "güllaç", "sütlaç", "künefix", "bicibici", "güllaç", "güllaç"));
        System.out.println("\n   task01   ");
        printAlfbtkBykHrfBenzersiz(yemahhh); //BİCİBİCİ GÜLLAÇ KÜNEFİX SÜTLAÇ

        System.out.println("\n   task02   ");
        printCharSayisiTekrarsızTersSıra( yemahhh); //5 5 6 7 7 7 7 7 7 7 7 7 7 7 7 8
        System.out.println("\n   task03   ");
        printCharSayisiSıralı( yemahhh);
        System.out.println("\n   task04   ");
        printSonCharTersSıralı(yemahhh);
        System.out.println("\n   task05   ");
        printCharCiftTersSıra( yemahhh); // 64 36

    }//main sonu
    //Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...


    public static void printAlfbtkBykHrfBenzersiz(List<String> yemahhh) {
        yemahhh
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .distinct()
                .forEach(C01_LambdaExpression::yazdirStrt);

        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir.
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
    }

    // Task02-> : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print eden code create ediniz.
    public static void printCharSayisiTekrarsızTersSıra(List<String> yemahhh) {
        yemahhh
                .stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(C01_LambdaExpression::yazdirInt);
    }

    // Task03-> : list elemanlarinin character sayisini k->b sıralı print eden code create ediniz.
    public static void printCharSayisiSıralı(List<String> yemahhh) {
        yemahhh
                .stream()
                .map(String::length)
                .sorted()
                .forEach(C01_LambdaExpression::yazdirInt);
    }
    // Task04-> : list elemanlarini son characterine göre ters sıralı print eden code create ediniz.

    public  static  void printSonCharTersSıralı(List<String> yemahhh){

yemahhh
        .stream()
        .sorted(//
                Comparator.comparing(t->t.//
                        toString().
                        charAt(t.toString().length()-1)).//
                        reversed()//
        )
        .forEach(C01_LambdaExpression::yazdirStrt);
/*
sorted(Comparator.comparing(str -> str.charAt(str.length() - 1), Comparator.reverseOrder())
sorted((s1, s2) -> Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1)))
 */
    }
    // Task05-> listin elemanlarin  cift sayili karakterlerinin  karelerini  tekrarsiz buyukten kucuge sirali  print eden code create ediniz...

public  static  void  printCharCiftTersSıra(List<String> yemahhh){

        yemahhh
                .stream()
                .map(t->t.length()*t.length())//akış String elemanları char saysının karesine update edildi
                .filter(C01_LambdaExpression::ciftMi)//char karesi cift olanlar filtrelendi
                .distinct()// akış elemanları tekrarsı yapıldı
                .sorted(Comparator.reverseOrder())// akış elemanları ters b->k sıralandı
                .forEach(C01_LambdaExpression::yazdirInt);// print edildi

}









}