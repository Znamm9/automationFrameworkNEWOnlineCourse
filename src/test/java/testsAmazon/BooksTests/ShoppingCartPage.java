package testsAmazon.BooksTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getInfoForCustumer() {
        return getElementByXpath("//span[@id='sc-subtotal-label-activecart']");
    }
}
