package testsAmazon.musicCDVinyl;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.CDsVinylPage;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.WebPlayerPage;
import tests.TestInit;

public class CheckWebPlayerForAvailability extends TestInit {

    @Test
    public void checkWebPlayerForAvailability() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/ref=nav_logo");
        homePage.getBtnAllInHeader().click();
        homePage.getBtnMusicCDsVinyl().click();
        homePage.getBtnSearch().click();
        CDsVinylPage cDsVinylPage = new CDsVinylPage(driver);
        cDsVinylPage.getOpenWebPlayer().click();
        WebPlayerPage webPlayerPage = new WebPlayerPage(driver);

        Assert.assertTrue(webPlayerPage.checkUrlMusic());
    }
}
