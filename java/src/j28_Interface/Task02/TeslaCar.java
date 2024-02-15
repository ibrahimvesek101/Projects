package j28_Interface.Task02;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "2 yılda bir batarya değiştir...";
    }

    @Override
    public String drive() {
        return "hızlı ve Auto pilot sür...";
    }
}
