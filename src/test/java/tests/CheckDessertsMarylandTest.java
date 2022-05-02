package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DessertsPage;
import pageObjects.HomePage;

import java.util.ArrayList;

public class CheckDessertsMarylandTest extends TestInit {

    @Test
    public void checkDessertsBaltimoreTest() {
        HomePage homePage = new HomePage(driver);
        DessertsPage dessertsPage = new DessertsPage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getAddressField().sendKeys("Baltimore, Мэриленд, США");
        homePage.getFedBtn().click();
        homePage.getEnterAddress().click();
        homePage.getFedBtn().click();
        sleep(3);
        dessertsPage.getSearchBtn().sendKeys("desserts");
        sleep(3);
        dessertsPage.getDessertsOption().click();

        Assert.assertTrue(dessertsPage.checkDessertsStenenPoint());
    }
}
