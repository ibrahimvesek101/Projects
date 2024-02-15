package j26_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {

    public static void main(String[] args) {
          /*
        ahan da TRİCK kosesinde bugun :)

        "throw" - throws" farkları
        1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
           "throw" -> method body içinde tanımlanır.
        2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
           "throw" -> keywordden sonra sadece bir tane exception tanımlanır
        3- "throws" -> keywordden sonra sadece exception class name yazılır
            "throw" ->  keywordden sonra exception obj tanımlanır
        4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
            "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
         */


        // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
        // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..

        Scanner input = new Scanner(System.in);
        System.out.println("agam yasını giresen : ");
        int yas = input.nextInt();

        try {
            if (yas < 18) {
                throw new IllegalArgumentException("Bu " + yas + " yaşda NAHsıl ehliyet alacan :( allan fasillesi  ");
                // throw key word ile Exc. obj oluşturularak hata tanımlanır  ve fırlatılır.
                //Böylece sartımıza uymayan(yas<18)  value için catch blok'a düşürülerek hata handle edilmesi sağlanır.
            } else System.out.println("agam ehliyet alacak yaşdasın bir tur verirsin artık :) ");


            System.out.println("Agam bu satırı okuduysan code exception fırlatmadı ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + (18 - yas) + " yıl daha buyumen lazım ");
            System.out.println("TEE ELLLAMMM TAAA agam nişleding bu yaşda ehliyet mi alınır  :( ");
            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");


    }


}
