package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
    //task-> girilen tamsayının rakamları toplamını print eden code create ediniz..
        Scanner sc = new Scanner(System.in);
        System.out.print("gakgom bisayi girisin : ");
        int biSayı = sc.nextInt();

        int rakamToplam = 0;

        while (biSayı > 0)                      {

            rakamToplam+=biSayı%10;

            biSayı/=10;//biSayı=biSayı/10
        }
        System.out.println("rakamToplam = " + rakamToplam);


    }
}
