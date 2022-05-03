package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnAllInHeader() {
        return getElementByXpath("//div[@id='nav-search-dropdown-card']");
    }

    public WebElement getBtnMusicCDsVinyl() {
        return getElementByXpath("//option[contains(text(), 'Music, CDs & Vinyl')]");
    }

    public WebElement getBtnSearch() {
        return getElementByXpath("//input[@id='nav-search-submit-button']");
    }

    public void navigate(){
        driver.get("https://www.amazon.com/");
    }

    public WebElement getBtnComputersInList() {
        return getElementByXpath("//option[@value='search-alias=computers-intl-ship']");
    }


}
