package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SignInPage;
import pageObjects.SignUpPage;

public class TestSignUp extends TestInit{

    @Test
    public void checkSignUp(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.getSignUpBtn().click();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputLoggin().sendKeys(System.currentTimeMillis() + "@fgf.com");
        signUpPage.inputPass().sendKeys("1Qwertyqazwsxedc");
        signUpPage.inputPassAgain().sendKeys("1Qwertyqazwsxedc");
        signUpPage.signUpBtn().click();
        sleep(5);

        Assert.assertTrue(homePage.getMyAccountBtn());
    }
}
