package ArraysTasks;

public class Q13_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value
         * of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi
         * yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4 = ortalama
         * Output2 : 5,6,7 = ortalamadan büyük olan dizi elemanları
         */
        int [] arr= {1,2,3,4,5,6,7};
        int ortalama=0;
        int toplam=0;
        int sayac=0;
        // ortalama hesabı
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
            sayac++;
        }
        ortalama=toplam/sayac;
        System.out.println(ortalama);

        //ortalamadan büyük olan dizi elemanları
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ortalama) {
                System.out.print(arr[i]+" ");
            }

        }





    }
}
