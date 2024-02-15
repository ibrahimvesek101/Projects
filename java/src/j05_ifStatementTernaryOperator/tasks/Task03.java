package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("bi yil girin");
			int yil = scan.nextInt();
			if (yil<=0){
				System.out.println("negatif veya sifir yil olarak girilmez");
			}else if(yil%1000==0) {
				System.out.println("Milenyum");
				
			}else if(yil%100 ==0) {
				System.out.println("Yuzyil");
			}else if(yil%10 == 0) {
		System.out.println("Onyil");
	}
			scan.close();
}
}

	

