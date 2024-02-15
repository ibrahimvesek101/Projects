package lesson03;

public class Q16_ForLoop {

    //Convert "Java" to "J*a*v*a*"

	/*	ForLoop
		print even numbers from 100 to 0 but do not use decrement(i--).

		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 ....2 0
      */

    public static void main(String[] args) {
        String s = "ankara";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "*");  //a*n*k*a*r*a*
        }


        System.out.println();


        int number = 100;

        for (int i = number; i>=0 ; i-=2) { //i-=2  -> i=i-2
            System.out.print(i +" ");
        }
    }


}
