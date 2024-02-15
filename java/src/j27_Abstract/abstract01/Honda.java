package j27_Abstract.abstract01;

public abstract class Honda {//abs. parent Class

    public abstract void motor();//abs-> body'siz implemet zorunlu meth.

    void sunroof() {//concrete-> body'li call edilebilir meth.

        System.out.println("Agam keyfini bilirsen sunroofu açarsan böğrüne maaşallah yazdırırsın ");
    }
    abstract  void  kapı();//abs-> body'siz implemet zorunlu meth.

    abstract  void koltuk();//abs-> body'siz implemet zorunlu meth.
    //abs. class concrete variable tanımlanır mı?->evet

    String isim = "murat bey";
    //abs. class abs. variable tanımlanır mı?->o-la-mazzzz
    // abstract String str="javaCAN";

   // final void finalMethod();//final body'siz method tanımlanamaz.
    //final abstract void finalMethod();//abs meth final olamaz
    //private  abstract  void privateMethod();//abs. method kısıtlanamz private olamaz

    //static void  gunesMethod();//static concrete meth bodysiz olamaz
    //static abstract  void gunesMethod();//abs static meth olamaz

    //Honda h1=new Honda();//abs Class obj uretemez->melek doğurmazz

}
