package J99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_Reduce {
    public static void main(String[] args) {
           /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        // List<Integer> sayiList = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        System.out.println("   task01   ");
        printCiftKareMaxEl(sayiList); // Optional[3364.0]->

        System.out.println("   task02   ");

        elTopla(sayiList); //
        System.out.println("   task03   ");

        ciftElCarp(sayiList); // carpım = 1
        System.out.println("   task04   ");
        enKckElPrint(sayiList); // 7

        System.out.println("   task05   ");
        print58BykTekMin( sayiList); // Optional[59]

    }//main sonu
    //Task01-> list çift elemanlarının karelerinin en buyugunu print code create ediniz...

    public static void printCiftKareMaxEl(List<Integer> sayiList) {
        Optional<Double> maxSayi = sayiList
                .stream()
                .filter(C01_LambdaExpression::ciftMi)
                .map(t -> Math.pow(t, 2))
                .reduce(Math::max);
        System.out.println(
                sayiList
                        .stream()
                        .filter(C01_LambdaExpression::ciftMi)
                        .map(t -> Math.pow(t, 2))
                        .reduce(Math::max) // Optional[3364.0]
        );
        System.out.println("maxSayi = " + maxSayi); // maxSayi = Optional[3364.0]

        // int a=9;
        // System.out.println("a = " + a);
        // System.out.println( 9);

    }

    //Task02-> list elemanlarının toplamını  print code create ediniz...
    public static void elTopla(List<Integer> sayiList) {

        System.out.println(sayiList
                .stream()
                .reduce(Math::addExact));// 1+3+5+7=16

        Optional<Integer> listToplamı = sayiList
                .stream()
                .reduce(Math::addExact);
        System.out.println(listToplamı);// 1+3+5+7=16

        System.out.println(sayiList
                .stream()
                .reduce(Integer::sum));//specific Class daha hızlı çalışır // 1+3+5+7=16

        int sayiListToplamı = sayiList
                .stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("sayiListToplamı = " + sayiListToplamı); //sayiListToplamı = 16
        /*
        a: ilk değerini her zaman  atanan identity değerden alır.
        b: değerini her zaman Stream()'den alır
        a: ilk değerden sonraki değerini action(işlem body)'den alır
          */
    }

    //Task03-> list'in çift elemanlarının çarpımını  print code create ediniz...
    public static void ciftElCarp(List<Integer> sayiList) {

        int carpım = sayiList
                .stream()
                .filter(C01_LambdaExpression::ciftMi)
                .reduce(1, (t, u) -> t * u);

        System.out.println("carpım = " + carpım); //
        Optional<Integer> carp1 = sayiList
                .stream()
                .filter(C01_LambdaExpression::ciftMi)
                .reduce(Math::multiplyExact);
        System.out.println("carp1 = " + carp1); // carp1 = Optional.empty
    }

    //Task04-> list elemanlarının en küçüğünü  print code 4 farklı create ediniz...
    public static void enKckElPrint(List<Integer> sayiList) {
        System.out.println(sayiList.stream().reduce(Math::min));// 1.yol -> Math meth. reference
        System.out.println(sayiList.stream().reduce(Integer::min));// 2.yol -> Integer meth. reference
        System.out.println(sayiList.stream().reduce(C04_Reduce::byHalukMinBul));// 3.yol -> Seed meth reference
        // sayiList.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);// 4.yol -> identity expression
        System.out.println(sayiList.stream().reduce(sayiList.get(0), (a, b) -> a < b ? a : b));// 4.yol -> identity expression


    }

    public static int byHalukMinBul(int a, int b) {
        return a < b ? a : b;
    }

    // Task05-> List elemanlarının 58'den buyuk en kucuk tek elemanını print eden code create ediniz...
    public static void print58BykTekMin(List<Integer> sayiList) {
        System.out.println(sayiList.stream().filter(t -> t > 58 && t % 2 == 1).reduce(Integer::min));
       // System.out.println(sayiList.stream().filter(t -> t > 58 && C01_LambdaExpression::ciftMi).reduce(Integer::min));
//CTE-> exp ve meth. ref aynı pararmetrede tanımlanamaz
    }


}











