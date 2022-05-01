package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCheckCareersTextAndJob extends TestInit {
    @Test
    public void TestCheckCareersTextAndJob() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getDeliveryBtn().click();
        homePage.getCareersPage().getEatStreetDriver().click();
        sleep(1);

        Assert.assertTrue(homePage.getCareersPage().tabsInfoForDiners().getText().contains("Make great money"));
        Assert.assertTrue(homePage.getCareersPage().tabsInfoForDiners().getText().contains("Flexible Schedule"));
        Assert.assertTrue(homePage.getCareersPage().tabsInfoForDiners().getText().contains("Be part of the team"));

        homePage.getCareersBtn().click();
        sleep(2);
        homePage.getCareersPage().clickCreativeBtn();
        sleep(2);

        Assert.assertEquals(homePage.getCareersPage().getListMadisonWi().size(), 2);
    }
}