package j27_Abstract.abstract02;

public class IdariPersonal extends Personal{//abs parent Personal class'a extends child concrete class


    @Override
    public void maasHesapla() {//implement edilen concrete meth
        System.out.println("Agam cincix personele keyfi olursa günde 2 saat coding yapar :) ");
    }

    @Override
    public void sigorta() {
        System.out.println("Agam cincix personele full sigorta  ");
    }

    @Override
    public void maasBilgisi() {//implement edilen concrete meth
        System.out.println("Agam cincix personele saatine $100 gayme verilir :) ");
    }
}
