package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SignInPage;

public class TestCheckTextRestaurantLosAngeles extends TestInit {

    @Test
    public void TestCheckTextRestaurantLosAngeles() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getSignInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.closeModal();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPassword().sendKeys("qwer4152sj");
        signInPage.getLoginBtn().click();
        sleep(3);
        homePage.getAddressField().sendKeys("Los Angeles");
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow().click();
        homePage.getFedBtn().click();
        waitTILLELelementContainsText("//h1", "Los Angeles Restaurants That Deliver & Takeout");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Los Angeles Restaurants That Deliver & Takeout"));
    }

}

