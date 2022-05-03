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
}
