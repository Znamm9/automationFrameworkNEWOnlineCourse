package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckSocialMediaBtns extends TestInit {

    public void base(HomePage homePage) {
        homePage.navigate();
        homePage.getGotItBtn().click();
    }

    @Test
    public void checkFacebookBtn() {
        HomePage homePage = new HomePage(driver);
        base(homePage);
        homePage.getFacebookBtn().click();
        homePage.switchTabs(homePage.getTabs().get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("www.facebook.com/eatstreetHQ/"));
    }

    @Test
    public void checkTwitterBtn() {
        HomePage homePage = new HomePage(driver);
        base(homePage);
        homePage.getTwitterBtn().click();
        homePage.switchTabs(homePage.getTabs().get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("twitter.com/EatStreet"));
    }
}
