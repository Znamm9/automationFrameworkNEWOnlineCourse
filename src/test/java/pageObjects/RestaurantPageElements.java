package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestaurantPageElements extends BasePage {
    public RestaurantPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement searchHeaderInput() {
        return waitLocatorPage("//div[@class='autocomplete ']/input");
    }

    public WebElement getMenuRestoranBlock() {
        return waitLocatorPage("//div[@class='menu-list ng-scope']");
    }

    public WebElement searchContainsTextByElemen(String element, String name) {
        String locator = "//" + element + "[contains(text(),'" + name + "')]";
        return waitLocatorPage(locator);
    }

}
