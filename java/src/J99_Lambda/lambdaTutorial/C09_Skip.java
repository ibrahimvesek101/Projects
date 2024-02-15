package J99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_Skip {
    public static void main(String[] args) {
        //skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        // akıs n den daha az eleman içeriyorsa  skip(n) meth dan sonra boş akıs return eder.skip(n) ara işlemdir.
        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("   task   ");
        printIlk2HariçSonHarfSıralı( yemahhh);
        /*
           *** version01  ***
trileçe bicibici tantuni büryan Welemen cacix kokereç güveç soğanlı arabAşı
   *** version02  ***
[trileçe, bicibici, tantuni, büryan, Welemen, cacix, kokereç, güveç, soğanlı, arabAşı]
   *** version03  ***
[trileçe, bicibici, tantuni, büryan, Welemen, cacix, kokereç, güveç, soğanlı, arabAşı]
         */
    }//main sonu


    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print eden code create ediniz.

    public static void printIlk2HariçSonHarfSıralı(List<String> yemahhh) {
        System.out.println("   *** version01  ***   ");
        yemahhh
                .stream()
                .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                .skip(2)
                .forEach(C01_LambdaExpression::yazdirStrt);
        System.out.println("\n   *** version02  ***   ");

        System.out.println(Arrays.toString(yemahhh
                .stream()
                .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .skip(2)
                .toArray()));
        System.out.println("   *** version03  ***   ");

        System.out.println(Arrays.asList(yemahhh
                .stream()
                .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .skip(2)
                .toArray()));
    }

}
