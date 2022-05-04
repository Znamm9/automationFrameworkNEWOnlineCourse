package testsAmazon.BeautyPersonalCare;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.BeautyPersonalCarePage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class SortingShampooByPrice extends TestInit {

    @Test
    public void sortingShampooByPrice() {
        HomePage homePage = new HomePage(driver);
        BeautyPersonalCarePage beautyPersonalCarePage = new BeautyPersonalCarePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getSearchField().sendKeys("shampoo\n");
        beautyPersonalCarePage.clickBtnSort().click();
        beautyPersonalCarePage.clickBtnPriceLowToHigh().click();

        Assert.assertTrue(checkUrlTrue("price-asc-rank&qid"));
    }
}
