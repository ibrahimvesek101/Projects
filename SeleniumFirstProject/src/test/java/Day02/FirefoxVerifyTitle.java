package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxVerifyTitle {

//             Invoke FireFox Driver
//             Go to https://www.youtube.com/
//             Verify the page title contains the word video.
//             Close the driver.

//  Expected result => title contains video
//  actual result => title does not contain video

    public static void main(String[] args) {

        //Driver objesi olusturuldu
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        if (actualTitle.contains("video")){
            System.out.println("TEST PASSED....");
        }else{
            System.out.println("TEST FAILED....");
        }

        driver.quit();



    }


}
