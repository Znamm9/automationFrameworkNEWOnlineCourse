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

        Assert.assertTrue(homePage.getAlbanyButton().isDisplayed());
        Assert.assertTrue(homePage.getCorvallisButton().isDisplayed());
        Assert.assertTrue(homePage.getPortlandButton().isDisplayed());
        Assert.assertTrue(homePage.getSalemButton().isDisplayed());
        Assert.assertTrue(homePage.getWilsonvilleButton().isDisplayed());
    }
}
