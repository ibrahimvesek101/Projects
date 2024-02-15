package SwitchCase;

import java.util.Scanner;

public class switch02 {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız.
        // 1.gün Pazartesi olsun

        Scanner scan = new Scanner(System.in);
        System.out.print("gunNo =");
        int gunNo = scan.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("Hata");
        }


    }
}
