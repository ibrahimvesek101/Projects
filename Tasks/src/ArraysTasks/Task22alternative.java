package ArraysTasks;

import java.util.Arrays;

public class Task22alternative {
    public static void main(String[] args) {
        String str2= "JavaCAN'lara selam olsun";
        String[] arr= str2.replace("'","").replace(" ","").toLowerCase().split(""); //str'yi array'e atar, boşlukları ve kesme işaretlerini siler
        Arrays.sort(arr); // arrayi alfabetik olarak sıralar, [a, a, a, a, a, a, c, e, j, l, l, l, m, n, n, o, r, s, s, u, v]
        System.out.println(Arrays.toString(arr));
        int enCokTekrarSayisi=0;
        int count=0;
        String enCokTekrarHarf=" ";
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                // [a, a, a, a, a, a, c, e, j, l, l, l, m, n, n, o, r, s, s, u, v]
                // harf bir önceki harfe eşitse sayaç artırılır böylece harfin kaç tane olduğu bulunur
                // *örnek: 5. tura kadar count artacak, count a harfi saysını saymış olacak
                count++;
                System.out.print(count+" ");
            } else{ // harf bir önceki harfe eşit değilse yeni harfe geçilmiştir. *örnek: 6. turda else girecek, çünkü c harfine geçildi
                if (count>=enCokTekrarSayisi) {  //*örnek: 6. turda a sayısını saymış olan count enCokTekrarSayisi'ndan büyük olduğu için if'e girecek
                    enCokTekrarSayisi=count+1;
                    count=0; // sayaç sıfırlanır, yeni harfi sayabilmek için
                    enCokTekrarHarf=arr[i-1]; //harf şimdilik en çok tekrarlanan harf oldu

                }


            }

        }

    }
}
