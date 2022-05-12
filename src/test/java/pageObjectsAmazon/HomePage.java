package pageObjectsAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.util.List;

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

    public void navigate() {
        driver.get("https://www.amazon.com/");
    }

    public WebElement getBtnComputersInList() {
        return getElementByXpath("//option[@value='search-alias=computers-intl-ship']");
    }

    public WebElement getBtnAllBurgerMenu() {
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

    public WebElement getBtnSoftware() {
        return getElementByXpath("//div[text()='Software']");
    }

    public List<WebElement> getBtnsSeeAll() {
        return getElementsByXpath("//i[@class='nav-sprite hmenu-arrow-more']");
    }

    public WebElement getBtnAll() {
        return getElementByXpath("//i[@class='hm-icon nav-sprite']");
    }

    public WebElement getSignInBtn() {
        return getElementByXpath("//span[@id='nav-link-accountList-nav-line-1']");
    }

    public WebElement getBohdanHelloBtn() {
        return getElementByXpath("//span[text()= 'Hello, Bohdan']");
    }

    public WebElement getSeeAllBtn() {
        return getElementsByXpath("//div[text()= 'see all']").get(0);
    }

    public WebElement getToysAndGamesBtn() {
        return getElementByXpath("//div[text()= 'Toys and Games']");
    }

    public WebElement getBuildingToysBtn() {
        return getElementByXpath("//a[text()= 'Building Toys']");
    }

    public void inputTextToSearch(String search) {
        getElementByXpath("//input[@id='twotabsearchtextbox']").sendKeys(search);
    }

    public List<WebElement> isListOfNewReleases() {
        return getElementsByXpath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
    }
}
