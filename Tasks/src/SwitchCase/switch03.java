package SwitchCase;

import java.util.Scanner;

public class switch03 {
    public static void main(String[] args) {
        /*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = scan.nextInt();
        if (not>=0 && not<50) {
            not=0;
        } else if (not>=50 && not<60) {
            not=1;
        } else if (not>=60 && not<80) {
            not=2;
        } else if (not>=80 && not<100) {
            not=3;
        }
        switch (not) {
            case 0:
                System.out.println("D");
                break;
            case 1:
                System.out.println("C");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("A");
                break;
            default:
                System.out.println("Gecerli not giriniz");
        }


    }
}
