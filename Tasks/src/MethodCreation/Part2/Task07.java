package MethodCreation.Part2;

import java.util.Scanner;

public class Task07 {
    static Scanner scan = new Scanner(System.in);
    static int toplamDolar=0;
    static int toplamEuro=0;
    static int IntEuro=0;
    static int IntDolar=0;
    static String s;

    /*
    (task 20)
    task->
      Tek bir String içerisinde verilen euro ve
      dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */
    public static void main(String[] args) {
        System.out.println("kaç adet para gireceksiniz");
        int kacTane= scan.nextInt();
        hesapla(kacTane);
    }
    private static void hesapla(int kacTane) {
        for (int i = 0; i <= kacTane; i++) {
            System.out.println("para miktarını ve birimini giriniz");
            s=scan.nextLine();
            if (s.contains("$")) {
                s=s.replace("$","");
                IntDolar=Integer.parseInt(s);
                toplamDolar+=IntDolar;
            } else if (s.contains("€")) {
                s=s.replace("€","");
                IntEuro=Integer.parseInt(s);
                toplamEuro+=IntEuro;
            }
        }
        String StrEuroToplam= Integer.toString(toplamEuro)+"€";
        String StrDolarToplam= Integer.toString(toplamDolar)+"$";
        System.out.println("girilen dolarların toplamı "+ StrDolarToplam
        +" girilen euroların toplamı "+ StrEuroToplam);



    }
}
