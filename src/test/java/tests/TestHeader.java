package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SignInPage;


public class TestHeader extends TestInit {

    @Test
    public void checkHeader() {

        HomePage homePageElements = new HomePage(driver);
        SignInPage signInElements = new SignInPage(driver);

        openUrl("https://eatstreet.com/");
        homePageElements.getCart().click();
        Assert.assertTrue(homePageElements.getCartPopUp().isDisplayed());
        homePageElements.getCart().click();
        sleep(1);
        Assert.assertEquals(homePageElements.cartPopUp().size(), 0);

        homePageElements.getSignIn().click();
        Assert.assertEquals(homePageElements.getUrl(), "https://eatstreet.com/signin");
        Assert.assertTrue(signInElements.getHeaderTitle().isDisplayed());

        homePageElements.getLogo().click();
        sleep(1);
        Assert.assertEquals(homePageElements.getUrl(), "https://eatstreet.com/");

        homePageElements.getPartnerWithUs().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long positionAfterScrolling = (Long) js.executeScript("return window.pageYOffset;");
        sleep(1);
        Assert.assertFalse(positionAfterScrolling > 0);
    }
}
