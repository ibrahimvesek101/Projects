package ArraysTasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı, giriş sırasına göre
        // tersten print eden code create ediniz
        // {1,2,3,4,5}
        //output={5,4,3,2,1}

        int [] arr= new int[5];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i]=scan.nextInt();
        }

        // ters çevirme
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }


    }
}
