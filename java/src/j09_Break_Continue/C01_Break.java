package j09_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
             /*
        break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop’u, loop’un koşul bölümüne bağlı
        kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop’a bağlı kod bloğunun
         herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu’nu görür görmez,
         loop başlangıç koşulu sağlanmış olsa bile, loop’dan çıkar ve loop’dan sonra gelen ilk işlem
         satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
          içinde kullanıldığı loop’dan çıkışı sağlar:


         temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
         */

        //Task-> girilen bir mail hesabı @ karakterine olan karakterleri print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("Agam imeyıl hesaba giresen : ");
        String emeyıl = input.nextLine();//ebıkGabık@cimeyıl.kom

        for (int i = 0; i < emeyıl.length(); i++) {// str nin ilk ve son karakter arası tekrar şartı


            if (emeyıl.charAt(i) == '@') {//emeyılda loopdan gelen karakter @ ise if blok çalışır
                break;//if blok run olura bu satırdan itibaren forr lopp kırılır
            }
            System.out.print(emeyıl.charAt(i));//lopdan gelen emeyıl karakterleri print edildi

        }
        System.out.println();
        System.out.println("agam code cincix  :) DEWAMKEEE");
    }
}
