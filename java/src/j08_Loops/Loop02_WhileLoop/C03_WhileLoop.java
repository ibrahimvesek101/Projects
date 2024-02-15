package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var

        Scanner sc = new Scanner(System.in);
        System.out.print("gakgom bisayi girisin : ");
        int biSayı = sc.nextInt();
        int bolenSayi = 1;
        int sayaç = 0;


        while (bolenSayi <= biSayı) {

            if (biSayı % bolenSayi == 0) {
                sayaç++;
            }
            bolenSayi++;

        }
        System.out.println("girilen tamsayı :"+biSayı+" nın "+sayaç+" kadar böleni var ..");

    }
}
