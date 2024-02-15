package ArraysCodeChalllange;

import java.util.Arrays;
import java.util.List;

public class Q09_Arraylist {
    /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43)
     Output is (21, 11, 21, 15, 21, 34, 43)
 */
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(12, 11, 12, 15, 12, 34, 43);
        System.out.println(list);

        if(list.contains(12)) { // eleman olarak 12 varsa
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)==12) { // herahngi bir eleman 12 ye eşitse
                    list.set(list.indexOf(12),21); // set metodu elemanı başka bir elamnla değiştirir
                }
            }
        }
        System.out.println(list);

    }

}
