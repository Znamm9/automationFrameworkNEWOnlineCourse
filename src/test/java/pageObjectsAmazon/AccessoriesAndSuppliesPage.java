package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class AccessoriesAndSuppliesPage extends BasePage {
    public AccessoriesAndSuppliesPage(WebDriver driver) {
        super(driver);
    }


    public WebElement isResultsText() {
        return getElementByXpath("//span[contains(text(), 'RESULTS')]");
    }

    public WebElement getBtnAppleAirPods2() {
        return getElementByXpath("//span[contains(text(), 'Apple AirPods (2nd Generation')]");
    }

    public WebElement getBtnAddToList() {
        return getElementByXpath("//span[@id='wishListMainButton']");
    }

    public WebElement inDisplaySingIn() {
        return getElementByXpath("//label[contains(text(), 'Email or mobile phone number')]");
    }
}
