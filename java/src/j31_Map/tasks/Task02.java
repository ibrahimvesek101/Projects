package j31_Map.tasks;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task ->
         Key:isim ,email,adres,telefon
         Key'lere ait value'leri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz.
         */

        HashMap<String, String> krtvzMurat = new HashMap<>(); //Strin key ve String value depolayan map

        krtvzMurat.put("isim", "Murat İnci");
        krtvzMurat.put("email", "Murat@gmail.com");
        krtvzMurat.put("adres", "clarusway Co, yan sokak");
        krtvzMurat.put("telefon", "1234567");

        HashMap<String, String> krtvzAbdi = new HashMap<>();

        krtvzAbdi.put("isim", "Abdi Bey");
        krtvzAbdi.put("email", "abdi@gmail.com");
        krtvzAbdi.put("adres", "alopaşa cami önü");
        krtvzAbdi.put("telefon", "7654321");
        Map<String, HashMap<String, String>> kartvizit = new HashMap<>(); //map leri valu atayan Strin key ile çalışan map
        kartvizit.put("QA Murat İnci", krtvzMurat);
        kartvizit.put("Dev Abdi Bey", krtvzAbdi);

        System.out.println("kartvizit = " + kartvizit);//{QA Murat İnci={telefon=1234567, adres=clarusway Co, yan sokak, email=Murat@gmail.com, isim=Murat İnci},
        // Dev Abdi Bey={telefon=7654321, adres=alopaşa cami önü, email=abdi@gmail.com, isim=Abdi Bey}}

        Map<Integer, Task02_Kartvizit> krtvzt = new HashMap<>();//krvzt obj integer key ile depolayan bos map

        Task02_Kartvizit k1 = new Task02_Kartvizit("Abdi", "ebikGabık@gmail.com", "dut ağacının dibi", "12345");//krtvz obj
        Task02_Kartvizit k2 = new Task02_Kartvizit("Ali", "ali@gmail.com", "elma ağacının dibi", "9999");//krtvz obj

        krtvzt.put(k1.id, k1);
        System.out.println("kartvizit = " + krtvzt);//
        krtvzt.put(k2.id,k2);
        System.out.println("kartvizit = " + krtvzt);//

    }
}
