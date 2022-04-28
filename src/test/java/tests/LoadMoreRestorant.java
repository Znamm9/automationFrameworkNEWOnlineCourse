package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class LoadMoreRestorant extends TestInit{

        @Test
        public void CheckLoadMoreRestorant(){
            HomePage homePage = new HomePage(driver);
            homePage.navigate();
            //sleep(3);
           //homePage.getAddressField().sendKeys("Seattle");
           //homePage.getFedBtn().click();
            //sleep(3);
           // homePage.checkAndClosePopUpWindow().click();
            //sleep(3);
            //homePage.getLoadMoreBtn().click();
            Assert.assertTrue(homePage.getFedBtn().isDisplayed());

        }
}
