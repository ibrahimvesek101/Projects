package j26_Exceptions;

public class C05_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundException-> array'lerde olmayan index elemanı ile işlem yapıldıgında oluşan  RTE

        int sayi[] = {33, 58, 31, 44, 2, 63, 21};
        System.out.println(sayi[5]);// 63

        // System.out.println("sayi[12] = " + sayi[12]);// RTE -> ArrayIndexOutOfBoundsException
        try {
            System.out.println("sayi[12] = " + sayi[1]);
            System.out.println("Agam bu satırı okuduysan code exception fırlatmadı ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " Agam olmayan eleman istirsen TEE ELLLAMMM YA  :( ");
            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");

    }
}
