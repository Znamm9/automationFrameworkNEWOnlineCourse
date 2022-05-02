package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchPage;

public class CheckRestaurantInLV extends TestInit {

    @Test
    public void checkRestaurantInLV() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getLasVegasBtn().click();
        sleep(2);
        homePage.getBurgerOptionBtn().click();

        SearchPage searchPage = new SearchPage(driver);
        sleep(2);
        Assert.assertTrue(searchPage.getLVRestaurantText().isDisplayed());
    }
}
