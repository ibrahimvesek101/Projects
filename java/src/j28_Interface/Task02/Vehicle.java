package j28_Interface.Task02;

public class Vehicle {//conc. parent class

    private String model;
    private double engine;

    public Vehicle(String model, double engine) {
        setModel(model);
        setEngine(engine);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", engine=" + engine ;
    }
}
