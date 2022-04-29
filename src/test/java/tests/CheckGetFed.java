package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.GetFedPage;
import pageObjects.HomePage;


public class CheckGetFed extends TestInit {

    @Test
    public void checkGetFed() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        GetFedPage getFedPage = new GetFedPage(driver);
        getFedPage.GetFedPage().click();

        Assert.assertTrue(homePage. getCheckGetFedBtn().isDisplayed());
    }
}
