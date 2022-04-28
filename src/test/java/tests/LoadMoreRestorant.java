package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class LoadMoreRestorant extends TestInit{

        @Test
        public void CheckLoadMoreRestorant(){
            HomePage homePage = new HomePage(driver);
            homePage.navigate();
            
          Assert.assertTrue(homePage.getFedBtn().isDisplayed());

        }
}
