package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LifeChatPage;

public class TestLifeChat extends TestInit{

    @Test
    public void testLifeChat() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();

        LifeChatPage lifeChatPage = new LifeChatPage(driver);
        lifeChatPage.LifeChatPage().click();

        Assert.assertTrue(homePage.getLifeChatBtn().isDisplayed());
    }
}