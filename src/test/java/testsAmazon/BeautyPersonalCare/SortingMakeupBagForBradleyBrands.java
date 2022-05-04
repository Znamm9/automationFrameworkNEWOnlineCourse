package testsAmazon.BeautyPersonalCare;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.BeautyPersonalCarePage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class SortingMakeupBagForBradleyBrands extends TestInit {

    @Test
    public void sortingMakeupBagForBradleyBrandsTest() {
        HomePage homePage = new HomePage(driver);
        BeautyPersonalCarePage beautyPersonalCarePage = new BeautyPersonalCarePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getSearchField().sendKeys("makeup bag\n");
        beautyPersonalCarePage.getRadioBtbBradley().click();

        Assert.assertTrue(beautyPersonalCarePage.checkUrlBradley());
    }
}

