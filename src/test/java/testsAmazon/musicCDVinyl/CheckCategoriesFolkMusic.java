package testsAmazon.musicCDVinyl;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.CDsVinylPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class CheckCategoriesFolkMusic extends TestInit {

    @Test
    public void checkCategoriesFolkMusic() {
        HomePage homePage = new HomePage(driver);
        openUrl("https:/amazon.com/");
        homePage.getBtnAllInHeader().click();
        homePage.getBtnMusicCDsVinyl().click();
        homePage.getBtnSearch().click();
        CDsVinylPage cDsVinylPage = new CDsVinylPage(driver);
        cDsVinylPage.getFolkBtn().click();

        Assert.assertTrue(cDsVinylPage.checkCategoriesOfFolkMusic().size()>1);
    }
}
