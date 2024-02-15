package j25_Inheritance.inheritance02;

public class Hayvancık {// G parent-super (dede)  Class
    int a;//inst. default int type variable
    int m=3;//inst. initial  int type variable
    public Hayvancık() {//p'siz cons.
        System.out.println("Agam ahan da HAYVANCIK p'siz cons...");
    }
    public Hayvancık(int x) {//int p'li cons.
        System.out.println("Agam ahan da HAYVANCIK p'li cons...");
    }
    public void mA(){
        System.out.println("mA -> HAYVANCIK  class meth. call...");
    }
    public void mM(){//Child'da ezilen meth
        System.out.println("mM -> HAYVANCIK  class meth. call...");
    }
}//Class sonu
