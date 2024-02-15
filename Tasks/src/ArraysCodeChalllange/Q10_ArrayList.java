package ArraysCodeChalllange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_ArrayList {
     /*
		A list has elements “H”, “G” and “E”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		Example : [H, G, E]
                  Enter a letter :  h
                  [Got It, G, E]
                  Enter a letter :  a
                  [H, G, E, A]
                  Enter a letter :  g
                  [H, got it, E]

        */
     public static void main(String[] args) {
          List<String> list= new ArrayList<>();

          list.add("H");
          list.add("G");
          list.add("E");
          System.out.println(list);

          Scanner scan = new Scanner(System.in);
          System.out.println("bir harf giriniz");
          String harf= scan.next().trim().substring(0,1).toUpperCase();
          // yukarıda kullanıcan harfi aldık

          if (list.contains(harf)) { // kullanıcının girdiği harf arraylistin içinde bulunuyorsa
               list.set(list.indexOf(harf), "Got it");
          } else {
               list.add(harf);
          }

          System.out.println(list);




     }



}
