package j30_Collection.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {
    public static void main(String[] args) {
    /*
         Task->
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "Germany" , "Brazil" ,"USA"
    ArrayListi print eden method create ediniz.
     */

        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Germany", "England", "South Africa", "Brazil", "USA"));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Germany", "China", "Brazil", "France", "USA"));
        System.out.println("commonValues(hs1,hs2) = " + commonValues(hs1, hs2));//[Germany,Brazil,USA]


    }//main sonu

    private static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2) {
        hs1.retainAll(hs2);//hs1'e hs2 de olan ortak elemanlar atandı
        return new ArrayList<>(hs1);
        // return new ArrayList<>(hs1.retainAll(hs2));

    }
}
