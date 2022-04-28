package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestRestaurantsPage extends TestInit {

    @Test
    public void searchWashington() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Morgantown, WI\n");
        getElementByXpath("//a[@id='enter-address-btn']").click();
        getElementByXpath("//a[@id='find-restaurants']").click();

        waitTILLELelementContainsText("//h1", "Morgantown");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Morgantown"));
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-delivery']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-takeout']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Order Ahead']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Specials']/..").isDisplayed());
    }

    @Test
    public void searchMadison() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Madison, WI\n");
        getElementByXpath("//a[@id='enter-address-btn']").click();
        getElementByXpath("//a[@id='find-restaurants']").click();

        waitTILLELelementContainsText("//h1", "Madison");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Madison"));
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-delivery']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-takeout']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Free Delivery']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Order Ahead']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Specials']/..").isDisplayed());
    }
}
