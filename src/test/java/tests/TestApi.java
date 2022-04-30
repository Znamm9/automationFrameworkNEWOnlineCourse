package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ApiPage;
import pageObjects.HomePage;

public class TestApi extends TestInit{

    @Test
    public void checkApiPage(){
        HomePage homePage = new HomePage(driver);
        ApiPage apiPage = new ApiPage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getApiBtn().click();
        apiPage.goToIframe();
        apiPage.inputName().sendKeys("Artyr");
        apiPage.inputEmail().sendKeys("Artyr@gmail.com");
        apiPage.inputBussinesName().sendKeys("Artyrito_Bandito");
        apiPage.inputDescriptionOfUsage().sendKeys("I want to work with you");
        apiPage.clearAllList().click();
        Assert.assertTrue(apiPage.getTextClearAllList().isDisplayed());
    }
}
