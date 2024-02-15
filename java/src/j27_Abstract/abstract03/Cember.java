package j27_Abstract.abstract03;

public class Cember extends Sekil{//abs parent Sekil class'a extends child Class

    double yarıçap;
   final double pi=3.14;
    @Override
    public double alan() {
   return pi*yarıçap*yarıçap;
    // return pi*Math.pow(2,yarıçap);
    }

    @Override
    public double cevre() {
      return 2*pi*yarıçap;
    }





}
