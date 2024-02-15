package WhileLoop.Part2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen tamsayı için çarpım tablosu print eden
        // code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi=scan.nextInt();
        int i=1;
        while (i<=10) {
            System.out.println(sayi+"x"+i+"="+(sayi*i));
            i++;
        }

    }
}
