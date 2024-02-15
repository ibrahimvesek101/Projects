package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner sc = new Scanner(System.in);


        int toplam=0, sayacFurkan=0;
        while (toplam<=333){

            System.out.print("gakgom bisayi girisin : ");
            toplam+=sc.nextInt();
            sayacFurkan++;

        }
        System.out.println("gakgom yeter  "+sayacFurkan+" kadar sayi girdin. Toplamları : "+toplam);




    }
}
