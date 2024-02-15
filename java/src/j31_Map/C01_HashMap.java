package j31_Map;

import java.util.Arrays;
import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {
 /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

        1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
                    dublicate kabul etnez
                    Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
                    null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
                    HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
                    HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
                    HashMap'ler "thread safe" degildir.
         */
        HashMap<String  ,String> hm=new HashMap<>();//bos hm tanımlandı
        //map.put(); -> girilen key, value değeri map'e  eleman(Entyr) olarak ekler.
        hm.put("Amazon","296 Euro");
        hm.put(null,"222 Euro");//key null değer alabilir.
        hm.put(null,"200 Euro");//tekrarlı key değere grilen son value update edilir
        hm.put("Ebay",null); //value null değer alabilir
        hm.put("Saturn","200 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple","450 Euro");
        hm.put("Apple","500 Euro");//Apple key 450 olan value 500 olarak update edildi
        hm.put("Teknosa","333 Euro");
        hm.put("Media Markt","444 Euro");

        //map print-> sout içine map parametre alır
        System.out.println("hm = " + hm); // {null=200 Euro, Apple=500 Euro, Saturn=200 Euro, Ebay=null, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}

    }
}
