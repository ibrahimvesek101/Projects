package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C08_TernaryOperator {
    public static void main(String[] args) {
        /*
		 Task-> Girilen  ürün miktarını ve ürünün birim fiyatını için Eğer urun miktarı 100 den fazla ise
         %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
		 */

        Scanner input = new Scanner(System.in);
        System.out.print("agıdeşşş bi urun miktarı gir bakam  :");
        double urunMiktarı = input.nextDouble();

        System.out.print("agıdeşşş bi birim fiyat gir bakam  :");
        double birimFiyat = input.nextDouble();

        System.out.println(urunMiktarı > 100 ? (urunMiktarı * birimFiyat * 0.67) : (urunMiktarı * birimFiyat));

    }
}
