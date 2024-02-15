package j19_StringBuilder;

public class Task {
    public static void main(String[] args) {
        /*
        Task->
        	Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) METHOD create ediniz.
	     (without case sensitivity)
	     Eg : input : javaCAN'lara selam olsun :)
	     Output: "Reversed sentence : ): nuslo males aral'NACavaj
	        It is not a palindrome"
         */
        StringBuilder sb = new StringBuilder("javaCAN");
        tersSB(sb);
        String str = "ece";
        System.out.println("isPolindrome(str) = " + isPolindromeCincix(str));// true
        System.out.println("isPolindrome(vedat) = " + isPolindromeCincix("vedat"));// false
        System.out.println("isPolindrome(\"ey edip adanada pide ye\") = " + isPolindromeCincix("ey edip adanada pide ye"));// true
        System.out.println("isPolindromeAmele(\"ismail\") = " + isPolindromeAmele("ismail"));// false
        System.out.println("isPolindromeAmele(\"aga\") = " + isPolindromeAmele("aga"));// true

    }//main sonu

    private static boolean isPolindromeAmele(String str) {
        String trsStr = "";//str'nn tersden sırasını atanacak boş kutu

        for (int i = str.length() - 1; i >= 0; i--) {
            trsStr += str.charAt(i);
        }
        return trsStr.equals(str);
    }

    private static boolean isPolindromeCincix(String str) {//cincix code
        StringBuilder SB = new StringBuilder(str);
        // return new StringBuilder(str).//SB  tanımlanıp ilk değeri str atandı
        return SB.//SB  tanımlanıp ilk değeri str atandı
                reverse().//SB index'e göre ters cevirildi.
                toString().//SB Stringe cevirildi ki eşitliği kontrol edilsin
                equals(str);//str ile eşitliği kontrol edildi
    }

    private static void tersSB(StringBuilder sb) {
        System.out.println("girilen SB index'e göre tersi = " + sb.reverse());
    }


}//class sonu
