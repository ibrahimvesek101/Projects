package j29_Iterators;


import j25_Inheritance.task01.A;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("Harika Eda", "Ceren", "Tugba", "Taha", "Ismail", "Murat"));

        System.out.println("l1 list ilk hali : " + l1);// [Harika Eda, Ceren, Tugba, Taha, Ismail, Murat]

        // Task01 -> l1 elemanlarını for lopp ile print code create ediniz..
        System.out.println("   ***   Task01   ***   ");

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");//Harika Eda Ceren Tugba Taha Ismail Murat
        }
        System.out.println();

        // Task02 -> l1 elemanlarını for-each loop  ile print code create ediniz..
        System.out.println("   ***   Task02   ***   ");

        for (String s : l1) {
            System.out.print(s + " ");// Harika Eda Ceren Tugba Taha Ismail Murat

        }
        System.out.println();

        // Task03 -> l1'in her bir  elemanını :-)  for loop  ile update edip print code create ediniz..
        System.out.println("   ***   Task03   ***   ");

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + " :-) ");
        }
        System.out.println("l1  :-) update sonrası : " + l1);// [Harika Eda :-) , Ceren :-) , Tugba :-) , Taha :-) , Ismail :-) , Murat :-) ]

        // Task04 -> l1'in her bir  elemanını :-(  for-each loop  ile update edip print code create ediniz..
        System.out.println("   ***   Task04   ***   ");
        for (String str : l1) {
            str += " :-( ";
        }

        System.out.println("l1  :-(  update sonrası : " + l1);// [Harika Eda :-) , Ceren :-) , Tugba :-) , Taha :-) , Ismail :-) , Murat :-) ]

   /*
   index  desteklemeyen yapılarda(Collections) tekrarlayan(loop)  aksiynlar için for-each  loop update yapamayabilir(task04)
   Bu durmnda java iterator interface'den tanımlanacak variable ile tekrarlanması gereken aksiyonlar index olmadan tanımlanabilir.
    */

        System.out.println("   ***   Iterators  ***   ");
        //Iterator için...
        //step -> 1
        Iterator<String> it1 = l1.iterator();//l1 list elemanları tekrara alınması için it1 variable tanımlandı.
        //step -> 2
        while (it1.hasNext()) {
            // hasNext()-> it1 eleamnalrı için pointer(cursor) oldugu yerin sonrasında elemanlığını kontrol eder true-false return edee
            //next()-> it1 poninter onundeki elemanı return eder
            System.out.print(it1.next() + " ");// Harika Eda :-)  Ceren :-)  Tugba :-)  Taha :-)  Ismail :-)  Murat :-)
        }

        // Task05 -> l1'in elemanlarını silip print code create ediniz..
        System.out.println("   ***   Task05   ***   ");
        Iterator it2 = l1.iterator();//step->1
        while (it2.hasNext()) {//step->2
            it2.next();//iteratordeki her bir eleman alındı
            it2.remove();//iteratordeki alınan  her bir eleman  silindi
        }
        System.out.println("l1 eleman silme sonrası " + l1); // []


        List<String> l2 = new ArrayList<>(Arrays.asList("JavaCAN","JavaTAR","Başarı","Gayrete","Aşıktır"));

        // Task06 -> l2'in elemanlarını :-) update edip  print code create ediniz..
        System.out.println("   ***   Task06   ***   ");
        System.out.println("l2 listiterator öncesi  " + l2); //[JavaCAN, JavaTAR, Başarı, Gayrete, Aşıktır]
        ListIterator<String> it3 = l2.listIterator();//step->1

        while (it3.hasNext()){//step->2
            it3.set(it3.next()+" :-) ");
        }

        System.out.println("l2 eleman :-) update  sonrası " + l2); //[JavaCAN :-) , JavaTAR :-) , Başarı :-) , Gayrete :-) , Aşıktır :-) ]

   List<String> l3 = new ArrayList<>(Arrays.asList("Küşleme","kokerec","kuzugerdan","havuç dilimi"));
        // Task07 -> l2'in elemanlarını ilk harfi buyuk harf karakteri kalan  harfleri *** ile update edip l3 ekleyip  print code create ediniz..
        System.out.println("   ***   Task07   ***   ");

        ListIterator<String>it4=l2.listIterator();// step -> 1
        while (it4.hasNext()){//step -> 2
            it4.set(it4.next().substring(0,1).toUpperCase()+"***");
            //it4.add(l3.toString());//
        }
        it4.add(l3.toString());
        System.out.println("l2 *** sonrası :  " + l2);//  [J***, J***, B***, G***, A***, [Küşleme, kokerec, kuzugerdan, havuç dilimi]]
    }
}
