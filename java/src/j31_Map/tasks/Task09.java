package j31_Map.tasks;

import java.util.HashMap;

public class Task09 {
    /* Task -> Ad ve soyad bulunduran iki ayrı array'i bir map'de print eden code create ediniz.
     input : {"javaCAN", "javaTAR", "javaNAZ"};  {"Ahmet", "Haluk", "İpek"};
     output:{javaCAN=Ahmet,javaTAR=Haluk,javaNAZ=İpek}
    */

    public static void main(String[] args) {
        String unvan[] = {"javaCAN", "javaTAR", "javaNAZ"};
        String isim[] = {"Ahmet", "Haluk", "İpek"};

        HashMap<String,String> heşMep=new HashMap<>(); // boş bir heşMep tanımşandı
        for (int i = 0; i < unvan.length; i++) {
            heşMep.put(unvan[i],isim[i] );
        }
        System.out.println("heşMep = " + heşMep); // {javaNAZ=İpek, javaTAR=Haluk, javaCAN=Ahmet}


    }// main sonu
}
