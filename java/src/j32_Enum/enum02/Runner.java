package j32_Enum.enum02;

public class Runner {
    public static void main(String[] args) {
        User kl1 = new User();
        kl1.name = "vedat bey";
        //  kl1.role=0;
        //  kl1.status=2;
        kl1.yetki = Role.ADMIN;
        kl1.durum=Status.ACTIVE;

        User kl2 = new User();
        kl2.name = "Abdi bey";
        //  kl1.role=0;
        //  kl1.status=2;
        kl2.yetki = Role.CUSTOMER;
        kl2.durum=Status.INACTIVE;

        if (kl2.yetki == Role.ADMIN) {
            System.out.println(kl2.name+" agam muhur sende suleyman sensin sil de silelim ADMIN sin adamsın");
        }else System.out.println(kl2.name+" tee ellam ya sefil customer silmeye gelmiş.");

        if (kl1.yetki == Role.ADMIN) {
            System.out.println(kl1.name+" agam muhur sende suleyman sensin sil de silelim ADMIN sin adamsın");
        }else System.out.println(kl1.name+" tee ellam ya sefil customer silmeye gelmiş.");
    }
}
