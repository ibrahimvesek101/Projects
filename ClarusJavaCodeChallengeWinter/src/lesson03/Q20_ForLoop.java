package lesson03;

import java.util.Scanner;

public class Q20_ForLoop {

    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int toplam = 0;

        if(sayi1<sayi2){
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;
            }

            System.out.println(sayi1 +  " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
        }else if(sayi1>sayi2){
            for (int i = sayi2; i <=sayi1; i++) {
                toplam+=i;
            }

            System.out.println(sayi1 +  " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
        }else{
            System.out.println("sayilar esittir" );
        }

        //2.yol
        int num1 = scanner.nextInt();
        int num2= scanner.nextInt();
        int sum=0;
        for (int i = (num1<num2 ? num1 : num2); i<= (num1>num2 ? num1 : num2); i++) {
            sum+=i;

        }System.out.println("toplamlari = " + sum);
    }
}
