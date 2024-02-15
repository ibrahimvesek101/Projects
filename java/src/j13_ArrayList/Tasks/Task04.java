package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimList = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> aOlmayanIsimList = new ArrayList<>();//a olmayan isimlerin ekleneceği boş list tanımlandı
        System.out.println("isimList = " + isimList);

        for (int i = 0; i < isimList.size(); i++) {//isimList elemanlarını sıra ile tekrara alır

            if (!isimList.get(i).toLowerCase().contains("a")) {//isimList'ten gelen elelman içinde a veya A yoksa

                aOlmayanIsimList.add(isimList.get(i));//isimListt'en gelen içinde a veya a olmayan elelman aOlmayanIsimList'e ekle
            }

        }
        System.out.println("aOlmayanIsimList = " + aOlmayanIsimList);//[Veli, Omer]

        isimList.clear();//isimList boşaltıdı
        System.out.println("boş isimList: "+isimList);//[]

        isimList.addAll(aOlmayanIsimList);//a olan isimlerin silinmiş hali olan aOlmayanİsimList  eklendi

        System.out.println("isimList = " + isimList);// [Veli, Omer]

    }
}
