package j17_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //  task -> verilen fiyat için %11 %22 ve %33  indirimli  fiyatı print eden return type METHODlar  create ediniz.
        double fiyat = 100;//double type primitive variable

        System.out.println("method call öncesi fiyat değeri : " + fiyat);//methoda parametre olarak girmeden önceki fiyat değeri -> 100

        System.out.println("indir11(fiyat) = " + indir11(fiyat));//meth. call->89

        System.out.println("indir22(fiyat) = " + indir22(fiyat));//meth. call->78

        System.out.println("indir33(fiyat) = " + indir33(fiyat));//meth. call->67

        System.out.println("method call sonrası fiyat değeri : " + fiyat);//methoda parametre olarak girdikten sonraki fiyat değeri -> 100 :pass By value


    }//main sonu

    private static double indir33(double fiyat) {

        return fiyat*0.67;//parametre fiyatın %33 eksiği return edildi
    }

    private static double indir22(double fiyat) {

        return fiyat*0.78;//parametre fiyatın %22 eksiği return edildi
    }

    private static double indir11(double fiyat) {
        return fiyat*0.89;//parametre fiyatın %11 eksiği return edildi

    }


}//class sonu
