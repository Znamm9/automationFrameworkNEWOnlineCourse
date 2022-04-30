package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCheckRestaurantOregon extends TestInit{
    @Test
    public void checkRestaurantMichiganTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn();

        Assert.assertTrue(homePage.getAlbanyBnt());
        Assert.assertTrue(homePage.getCorvallisBtn());
        Assert.assertTrue(homePage.getPortlandBtn());
        Assert.assertTrue(homePage.getSalemBtb());
        Assert.assertTrue(homePage.getWilsonvilleBtn());
    }
}

