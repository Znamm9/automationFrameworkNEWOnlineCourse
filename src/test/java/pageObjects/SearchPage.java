package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLVRestaurantText() {
        return getElementByXpath("//h1[contains(text(), 'Las Vegas Restaurants')]");
    }
}
