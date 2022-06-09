package testsAmazon.musicCDVinyl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.CDsVinylPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class CheckListOfFeaturedCategories extends TestInit {

    @Test
    public void checkListOfFeaturedCategories() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com");
        homePage.getBtnAllInHeader().click();
        homePage.inputTextToSearch("Queen vinyl\n");
        CDsVinylPage cDsVinylPage = new CDsVinylPage(driver);
        cDsVinylPage.getSortBtn().click();
        cDsVinylPage.getSortByPriceLowToHighBtn().click();

        Assert.assertEquals(cDsVinylPage.queenVinylResults().size(),0);
    }
}
