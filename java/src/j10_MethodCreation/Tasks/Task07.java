package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz

       // enKucukBul();
        double okulUcuncusu=enKucukBul1();
        System.out.println("okulUcuncusu = " + okulUcuncusu);


    }//main sonu

    private static double enKucukBul1() {
        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = input.nextDouble();
        System.out.print("3. sayıyı giriniz : ");
        double sayi3 = input.nextDouble();

     return   sayi1 < sayi2 ? (sayi1 < sayi3 ? (sayi1) : (sayi3)) : (sayi2 < sayi3 ? (sayi2) : (sayi3));
    }

  // private static void enKucukBul() {
  //     System.out.print("1. sayıyı giriniz : ");
  //     double sayi1 = input.nextDouble();
  //     System.out.print("2. sayıyı giriniz : ");
  //     double sayi2 = input.nextDouble();
  //     System.out.print("3. sayıyı giriniz : ");
  //     double sayi3 = input.nextDouble();

  //     System.out.println(sayi1 < sayi2 ? (sayi1 < sayi3 ? (sayi1) : (sayi3)) : (sayi2 < sayi3 ? (sayi2) : (sayi3)));
  // }


}
