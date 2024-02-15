package ArraysCodeChalllange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_ArrayList {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini
         * girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve
         * yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Olusturmak istediginiz listin uzunlugunu giriniz : ");
            int listUzunluk = scan.nextInt();
            // kullanıcı oluşturulacak dizinin uzunluğunu girer

            List<Integer> list= new ArrayList<>();
            System.out.println("arrayin elemanlarını giriniz");
            // boş dizi tanımlanır

            for (int i = 0; i < listUzunluk; i++) {
                list.add(scan.nextInt());
            }
            // kullanıcının girdiği sayılar diziye eklenir

            tekrarliEleman(list);

        }

    private static void tekrarliEleman(List<Integer> list) {
            List<Integer>tekrarliList = new ArrayList<>();
            //tekrarlı elemanların atanacağı bir arraylist oluşturulur,
            // output olarak bu arraylist gönderilecek
        for (int i = 0; i < list.size(); i++) { // dış döngü
            // { 1 , 2 , 2 , 3 , 4}
            for (int j = i+1; j <list.size(); j++) { //iç döngü,
                // i nin indexindeki elemandan bir sonraki indextedki elemanın kontrolü
                if (list.get(i)==list.get(j)&&!tekrarliList.contains(list.get(i))) {
                    tekrarliList.add(list.get(i));
                } // arraylistin bir önceki elemanıyla bir sonraki elemanı birbirine eşitse yeni oluşturulan arrayliste ekle
            }
        }
        System.out.println(tekrarliList);
    }


}


