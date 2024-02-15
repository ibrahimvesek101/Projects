package j28_Interface;

public class Sahin extends Tofas implements DısDonanım,IcDonanım,Ilastik{//concrete child class
    @Override
    public void motor() {
        System.out.println("Agam 1.6 çok yakar az kaçar MOTOR ");
    }

    @Override
    public void yakıt() {
        System.out.println("Agam TÜPitak yoksa ocagına imcie ağacı :(");
    }

    @Override
    public void kapı() {
        System.out.println("Agam 4 KAPI sedan ");
    }

    @Override
    public void kaporta() {
        System.out.println("Agam akordion KAPORTA gamzesiz olmaz :)");
    }

    @Override
    public void koltuk() {
        System.out.println("Agam deriKOLTUK yazın pişik yapar aman içi saman olmasın");
    }

    @Override
    public void klima() {
        System.out.println("Agam aç camı serinle KLİMA senin neyine :) ");
    }

    @Override
    public void ebat() {
        System.out.println("Agam 15' LASTIK ");
    }

    @Override
    public void jant() {
        System.out.println("Agam senin gibi JANTİ teker çooğğğ şeker :) ");
    }
}





















