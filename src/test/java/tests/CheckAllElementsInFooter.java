package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckAllElementsInFooter extends TestInit {

    @Test
    public void checkAllBtnInFooter() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();

        Assert.assertTrue(homePage.getAboutUsBtn().isDisplayed());
        Assert.assertTrue(homePage.getContactUsBtn().isDisplayed());
        Assert.assertTrue(homePage.getCareersBtn().isDisplayed());
        Assert.assertTrue(homePage.getBlogBtn().isDisplayed());
        Assert.assertTrue(homePage.getBecomeDriverBtn().isDisplayed());
        Assert.assertTrue(homePage.getForCustomers().isDisplayed());
        Assert.assertTrue(homePage.getAccessibilityStatementBtn().isDisplayed());
        Assert.assertTrue(homePage.getRestaurantDashboard().isDisplayed());
        Assert.assertTrue(homePage.getApiBtn().isDisplayed());
        Assert.assertTrue(homePage.getGetEatStreetBtn().isDisplayed());
        Assert.assertTrue(homePage.getGetHelpBtn().isDisplayed());
        Assert.assertTrue(homePage.getPrivacyPolicyBtn().isDisplayed());
        Assert.assertTrue(homePage.getTermsOfUseBtn().isDisplayed());
        Assert.assertTrue(homePage.getRestaurantTerms().isDisplayed());
    }
}
