package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCheckCareersText extends TestInit {
    @Test
    public void TestCheckCareersText() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getDeliveryBtn().click();
        homePage.getCareersPage().getEatSteetDriver().click();
        sleep(1);

        Assert.assertTrue(homePage.getCareersPage().tabsInfoForDiners().getText().contains("Make great money"));
        Assert.assertTrue(homePage.getCareersPage().tabsInfoForDiners().getText().contains("Flexible Schedule"));
        Assert.assertTrue(homePage.getCareersPage().tabsInfoForDiners().getText().contains("Be part of the team"));
    }
}