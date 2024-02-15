package ArraysTasks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını
        // buyukten kucuge siralayip return eden METHOD create ediniz
        int[] arr ={1,5,7,6,9,5,7};
        sirala(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        } // diziyi tersten print eder

    }

    private static int[] sirala(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i]+=arr[i];
        }
        return arr;
    }
}
