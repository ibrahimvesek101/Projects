package MethodCreation.Part2;

import java.util.Scanner;

public class Task02 {
    static Scanner input = new Scanner(System.in);
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
      */

    public static void printCurrencySums(String input) {
        // Initialize variables to hold the dollar and euro sums
        int dollarsTotal = 0;
        int euroTotal = 0;

        // Split the input string into an array of individual currency values
        String[] currencies = input.split(" ");

        // Loop through the array and add up the euro and dollar amounts separately
        for (String currency : currencies) {
            if (currency.startsWith("$")) {
                // If the currency starts with a dollar sign, add the numeric value to the dollars total
                dollarsTotal += Integer.parseInt(currency.substring(1));
            } else if (currency.startsWith("€")) {
                // If the currency starts with a euro sign, add the numeric value to the euro total
                euroTotal += Integer.parseInt(currency.substring(1));
            }
        }

        // Print the results
        System.out.println("dollarsTotal: " + dollarsTotal + ", euroTotal: " + euroTotal);
    }

}
