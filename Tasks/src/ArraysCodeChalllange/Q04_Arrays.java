package ArraysCodeChalllange;

import java.util.Arrays;

public class Q04_Arrays {
    /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini
    bulan prgram yazin
    String s= "Apex,nesne yonelimli bir programlama dilidir"
                {"a", "e", "i", "o", "u"} */
    // array1= boşlukları kopartılmış s stringi
    // array2= sesli harfler
    // for (array1 taranır) { for (array2) sayac++

    public static void main(String[] args) {
        String s= "Apex,nesne yonelimli bir programlama dilidir";
        s= s.replace(",","").replace(" ","");
        String[] arr= s.split("");

        String[] sesliHarfler= {"a", "e", "i", "o", "u"};
        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sesliHarfler.length; j++) {
                if (arr[i].equalsIgnoreCase(sesliHarfler[j])) {
                    sayac++;
                }
            }
        }
        System.out.println("sesli harf sayısı = "+sayac);

    }


}
