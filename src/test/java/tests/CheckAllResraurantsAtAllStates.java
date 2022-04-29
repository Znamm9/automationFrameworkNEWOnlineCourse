package tests;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CheckRestaurantsPage;
import pageObjects.HomePage;

public class CheckAllResraurantsAtAllStates extends TestInit{
    @Test
    public void checkRestaurantsOhioTestBtb() {
        HomePage homePage = new HomePage(driver);
        CheckRestaurantsPage checkRestaurantsPage = new CheckRestaurantsPage(driver);
        homePage.navigate();

        Assert.assertTrue(checkRestaurantsPage.isBowlingGreenBtn());
        Assert.assertTrue(checkRestaurantsPage.isCincinnati());
        Assert.assertTrue(checkRestaurantsPage.isClevelant());
        Assert.assertTrue(checkRestaurantsPage.isColumbus());
        Assert.assertTrue(checkRestaurantsPage.isToledo());




    }

}
