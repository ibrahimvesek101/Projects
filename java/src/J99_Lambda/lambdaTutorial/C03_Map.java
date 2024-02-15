package J99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 3, 11, 4, 12, 2, 5, 17));
        // System.out.println(sayiList); // [7, 3, 11, 4, 12, 2, 5, 17]
        System.out.println("   task01   ");
        printCiftElKareFunctional(sayiList); // 16 144 4
        System.out.println("\n   task02   ");
        printElTekKup1Fazla(sayiList); // 344 28 1332 126 4914
        // System.out.println(sayiList); // [7, 3, 11, 4, 12, 2, 5, 17]
        System.out.println("\n   task03   ");
        printElCiftKarakokFunctional(sayiList); //2 3 1

        System.out.println("\n   task04   ");

    }//main sonu


    // task01-> listin çift elemanlarının karelerini aynı satıra aralarına bosluk bırakarak print ediniz.
    public static void printCiftElKareFunctional(List<Integer> sayiList) {
        sayiList
                .stream()//list elemanları akısa alındı
                .filter(C01_LambdaExpression::ciftMi)//akısdaki list elemanları çift sarta göre filtrelendi
                // .map(t->t*t) // çift sarta fitrelene list elemanları karesine update (maping) edildi
                //.map(t->(int)Math.pow(t,2)) // çift sarta fitrelene list elemanları karesine update (maping) edildi
                .map(C03_Map::kareAl) // çift sarta fitrelene list elemanları karesine update (maping) edildi
                .forEach(C01_LambdaExpression::yazdirInt); // akısdaki maping(update) elemanların herbiri prşnt edildi

        //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için map kullanılmaktadır.


    }

    public static int kareAl(int a) {
        return a * a;
    }
    // Task02 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void printElTekKup1Fazla(List<Integer> sayiList) {

        sayiList
                .stream()//list elemanları akısa alındı
                .filter(t -> t % 2 == 1)//akısdaki list elemanları tek sarta göre filtrelendi
                // .map(t->t*t*t+1) // çift sarta fitrelene list elemanları karesine update (maping) edildi
                .map(t -> (int) Math.pow(t, 3) + 1) // tek sarta fitrelene list elemanları kup fazlasına update (maping) edildi
                .forEach(C01_LambdaExpression::yazdirInt); // akısdaki maping(update) elemanların herbiri prşnt edildi

        //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için map kullanılmaktadır.

    }

    // Task03-> Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printElCiftKarakokFunctional(List<Integer> sayiList) {

        sayiList.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(t->(int)Math.sqrt(t)).
                forEach(C01_LambdaExpression::yazdirInt);
    }
}
