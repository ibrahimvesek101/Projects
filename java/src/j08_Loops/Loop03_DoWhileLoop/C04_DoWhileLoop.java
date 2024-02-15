package j08_Loops.Loop03_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        // Example: kullanicidan bir sayi aliniz. Sayi 100'den kucukse ekrana "kazandin" yazdiriniz. Aksi halde ekrana "kaybettin" yazdiriniz.
        // Kullanici kazandikca oyun devam etmeli.

        Scanner input = new Scanner(System.in);
        int sayi =0;

        do{
            System.out.println("bir sayi giriniz");   //Kullanici kazandikca tekrar ayni mesaji vermem icin loop icine koymaliyiz.
            sayi = input.nextInt();   //Bu loop'ta decrement-increment'i kullanici yapiyor. User bize sayi veriyor.

            if(sayi<100){
                System.out.println("kazandiniz");
            }
        } while(sayi<100);

        System.out.println("kaybettiniz!");  //Loop kirildiktan sonra' yani 100 den buyuk sayi girince, oyuncu yaninca bunu yazacak

        //Example-2: Kullanicidan isimler aliniz. ilk harfinin buyuk olup olmadigini kontrol ediniz

        do{
            System.out.println("isim giriniz");
            char ilkHarf =input.next().charAt(0);

            if(ilkHarf>='A' && ilkHarf<='Z'){
                System.out.println("ismi basariyla girdiniz");
            }else{
                System.out.println("ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
                break; // yanlis isim girince ustteki mesaji verdikten sonra break ile loop'u kirar
            }
        }while(true);    // Bu sonsuz dongu verir, isim dogru oldukca calisir

        //Infinite Loop: Sonsuz Dongu. Loop olustururken sonsuz dongu olusturmamaya dikkat etmeliyiz. Aksi halde application donar, calisir-calisir...memory dolana kadar.
        // Sonra out of memory (Hafiza doldu uyarisi verir. YAPMA, bilgisayar gidebilir.
        //Artirma-azaltma kisminda hata yaparsan infinite loop sorunsali olusur.
        //Ornegin;

        for(int i =1; i<4; i--){
            System.out.println("hi!"); //burada i her zaman 4 ten kucuk olacagindan sonsuz sayida hi! yazar durur
        }

        for(int i =1; i<4; ) {
            System.out.println("hi!"); //Burada da artirma-azaltma belirtilmediginden her dongude i=1 olur, sonsuz dongu olur.
        }

        //Yine mesela;

        int i=12;
        while (i < 15) {
            System.out.println("Hi");
            // Burada increment-decrement i yazmazsak while loop u sonsuz donguye girer.
        }
    }
}
