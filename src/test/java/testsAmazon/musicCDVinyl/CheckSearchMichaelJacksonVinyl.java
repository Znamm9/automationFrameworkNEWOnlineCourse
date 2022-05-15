package testsAmazon.musicCDVinyl;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.CDsVinylPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class CheckSearchMichaelJacksonVinyl extends TestInit {

    @Test
    public void checkSearchMichaelJacksonVinyl() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getBtnAllInHeader().click();
        homePage.getBtnMusicCDsVinyl().click();
        homePage.inputTextToSearch("michael jackson\n");
        CDsVinylPage cDsVinylPage = new CDsVinylPage(driver);
        cDsVinylPage.getVinylBtn().click();

        Assert.assertTrue(checkUrlTrue("michael+jackson"));
    }
}
