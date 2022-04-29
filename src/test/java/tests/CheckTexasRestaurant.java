package tests;

import org.openqa.selenium.devtools.v98.page.model.NavigationEntry;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckTexasRestaurant extends TestInit {

    @Test
    public void TestTexasRestaurant() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getSearchInput().sendKeys("Texas City, TX, USA");
        sleep(2);
        homePage.getFedBtn().click();
        sleep(3);

        Assert.assertTrue(homePage.restaurantTexasPizza().isDisplayed());
    }
}

