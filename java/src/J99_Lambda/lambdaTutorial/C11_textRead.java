package J99_Lambda.lambdaTutorial;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class C11_textRead {
    public static void main(String[] args) throws IOException {
        //TASK 01 --> haluk dosyasini okuyunuz.(Console'a print eden code create ediniz.)
        System.out.println("\n task 01 --> haluk dosyasini okuyunuz");
        Path erişilecekDosya = Path.of("src/J99_Lambda/lambdaTutorial/HalUk");//erişilecek dosya yolu tanımlandı

        Stream<String> dosyaAkısı = Files.lines(erişilecekDosya);

        //  Files.lines(Path.of("src/J99_Lambda/lambdaTutorial/HalUk")).forEach(System.out::println);
        dosyaAkısı.forEach(System.out::println);


        //TASK 02 --> haluk.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print eden code create ediniz.)
        System.out.println("\n task 02 --> Console'a buyuk harflerle print eden code create ediniz.");
        Files.lines(erişilecekDosya)
                .map(String::toUpperCase)//akısdaki elemanlar buyuk harfe update edildi
                .forEach(System.out::println);

        //TASK 03 --> haluk dosyasindaki ilk satiri kucuk harflerle print eden code create ediniz.
        System.out.println("\n task 03 -->haluk dosyasindaki ilk satiri kucuk harflerle print eden code create ediniz");

        Files.lines(erişilecekDosya)
                .map(String::toLowerCase)
                .limit(1)//akışdaki iik eleman-> satır alındı
                .forEach(System.out::println);

        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print eden code create ediniz.
        System.out.println("\n task 04 --> haluk dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print eden code create ediniz");

        System.out.println(Files.lines(erişilecekDosya)
                .filter(t -> t.contains("Basari"))
                .count());
    }
}
