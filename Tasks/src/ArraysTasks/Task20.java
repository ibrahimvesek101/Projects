package ArraysTasks;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int[] arr= {1,2,3,4,1};
        int[] arr2= elemaniSil(arr,1);
        System.out.println(Arrays.toString(arr2));

    }

    private static int[] elemaniSil(int[] arr, int eleman) {
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= eleman) {
                sayac++;
            }
        }
        int [] arr2= new int [sayac];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= eleman) {
                arr2[j] =arr[i];
                j++;
            }
        }
        return arr2;
    }
}
