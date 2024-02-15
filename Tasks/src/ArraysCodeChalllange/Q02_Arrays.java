package ArraysCodeChalllange;

import java.util.Arrays;

public class Q02_Arrays {
     /*
      *  Verilen bir cumledeki bosluklar haric
      *  character sayisini bulunuz.
      *
      *  Cumle: Verilenbircumledeki
      *  bosluklarhariccharactersayisinibulunuz.
      * split("")
      *  output: 58
      */
     public static void main(String[] args) {
          String str="Verilen bir cumledeki bosluklar haric" +
                  "character sayisini bulunuz.";
          String [] arr= str.replace(" ","").split("");
          System.out.println(Arrays.toString(arr));

          System.out.println(arr.length);



     }



}
