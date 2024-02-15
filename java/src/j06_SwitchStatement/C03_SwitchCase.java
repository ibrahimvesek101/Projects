package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {

    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
        Scanner input = new Scanner(System.in);
        System.out.print("Dadaş hele bir ayın sayisini gir : ");
        int aySayi = input.nextInt();

        switch (aySayi) {
            default://switch hiç bir case için calışmzsa devreye girer.switch blok'da yeri önemli değildir.
                System.out.println("kurban olim sizin köyde bir yılda kaç ay var :( ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12://yukarıdaki tüm case'ler aynı aksiyonu alacagı için break atılmadı
                System.out.println("girilen ayda 31 gün  vardır");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ayda 30 gün  vardır");
                break;
            case 2:
                System.out.print("hele yılını giresen :");
                int yıl = input.nextInt();
               //if (yıl % 4 == 0) {
               //    System.out.println("girilen ayda 29 gün vardır");
               //} else System.out.println("girilen ayda 28 gün vardır");
                System.out.println(yıl % 4 == 0 ? "girilen ayda 29 gün vardır" : "girilen ayda 28 gün vardır");
                break;

        }
        System.out.println("dadaş code cincik oldu DEWAMKEE...");//bu komut console'de görülürse yukarıdaki bloklardan çıkılmış demektir


    }
}
