package j31_Map.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task10 {

    public static void main(String[] args) {
        // Task ->Verilen bir Stringdeki harfleri sayısını return  eden method create ediniz
        //  Input : Hellooo
        //  output : H=1, e=1, l=2, o=3


        String input = "eyedipadanadapideye";

        System.out.println("harfSay(input) = " + harfSay(input));//


    }//main sonu

    private static HashMap<Character, Integer> harfSay(String input) {
        HashMap<Character, Integer> heşMep = new HashMap<>();//boş heşMep tanımşandı
        for (int i = 0; i < input.length(); i++) {
            if (heşMep.containsKey(input.charAt(i))) {


                heşMep.put((input.charAt(i)), heşMep.get(input.charAt(i)) + 1);


            } else heşMep.put((input.charAt(i)), 1);
        }
        return heşMep;
    }

}
