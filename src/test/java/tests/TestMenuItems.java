package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RestaurantPageElements;

public class TestMenuItems extends TestInit {

    @Test
    public void TestMenuItemNewYork() {
        HomePage homePage = new HomePage(driver);
        RestaurantPageElements restaurantPageElements = new RestaurantPageElements(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        restaurantPageElements.searchNameInput();
        homePage.sleep(3);
        homePage.getFedBtn().click();
        restaurantPageElements.clickSearchAttempt().click();
        homePage.getFedBtn().click();
        sleep(3);
        restaurantPageElements.searchRestaurants().click();
        sleep(3);
        restaurantPageElements.searchOmelettes();
        Assert.assertTrue(restaurantPageElements.CheckSearchMenu().isDisplayed());
    }
}
