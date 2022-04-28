package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckElementsTrendingArticles extends TestInit{
    @Test
    public void checkHowDoICancelMyOrder(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.byVisibleElement();
        homePage.getForCustomers().click();
        sleep(3);

        Assert.assertTrue(homePage.checkElementsTrendingArticles().isDisplayed());
    }

}
