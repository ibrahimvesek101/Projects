package ArraysTasks;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz
        sonuç doğru olmalı
         */

        //1. yöntem
        boolean b=true;
        int[] arr= {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j]==4) {
                        b=false;
                    }
                }
            }
        }

        System.out.println(b);

        // 2. yöntem
        System.out.println("ikinci yöntem");
        int[] arr2= {1,2,3,4};
        boolean birVarMi= false;
        boolean dortVarMi= false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]==1) {
                birVarMi=true;
            } else if (arr2[i]==4) {
                dortVarMi=true;
            }
        }
        if (dortVarMi==true&&birVarMi==true) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }



    }
}