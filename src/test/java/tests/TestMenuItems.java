package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.HomePageHelper;
import pageObjects.RestaurantPageElements;
import pageObjects.RestoranPageHelper;

public class TestMenuItems extends TestInit {

    @Test
    public void TestMenuItemNewYork() {
        HomePageHelper homePage = new HomePageHelper(driver);
        homePage.navigate();

        homePage.clickGotItBtn();
        //homePage.clickAttempt();

        homePage.setTextSearch("New York");
        homePage.clickSelectFirstListSearch();

        RestoranPageHelper restaurantHelper = new RestoranPageHelper(driver);
        restaurantHelper.clickContainsTextByElemen("a","Yummy Gyro - Williston Park");

        Assert.assertTrue(restaurantHelper.isMenuRestorant());
    }

}
