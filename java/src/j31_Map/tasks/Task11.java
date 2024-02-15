package j31_Map.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task11 {

    public static void main(String[] args) {
        //Task ->  Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste return eden method create edinizn

        Map<Integer, String> mep = new HashMap<>();
        mep.put(101, "Ali, Can, java");
        mep.put(102, "Veli, Yan, java");
        mep.put(103, "Ali, Yan, C#");
        //String istenenDil="JAVA";
        System.out.println("javaBilenSırtıYereGelmez(mep,\"JAVA\") = " + javaBilenSırtıYereGelmez(mep, "JAVA"));
    }
    private static List<String> javaBilenSırtıYereGelmez(Map<Integer, String> mep, String java) {

        List<String> javaCAN = new ArrayList<>();//bos java bilenlerin atancagı isim list tanımlandı

        for (String avuc : mep.values()) {

            String arr[] = avuc.split(", ");//mep'in herbir valuesi ,  ile parçalanıp arr'e atandı

            if (arr[2].equals("java")) {

                javaCAN.add(arr[0]);
            }
        }

        return javaCAN;
    }
}
