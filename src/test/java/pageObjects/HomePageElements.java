package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends HomePage{
    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchInput() {
        return waitLocatorPage("//*[@id='input-food-search']");
    }

    public WebElement getSearchAttempt() {
        return waitLocatorPage("//a[@id='enter-address-btn']");
    }

    public WebElement getGotItBtn() {
        return waitLocatorPage("//button[text()='Got it']");
    }

    public WebElement getFedBtn() {
        return waitLocatorPage("//a[@id='find-restaurants']");
    }

    public WebElement selectFirstElement(){
        return waitLocatorPage("//ul[@class='ng-scope']/li[@index='0']");
    }
}
