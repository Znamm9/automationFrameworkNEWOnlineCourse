package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckOregonRestaurantsBtn extends TestInit {

    @Test
    public void checkOregonRestaurantsBtn() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();

        Assert.assertTrue(homePage.getAlbanyBtn().isDisplayed());
        Assert.assertTrue(homePage.getCorvallisBtn().isDisplayed());
        Assert.assertTrue(homePage.getPortlandBtn().isDisplayed());
        Assert.assertTrue(homePage.getSalemBtn().isDisplayed());
        Assert.assertTrue(homePage.getWilsonvilleBtn().isDisplayed());
    }
}
