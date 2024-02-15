package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);

        int grsHkk=3;
        String  dgrPin="javaCAN";
        while (true){

            System.out.print("gakgom hele bi pin cizikdiresen ha :");
            if (dgrPin.equals(input.nextLine())) {
                System.out.println("Gakgom böyün ballı günüğndesin haa :)");
                break;
            } else {
                System.out.println("gakgom hele bi daha pin cizikdiresen ha :");;
                grsHkk--;
                System.out.println("Gakgom kalan hakkın : "+grsHkk);
                if (grsHkk == 0) {
                    System.out.println("Gakgom hiç canın kalmadı bekleme yapma DEWAMKEEE ");
                    break;
                }
            }
        }
    }
}
