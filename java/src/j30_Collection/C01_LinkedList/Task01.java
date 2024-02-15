package j30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
             /*
        Task->
        Node değerleri "Murat","javaCAN","javaTAR","Abdi bey" olan bir linkedList create ediniz.
        Girilen bir String değeri linkedListte varlığını kontrol edip varsa silip "Agam eleman halledildi"
        yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

         */
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("Murat", "javaCAN", "javaTAR", "Abdi bey", "sefil HalUk"));
        Scanner input = new Scanner(System.in);
        System.out.println("Agam kime bakmiştın : ");
        String aganınAdamı = input.nextLine();

        System.out.println("ll = " + ll);
        System.out.println("   *** amele if code    ***   ");


       if (ll.remove(aganınAdamı)) {
           System.out.println("Agam eleman halledildi");
       } else System.out.println("Agam aradığınız kişiye ulaşılamadı");

        System.out.println("   *** cincix ternary code    ***   ");
        System.out.println(ll.remove(aganınAdamı) ? "Agam eleman halledildi" : "Agam aradığınız kişiye ulaşılamadı");
        System.out.println("ll = " + ll);


    }
}
