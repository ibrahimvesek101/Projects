package j28_Interface.Task02;

import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar("tesla p90", 2000);
        ToyotaPrius toyota = new ToyotaPrius("pirus", 1600);
        Bus otobus = new Bus("302", 6000);

        tesla.ebikGabık();//default conc. meth obj ile call
        IElectric.autoPilot();//static conc. meth. interfaceName ile call

        ArrayList<IVehicle> arabalar = new ArrayList<>();

        arabalar.add(tesla);
        arabalar.add(toyota);
        arabalar.add(otobus);

        for (IVehicle arac : arabalar) {
            System.out.println(arac.getClass().getSimpleName());
        }


    }
}
