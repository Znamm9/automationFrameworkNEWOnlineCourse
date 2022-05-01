package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckMarylandRestaurantBtn extends TestInit{

    @Test
    public void checkMarylandRestaurantBtn (){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn();

        Assert.assertTrue(homePage.getBaltimoreBtn().isDisplayed());
        Assert.assertTrue(homePage.getCollegeParkBtn().isDisplayed());
        Assert.assertTrue(homePage.getHyattsvilleBtn().isDisplayed());
        Assert.assertTrue(homePage.getRockvilleBtn().isDisplayed());

    }
}
