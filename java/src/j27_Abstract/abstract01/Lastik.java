package j27_Abstract.abstract01;

public abstract class Lastik extends Honda {//abs parent ancak Honda abs. parente extends child Class
//abs. class extends parent-child ilişkisinde abs. meth implement zorunluluğu yoktur
   public abstract  void lastikEbat();//abs impelemnt zorunlu meth

    public  void kısLastik(){//concrete meth
        System.out.println("Agam karlı havada ihmal etme pis cezası var ");
    }
}
