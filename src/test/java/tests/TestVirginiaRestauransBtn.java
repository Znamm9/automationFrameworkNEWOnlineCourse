package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.HomePage;

public class TestVirginiaRestauransBtn extends TestInit {

    @Test
    public void testVirginiaRestauransBtn(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();

        Assert.assertTrue(homePage.getAlexandriaBtn().isDisplayed());
        Assert.assertTrue(homePage.getArlingtonBtn().isDisplayed());
        Assert.assertTrue(homePage.getCharlottesvilleBtn().isDisplayed());
        Assert.assertTrue(homePage.getFairfaxBtn().isDisplayed());
        Assert.assertTrue(homePage.getNorfolkBtn().isDisplayed());
        Assert.assertTrue(homePage.getRichmondBtn().isDisplayed());
    }
}
