package j25_Inheritance.inheritance01;

public class Kedi extends Mammal {//Mammal parent Classın child Classı
    public Kedi() {//P'siz child cons.
        System.out.println("Agam P'siz KEDİ cons call edildi..");
    }
    public  void cırmala(){
        System.out.println("Agam asil kedi fena cırmalar:)");
    }

}
