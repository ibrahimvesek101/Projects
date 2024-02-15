package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Before method calisti...");
    }

    @After
    public void teardown(){
        System.out.println("After method calisti...");

        // driver kapatma
        // fail olan testlerde screenshot alma..........................................
    }


}
