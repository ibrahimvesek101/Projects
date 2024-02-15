package ArraysCodeChalllange;

import java.util.Scanner;

public class Q03_Arrays {
    public static void main(String[] args) {

        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
        // input cumle: kelime sayisini yazdirin.
        //output: 3


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz ");
        String verilenCumle = scan.nextLine().trim();
        int kelimeSayisi=0;

        String[] cumle= verilenCumle.split(" ");
        kelimeSayisi=cumle.length;
        System.out.println(kelimeSayisi);





    }
}
