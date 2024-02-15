package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
     // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.print("agıdeşşş bi sayı gir bakam  :");
        int sayi = input.nextInt();
        System.out.println((sayi < 10 && sayi > -10) ? "agıdeşş senin sayı TEK BASAMAKLI " : "agıdeşşş senin sayı ENAZ 2 BASAMAKLI ");


    }//main sonu
}//class sonu
