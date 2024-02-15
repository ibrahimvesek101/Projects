package j31_Map;

import java.util.HashMap;
import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
     /*
        HashTable ->
        HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
        1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
        olam bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
        2-HashTable HashMap'e göre daha yavaştır
        3-HashTable key ve value'lerda null değere izin vermez.
        4-HashTable eleman ataması yapılırken  HashMap randum(rastgele: hurra )  yapar.
         */

        Hashtable<String, String> hm = new Hashtable<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "");

        System.out.println("hm = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
        //System.out.println("hm.put(\"Samsung\",null) = " + hm.put("Samsung", null)); // RTE->NullPointerException
        System.out.println("hm.put(\"Apple\",\"33 Euro\") = " + hm.put("Apple", "33 Euro")); //
        //System.out.println("hm.put(null,\"agayaBeles\") = " + hm.put(null, "agayaBeles")); // RTE->NullPointerException

        Hashtable<String, String> hm1 = new Hashtable<>();//bos hm tanımlandı
        hm1.put("Harika", "çok Euro");
        hm1.put("Eda", "en çok  Euro");
        hm1.put("Veda", "az  Euro");
        System.out.println("hm1 = " + hm1); //{Veda=az  Euro, Eda=en çok  Euro, Harika=çok Euro}
        hm.putAll(hm1);
        System.out.println("hm putAll(hm1) sonrası = " + hm); //{Amazon=296 Euro, Harika=çok Euro, Media Markt=, Apple=33 Euro, Veda=az  Euro, Teknosa=333 Euro, Saturn=200 Euro, Vatan=111 Euro, Eda=en çok  Euro}
    }
}
