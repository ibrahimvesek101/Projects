package j10_MethodCreation;

public class C03_MethodDepo {//main olmayan depo class->komşu köy

    public static void gecmeNotu(int not) {//p'li void method->komşu köy amelese

        if (not >= 85) {
            System.out.println("takdir belgesi kazandınız");
        } else if (not >= 70) {
            System.out.println("teşekkür belgesi kazandınız");
        } else if (not >= 50) {
            System.out.println("tebrikler belgesiz geçtiniz");
        } else System.out.println("mortingen shtrouse :( ");


    }


}
