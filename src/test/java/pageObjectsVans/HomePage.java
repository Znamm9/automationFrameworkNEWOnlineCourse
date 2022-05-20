package pageObjectsVans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static final String POP_UP_CLOSE = "//button[@class='popup-close']";
    public static final String ALLOW_ALL_COOKIE_BTN = "//div[@id='onetrust-button-group']//button[contains(@id, 'accept')]";
    public static final String MAN_DROPDOWN_BTN = "//a[contains(@id, 'topnav')][contains(text(), 'Men')]";
    public static final String MAN_CLASSICS_BTN = "//a[contains(@href, '/men-shoes-classics')]";

    public WebElement getPopUpClose() {
        return getElementByXpath(POP_UP_CLOSE);
    }

    public WebElement getAllowAllCookieBtn() {
        return getElementByXpath(ALLOW_ALL_COOKIE_BTN);
    }

    public WebElement getManClassicsBtn() {
        return getElementByXpath(MAN_CLASSICS_BTN);
    }

    public void moveCursor(String locator) {
        Actions action = new Actions(driver);
        action.moveToElement(getElementByXpath(locator)).perform();
    }
}
