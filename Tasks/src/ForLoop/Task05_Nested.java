package ForLoop;

public class Task05_Nested {
    public static void main(String[] args) {
        /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */

        for (int i = 1; i <=6 ; i++) { // dış döngü
            for (int j = 1; j <= 5; j++) { //iç döngü
                System.out.print("# ");
            }
            System.out.println();
        }


    }
}
