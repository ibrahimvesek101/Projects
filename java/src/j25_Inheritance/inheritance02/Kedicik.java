package j25_Inheritance.inheritance02;

public class Kedicik extends Mammal {//parent Mammal Class extend child Kedicik Class
    int c = 2;   int d = 7;
    public Kedicik() {//p'siz cons...
        super();//parent super Class p'siz cons call
        System.out.println("Agam ahan da KEDİCİK p'siz cons...");
    }

    public Kedicik(String  str) {

      this();//BU CLassdaki p'siz cons call edildi
    // this("a");//-> CTE recursive cons tanımlanamaz
        System.out.println(super.c);//parent class c variable call edildi
        System.out.println("Agam ahan da KEDİCİK p'li cons...");
    }
    @Override//@Override annotation-> overriden(eziled) meth ile ovveride (ezen) meth ilişkilendirir.
    public  void mC() {

        System.out.println("mC -> KEDİCİK Class meth call...");
    }
    @Override
    public String toString() {
        return super.toString() +
                "c=" + c +
                ", d=" + d ;
    }
}//Class sonu
