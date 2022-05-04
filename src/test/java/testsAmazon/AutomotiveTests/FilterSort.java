package testsAmazon.AutomotiveTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.Automotive;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class FilterSort extends TestInit {

    @Test
    public void sortNewestArrivals() {
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

    @Test
    public void featuredBrands() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com");
        homePage.getBtnAllInHeader().click();
        homePage.getBtnAutomative().click();
        homePage.getBtnSearch().click();
        Automotive auto = new Automotive(driver);
        auto.getTiresWheels().click();
        auto.getSortTriLynx().click();
        for (int i = 0; i < auto.elementsProducts().size(); i++) {
            Assert.assertTrue(auto.elementsProducts().get(i).getText().contains("Lynx"));
        }
    }

    @Test
    public void sort(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com");
        homePage.getBtnAllInHeader().click();
        homePage.getBtnAutomative().click();
        homePage.getBtnSearch().click();
        Automotive auto = new Automotive(driver);
        auto.getOilsFluids().click();
        auto.sort3M().click();
        for(int i = 0; i < auto.elementsProducts().size(); i++){
            Assert.assertTrue(auto.elementsProducts().get(i).getText().contains("3M"));
        }
    }
}
