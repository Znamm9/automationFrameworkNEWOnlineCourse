package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckRestoransInFlorida extends TestInit{

    @Test
    public void checkRestoransInFlorida() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();

        Assert.assertTrue(homePage.getDaytonaBtn().isDisplayed());
        Assert.assertTrue(homePage.getFortLauderdaleBtn().isDisplayed());
        Assert.assertTrue(homePage.getGainesvilleBtn().isDisplayed());
        Assert.assertTrue(homePage.getJacksonvilleBtn().isDisplayed());
        Assert.assertTrue(homePage.getMiamiBtn().isDisplayed());
        Assert.assertTrue(homePage.getOrlandoBtn().isDisplayed());
        Assert.assertTrue(homePage.getPortBtn().isDisplayed());
        Assert.assertTrue(homePage.getTallahasseeBtn().isDisplayed());
        Assert.assertTrue(homePage.getTampaBtn().isDisplayed());
    }
}
