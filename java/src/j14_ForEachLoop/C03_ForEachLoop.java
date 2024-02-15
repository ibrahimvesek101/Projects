package j14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array elemanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"gülsüm","musty",  "ayşe", "enise", "ciğdem" ,"cüneyt"};

        List<String > ortakList=new ArrayList<>();//her iki arrayden ortak elemanların atanacagı boş list tanımlandı

      // for (String  str1:arr1) {
      //     System.out.print(str1+" ");//arr1 herbir elemanı str1 eatanım print edildi
      // }
      for (String str1:arr1) {//arr1 elemanları str1 e atanrak loop tanımlandı
          for (String str2:arr2) {//arr2 elemanları str2 e atanrak loop tanımland
              if (str1.equalsIgnoreCase(str2) ) {//her iki loopdan gelen elelman eşitliği şartı tanımlandı
                  ortakList.add(str1);//ortak eleman ortakList e eklendi
              }
          }
      }
      if (ortakList.isEmpty()) {
          System.out.println("Agam olsa dükan senin ortak eleman yooğğğ  :(");
      }else System.out.println("Agam ortak elemanlar :"+ortakList);//Agam ortak elemanlar :[gülsüm, cüneyt, ciğdem]


    }
}
