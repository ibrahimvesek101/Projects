package j06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre ayın isimini print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Dadaş hele bir ayın sayisini gir : ");
        int aySayi = input.nextInt();

        switch (aySayi) {
            case 1:
                System.out.println("ocak");
                break; //code blok bu komuttan sonra kırılır: bloktan sonraki satır run edilir
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("kurban olim sizin köyde bir yılda kaç ay var :( ");
        }
        System.out.println("dadaş code cincik oldu DEWAMKEE...");//bu komut console'de görülürse yukarıdaki bloklardan çıkılmış demektir

    }
}
