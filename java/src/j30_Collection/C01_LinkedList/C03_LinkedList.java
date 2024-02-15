package j30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcan kebap", "ciğer şiş", "çöp şiş", "Haşhaş kebap", "kilis tava", "küşleme"));
        System.out.println("ll1 ilk hali :  " + ll1);//  [balcan kebap, ciğer şiş, çöp şiş, Haşhaş kebap, kilis tava, küşleme]
        //LinkedList remove ->

        System.out.println("ll1.remove() = " + ll1.remove());//balcan kebap
        System.out.println("ll1 remove() sonrası : " + ll1);// [ciğer şiş, çöp şiş, Haşhaş kebap, kilis tava, küşleme]

        System.out.println("ll1.remove(\"çöp şiş\") = " + ll1.remove("çöp şiş"));//true
        System.out.println("ll1.remove(\"çöp şiş\") = " + ll1.remove("çöpşiş"));//false
        System.out.println("ll1.removeLast() = " + ll1.removeLast());// küşleme
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst());// ciğer şiş
        System.out.println("ll1 remove'lar sonrası  " + ll1);//[Haşhaş kebap, kilis tava]

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("havuç dilimi", "dondurmalı irmik", "trileçe", "künefe", "su muhallebisi", "hamsikoy sütlaç"));
        ll1.addAll(ll2);
        System.out.println("ll1 'e ll2 eklenmiş hali : " + ll1);//  [Haşhaş kebap, kilis tava, havuç dilimi, dondurmalı irmik, trileçe, künefe, su muhallebisi, hamsikoy sütlaç]
        System.out.println("ll1.remove(ll2) = " + ll1.removeAll(ll2));

        System.out.println("ll1 'den ll2 remove edilmiş hali :  " + ll1);//[Haşhaş kebap, kilis tava]

        System.out.println("ll2.element() = " + ll2.element());//ilk element return eder->havuç dilimi

        //LinkedList get() - getFirst() - getLast() ->

        System.out.println("ll2.get(3) = " + ll2.get(3));// künefe
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//havuç dilimi
        System.out.println("ll2.getLast() = " + ll2.getLast());//hamsikoy sütlaç

        LinkedList<Integer> sayıList=new LinkedList<>(Arrays.asList(1,3,4,6,7,45,59,38));
        System.out.println("sayıList = " + sayıList);

        System.out.println("sayıList.remove(3) = " + sayıList.remove(3));// 6

        // remove() meth parametre integer alırsa List data Type integer oldugunda meth parametre obj değil index tanımlar.
        // System.out.println("sayıList.remove(45) = " + sayıList.remove(45));//RTE ->IndexOutOfBoundsException


    }
}
