package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ParisRestaurantPage;

public class TestCheckTextRestaurantParis extends TestInit{

    @Test
    public void checkTextOnPageRestaurantParis(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getAddressField().sendKeys("Paris Las Vegas");
        homePage.getFedBtn().click();
        sleep(2);
        homePage.checkAndClosePopUpWindow().click();
        homePage.getFedBtn().click();

        ParisRestaurantPage parisRestaurantPage = new ParisRestaurantPage(driver);

        waitTILLELelementContainsText("//h1", "Las Vegas Restaurants That Deliver & Takeout");
        Assert.assertTrue(parisRestaurantPage.getElementByXpath("//h1").getText().contains("Las Vegas Restaurants That Deliver & Takeout"));
        Assert.assertTrue(parisRestaurantPage.getInputDelivery().isDisplayed());
        Assert.assertTrue(parisRestaurantPage.getBtnSignIn().isDisplayed());
        Assert.assertTrue(parisRestaurantPage.getLogo().isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("Restaurants"));
    }
}
