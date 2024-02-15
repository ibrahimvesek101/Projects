package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));

        tekrarsizlistPrintEt(list);//[1, 3, 5, 6, 7]

    }//main sonu

    private static void tekrarsizlistPrintEt(ArrayList<Integer> list) {
        ArrayList<Integer> benzersizElemanListi = new ArrayList<>();//benzersiz elemanlardan oluşacak boş list tanımlandı

        for (int i = 0; i < list.size(); i++) {

            if (!benzersizElemanListi.contains(list.get(i))) {//listen gelen elelman benzersizElemanList'inde yoksa şartı
                benzersizElemanListi.add(list.get(i));
            }
        }
        System.out.println(benzersizElemanListi);//[1, 3, 5, 6, 7]
    }


}//class sonu
