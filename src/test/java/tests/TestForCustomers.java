package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestForCustomers extends TestInit{

    @Test
    public void checkForCustomersBtn(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getForCustomers().click();
        sleep(5);
        homePage.trendingArticles();
        homePage.howDoICancelMyOrder();
        homePage.whereIsMyOrder();
        homePage.iNeverReceivedMyEatStreetOrder();
        homePage.myOrderWasMissingAnItemIncorrectOrder();
        homePage.canIUpdateAnOrderAfterPlacingIt();
        homePage.whyWasMyOrderCancelled();
        homePage.whyWasMyOrderBeenDealyed();
        homePage.getContactUsBtn();

        Assert.assertTrue(homePage.trendingArticles().isDisplayed());
        Assert.assertTrue(homePage.howDoICancelMyOrder().isDisplayed());
        Assert.assertTrue(homePage.whereIsMyOrder().isDisplayed());
        Assert.assertTrue(homePage.iNeverReceivedMyEatStreetOrder().isDisplayed());
        Assert.assertTrue(homePage.myOrderWasMissingAnItemIncorrectOrder().isDisplayed());
        Assert.assertTrue(homePage.canIUpdateAnOrderAfterPlacingIt().isDisplayed());
        Assert.assertTrue(homePage.whyWasMyOrderCancelled().isDisplayed());
        Assert.assertTrue(homePage.whyWasMyOrderBeenDealyed().isDisplayed());
        Assert.assertTrue(homePage.getContactUsBtn().isDisplayed());
    }
    
}
