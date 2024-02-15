package j24_Encapsulation.encapsulation03;

public class AracRunner {//step3
    public static void main(String[] args) {//main level
   Arac a1=new Arac();//P'siz cons. call edilerek obj create edildi ->step4
    Arac a2=new Arac("volvo","inci beyaz",2015,2000);//P'li cons. call edilerek obj create edildi ->step4
    Arac a3=new Arac("Audi","bejjj",-1905,300);//P'li cons. call edilerek obj create edildi ->step4

        System.out.println("a1.getModel() = " + a1.getModel());// null
        System.out.println("a1.getRenk() = " + a1.getRenk());// null
        System.out.println("a1.getYıl() = " + a1.getYıl());// 0
        System.out.println("a1.getMotor() = " + a1.getMotor()); // 0

        a1.setModel("hacı Murat");
        a1.setYıl(-1974);
        a1.setMotor(1300);
        a1.setRenk("civciv sarısı");

        System.out.println("a1.getModel() = " + a1.getModel());// null
        System.out.println("a1.getRenk() = " + a1.getRenk());// null
        System.out.println("a1.getYıl() = " + a1.getYıl());// 0
        System.out.println("a1.getMotor() = " + a1.getMotor()); // 0

        System.out.println("a2 = " + a2);//
        System.out.println("a3 = " + a3);//
        System.out.println("a3.getYıl() = " + a3.getYıl());//
        System.out.println("a3.getMotor() = " + a3.getMotor());
    }//main sonu
}
