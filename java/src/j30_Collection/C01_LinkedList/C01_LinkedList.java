package j30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
       /*
        LinkedList .....
        1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node" olarak tanımlanır.
        2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.
        5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
         */

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcan kebap", "ciğer şiş", "çöp şiş", "Haşhaş kebap", "kilis tava", "küşleme"));
        //LinkedList pirnt ->
        System.out.println("ll1 = " + ll1);//[balcan kebap, ciğer şiş, çöp şiş, Haşhaş kebap, kilis tava, küşleme]

        //LikenList add ->
        ll1.add("tandır");
        System.out.println("ll1 ad sonrası : " + ll1);//[balcan kebap, ciğer şiş, çöp şiş, Haşhaş kebap, kilis tava, küşleme, tandır]
        ll1.add(1, "közde uscuk ");
        System.out.println("ll1 index 1 add sonrası  " + ll1);//[balcan kebap, közde uscuk , ciğer şiş, çöp şiş, Haşhaş kebap, kilis tava, küşleme, tandır]
        ll1.addFirst("kuyu buryan");
        System.out.println("ll1 addFirst sonrası : " + ll1);//[kuyu buryan, balcan kebap, közde uscuk , ciğer şiş, çöp şiş, Haşhaş kebap, kilis tava, küşleme, tandır]
        ll1.addLast("döner");
        System.out.println("ll1 addLast sonrası : " + ll1);//[kuyu buryan, balcan kebap, közde uscuk , ciğer şiş, çöp şiş, Haşhaş kebap, kilis tava, küşleme, tandır, döner]

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("havuç dilimi", "dondurmalı irmik", "trileçe", "künefe", "su muhallebisi", "hamsikoy sütlaç"));
        ll1.addAll(ll2);
        System.out.println("ll1 add(ll2) sonrası : " + ll1);//

        ll2.addAll(5,ll1);
        System.out.println("ll2 = " + ll2);//
        //ll2.addAll("fıstık ezmesi");-> CTE


    }
}
