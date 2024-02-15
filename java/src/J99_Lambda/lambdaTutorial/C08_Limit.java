package J99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C08_Limit {
    public static void main(String[] args) {
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.
        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("   task   ");
        printEnBykcharSayisi(yemahhh);


    }//main sonu

    // Task01-> list elemanlarının karakter sayısı en buyuk olanı print code create ediniz...

    public static void printEnBykcharSayisi(List<String> yemahhh) {


        System.out.println(yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())//9,8,7,6....
                .limit(1));// java.util.stream.SliceOps$1@3b6eb2ec

        System.out.println("   *** version01 ***   ");

        Stream<String> enBykKrktrEleman = yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())//9,8,7,6....
                .limit(1);
        System.out.println(Arrays.toString(enBykKrktrEleman.toArray()));//enBykKrktrEleman toArray ile Arraya çevrildi.array toString ile print edildi
        /*
        limit(a)-> return typ bir Stream oldg için yani yeni bir elelman akışı oldg için birden çok elelman return edebilir.
        dolayısıyla limit() meth çıktısı doğrudan sout parametre olamaz(print edilemez) .
        limit() meth cıktısı array veya List gibi bir collectiona atanmalı.
         */
        System.out.println("   *** version02 ***   ");
        Object[] yemahhArr = yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())//9,8,7,6....
                .limit(1).toArray();
        System.out.println(Arrays.toString(yemahhArr));//[bicibici]

        System.out.println("   *** version03 ***   ");
        System.out.println(yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())//9,8,7,6....
                .findFirst());//ıkşdaki ilk elemanı verir.

        System.out.println("   *** version04 ***   ");
        yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())//9,8,7,6....
                .limit(1).forEach(C01_LambdaExpression::yazdirStrt);//ıkşdaki ilk elemanı verir.
        System.out.println("   *** version05 ***   ");
        String enBuyukEleman = yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1)
                .collect(Collectors.toList())
                .toString();
        System.out.println(enBuyukEleman);
    }

}
