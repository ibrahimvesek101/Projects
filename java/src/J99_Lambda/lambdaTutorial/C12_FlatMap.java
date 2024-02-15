package J99_Lambda.lambdaTutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class C12_FlatMap {
    public static void main(String[] args) throws IOException {
       /*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

 */

        Path erişilecekDosya = Path.of("src/J99_Lambda/lambdaTutorial/HalUk");//erişilecek dosya yolu tanımlandı

        Stream<String> dosyaAkısı = Files.lines(erişilecekDosya);

        //TASK 05 -> HalUk dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("\n task 05 --> HalUk dosyasindaki farkli kelimeleri  print ediniz..");
    // 1. yol-> distinct()
        Files.lines(erişilecekDosya)
                .map(t->t.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::print);

        //TASK 06 -> HalUk dosyasindaki tum kelimeleri natural order  print ediniz..
        //TASK 07 -> HalUk dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        //TASK 08 -> HalUk dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        //TASK 09 -> HalUk dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        //TASK 10 -> HalUk dosyasinda kac /farklı harf kullanildigini print ediniz.
        //TASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz.
        //TASK 12 -> HalUk dosyasinda  farkli kelimeleri print ediniz

    }
}
