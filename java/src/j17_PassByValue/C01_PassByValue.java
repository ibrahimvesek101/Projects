package j17_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
            /*
        Java Pass By Value bir programlama dilidir.
        Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

         */
        // task -> verilen fiyat için %24 artırılmış fiyatı print eden METHOD  create ediniz.

        double fiyat = 100;//double type primitive variable

        System.out.println("method call öncesi fiyat değeri : "+fiyat);//methoda parametre olarak girmeden önceki fiyat değeri -> 100


        fiyatArttir(fiyat);//meth call -> 124


        System.out.println("method call sonrası fiyat değeri : "+fiyat);//methoda parametre olarak girdikten sonraki fiyat değeri -> 100 :pass By value



    }//main sonu

    private static void fiyatArttir(double fiyat) {

        fiyat*=1.24;
        System.out.println("fiyatınızın artmış hali : "+fiyat);


    }


}//class sonu
