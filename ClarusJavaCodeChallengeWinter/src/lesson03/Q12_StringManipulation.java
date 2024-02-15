package lesson03;

import java.util.Scanner;

public class Q12_StringManipulation {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int bosluk = str.indexOf(" ");  //indexOf() olmayan karakterler icin -1 doner

        //bosluk yoksa ve stringim bos degilse
        if(bosluk == -1 && !str.isEmpty()) System.out.println("istenen sartlara uygun ");
        else System.out.println("sartlara uygun degildir");


        System.out.println(str.contains(" ") ? "bosluk icerir": "bosluk icermez");
    }
}