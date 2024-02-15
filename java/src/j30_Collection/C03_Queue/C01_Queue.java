package j30_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
       /*
      Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
      ile obj uretilir.
      Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
      Cons seçimine göre queue obj özelliklieri belirlenir.
      FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenir enbaştan silinir.
       */
        Queue<String>q1=new LinkedList<>(Arrays.asList("javaCAN","javaSU","javvaNUR","javaNAZ"));
        //queue print->
        System.out.println("q1 = " + q1); //[javaCAN, javaSU, javvaNUR, javaNAZ]
        q1.add("javaTAR");
        System.out.println("q1 add sonrası : " + q1); //[javaCAN, javaSU, javvaNUR, javaNAZ, javaTAR]


        Queue<String>q2=new PriorityQueue<>(Arrays.asList("Biftek","meyve tabagı","lüfer"));
        System.out.println("q2 = " + q2); //  [Biftek, meyve tabagı, lüfer]
        q2.add("gerdan");
        System.out.println("q2 add sonrası : " + q2);//  [Biftek, gerdan, lüfer, meyve tabagı]
        System.out.println("q1.element() = " + q1.element());// javaCAN
        System.out.println("q1.peek() = " + q1.peek());//javaCAN
  /*
     peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
     poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
     element() -> ilk elemanı silmeden return eder.
     remove() -> ilk elemnı siler ve return eder.. :kaldırma

    ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
    poll ise null return eder.
   */
        q1.clear();//q1 temizlendi->tüm elemanlar silindi
        System.out.println("q1.size() = " + q1.size()); //0
        System.out.println("q1.isEmpty() = " + q1.isEmpty());// true
        System.out.println("q1.poll() = " + q1.poll()); // null
       // System.out.println("q1.remove() = " + q1.remove());// rte->NoSuchElementException
        System.out.println("q1.peek() = " + q1.peek());//null
       // System.out.println("q1.element() = " + q1.element());//rte-> NoSuchElementException


        //offer()-> queue coll. eleman eklemek için kullanılır. queue'de eleman kısıtlaması varsa add() meth. rte
        // fırlatırken offer() true-false return eder.
        q1.offer("javFER");
        System.out.println("q1 = " + q1);// [javFER]

        System.out.println("agam code cincix dewamkeee  :) ");
    }
}
