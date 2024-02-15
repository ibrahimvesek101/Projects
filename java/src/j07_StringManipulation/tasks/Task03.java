package j07_StringManipulation.tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

        String str = "Alamanya";

       // str.indexOf('a')-> ilk a'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));

    }
}
