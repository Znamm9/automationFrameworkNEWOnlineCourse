package testsAmazon.BooksTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class VerityHooverPage extends BasePage {
    public VerityHooverPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnAddToCart() {
        return getElementByXpath("//input[@id='add-to-cart-button']");
    }

    public WebElement getBtnGoToCart() {
        return getElementByXpath("//div[@id='nav-cart-count-container']");
    }
}
