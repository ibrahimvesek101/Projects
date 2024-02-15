package j31_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {

        //map.get(key);->girilen key'e ait value return eder.
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm. Amazon  value : " + hm.get("Amazon"));//296 Euro
        System.out.println("hm. amazon  value : " + hm.get("amazon"));// null
        System.out.println("hm.get(33) = " + hm.get(33));// null

    }
}
