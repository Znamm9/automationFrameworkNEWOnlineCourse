package testsAmazon.musicCDVinyl;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.CDsVinylPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class CheckBestSellersInCDsVinyl extends TestInit {

    @Test
    public void checkBestSellersInCDsVinyl() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/ref=nav_logo");
        homePage.getBtnAllInHeader().click();
        homePage.getBtnMusicCDsVinyl().click();
        homePage.getBtnSearch().click();
        CDsVinylPage cDsVinylPage = new CDsVinylPage(driver);
        cDsVinylPage.bestSellersBtn().click();

        Assert.assertTrue(checkUrlTrue("best-sellers-music-albums"));
    }
}
