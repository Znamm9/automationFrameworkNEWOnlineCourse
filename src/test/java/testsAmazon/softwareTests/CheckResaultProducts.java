package testsAmazon.softwareTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.SoftwarePage;
import tests.TestInit;

public class CheckResaultProducts extends TestInit {

    @Test
    public void checkResaultProducts() {
        HomePage homePage = new HomePage(driver);
        SoftwarePage softwarePage = new SoftwarePage(driver);
        openUrl("https://www.amazon.com/ref=nav_logo");
        homePage.getBtnAll().click();
        homePage.getBtnsSeeAll().get(0).click();
        sleep(1);
        homePage.getBtnSoftware().click();
        softwarePage.getBtnAccountingAndFinance().click();
        for (int i=0; i<softwarePage.getAllProducts().size(); i++) {
            softwarePage.getAllProducts().get(i).click();
            Assert.assertTrue(softwarePage.getProductDetails().isDisplayed());
            driver.navigate().back();
        }
    }
}

