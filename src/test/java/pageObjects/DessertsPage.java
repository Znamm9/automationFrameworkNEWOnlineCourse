package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DessertsPage extends BasePage {
    public DessertsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getStevensPointBtn() {
        return getElementByXpath("//a[text()= 'Stevens Point, WI']");
    }

    public WebElement getDessertsBtn() {
        return getElementsByXpath("//button[@class='cuisine-types__item__button ng-binding']").get(0);
    }

    public boolean checkDessertsStenenPoint() {
        return getElementByXpath("//h1[@class='restaurants-list_header ng-binding ng-scope']").isDisplayed();
    }

    public WebElement getSearchBtn() {
        return getElementByXpath("//input[@id='search-autocomplete']");
    }

    public WebElement getDessertsOption() {
        return getElementByXpath("//li[contains(text(), 'dessert')]");
    }
}
