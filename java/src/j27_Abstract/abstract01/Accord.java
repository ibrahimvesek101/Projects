package j27_Abstract.abstract01;

public class Accord extends Honda {//concrete child Class -> Honda abs class'a extends


    @Override
    public void motor() {//override edilmiş ->abs parentten zorunlu implement edilmiş concrete meth.

        System.out.println("Agam 2.0 turbo çok yakar çabuk kaçar\nHız felakettir");
    }


    void kapı() {//override edilmiş ->abs parentten zorunlu implement edilmiş concrete meth.
        System.out.println("agam vakumlu kapı çarpmasın ");
    }


    @Override
    void sunroof() {//override edilmiş ->abs parentten override zorunlu olmayan  concrete meth.
        System.out.println("Agam cuğara yakınca sunroof açmayı unutma ");
    }

    @Override
    void koltuk() {//override edilmiş ->abs parentten zorunlu implement edilmiş concrete meth.
        System.out.println("Agam deri koltuk ter yapar pişik olmayasan :( ");
    }
}
