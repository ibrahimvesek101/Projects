package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.amazon.AmazonCartPage;
import pages.amazon.AmazonHomePage;
import pages.amazon.AmazonProductPage;
import pages.amazon.AmazonSearchPage;
import utils.Driver;

import java.time.Duration;

public class C04_TestCase {

    // https://www.amazon.com/ a gidilir
    // Arama kutusuna {keyword} yazildiktan sonra arama yapilir
    // Gelen ilk urun sepete eklenir
    // Sepete gidilir
    // Sepette alinan urunun sayisi {quantity} e cikarilir
    // Sepet tutari urunfiyati * 3 olarak bulunmalidir.


    // keywords = 'microphone', 'gaming keyboard', 'gaming mouse'
    // quantity = 2            , 3               ,  4


    // Ana sayfa
    // Arama Sayfasi
    // Urun sayfasi
    // Sepet sayfasi

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://www.amazon.com/");

        AmazonHomePage hp = new AmazonHomePage();
        hp.searchFor("microphone");

        AmazonSearchPage sp = new AmazonSearchPage();
        sp.navigateToProduct(1);

        AmazonProductPage pp = new AmazonProductPage();
        pp.addProductToCart();

        Thread.sleep(3000);
        pp.navigateToCart();

        AmazonCartPage cp = new AmazonCartPage();

        cp.selectQuantity(3);

        double expectedPrice = cp.getProductPrice() * 3;
        double actualPrice = cp.getSubTotalAmount();

        System.out.println(cp.getSubTotalAmount());
        Assert.assertEquals(actualPrice,expectedPrice);

        Driver.closeDriver();

    }
}
