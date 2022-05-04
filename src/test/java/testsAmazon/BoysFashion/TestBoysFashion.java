package testsAmazon.BoysFashion;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.PageBoysFashion;
import tests.TestInit;

public class TestBoysFashion extends TestInit {
    @Test
    public void checkBoysFashion(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getSearchField().sendKeys("Boys Fashion");
        homePage.getBtnSearch().click();
        PageBoysFashion pageBoysFashion = new PageBoysFashion(driver);
        pageBoysFashion.getJecket().click();
        pageBoysFashion.checkSizeBtn().click();
        pageBoysFashion.getMediumSize().click();
        pageBoysFashion.clickSelectNevy().click();

        Assert.assertTrue(getElementByXpath("//span[@id='productTitle']").isDisplayed());

    }
    @Test
    public void checkBeltDoubleStitch(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getSearchField().sendKeys("Boys Fashion");
        homePage.getBtnSearch().click();
        PageBoysFashion pageBoysFashion = new PageBoysFashion(driver);
        sleep(3);
        pageBoysFashion.getBeltDouble().click();
        pageBoysFashion.checkSizeBtn().click();
        pageBoysFashion.getMediumSize().click();
        pageBoysFashion.checkSelectBlack().click();

        Assert.assertTrue(getElementByXpath("//span[@id='productTitle']").isDisplayed());
    }

    @Test
    public void checkJampMan(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getSearchField().sendKeys("Boys Fashion");
        homePage.getBtnSearch().click();
        PageBoysFashion pageBoysFashion = new PageBoysFashion(driver);
        pageBoysFashion.getJamperMan().click();
        pageBoysFashion.getSelectCarbon().click();

        Assert.assertTrue(getElementByXpath("//span[@id='productTitle']").isDisplayed());

    }
}
