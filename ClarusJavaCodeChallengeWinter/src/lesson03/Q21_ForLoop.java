package lesson03;

public class Q21_ForLoop {

    //Type all integers which are divisible
    // by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 120; i > 11; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                sayac++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print (sayac + " adet sayi vardir");
    }
}
