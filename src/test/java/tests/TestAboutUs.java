package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AboutUsPage;
import pageObjects.HomePage;


public class TestAboutUs extends TestInit{
    @Test
    public void testAboutUs() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getAboutUsBtn().click();

        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.getAboutUsBtn().click();

        Assert.assertTrue(homePage.getAboutUsBtn().isDisplayed());

    }
}
