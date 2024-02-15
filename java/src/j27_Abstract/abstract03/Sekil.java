package j27_Abstract.abstract03;

public abstract class Sekil {//abs parent class
    String  name;
    public abstract double alan();//abs meth
    public abstract double cevre();//abs meth

    public  void ciz(){//concrete emethod
        System.out.println(this.name+" cizildi");
    }
public String getName(){//anlıyorum ama anlamsız buluyorum nasıll bizniss locigg

        return this.name;
}
    @Override
    public String toString() {
        return
                "name='" + name +
                "\n Alan = "+this.alan()+
                "\n Cevre = "+this.cevre();
    }
}
