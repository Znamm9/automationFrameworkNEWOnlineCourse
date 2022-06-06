package testsAmazon.BooksTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.FathersDayPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class CheckBtnInHeader extends TestInit {

    @Test
    public void checkBtnOnHomePage(){
        HomePage homePage = new HomePage(driver);
        FathersDayPage fathersDayPage = new FathersDayPage(driver);
        homePage.navigate();
        homePage.getBtnShopFathersDayGift().click();

        Assert.assertEquals("Amazon.com: Father's Day", driver.getTitle());
        Assert.assertTrue(fathersDayPage.getImgFathersDay().isDisplayed());
    }

}
