package j27_Abstract.abstract01;

public class Civic extends Lastik{
    /*
 extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
 java CTE verdi
 çözüm:
 a) Unımplemented (uyarlanmamış) method implement edilmeli
 b)parent Honda class'dan abstarct keyword kaldırılmalı
 c)concrete olan child Civic class abstract tanımlanmalı
  */

    // concerete class'da abstract method tanımlanır mı?
    // public  abstract void absMethod();// ya class abs olmalı yada method concrete body olmalı..
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli

    @Override
    public void motor() {
        System.out.println("Agam 1.6 eco motor neyine yetmiii");
    }

    @Override
    void kapı() {//impelemnted abs meth
        System.out.println("Agam kapı elinde kalmasın yavaş kapa");
    }

    @Override
    void koltuk() {//impelemnted abs meth
        System.out.println("Agam koltukda ucuza kaçıp kumaş çakmıssın");
    }

    @Override
    public void lastikEbat() {//impelemnted abs meth
        System.out.println("Agam 16' ilastik  ");
    }
    // polymorphisim->obj'nin çok biçimliliği
 // Civic c1 = new Civic();//civic child class data type obj
 // Honda c2=new Civic();//honda abs parent class data type obj


    // @Override
  // public void motor() {
  //     System.out.println("Agam 1.6 eco motor neyine yetmiii");
  // }

  // @Override
  // void kapı() {
  //     System.out.println("Agam kapı elinde kalmasın yavaş kapa");
  // }

  // @Override
  // void koltuk() {
  //     System.out.println("Agam koltukda ucuza kaçıp kumaş çakmıssın");

  // }
}
