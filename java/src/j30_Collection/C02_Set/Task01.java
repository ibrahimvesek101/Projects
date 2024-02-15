package j30_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
       /* Task->
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */
        String arr[] = {"javaCAN", "javaSU", "javaNAZ", "javIYE", "javIDAN", "javaTAR", "javFER"};
      // arrListCevir(arr);
        HashSet<String> hs = new HashSet<>(arrListCevir(arr));
        LinkedHashSet<String> ls = new LinkedHashSet<>(arrListCevir(arr));
        TreeSet<String> ts = new TreeSet<>(arrListCevir(arr));
        System.out.println("hurra set : " + hs); //[javaNAZ, javaTAR, javaCAN, javIYE, javaSU, javFER, javIDAN]
        System.out.println("ego set : " + ls); // [javaCAN, javaSU, javaNAZ, javIYE, javIDAN, javaTAR, javFER]
        System.out.println("kıl mudur set : " + ts); // [javFER, javIDAN, javIYE, javaCAN, javaNAZ, javaSU, javaTAR]


    }//main sonu



    private static ArrayList<String> arrListCevir(String[] arr) {
      return new ArrayList<>(Arrays.asList(arr));
  }
}
