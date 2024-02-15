package j29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(34, 35, 41, 58, 31, 7, 38, 61, 9));
        System.out.println("l1 ilk halin :  " + l1);// [34, 35, 41, 58, 31, 7, 38, 61, 9]

        // Task01-> l1 elemanları sondan başa doğru print eden codee create ediniz.
        System.out.println("   ***   task01   ***   ");

        ListIterator<Integer> it1 = l1.listIterator();//step ->1
        while (it1.hasNext()) {//step->1.5 :b->s doğru sürekli pointer sona doğru ilerletilir
            it1.next();
        }
        while (it1.hasPrevious()) {//step->2 ana action için pointer s->b ilerler
            System.out.print(it1.previous() + " ");//9 61 38 7 31 58 41 35 34
        }
        System.out.println();

        List<String> l2 = new ArrayList<>(Arrays.asList("Trileçe", "Güllaç", "cennet çamuru", "künefe", "Bal-Gaymak"));


        // Task01-> l2 elemanın sonuncusuna :-) update edip print eden codee create ediniz.
        System.out.println("   ***   task02   ***   ");
        System.out.println("l2 task 02 öncesi : " + l2);
        ListIterator<String> it2 = l2.listIterator();//step -> 1

        while (it2.hasNext()) {//step -> 2
            it2.next();

            if (it2.hasNext() == false) {//pointer en sonda olma sartı
                it2.previous();//pointer ömcesi son elelmanı verir
                it2.set(it2.next() + " :-) ");
            }

        }
        System.out.println("l2 task 02 sonrası : " + l2);// [Trileçe, Güllaç, cennet çamuru, künefe, Bal-Gaymak :-) ]

    }
}
