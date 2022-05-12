package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class ToysAndGamesPage extends BasePage {
    public ToysAndGamesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultString() {
        return getElementByXpath("//span[text()= 'RESULTS']");
    }

    public WebElement getHurryPoterBtn() {
        return getElementByXpath("//span[text()= 'Harry Potter']");
    }
}
