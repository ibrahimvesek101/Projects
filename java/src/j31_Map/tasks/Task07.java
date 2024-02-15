package j31_Map.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Task07 {
    /* task->

    Parametreleri , Integer -String HashMap,  int ve String olan (3ayrı parametre)
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyip Integer - String HashMap return eden
    update() isminde METHOD create ediniz.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    input :
    int = 3
    String = Miami
    output :
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "New jersey");
        hm.put(2, "New York");
        hm.put(3, "London");
        hm.put(4, "Paris");

        System.out.println("update(hm, 3, \"Miami\") = " + update(hm, 3, "Miami")); // {1=New jersey, 2=New York, 3=Miami, 4=Paris}
        System.out.println("update(hm, 4, \"Angara\") = " + update(hm, 4, "Angara")); // {1=New jersey, 2=New York, 3=Miami, 4=Angara}
    }//main sonu

    private static HashMap<Integer, String> update(HashMap<Integer, String> heşMep, int key, String sehir) {
        if (heşMep.containsKey(key))
            heşMep.put(key, sehir);
        return heşMep;
    }
}
