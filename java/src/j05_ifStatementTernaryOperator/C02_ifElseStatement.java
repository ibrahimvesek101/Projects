package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /*
        Task-> girilen yasın 18'den buyukluğunu kontrol eden code create ediniz...
         */

        Scanner input=new Scanner(System.in);
        System.out.print("agam yasını giresen : ");
        int agaYas= input.nextInt();

       // if (agaYas >18) {
       //     System.out.println("agam artık reşitsin cuğara sana çoooh yakışır :)");
       // }
        /*
        Task-> girilen yasın 18'den buyukluğunu kontrol eden ve
         yas 18'den kucukse " agam büyü de gel :( " print eden code create ediniz
         */

       // if (agaYas<18) {
       //     System.out.println(" agam büyü de gel :( ");
       // }

        if (agaYas >=18) {
            System.out.println("agam artık reşitsin cuğara sana çoooh yakışır :)");
        }else System.out.println(" agam büyü de gel :( ");





    }//main sonu

}//class sonu
