package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RestaurantsPage;

public class TestRestaurantsNewYork extends TestInit{


    @Test
    public void testNewYorkRestaurants(){
        HomePage homePage = new HomePage(driver);
        RestaurantsPage restaurantsPage = new RestaurantsPage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        sleep(2);
        homePage.clickNewYorkRestaurants();
        sleep(2);
        restaurantsPage.clickHealthyFood();
        sleep(2);
        restaurantsPage.clickBBQ();

        Assert.assertTrue(restaurantsPage.getBBQText().isDisplayed());
        Assert.assertTrue(restaurantsPage.getTextOneMatchingRestaurant().isDisplayed());
    }
}
