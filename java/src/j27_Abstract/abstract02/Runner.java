package j27_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();
        mrb1.name="BiloCan";
        System.out.println("mrb1.name = " + mrb1.name);//mrb1.name = BiloCan
        mrb1.maasBilgisi();//Agam maraba işciye  en çok yevmiye 499 gayme veririlir :)
        mrb1.maasHesapla();//Agam maraba işci çay-cuğara hariç günde 8 saat kürek mahkumu :)


        IdariPersonal cncx1=new IdariPersonal();
        cncx1.name="ŞesuCan";
        System.out.println("cncx1.name = " + cncx1.name);//cncx1.name = ŞesuCan
        cncx1.maasBilgisi();//Agam cincix personele saatine $100 gayme verilir :)
        cncx1.maasHesapla();//Agam cincix personele keyfi olursa günde 2 saat coding yapar :)
        cncx1.sigorta();//Agam cincix personele full sigorta
    }
}
