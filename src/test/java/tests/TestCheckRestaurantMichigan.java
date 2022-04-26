package tests;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCheckRestaurantMichigan extends TestInit {
    @Test
    public void checkRestaurantMichiganTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn();

        Assert.assertTrue(homePage.getAnnArborBtn());
        Assert.assertTrue(homePage.getDetroitBtn());
        Assert.assertTrue(homePage.getEastLansingBtn());
        Assert.assertTrue(homePage.getGrandRapBtn());
        Assert.assertTrue(homePage.getKalamazooBtb());
    }
}

