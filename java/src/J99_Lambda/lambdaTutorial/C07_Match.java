package J99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme",  "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("\n   task01   ");
        kontrolCharSayisi7ve7denAz( yemahhh);
        System.out.println(kontrolCharSayisi7ve7denAz1(yemahhh));;
        System.out.println("\n   task02   ");
        System.out.println(kontrolWBasla(yemahhh));
        System.out.println("\n   task03   ");
        System.out.println(kontrolXBit(yemahhh));
    }//main sonu

    // Task01->  List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.
public  static  void kontrolCharSayisi7ve7denAz(List<String> yemahhh){
   yemahhh.stream().anyMatch(t -> t.length() <= 7);//tum elelmanlar kontrol edilir tum elemanlar sartı saglıyorsa true
    if (yemahhh.stream().anyMatch(t -> t.length() <= 7)) {
        System.out.println("Agam menude enaz bir yemahh 7 harf ve daha az character :)");

    }else System.out.println("Agam menude aradagın yemahh yok :(");

}
    public  static  String  kontrolCharSayisi7ve7denAz1(List<String> yemahhh){

     return    (yemahhh.stream().anyMatch(t -> t.length() <= 7))?"Agam menude enaz bir yemahh 7 harf ve daha az character :)":"Agam menude aradagın yemahh yok :(";

    }
    // Task02-> List elemanlarinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch
    public  static  String  kontrolWBasla(List<String> yemahhh){

       // return    (yemahhh.stream().noneMatch(t -> t.toUpperCase().startsWith("W")))?"Agam menude hiç bir yemahh W ile başlameyyo :)":"Agam menude W ile başlayan enz bir yemahhh var :(";
        return    (yemahhh.stream().noneMatch(t -> t.toString().substring(0,1).equalsIgnoreCase("W")))?"Agam menude hiç bir yemahh W ile başlameyyo :)":"Agam menude W ile başlayan enz bir yemahhh var :(";

    }
    // Task03-> List elemanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->

    public  static  String  kontrolXBit(List<String> yemahhh){

         return    (yemahhh.stream().noneMatch(t -> t.endsWith("x")))?"Agam menude hiç bir yemahhh x ile bitmeyyoo :(":"Agam menude enaz bir yemahh X ile Biteyyoo :)";
      //  return    (yemahhh.stream().anyMatch(t -> t.toString().substring(0,1).equalsIgnoreCase("W")))?"Agam menude hiç bir yemahh W ile başlameyyo :)":"Agam menude W ile başlayan enz bir yemahhh var :(";

    }






}
