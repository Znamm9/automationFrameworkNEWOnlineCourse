package tests;

import com.github.dockerjava.core.command.WaitContainerCmdImpl;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestNevadaRestaurants extends TestInit {

    @Test
    public void checklvrestaurant() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getAddressField().sendKeys("Las Vegas, Nevada, USA");
        sleep(2);
        homePage.getLVAdress().click();

        waitTILLELelementContainsText("//h1", "Las Vegas Restaurants That Deliver & Takeout");

        Assert.assertTrue(homePage.checklv().isDisplayed());
    }
}
