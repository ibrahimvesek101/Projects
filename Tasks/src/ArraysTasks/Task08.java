package ArraysTasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın
        // tek elemanlarını print eden code create ediniz.

        int [] arr= new int[7]; //7 elemanlı içi boş dizi

        Scanner scan = new Scanner(System.in);
        // kullanıcıdan elemanları al
        System.out.println("dizinin elemanlarını giriniz");
        for (int i = 0; i < 7; i++) {
            arr[i]= scan.nextInt();
        }

        //tek olanları yaz
        for (int i = 0; i < 7; i++) {
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
