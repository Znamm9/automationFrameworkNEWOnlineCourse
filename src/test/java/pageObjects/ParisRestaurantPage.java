package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParisRestaurantPage extends BasePage {
    public ParisRestaurantPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getInputDelivery() {
        return getElementByXpath("//input[@id='filters-checkbox-delivery']");
    }

    public WebElement getBtnSignIn() {
        return getElementByXpath("//a[@id='menu-signin']");
    }

    public WebElement getLogo() {
        return getElementByXpath("//img[@class='logo-alternate']");
    }
}
