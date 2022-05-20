package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class BasketAmazonPage extends BasePage {
    public BasketAmazonPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getImg() {
        return getElementByXpath("//div[@class='a-column a-span4']");
    }

    public WebElement getBtnSell() {
        return getElementByXpath("//a[text()='Sell']");
    }

    public WebElement getBtnShopMothersDayGifts() {
        return getElementByXpath("//a[@class='nav_a nav-swm-text nav-progressive-attribute nav-progressive-content']");
    }
}
