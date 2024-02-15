package ArraysCodeChalllange;

import java.util.ArrayList;
import java.util.List;

public class Q06_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini
     * bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 78, 12, -4, 11, 0};
        int n = 2;

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        List<Integer> maxList= new ArrayList<>();

        int sayac=0;

        while (sayac<n) {
            int max= list.get(0);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max) {
                    max= list.get(i);
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max));
            sayac++;
        }

        System.out.println(maxList);



    }


}