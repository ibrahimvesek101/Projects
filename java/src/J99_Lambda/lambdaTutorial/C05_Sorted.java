package J99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));

        System.out.println("   task01   ");

        printCiftElKareKbSıra(sayiList); // 256 1444 2116 2916 3364
        System.out.println("\n   task02   ");
        printTekElKareBkSıra(sayiList); // 4225 3721 3481 2025 1681 1089 625 169 49


    }//main sonu

    // Task01-> list çift elemanlarının karelerini k->b sıra ile print eden code create ediniz

    public static void printCiftElKareKbSıra(List<Integer> sayiList) {


        sayiList
                .stream() // list elemanları akışa alındı
                .filter(C01_LambdaExpression::ciftMi) //akışdaki list çift elelmanları filtrelendi
                .map(t -> t * t)//alışdaki filtrelene çift elemanlar karesine update edildi
                .sorted()//akışdaki karesine update edilen çift elemanlar naturel order yapıldı
                .forEach(C01_LambdaExpression::yazdirInt);
/*
sorted() -> akışdaki elemanları naturel order (doğal sıra) halinde akış return eder
sorted() tekrarlı kullanılırsa son return aktif olur...
 */

    }

    // Task02-> list tek elemanlarının karelerini b->k sıra ile print eden code create ediniz
    public static void printTekElKareBkSıra(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(t->t%2==1)
                .map(t->t*t)
                .sorted(Comparator.reverseOrder())//akışdaki elemanlar parametre-> tersSıra ile sıralandı
                .forEach(C01_LambdaExpression::yazdirInt);
    }
}
