package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCheckRestaurantCalifornia extends TestInit {
    @Test
    public void checkRestaurantCaliforniaTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn();

        Assert.assertTrue(homePage.getBerkeleyBtn().isDisplayed());
        Assert.assertTrue(homePage.getIrvineBtn().isDisplayed());
        Assert.assertTrue(homePage.getLosAngelesBtn().isDisplayed());
        Assert.assertTrue(homePage.getOaklandBtn().isDisplayed());
        Assert.assertTrue(homePage.getPaloAltoBtn().isDisplayed());
        Assert.assertTrue(homePage.getRiversideBtn().isDisplayed());
        Assert.assertTrue(homePage.getSacramentoBtn().isDisplayed());
        Assert.assertTrue(homePage.getSanDiegoBtn().isDisplayed());
        Assert.assertTrue(homePage.getSanFranciscoBtn().isDisplayed());
        Assert.assertTrue(homePage.getSanJoseBtn().isDisplayed());
        Assert.assertTrue(homePage.getSantaMariaBtn().isDisplayed());
    }
}