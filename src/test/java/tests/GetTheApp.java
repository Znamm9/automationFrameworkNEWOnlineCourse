package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.util.ArrayList;

public class GetTheApp extends TestInit{

    @Test
    public void googlePlay() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getGooglePlayBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        Assert.assertTrue(homePage.googlePlayLinkEatSt().isDisplayed());
    }

    @Test
    public void appStore() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getAppStoryBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        Assert.assertTrue(homePage.appStoryLinkEatSt().isDisplayed());
    }
}
