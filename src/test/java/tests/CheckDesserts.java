package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DessertsPage;
import pageObjects.HomePage;

public class CheckDesserts extends TestInit {
    @Test
    public void checkDessertsInWisconsin() {
        HomePage homePage = new HomePage(driver);
        DessertsPage dessertsPage = new DessertsPage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        dessertsPage.getStevensPointBtn().click();
        sleep(2);
        dessertsPage.getDessertsBtn().click();
        sleep(2);

        Assert.assertTrue(dessertsPage.checkDessertsStenenPoint());
    }
}
