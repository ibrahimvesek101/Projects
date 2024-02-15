package j27_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {
        Civic c1 = new Civic();

        c1.motor();//Agam 1.6 eco motor neyine yetmiii
        c1.kapı();//Agam kapı elinde kalmasın yavaş kapa
        c1.koltuk();//Agam koltukda ucuza kaçıp kumaş çakmıssın
        c1.sunroof();//Agam keyfini bilirsen sunroofu açarsan böğrüne maaşallah yazdırırsın
        c1.lastikEbat();//Agam 21' ilastik
        c1.isim="typeR";
        System.out.println("c1.isim = " + c1.isim);//typeR

        Accord c2=new Accord();


        c2.isim="console car";
        c2.koltuk();//Agam deri koltuk ter yapar pişik olmayasan :(
        c2.kapı();//agam vakumlu kapı çarpmasın
        c2.motor();//Agam 2.0 turbo çok yakar çabuk kaçar



    }
}
