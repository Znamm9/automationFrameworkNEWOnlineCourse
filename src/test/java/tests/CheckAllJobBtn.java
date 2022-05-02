package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CareersPage;
import pageObjects.HomePage;

public class CheckAllJobBtn extends TestInit{

    @Test
    public void checkAllJobBtn() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getCareersBtn().click();

        CareersPage careersPage = new CareersPage(driver);
        sleep(2);
        Assert.assertTrue(careersPage.getTechBtn().isDisplayed());
        Assert.assertTrue(careersPage.getCreativeBtn().isDisplayed());
        Assert.assertTrue(careersPage.getCulinaryBtn().isDisplayed());
        Assert.assertTrue(careersPage.getBusinessBtn().isDisplayed());
        Assert.assertTrue(careersPage.getDeliveryBtn().isDisplayed());
    }
}
