package testsAmazon.BabyTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.BabyPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class Baby extends TestInit {

    @Test
    public void checkBabyStore(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getBtnAllInHeader().click();
        homePage.getBtnBaby().click();
        homePage.getBtnSearch().click();
        BabyPage babyPage = new BabyPage(driver);

        Assert.assertTrue(babyPage.theBabyStore().isDisplayed());
    }
}
