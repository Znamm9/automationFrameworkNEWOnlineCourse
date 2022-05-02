package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCheckOklahomaRestaurants extends TestInit{

    @Test
    public  void testCheckOklahomaRestaurants() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();

        Assert.assertTrue(homePage.getOklahomaCityBtn().isDisplayed());
        Assert.assertTrue(homePage.getStillwaterBtn().isDisplayed());
    }
}
