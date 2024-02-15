package MethodCreation.Part1;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre
        // hesaplayan method create ediniz

        Scanner scan= new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        double sayi1= scan.nextDouble();
        System.out.print("2. sayıyı giriniz");
        double sayi2= scan.nextDouble();
        System.out.print("işleminizi giriniz: ");
        char islem =scan.next().charAt(0);
        islemMenu(islem, sayi1, sayi2);

    }

    private static void islemMenu(char islem, double sayi1, double sayi2) {
        switch (islem) {
            case '+':
                topla(sayi1,sayi2);
                break;
            case '-':
                cikar(sayi1,sayi2);
                break;
            case '*':
                carp(sayi1,sayi2);
                break;
            case '/':
                bol(sayi1,sayi2);
                break;
        }
    }

    private static void bol(double sayi1, double sayi2) {
        System.out.println(sayi1/sayi2);
    }

    private static void carp(double sayi1, double sayi2) {
        System.out.println(sayi1*sayi2);
    }

    private static void cikar(double sayi1, double sayi2) {
        System.out.println(sayi1-sayi2);
    }

    private static void topla(double sayi1, double sayi2) {
        System.out.println(sayi1+sayi2);

    }

}
