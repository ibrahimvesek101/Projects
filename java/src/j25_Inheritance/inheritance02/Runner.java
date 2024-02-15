package j25_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
        // Data Type obj  = new    Cons
        Kedicik k1 = new Kedicik();//Kedicik data taype obj
        System.out.println("k1.a = " + k1.a);// 0->Hayvancık Class call
        System.out.println("k1.c = " + k1.c);// 2->Kedicik Class call
        System.out.println("k1.d = " + k1.d);// 7->Kedicik Class call
        System.out.println("k1.m = " + k1.m);// 1->Mammal Class call
        System.out.println("   ***   ");
        Mammal k2 = new Kedicik("pambık");//Mammal data type obj
        System.out.println("k2.a = " + k2.a);// 0->Hayvancık Class call
        System.out.println("k2.c = " + k2.c);// 4->Mammal Class call
        //  System.out.println("k2.d = " + k2.d);//CTE -> Mammal Class'da d tanımlı değil
        System.out.println("k2.m = " + k2.m);// 1->Mammal Class call
        System.out.println("   ***   ");

        Hayvancık k3 = new Kedicik("pambık");//Hayvancık data type obj
        System.out.println("k3.a = " + k3.a);// 0->Hayvancık Class call
        //   System.out.println("k3.c = " + k3.c);// CTE -> Hayvancık Class'da d tanımlı değil
        //   System.out.println("k3.d = " + k3.d);// CTE -> Hayvancık Class'da d tanımlı değil
        System.out.println("k3.m = " + k3.m);// 3->Hayvancık Class call
/*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
 Variable araştırmaya data type Class'dan başlanıp parentlere gidilir
 */
        System.out.println("   ***   ");
        k1.mA();
        k1.mC();
        k1.mM();

        System.out.println("   ***   ");
        k2.mA();
        k2.mC();
        k2.mM();
        System.out.println("   ***   ");
        k3.mA();
      //  k3.mC();
        k3.mM();
/*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj methodları  cons. göre call edilir
 method araştırmaya cons. Class'dan başlanıp parentlere gidilir
 */
    }//main sonu
}//class sonu
