package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckBtnDelivery extends TestInit{
    @Test
    public void checkBtnDelivery(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        //Assert.assertTrue(homePage.getDeliveryBtn().isDisplayed());
    }
}
