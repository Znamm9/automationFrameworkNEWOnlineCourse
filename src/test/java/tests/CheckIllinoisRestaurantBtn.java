package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckIllinoisRestaurantBtn extends TestInit {

    @Test
    public void checkIllinoisRestaurantBtn() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn();

        Assert.assertTrue(homePage.getChampaignBtn().isDisplayed());
        Assert.assertTrue(homePage.getChicagoBtn().isDisplayed());
        Assert.assertTrue(homePage.getDeKalbBtn().isDisplayed());
    }
}
