package j27_Abstract.abstract04;

public abstract  class Food {//G-parent abs class

    String name;
    public abstract void madeIn();//abs. meth.
    public abstract void taste();//abs. meth.


    @Override
    public String toString() {
        return
                "name='" + name ;
    }
}
