package j31_Map;

import java.util.HashMap;

public class C02_KeySet_Values {
    public static void main(String[] args) {
        //map.keySet(),-> map key değerlerini Set'e(coll.) atayıp return eder
        //map.values(),-> map key değerlerini coll.  atayıp return ede

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.keySet() = " + hm.keySet());//[Apple, Saturn, Teknosa, Media Markt, Amazon, Vatan]

        System.out.println("hm.values() = " + hm.values());//[450 Euro, 200 Euro, 333 Euro, 444 Euro, 296 Euro, 111 Euro]
       // Task-> hm key ve value'larını aynı satırda (satır-satır) print eden code create ediniz(for-each)
        System.out.println("   ***   ");

        for (String  str :hm.keySet()) {
            System.out.print(str+" ");// Apple Saturn Teknosa Media Markt Amazon Vatan
        }
        System.out.println();
        for (String  str :hm.values()) {
            System.out.print(str+" ");// 450 Euro 200 Euro 333 Euro 444 Euro 296 Euro 111 Euro
        }

    }
}
