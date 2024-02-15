package ForLoop;

import java.util.Scanner;

public class Task10_Nested {

    public static void main(String[] args) {
        /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar   index sayısı en fazla= 6, karakter sayısı=7
        output : a sayısı :3
         */
        Scanner sc=new  Scanner(System.in);

        System.out.println("bir cumle giriniz : ");
        String  cumle=sc.nextLine();

        System.out.println("sayılacak harfi giriniz : ");
        char harf=sc.next().charAt(0); // a harfi
        int harfSayisi=0;

        for (int i=0; i<=cumle.length()-1; i++) {

            if (cumle.charAt(i)==harf) {
                harfSayisi++;
            } // if sonu
        }// for sonu

        System.out.println(harfSayisi);



    }
}
