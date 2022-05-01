package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestCareersTabsForJob extends TestInit {
    @Test
    public void TestCareersTabsForJob() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getCareersBtn().click();
        sleep(2);

        Assert.assertTrue(homePage.getCareersPage().textTabsForJob().getText().contains("JamesTestCareer"));
        Assert.assertTrue(homePage.getCareersPage().textTabsForJob().getText().contains("Product Analyst - Diner"));
        Assert.assertTrue(homePage.getCareersPage().textTabsForJob().getText().contains("Senior Software Engineer - Back End"));
        Assert.assertTrue(homePage.getCareersPage().textTabsForJob().getText().contains("Software Engineer - Patronpath"));
        Assert.assertTrue(homePage.getCareersPage().textTabsForJob().getText().contains("Business"));
        Assert.assertTrue(homePage.getCareersPage().textTabsForJob().getText().contains("Creative"));
    }
}