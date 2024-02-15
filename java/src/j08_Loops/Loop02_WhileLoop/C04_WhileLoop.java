package j08_Loops.Loop02_WhileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz


        int basla=100;//3 basamaklı baslangıc sayısı
        while (basla<=999){

            if (basla%4==0){
                System.out.print(basla+" ");
            }

            basla++;
        }
    }
}
