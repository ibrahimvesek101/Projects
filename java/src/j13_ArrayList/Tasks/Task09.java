package j13_ArrayList.Tasks;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("liste atamak içn sayı giriniz\nAgam yeter diyirsen 'q' gir ");

        String listSayılari = "";

        double toplam = 0;//list karelerini toplamı için boş kutu

        while (!listSayılari.equalsIgnoreCase("q")) {//while döngü girilen sayı q değilse action alır
            System.out.println(" Agam sayı giresen : ");
            listSayılari = input.nextLine();
            list.add(listSayılari);


        }
        System.out.println("agam girdiğin sayı listi : " + list);
        list.remove(list.size() - 1);//liste girilen son q elelmanı silinir
        System.out.println("q silinmiş kare toplamı almaya hazır hale gelen list :" + list);


        for (int i = 0; i < list.size(); i++) {
         //   toplam += Integer.parseInt(list.get(i)) * Integer.parseInt(list.get(i));
            toplam +=Math.pow( Double.parseDouble(list.get(i)),2);
        }
        for ( String w:list ) {
            toplam += Integer.parseInt(w) * Integer.parseInt(w);
        }



        System.out.println("agam giridigin dsayılar toplamı : " + toplam);
    }
}
