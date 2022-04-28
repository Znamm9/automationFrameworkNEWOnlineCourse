package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BarnlysRestoranHelper;

public class TestBarnlysRestoran extends TestInit{

    @Test
    public void isReviewsBlockDisplay(){
        BarnlysRestoranHelper restorantPage = new BarnlysRestoranHelper(driver);
        restorantPage.navigateParams("/orlando-fl/restaurants/barnlys");
        sleep(2);
        Assert.assertTrue(restorantPage.isReviews().isDisplayed());
    }

    @Test
    public void isDeliveryPriceDisplay(){
        BarnlysRestoranHelper restorantPage = new BarnlysRestoranHelper(driver);
        restorantPage.navigateParams("/orlando-fl/restaurants/barnlys");
        sleep(2);
        Assert.assertTrue(restorantPage.isDeliveryPrice().isDisplayed());
    }

    @Test
    public void getDeliveryPriceDisplay(){
        BarnlysRestoranHelper restorantPage = new BarnlysRestoranHelper(driver);
        restorantPage.navigateParams("/orlando-fl/restaurants/barnlys");
        sleep(2);
        Assert.assertTrue(restorantPage.getDeliveryPrice() > 0);
    }


}
