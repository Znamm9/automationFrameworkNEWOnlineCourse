package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class BooksInSpanishPage extends BasePage {
    public BooksInSpanishPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHeaderText() {
        return getElementByXpath("//b[text()='Libros en Español']");
    }

    public WebElement getBasketBtn() {
        return getElementByXpath("//div[@id='nav-cart-count-container']");
    }
}
