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
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Specials']/..").isDisplayed());
    }

    @Test
    public void searchIllinois() {
        driver.get("https://qa2.eatstreet.com/");
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Illinois, WI\n");
        getElementByXpath("//a[@id='enter-address-btn']").click();
        getElementByXpath("//a[@id='find-restaurants']").click();

        waitTILLELelementContainsText("//h1", "Peoria Restaurants");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Peoria Restaurants"));
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-delivery']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-takeout']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Order Ahead']/..").isDisplayed());
    }

    @Test
    public void searchKansas() {
        driver.get("https://qa2.eatstreet.com/");
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Kansas City Restaurants, WI\n");
        getElementByXpath("//a[@id='enter-address-btn']").click();
        getElementByXpath("//a[@id='find-restaurants']").click();

        waitTILLELelementContainsText("//h1", "Kansas City Restaurants That Deliver & Takeout");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Kansas City Restaurants That Deliver & Takeout"));
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-delivery']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-takeout']").isDisplayed());
    }

    @Test
    public void searchMassachusetts() {
        driver.get("https://qa2.eatstreet.com/");
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Massachusetts, ?????????????????? ?????????? ??????????????, WI\n");
        getElementByXpath("//a[@id='enter-address-btn']").click();
        getElementByXpath("//a[@id='find-restaurants']").click();

        waitTILLELelementContainsText("//h1", "Cambridge Restaurants That Deliver & Takeout");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Cambridge Restaurants That Deliver & Takeout"));
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-delivery']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-takeout']").isDisplayed());
    }
}
