package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main(String[] args) throws InterruptedException {

        //Driver objesi olusturuldu
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.get("https://stackoverflow.com/");

    //NAVIGATION COMMANDS


        //back() bir onceki sayfayi acar
        driver.navigate().back(); // chrome
        //Thread.sleep(3000);

        //forward() geri gelindikten sonra bir sonraki sayfayi acar
        driver.navigate().forward(); // stackoverflow

        //refresh() sayfayi yeniler
        driver.navigate().refresh(); // stackoverflow

        //to() - get() method u ile tamamen ayni islevi yapar
        driver.navigate().to("https://www.linkedin.com/");

        driver.quit();




    }
}
