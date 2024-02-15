package j20_Constructor;

public class C01_Constructor {
    /*
    1- consturctor ismi Calss name ile aynı olmalı.Cons name Buyuk harf ile başlamalı
    2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
    3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
    4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
    5-Class tanımlandığında java default cons. kendi create eder.
    6-Fields-> obj'nin uretilirken alacagı değer variables
    7-bir class'da bir den çok cons. tanımlanabilir
     */

    String str;  // inst. variable-> obj variable(initial edilmemiş)
    String selam = "güzel insan";// inst. variable-> obj variable(initial edilmiş)

  //  C01_Constructor obj1 = new C01_Constructor();-> class level'a da obj create edilebilir.

    public static void main(String[] args) {
        // clas name    obje name  =  new keyword   defaultCons.
        C01_Constructor obj1 = new C01_Constructor();
       // C01_Constructor obj1 = new C01_Constructor();//aynı obj create edilirse CTE:dublicate
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();
        // bir class'dan istenildiği kadar obj create edilebilir.obj ile class üyelerine(field meth.) ulaşılabilir
        obj1.str = "javacan";//str ins. variable obj1 ile call edilerek obj1 için str variable için javacan value atandı
        obj2.str = "javatar";//str ins. variable obj2 ile call edilerek obj2 için str variable için javatar value atandı
        System.out.println(obj3.selam);//"güzel insan"

        System.out.println("obj1.str = " + obj1.str);//obj1.str = javacan
        System.out.println("obj2.str = " + obj2.str);//obj2.str = javatar
        System.out.println("obj4.str = " + obj4.str);//obj4.str = null

        obj3.aga();//obj3 ile aga() meth call-> agama selamkeee :)
        obj2.aga();//obj2 ile aga() meth call-> agama selamkeee :)

    }// main sonu
    public   void aga(){
        System.out.println("agama selamkeee :)");
    }
}
