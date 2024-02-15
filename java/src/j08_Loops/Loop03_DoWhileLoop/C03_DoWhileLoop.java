package j08_Loops.Loop03_DoWhileLoop;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        int i= 1;

        while(i<1){
            System.out.println("While Loop");
            i++;     //Bunu calistirdigimizda hicbirsey vermez. Dolayisiyla while loop bazi durumlarda hic calismayabilir
                    //Yani while loop "zer excecution" mumkundur
        }

        int k= 1;

        do{
            System.out.println("do-while loop");
            k++;

        }while(k<1);   // do while loop kullaninca loop body'si icindeki kod en az 1 kere calisir. Yani do-while loop icin zero excecution mumkun degildir.

        //Bazen once dusunup sonra hareket etmek gerekir. Mesela ATM makinelerinde once sifre alip sonra makine dusunmeli. Bu durumda do while gerekir

        //Example-1: Bir ondalik sayinin ondalik kismindaki rakamlarin toplamini bulunuz
        //     24.5673==> 5+6+7+3=21

        double num = 24.5673;
        String str = String.valueOf(num); //value of metodunu String Class'indan alarak degeri String yapariz.
                                            // valueOf metodu parantez ici degeri String yapar
        //Regex icin nokta kullandiginizda onune \\ koyunuz. Yani nokta "\\." seklinde kullanilir

        String decimalPart = str.split("\\.")[1]; //burada ondalikli kisimdan bolmek icin noktadan split yaptik. Ondalik kisim icin index 1 al [1]
        System.out.println(decimalPart);//5673

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt); // Integer. yazip yine valueOf secince tekrar int'e donusur

        int sum = 0;

        do{
            sum= sum+decimalInt%10;      //5673'un sayilarini tek tek toplamak icin %10 ve akabinde /10 loop dondurup devam ederiz

            decimalInt = decimalInt/10;

        }while (decimalInt>0);
        System.out.println(sum); //21

    }
}
