package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePageHelper;
import pageObjects.RestaurantPageHelper;

public class TestMenuItems extends TestInit {

    @Test
    public void TestMenuItemNewYork() {
        HomePageHelper homePage = new HomePageHelper(driver);
        homePage.navigate();

        homePage.clickGotItBtn();
        //homePage.clickAttempt();

        homePage.setTextSearch("New York");
        homePage.clickSelectFirstListSearch();

        RestaurantPageHelper restaurantHelper = new RestaurantPageHelper(driver);
        restaurantHelper.clickContainsTextByElemen("a","Yummy Gyro - Williston Park");

        Assert.assertTrue(restaurantHelper.isMenuRestaurant());
    }

    @Test
    public void TestReviews(){
        HomePageHelper homePage = new HomePageHelper(driver);
        homePage.navigate();

        homePage.clickGotItBtn();
        //homePage.clickAttempt();

        homePage.setTextSearch("New York");
        homePage.clickSelectFirstListSearch();

        RestaurantPageHelper restaurantHelper = new RestaurantPageHelper(driver);
        restaurantHelper.clickContainsTextByElemen("a","Yummy Gyro - Williston Park");

        Assert.assertTrue(restaurantHelper.isReviewsRestaurant());
    }

    @Test
    public void TestHeaderRestautant(){
        HomePageHelper homePage = new HomePageHelper(driver);
        homePage.navigate();

        homePage.clickGotItBtn();
        //homePage.clickAttempt();

        homePage.setTextSearch("New York");
        homePage.clickSelectFirstListSearch();

        RestaurantPageHelper restaurantHelper = new RestaurantPageHelper(driver);
        restaurantHelper.clickContainsTextByElemen("a","Yummy Gyro - Williston Park");

        Assert.assertTrue(restaurantHelper.isTitleRestorant());
    }

    @Test
    public void TestSearchHeaderRestautant(){
        HomePageHelper homePage = new HomePageHelper(driver);
        homePage.navigate();

        homePage.clickGotItBtn();
        //homePage.clickAttempt();

        homePage.setTextSearch("New York");
        homePage.clickSelectFirstListSearch();

        RestaurantPageHelper restaurantHelper = new RestaurantPageHelper(driver);
        restaurantHelper.clickContainsTextByElemen("a","Yummy Gyro - Williston Park");

        restaurantHelper.setTextSearchHeader("Chicken");
        restaurantHelper.clickFirstElemetSearch();

        Assert.assertTrue(restaurantHelper.isListBlockRestaurants());
    }




}
