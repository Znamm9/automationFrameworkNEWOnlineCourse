package testsAmazon.electronicsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.AccessoriesAndSuppliesPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class AddToListAirPods2 extends TestInit {

    @Test
    public void addToListAirPods2(){

        HomePage homePage = new HomePage(driver);
        AccessoriesAndSuppliesPage accessoriesAndSuppliesPage = new AccessoriesAndSuppliesPage(driver);


        homePage.navigate();
        homePage.getBtnAllBurgerMenu().click();
        homePage.getBtnElectronics().click();
        sleep(2);
        homePage.getBtnAccessoriesandSupplies().click();
        sleep(2);
        accessoriesAndSuppliesPage.getBtnAppleAirPods2().click();
        accessoriesAndSuppliesPage.getBtnAddToList().click();
        sleep(2);

        Assert.assertTrue(accessoriesAndSuppliesPage.inDisplaySingIn().isDisplayed());
    }
}
