package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ApplyNowPage;
import pageObjects.HomePage;

public class CheckApplyNow extends TestInit {
    @Test
    public void checkApplyNow() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        ApplyNowPage checkApplyNow = new ApplyNowPage(driver);
        checkApplyNow.getApplyNowBtn().click();
        sleep(2);

        Assert.assertTrue(homePage.getButtonApplyNowInYourCity());
    }
}
