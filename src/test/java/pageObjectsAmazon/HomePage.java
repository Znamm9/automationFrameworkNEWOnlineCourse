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

    public WebElement getBtnHelloSignIn() {
        return getElementByXpath("//div[@id='hmenu-customer-name']");
    }

    public WebElement isHelloYuriyBtn() {
        return getElementByXpath("//span[@id='nav-link-accountList-nav-line-1']");
    }

    public WebElement getSearchField() {
        return getElementByXpath("//input[@id='twotabsearchtextbox']");
    }

    public WebElement getBtnBaby() {
        return getElementByXpath("//option[contains(text(),'Baby')]");
    }
}
