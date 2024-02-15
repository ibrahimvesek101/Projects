package j31_Map.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task05 {

    /* Task-> girilen key(ınteger type) karsılık gelen Value(String type) return eden map ve int parametre
    alan method create ediniz.

    ÖRNEK:
    Map:
                    1 ,  "Lion"
                    2 ,  "Tiger"
                    3 ,  "Elephant"
                    4 ,  "Cat"
                    5  , "Dog"
     input: 3
     output : Elephant
     */

    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "Lion");
        mp.put(2, "Tiger");
        mp.put(3, "Elephant");
        mp.put(4, "Cat");
        mp.put(5, "dog");

        System.out.println("mapMethod(mp, 3) = " + mapMethod(mp, 3)); //  Elephant
        Scanner input = new Scanner(System.in);
        System.out.println("Agam istediğin hayvanın sayısını giresen  : ");
        int sayı = input.nextInt();

        System.out.println("mapMethod(mp,sayı) = " + mapMethod(mp, sayı));
    }

    private static String mapMethod(Map<Integer, String> mp, int i) {

        return mp.get(i); //mp'de i key'e ait value return edildi.


    }
}