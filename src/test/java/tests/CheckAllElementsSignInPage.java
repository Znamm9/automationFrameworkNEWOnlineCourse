package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SignInPage;

public class CheckAllElementsSignInPage extends TestInit {
    @Test
    public void checkAllElementsSignInPage() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();

        SignInPage signInPage = new SignInPage(driver);
        Assert.assertTrue(signInPage.getSignUpBtn().isDisplayed());
        Assert.assertTrue(signInPage.getSignInFB().isDisplayed());
        Assert.assertTrue(signInPage.getSignInGoogleBtn().isDisplayed());
        Assert.assertTrue(signInPage.getEmailInput().isDisplayed());
        Assert.assertTrue(signInPage.getPasswordInput().isDisplayed());
        Assert.assertTrue(signInPage.getResetPasswordBtn().isDisplayed());
        Assert.assertTrue(signInPage.getSignBtn().isDisplayed());
    }
}
