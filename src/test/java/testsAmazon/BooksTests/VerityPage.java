package testsAmazon.BooksTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class VerityPage extends BasePage {
    public VerityPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLinkVerityBook() {
        return getElementByXpath("//span[text()='Verity']");
    }
}
