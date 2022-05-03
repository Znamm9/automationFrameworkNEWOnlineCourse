package testsAmazon.electronicsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.AccessoriesAndSuppliesPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class ElectronicsTest extends TestInit {

    @Test
    public void testAllBtnBurgerMenu(){

        HomePage homePage = new HomePage(driver);
        AccessoriesAndSuppliesPage accessoriesAndSuppliesPage = new AccessoriesAndSuppliesPage(driver);

        openUrl("https://www.amazon.com/");
        homePage.getBtnAllBurgerMenu().click();
        homePage.getBtnElectronics().click();
        sleep(3);
        homePage.getBtnAccessoriesandSupplies().click();
        sleep(3);

        Assert.assertTrue(accessoriesAndSuppliesPage.isResultsText().isDisplayed());






    }
}
