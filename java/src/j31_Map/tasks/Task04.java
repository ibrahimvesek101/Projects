package j31_Map.tasks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task04 {
    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam bişeyler cızıkdırasan : ");
        String bisey = input.nextLine(); //javaCAN
        TreeMap<Character, Integer> harfFrekans = new TreeMap<>();

        for (int i = 0; i < bisey.length(); i++) {

            Character keyOlanChar=bisey.charAt(i);

            if (harfFrekans.containsKey(keyOlanChar)) {//biseydeki her bir charın harfFrekans map'de varlık kontrolu

                harfFrekans.replace(keyOlanChar, harfFrekans.get(keyOlanChar) + 1);

            } else

                harfFrekans.put(keyOlanChar, 1);//bisyedeki herbir char harffrekansda yoksa valuesini 1 olarak ekle
        }
        System.out.println("harfFrekans = " + harfFrekans);

    }


}

