package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCareersContainerBenefits extends TestInit {
    @Test
    public void TestCareersContainer() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getCareersBtn().click();
        sleep(2);

        Assert.assertTrue(homePage.getCareersPage().textTabsBenefits().getText().contains("Wellness"));
        Assert.assertTrue(homePage.getCareersPage().textTabsBenefits().getText().contains("Lifestyle"));
        Assert.assertTrue(homePage.getCareersPage().textTabsBenefits().getText().contains("Financial"));
    }
}