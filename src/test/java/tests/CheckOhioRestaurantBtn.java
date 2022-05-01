package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckOhioRestaurantBtn extends TestInit{

    @Test
    public void checkOhioRestaurantBtn (){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();

        Assert.assertTrue(homePage.getBowlingGreenBtn().isDisplayed());
        Assert.assertTrue(homePage.getCincinnatiBtn().isDisplayed());
        Assert.assertTrue(homePage.getClevelandBtn().isDisplayed());
        Assert.assertTrue(homePage.getColumbusBtn().isDisplayed());
        Assert.assertTrue(homePage.getToledoBtn().isDisplayed());

    }
}
