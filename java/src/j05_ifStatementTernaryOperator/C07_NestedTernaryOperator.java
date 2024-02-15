package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {
      /*
        TASK :
        Girilen bir pozitif tamsayı  4 basamaklı ise  “4 Basamaklı”
        degilse çift olup olmadigini kontrol edip. Çift ise “4 basamaklı olmayan çift sayı”
        degilse “4 basamaklı olmayan tek sayı"  print eden code create ediniz.
         */


        Scanner input = new Scanner(System.in);
        System.out.print("gardaşşş bir sayı gir :");
        int sayi = input.nextInt();
        System.out.println((sayi > 999 && sayi < 10000) ? ("4 Basamaklı") : (sayi % 2 == 0 ? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı"));
    }
}
