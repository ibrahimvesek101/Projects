package ArraysCodeChalllange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q08_ArrayList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa
         *  kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna
         *  rastgele sayi olusturup ekleyelim, ve gosterelim.
         */
        // input1= Enes
        //output1 = Enes+random sayı
        //input2= Canan
        // output2= bu kullanıcı adını kullanabilirsiniz


        List<String> databaseIsimler = new ArrayList<>();
        databaseIsimler.add("Enes");
        databaseIsimler.add("Ismail");
        databaseIsimler.add("AbdulBaki");
        databaseIsimler.add("Emre");
        databaseIsimler.add("Melisa");
        databaseIsimler.add("Oguz");
        System.out.println("databaseIsimler = " + databaseIsimler);

        Scanner scan = new Scanner(System.in);
        System.out.println("kullanmak istediginiz username i giriniz :");
        String username = scan.nextLine().trim();

        boolean userNameVarmi= databaseIsimler.contains(username);

        if(userNameVarmi) { // eğer database listesinde girilen username zaten buluyorsa
            System.out.println("bu kullanıcı adı alınmış");
        } else { // database listesinde kullaınıcının girdiği username bulunmuyor,
            // kullanıcı girdiği usernamei kullanabilir
            System.out.println("bu kullanıcı adını adını kullanabilirsiniz");
        }

        if (userNameVarmi) {
            int randomSayi= new Random().nextInt(100);
            username=username+randomSayi; //Enes+randomsayi
            System.out.println("yeni kullanıcı adınız "+username);
            databaseIsimler.add(username); // database yeni kullanıcı adı eklenir
            System.out.println(databaseIsimler);
        } else {
            System.out.println("yeni kullanıcı adınız " +username);
            databaseIsimler.add(username);
            System.out.println(databaseIsimler);
        }


    }

}