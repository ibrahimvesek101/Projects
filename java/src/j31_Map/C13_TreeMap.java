package j31_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
      /*
        TreeMap->
        1-TreeMap key'lerde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
         */

        TreeMap<Integer, String> tm = new TreeMap<>(); //bos tremap tanımlandı
        tm.put(104, "Sümeyye");
        tm.put(102, "Eda");
        tm.put(101, "Harika");
        tm.put(103, "Rukiye");
        tm.put(102, "Tugba"); //key dubilcate değil key value update edildi


        System.out.println("tm = " + tm); //  {101=Harika, 102=Tugba, 103=Rukiye, 104=Sümeyye}

        tm.put(105, null); // {101=Harika, 102=Tugba, 103=Rukiye, 104=Sümeyye, 105=null} -> value null tanımlar
        // tm.put(null,"haluk");// rte-> NullPointerException -> key value tanımlamaz
        System.out.println("tm = " + tm);//


        System.out.println("   ***   ");

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
        //System.out.println("tm1 hm conver öncesi = " + tm1);
        TreeMap<String, String> tm1 = new TreeMap<>(hm); // hashmap treemap' parametre atanarak  convert edildi...
        System.out.println("tm1 hm conver sonrası = " + tm1); //{Amazon=296 Euro, Apple=450 Euro, Media Markt=444 Euro, Saturn=200 Euro, Teknosa=333 Euro, Vatan=111 Euro}
        // TreeMap<String,String > tm2 =hm;// CTE->dataType MissMatch
        // map.ceilingKey();-> Girilen key map'de varsa retrun eder
        // Girilen key map'de yoksa  parametre girilen keyden buyuk en kucuk key retrun edilir.
        //girilen key map'de yoksa ve parametre keyden buyuk en kucuk key yoksa null return eder..
        //ceilingKey();-> en kucuk abi-abla

        System.out.println("tm.ceilingKey(99) = " + tm.ceilingKey(99));  //  101 -> 99 key map'de yok ama 99'un en kucuk abisi 100 101 olanı return etti
        System.out.println("tm.ceilingKey(111) = " + tm.ceilingKey(111)); // null-> 11 key map'de yok ama 11 en kucuk abisi 112 113... hicbiri yok null
        System.out.println("tm.ceilingKey(102) = " + tm.ceilingKey(102)); // 102 ->! 102 key nap'de var ve return edildi
        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1)); // 101 -> 1 key nap'de yok ben de olan en kucuk abi 101  ve return edildi


        //ascending order-> artan sıralama
        // descendingorder -> azalan sıralama
        System.out.println("tm descendingKeySet() öncesi = " + tm); //{101=Harika, 102=Tugba, 103=Rukiye, 104=Sümeyye, 105=null}

        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet()); // [105, 104, 103, 102, 101]

        System.out.println("tm descendingKeySet() sonrası = " + tm); //{101=Harika, 102=Tugba, 103=Rukiye, 104=Sümeyye, 105=null}
        System.out.println("tm.keySet() = " + tm.keySet()); // [101, 102, 103, 104, 105]
        System.out.println("tm.firstKey() = " + tm.firstKey()); // 101
        System.out.println("tm.lastKey() = " + tm.lastKey()); // 105
    }
}
