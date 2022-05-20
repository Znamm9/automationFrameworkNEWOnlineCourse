package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class BooksPage extends BasePage {
    public BooksPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHeaderText() {
        return getElementByXpath("//h3[text()='Popular in Books']");
    }

    public WebElement getLinkBooksInSpanish() {
        return getElementByXpath("//a[text()='Books in Spanish']");
    }
}
