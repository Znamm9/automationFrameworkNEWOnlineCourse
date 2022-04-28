package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestaurantsPage extends BasePage{
    public RestaurantsPage(WebDriver driver) {
        super(driver);
    }


    public void clickHealthyFood() {
        clickElementByXpath("//button[contains(text(), 'View all Healthy Food options')]");
    }

    public void clickBBQ(){
        clickElementByXpath("//label[contains(text(), 'BBQ')]");
    }

    public WebElement getBBQText() {
        return getElementByXpath("//span[@class='active_filter ng-binding ng-scope']");
    }

    public WebElement getTextOneMatchingRestaurant() {
        return getElementByXpath("//p[@class='ng-binding ng-scope']");
    }
}
