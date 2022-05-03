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

    public WebElement getBtnAllBurgerMenu(){
        return getElementByXpath("//a[@id='nav-hamburger-menu']");
    }

    public WebElement getBtnElectronics() {
        return getElementByXpath("//div[contains(text(), 'Electronics')]");
    }

    public WebElement getBtnAccessoriesandSupplies() {
        return getElementByXpath("//a[contains(text(), 'Accessories & Supplies')]");
    }
}
