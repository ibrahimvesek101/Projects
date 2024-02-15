package J99_Lambda.lambdaTutorial;

import java.util.*;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    /*
   TASK :
   fields --> Universite (String)
              bolum (String)
              ogrcSayisi (int)
              notOrt (int)
              olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
    */
    public static void main(String[] args) {
        C10_University u01 = new C10_University("Bogazici", "Matematik", 571, 73);
        C10_University u02 = new C10_University("Istanbul", "Matematik", 622, 77);
        C10_University u03 = new C10_University("Marmara", "Hukuk", 1453, 52);
        C10_University u04 = new C10_University("Itu", "uçak muh.", 333, 63);
        C10_University u05 = new C10_University("Yıldız Teknik", "Gemi ", 216, 55);

        List<C10_University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        System.out.println("   task01  ");
        System.out.println(controlNotOrt74Byk(unv)); // Agam unv notOrt 74 den buyuk deeel
        System.out.println("   task02  ");
        System.out.println(control110azOlmayanOgrcsayisi(unv)); // Unv öğrenci sayısı 110 dan fazla
        System.out.println("   task03  ");
        System.out.println(controlMathBol(unv)); // Unv en az bir bolum Matematik bulundurur¬
        System.out.println("   task04  ");
        System.out.println(printOgrcSayisiTersSıra(unv)); //
        System.out.println("   task05  ");
        System.out.println(printNotOrTersSıra(unv));
        System.out.println("   task06  ");
        printOgrcSayisiEnaz2(unv);// 1193
        System.out.println("   task07  ");
        System.out.println(printNotOrt63BykOgrcSayıTopla(unv));
        System.out.println("   task08  ");
        System.out.println(printOgrcSayisi333BykNotOrt(unv)); // OptionalDouble[67.33333333333333]
        System.out.println("   task09  ");
        System.out.println(printMatSayisi(unv));// 2
        System.out.println("   task10  ");
        System.out.println(printOgrcSayisi571FazlaMaxNotOrt(unv)); // OptionalDouble[77.0]
        System.out.println("   task11  ");
        System.out.println(printOgrcSayisi1071AzMinNotOrt(unv)); // OptionalDouble[55.0]

    }//main sonu

    // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...
    public static String controlNotOrt74Byk(List<C10_University> unv) {

        return unv.stream().allMatch(t -> t.getNotOrt() > 74) ? "Agam unv notOrt 74 den  buyuk " : "Agam unv notOrt 74 den buyuk deeel";

    }

    //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.
    public static String control110azOlmayanOgrcsayisi(List<C10_University> unv) {
        return unv.stream().allMatch(t -> t.getOgrcSayisi() >= 110) ?
                "Unv öğrenci sayısı 110 dan fazla" :
                "Unv öğrenci sayısı 110 dan az";
    }


    //task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.
    public static String controlMathBol(List<C10_University> unv) {
        return unv.stream().anyMatch(t -> t.getBolum().contains("Mat")) ?
                "Unv en az bir bolum Matematik bulundurur" :
                "Unv en az bir bolum Matematik bulundurmaz";
    }

    //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<C10_University> printOgrcSayisiTersSıra(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi).reversed())// akışelamanları ogrcSayisina göre ters sıralandı
                .collect(Collectors.toList());// akışdaki elemanlar liste atandı.
    }

    //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...
    public static List<C10_University> printNotOrTersSıra(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getNotOrt).reversed())
                .limit(3)
                .collect(Collectors.toList());//akısdaki elemanlar liste atandı
    }

    //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...
    public static void printOgrcSayisiEnaz2(List<C10_University> unv) {
        System.out.println(unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList()));
    }

    //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...
    public static int printNotOrt63BykOgrcSayıTopla(List<C10_University> unv) {

        return unv
                .stream()
                .filter(t -> t.getNotOrt() > 63)
                .mapToInt(t -> t.getOgrcSayisi())//akışdaki elemanların data type parametredeki  değere göre update edildi
                .sum();//akışdaki elemanlar toplandı

    }

    //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...
    public static OptionalDouble printOgrcSayisi333BykNotOrt(List<C10_University> unv) {

        return unv
                .stream()
                .filter(t -> t.getOgrcSayisi() > 333)
                .mapToDouble(t -> t.getNotOrt())
                .average();
    }
    //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...

    public static int printMatSayisi(List<C10_University> unv) {
        return (int) unv
                .stream()
                .filter(t -> t.getBolum().contains("Mat"))
                .count();//akış elemanları saydırıldı
    }

    //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...
    public static OptionalDouble printOgrcSayisi571FazlaMaxNotOrt(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t -> t.getOgrcSayisi() > 571)
                .mapToDouble(t -> t.getNotOrt())
                .max();//akışdaki elemanların max alındı
    }
    //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...

    public static OptionalDouble printOgrcSayisi1071AzMinNotOrt(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t -> t.getOgrcSayisi() < 1071)
                .mapToDouble(t -> t.getNotOrt())
                .min();//akışdaki elemanların min alındı
    }
}
