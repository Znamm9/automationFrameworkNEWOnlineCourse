package testsAmazon.HomeAndKitchen;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class checkKidsHomeStore extends TestInit {
    
    @Test
    public void checkAddInCart(){
        HomePage homepage = new HomePage(driver);
        homepage.navigate();
        homepage.getAllBtn().click();
        homepage.getSeeAllBtn().click();
        sleep(2);
        homepage.getHomeAndKitcenBtn().click();
        sleep(2);
        homepage.getKidsHomeStore().click();
        sleep(2);
        homepage.selectTovar().click();
        homepage.seeAllBuyingOptions().click();
        sleep(3);
        homepage.getAddToCart().click();
        sleep(3);
        homepage.closeAddToCartWindow().click();
        homepage.openCart().click();
        sleep(2);

        Assert.assertTrue(homepage.tovarInCart().isDisplayed());
    }
}
