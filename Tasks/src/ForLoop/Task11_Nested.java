package ForLoop;

public class Task11_Nested {
    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri

        */
        int harf=65; //A'nın ascıı değeri, b=66, c=67
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (harf+j)+" ");
            }
            System.out.println();
        }



    }
}
