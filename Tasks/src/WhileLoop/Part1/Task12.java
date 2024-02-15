package WhileLoop.Part1;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını
		 print eden code create ediniz.
		do-While loop
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String s = scan.nextLine().toLowerCase();

		int harfSayaci=0;
		int rakamSayaci=0;
		int digerSayaci=0;
		int i=0;
		do {
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				harfSayaci++;
			} else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				rakamSayaci++;
			} else {
				digerSayaci++;
			}

			i++;
		} while (i<s.length());

		System.out.println(harfSayaci+ " tane harf vardır");
		System.out.println(rakamSayaci+ " tane rakam vardır");
		System.out.println(digerSayaci+ " tane özel karakter vardır");


	}

}
