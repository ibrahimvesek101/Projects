package j31_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        // map.putAll();-> Girilen map istenen map'e eklenir.

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}

        HashMap<String, String> hm1 = new HashMap<>();//bos hm tanımlandı

        hm1.put("javaCAN ", "vedat");
        hm1.put("javaNAZ", "ceren");
        hm1.put("javaTAR", "sümeyye");
        hm1.put("javvaNUR", "rukiyye");
        hm1.put("javaSU", "haluk");
        System.out.println("hm1 putAll öncesi  = " + hm1);// {javvaNUR=rukiyye, javaNAZ=ceren, javaTAR=sümeyye, javaCAN =vedat, javaSU=haluk}

        hm.putAll(hm1);
        System.out.println("hm putAll sonrası = " + hm); // {javvaNUR=rukiyye, Apple=450 Euro, javaNAZ=ceren, Saturn=200 Euro, Teknosa=333 Euro, javaTAR=sümeyye, Media Markt=444 Euro, javaCAN =vedat, javaSU=haluk, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm1 putAll sonrası = " + hm1); // {javvaNUR=rukiyye, javaNAZ=ceren, javaTAR=sümeyye, javaCAN =vedat, javaSU=haluk}

        HashMap<String, String> hm3 = hm1; //hm1 hm3'e atandı
        HashMap<String, String> hm4 = new HashMap<>(hm3); //hm3 hm4 için cons. parametresi yapıldı

        System.out.println("hm3 = " + hm3); //{javvaNUR=rukiyye, javaNAZ=ceren, javaTAR=sümeyye, javaCAN =vedat, javaSU=haluk}
        System.out.println("hm4 = " + hm4); //{javvaNUR=rukiyye, javaCAN =vedat, javaNAZ=ceren, javaSU=haluk, javaTAR=sümeyye}
    }
}
