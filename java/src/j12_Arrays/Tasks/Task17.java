package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyuk elemanı print eden code create ediniz...

        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int enBuyuk=arr[2][3];//arr elemanların çarpımı içn boş kutu tanımlandı

        for (int kat = 0; kat < arr.length; kat++) {
            for (int daire = 0; daire < arr[kat].length; daire++) {
                if (arr[kat][daire] >enBuyuk) {
                    enBuyuk=arr[kat][daire];
                }
            }
        }
        System.out.println(enBuyuk);//6
        System.out.println(Arrays.deepToString(arr));//sıralama öncesi
       // Arrays.sort(arr);//arr k->b sıralandı...//RTE MdArray sortingen çalışmaz
        System.out.println(Arrays.deepToString(arr));//sıralama sonrası


    }
}
