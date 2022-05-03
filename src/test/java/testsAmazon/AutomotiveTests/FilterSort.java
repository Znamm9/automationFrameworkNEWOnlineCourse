package testsAmazon.AutomotiveTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.Automotive;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class FilterSort extends TestInit {

    @Test
    public void sortNewestArrivals(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com");
        homePage.getBtnAllInHeader().click();
        homePage.getBtnAutomative().click();
        homePage.getBtnSearch().click();
        Automotive auto = new Automotive(driver);
        auto.getExteriorAccessories().click();
        auto.getBtnSort().click();
        auto.getSortNewestArrivals().click();

        Assert.assertTrue(auto.getExteriorAccessories().isDisplayed());
    }
}
