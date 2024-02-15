package j20_Constructor;

public class C04_Teacher {//ogretmen obj ureten kalıphane Class
    String ad;
    String soyad;
    String branş;
    int tecrube;
    double maaş;
    int id;
    boolean emekli;

    public  void  dersSaati(){

        System.out.println( " agam haftada 20 saatten sonra extraya girer :)");
    }

    public C04_Teacher() {//p'lini ezdiği dafult cons yerine p'siz cons. cerate edidli
    }

    //king of Trick-> p'li cons default cons ezer.
    public C04_Teacher(String ad, String Soyad, String branş, int tecrube, double maaş, int id, boolean emekli) {//pLİ cons
        /*
        Constructor içerisinden yukarıda(class level) tanımlanan object değişkenlerine(instance variable) erişilmek istenirse this keyword kullanılır.
        this keyword, o anda üzerinde işlem yapılan object'in referansını return eder ve böylece nesne değişkenlerine(instance variable) erişilir.
         Ancak nesne değişkenleri(instance variable) ile cons. parametre değişkenlerinin isimleri farklı olsaydı(soyad = Soyad) this keyword gerek kalmayacaktı.
          Bu kural sadece constructor için değil, bütün metotlar için geçerlidir.
         */
        this.ad = ad;
        soyad = Soyad;
        this.branş = branş;
        this.tecrube = tecrube;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", Soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", tecrube=" + tecrube +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }
}
