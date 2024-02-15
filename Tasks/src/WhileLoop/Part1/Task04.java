package WhileLoop.Part1;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten
		kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */

		int i=999;
		int counter=0;

		while (i>=100) {
			if (i%4==0 && i%6==0) {
				System.out.print(i +" ");
				counter++;
			}
			i--;
		}
		System.out.println();
		System.out.println("4 ve 6 ya bölünen 3 basamaklı " +counter +
				"tane sayı vardır");



		
			
	}

}
