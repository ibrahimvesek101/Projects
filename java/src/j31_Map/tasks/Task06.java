package j31_Map.tasks;

import java.util.ArrayList;
import java.util.HashMap;

public class Task06 {

    /* Task->
    String-Integer HashMap parametre alan ve ArrayList<String> return eden
    returnKey() isminde bir method create ediniz.

    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5

     */

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Lion", 1);
        hm.put("Tiger", 2);
        hm.put("Elephant", 3);
        hm.put("Cat", 4);
        hm.put("Dog", 5);

        System.out.println("returnKey(hm) = " + returnKey(hm)); //  [Elephant, Cat, Lion, Dog, Tiger]

    }//main sonu

    private static ArrayList<String> returnKey(HashMap<String, Integer> heşMep) {

        return new ArrayList<>(heşMep.keySet());

    }
}


