package j27_Abstract.abstract03;

public class Dikdortgen extends Sekil {//abs parent Sekil class'a extends child Class

double en;
double boy;

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    @Override
    public double alan() {
        return en*boy;
    }

    @Override
    public double cevre() {
        return 2*(boy+en);
    }
}
