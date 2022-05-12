package testsAmazon.musicCDVinyl;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.CDsVinylPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class CheckListOfNewReleases extends TestInit {

    @Test
    public void checkListOfNewReleases() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getBtnAllInHeader().click();
        homePage.getBtnMusicCDsVinyl().click();
        homePage.getBtnSearch().click();
        CDsVinylPage cDsVinylPage = new CDsVinylPage(driver);
        cDsVinylPage.getNewReleasesBtn().click();

        Assert.assertTrue(checkUrlTrue("mushead_newreleases"));
    }
}
