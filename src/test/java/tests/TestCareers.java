package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCareers extends TestInit {
    @Test
    public void checkCareers() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getCareersBtn().click();
        sleep(3);
        homePage.getCareersPage().clickCreativeBtn();
        sleep(1);

        Assert.assertEquals(homePage.getCareersPage().getListApplyHereBtn().size(), 2);
    }
}