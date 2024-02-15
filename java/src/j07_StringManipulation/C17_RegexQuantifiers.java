package j07_StringManipulation;

public class C17_RegexQuantifiers {
    public static void main(String[] args) {

        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.

        String str = "as";
        System.out.println(str.matches(".."));  //Bu 2 karakter mi icerdigini kontrol eder. matches metodu boolean verir
        System.out.println(str.matches(".s"));  //Bu da 2 karakterli ve s ile mi bitiyor? kontrolu
        //matches metodu regex ile calisip String degerin regex ile karsilastirmasini yapar

        //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.

        System.out.println("qsdhyg".matches(".s.*"));  //.s.*   burada 2. karakter s mi diye bakiyor, nokta sonrasi yildiz karakter sayisi farketmez demek

        System.out.println("qsadhyg".substring(1, 2).equals("s")); //Alternatif olabilir

        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.

        System.out.println("abc".matches("[a-zA-Z]*"));  //* koyarak harflerden istedigimiz kadar olabilir demek. * olmazsa sadece ilk harf icin olur
        System.out.println("ab9".matches("\\w{3}"));   //yani harflerden veya rakamlardan 3 adet karakter

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.

        System.out.println("abchd".matches("[a-zA-Z]{5}")); //5 karakter, hepsi de harf, true verir
        System.out.println("abchdqe".matches("[a-zA-Z]{5}")); //False verir, 5 ten fazla karakter var cunku
        System.out.println("abch4".matches("[a-zA-Z]{5}"));  //False, cunku harf disi karakter var

        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("123456".matches("[0-9]{6,}")); //bu sekilde en az 6 rakam demektir.
        System.out.println("123456789".matches("[0-9]{6,10}"));  //{6,10} yazarsak en az 6 max. 10 demektir

        System.out.println("abcd123xAc".matches("\\w{7,10}"));  //7-10 arasi harf-rakam ve _ isareti iceren

        //  \\w: [a-zA-Z0-9_]

        // ilk karakter 1, ikinci 3 karekter noktalama işareti ve kalan 6 karakter rakam toplam 10 karakter olan bir String yazalim
        System.out.println("1?.!345678".matches("[1][\\p{Punct}]{3}[0-9]{6}"));  //her bir [] bir karakter icin yazilir match de. ilk karakter 1, [1], 3 tane noktalama, 6 rakam


    }
}
