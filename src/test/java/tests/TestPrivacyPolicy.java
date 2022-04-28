package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.PrivacyPolicyPage;

public class TestPrivacyPolicy extends TestInit{

    @Test
    public void testPrivacyPolicy(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getPrivacyPolicyBtn().click();

        PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(driver);
        privacyPolicyPage.getPrivacyPolicyBtn().click();

        Assert.assertTrue(homePage.getPrivacyPolicyBtn().isDisplayed());

    }
}
