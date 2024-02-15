import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumGrid {


    @Test
    public void test01() throws MalformedURLException {

        // Bir frameworkte kullaniliyorsa Driver objesi nerede tanimliysa bu degisiklikler orada yapilir

        ///******************************************************************************************

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browserName", "chrome"); //hangi browser da calisacagi
        capabilities.setCapability("platformName", "Windows 10");
        // Driver objemizi RemoteWebDriver olarak olusturacagiz
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.45:4444"), capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        ///******************************************************************************************

        driver.get("https://www.amazon.com.tr/");


        String actualTitle = driver.getTitle();

        String expectedString = "Elektronik";

        Assert.assertTrue(actualTitle.contains(expectedString));

    }
}
