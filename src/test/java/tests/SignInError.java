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
        signInPage.getSignBtn().click();
        sleep(4);

        Assert.assertTrue(signInPage.messageErrorEmail().isDisplayed());
    }

    @Test
    public void checkIncorrectEmailPassword(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.getEmailInput().sendKeys("qwer123@ukr.net");
        signInPage.getPasswordInput().sendKeys("qwe321");
        signInPage.getSignBtn().click();
        sleep(3);

        Assert.assertTrue(signInPage.messageIncorrect().isDisplayed());
    }

    @Test
    public void checkCorrectEmailNotPassword(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.getEmailInput().sendKeys("vv1808@ukr.net");
        signInPage.getSignBtn().click();
        sleep(3);

        Assert.assertTrue(signInPage.messageErrorPassword().isDisplayed());
    }

    @Test
    public void checkCorrectPasswordNotEmail(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.getPasswordInput().sendKeys("qwert54321");
        signInPage.getSignBtn().click();
        sleep(3);

        Assert.assertTrue(signInPage.messageErrorEmail().isDisplayed());
    }
}
