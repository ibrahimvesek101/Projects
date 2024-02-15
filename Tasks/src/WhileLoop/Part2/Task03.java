package WhileLoop.Part2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden
		 soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print eden code create ediniz

		 input= ali yılmaz
		 output= a l i y ı l m a z
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("İsim soyisim giriniz");
        String isim= scan.nextLine();

        int i=0;
        while (i<=isim.length()-1) {
            System.out.print(isim.charAt(i)+" ");
            i++;
        }

    }
}
