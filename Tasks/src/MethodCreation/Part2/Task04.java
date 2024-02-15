package MethodCreation.Part2;

import java.util.Scanner;


public class Task04 {
    public static void main(String[] args) {
        //task-> girilen sayının faktoriyelini print eden 
        // METHOD create ediniz
        // input =5
        // output =5*4*3*2*1

        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayi = sc.nextInt();
        fakktoriyel(sayi);
    }

    private static void fakktoriyel(int sayi) {
        int faktoriyel=1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);
    }
}
