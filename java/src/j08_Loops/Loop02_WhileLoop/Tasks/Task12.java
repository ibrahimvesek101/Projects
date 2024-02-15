package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Agam bir metin giresen : ");
        String str = input.nextLine().toLowerCase();//girilen str değeri kuck harfe atandı

        int harfSay = 0;
        int rakamSay = 0;
        int karakterSay = 0;
        int strIndex = 0;

        do {
            if (str.length() == 0) {//"" boş karakterli str giriş şartı
                System.out.println("Agam adam gibi metim gir dedik ");
            } else if (str.charAt(strIndex) >= 'a' && str.charAt(strIndex) <= 'z') {//str'nin idex'indeki karakterin harf olma şartı
                harfSay++;
            } else if (str.charAt(strIndex) >= '0' && str.charAt(strIndex) <= '9') {//str'nin idex'indeki karakterin rakam olma şartı
                rakamSay++;
            }else karakterSay++;//str'nin idex'indeki karakterin özelkarakter olma şartı

            strIndex++;//her loop trkrarında str'nin bir sonraki indexi verir
        } while (strIndex < str.length());//loop strIndex str'nin boyutundan  kücük oldg surece  body action şartı

        System.out.println("Agam girdigin metinde "+harfSay+" tane harf var");
        System.out.println("Agam girdigin metinde "+rakamSay+" tane rakam  var");
        System.out.println("Agam girdigin metinde "+karakterSay+" tane özel karakter var");
    }

}
