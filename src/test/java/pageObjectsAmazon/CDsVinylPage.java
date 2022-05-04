package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class CDsVinylPage extends BasePage {
    public CDsVinylPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getOpenWebPlayer() {
        return getElementByXpath("//img[@alt='Play']");
    }

    public WebElement bestSellersBtn() {
        return getElementByXpath("//a[contains(text(), 'Best Sellers')]");
    }
}
