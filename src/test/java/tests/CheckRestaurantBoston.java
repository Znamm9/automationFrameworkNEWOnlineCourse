package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckRestaurantBoston extends TestInit {

    @Test
    public void checkTextRestaurantBoston() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        sleep(2);
        homePage.getAddressField().sendKeys("Boston");
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow().click();
        homePage.getFedBtn().click();
        waitTILLELelementContainsText("//h1", "Boston Restaurants That Deliver & Takeout");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Boston Restaurants That Deliver & Takeout"));
    }
}


