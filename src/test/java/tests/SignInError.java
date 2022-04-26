package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SignInPage;

public class SignInError extends TestInit {

    @Test
    public void checkSignIn() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.signInBtn().click();
        sleep(2);

        Assert.assertTrue(signInPage.messageError().isDisplayed());
    }
}
