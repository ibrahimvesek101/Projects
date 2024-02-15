package j25_Inheritance.inheritance02;

public class Mammal extends Hayvancık {//Hayvancık parent Class extend Mammal child class
    int m = 1;    int c = 4;
    public Mammal() {//p'siz cons..
        this('H');//BU Class p'li cons call edildi
        System.out.println("Agam ahan da MAMMAL  p'siz cons...");
        //  this('H');-> CTE cons. call ilk satırda tanımlanmalı
    }



    public Mammal(char y) {//char data type p'li cons..
        super(34);//Super Class p'li cons call edildi...
        System.out.println("Agam ahan da MAMMAL  p'li cons...");
    }
    public  void mC() {
        System.out.println("mC -> MAMMAL Class meth call...");
    }
    @Override//annotation(dip not)
 public  void mM() {//parent'den ezen meth.
     System.out.println("mM -> MAMMAL Class meth call...");
 }


}//Class sonu
