package j25_Inheritance.inheritance01;

public class Runner {
    /*
	 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
	 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
	 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
	 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
	 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
	 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
	 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
	   denir.
	 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
	 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

	*/
    public static void main(String[] args) {
        Hayvancık h = new Hayvancık();
        h.hareket();
        h.beslen();
        h.icme();
        System.out.println("   ***   ");
        Mammal m1=new Mammal();
        m1.beslen();
        m1.dogum();
        m1.hareket();
        m1.sutBeslen();
        m1.icme();
        System.out.println("   ***   ");

        Paluk p=new Paluk();
        p.ızgaraTava();
        p.hareket();
        p.beslen();
        p.icme();

        System.out.println("   ***   ");
        Kedi k1=new Kedi();
        k1.beslen();
        k1.dogum();
        k1.cırmala();
        k1.hareket();
        k1.icme();
        k1.sutBeslen();
        System.out.println("   ***   ");
        Goyun g1=new Goyun();
        g1.beslen();
        g1.dogum();
        g1.semir();
        g1.sutBeslen();
        g1.icme();
        g1.hareket();


    }
}
