package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // Task-> girilen bir tamsayının ciftse yarısını ,
        // değilse "agıdeşşş tek'in yarısı tam olmazzz" print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("agıdeşşş bi sayı gir bakam  :");
        int sayi = input.nextInt();
        // System.out.println((sayi%2==0) ? sayi/2 : "agıdeşşş tek'in yarısı tam olmazzz");
        Object sonuç = (sayi % 2 == 0) ? sayi / 2 : "agıdeşşş tek'in yarısı tam olmazzz";
        System.out.println("sonuç = " + sonuç);





    }// main sonu
}// class sonu
