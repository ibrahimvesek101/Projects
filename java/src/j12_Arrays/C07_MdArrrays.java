package j12_Arrays;

public class C07_MdArrrays {
    public static void main(String[] args) {
        //Task-> int arr[][]={
        //                {3,5},//0. kat
        //                {12,13,15},//1. kat
        //                {103,107,111,121},//2. kat
        //        };
        //        array elamanları toplamını print eden code create ediniz.
        int toplam=0;//arr elamnalrı toplanacak boş kutu tanımlandı
        int arr[][]={
                {3,5},//0. kat
                {12,13,15},//1. kat
                {103,107,111,121},//2. kat
        };
        for (int kat = 0; kat < arr.length; kat++) {//katlara ulaşan tekrar
            for (int daire=0; daire < arr[kat].length; daire++){//dairelere ulaşan tekrar
                toplam+=arr[kat][daire];
            }
        }
        System.out.println("arr elamanları toplamını: "+toplam);// 490

    }
}
