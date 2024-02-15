package WhileLoop.Part2;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri
        girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan =new Scanner(System.in);
        String s= "";

        do {
            s= scan.nextLine(); //a,b,x
            if (s.equals("x")) break;
            System.out.println("JavaCan");
        } while (!s.equals("x"));

        System.out.println("javaTAR");


    }
}
