package ArraysCodeChalllange;

import java.util.Arrays;

public class Q05_Arrays {
    /*
       Find the middle element in an integer array
       Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
                 (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
    */


    public static void main(String[] args) {
        int [] arr= {16, 5, 8, 10};

        Arrays.sort(arr); // büüykten küçüğe sıralar
        System.out.println(Arrays.toString(arr));

        int middleIndex= arr.length/2;

        if (arr.length%2!=0) { // eleman sayısı tek ise
            System.out.println(arr[middleIndex]);
        } else { // çiftse
            System.out.println((arr[middleIndex]+arr[middleIndex-1])/2);
        }


    }

}
