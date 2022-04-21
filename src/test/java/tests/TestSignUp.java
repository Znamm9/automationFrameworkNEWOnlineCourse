package tests;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SignInPage;

public class TestSignUp extends TestInit{

    @Test
    public void checkSignUp(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.getSignUpBtn().click();

    }
}
