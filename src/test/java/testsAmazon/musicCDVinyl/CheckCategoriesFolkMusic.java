package testsAmazon.musicCDVinyl;

import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class CheckCategoriesFolkMusic extends TestInit {

    @Test
    public void checkCategoriesFolkMusic() {
        HomePage homePage = new HomePage(driver);
        openUrl("https:/amazon.com/");
    }
}
