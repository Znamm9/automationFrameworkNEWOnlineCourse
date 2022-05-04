package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class BeautyPersonalCarePage extends BasePage {
    public BeautyPersonalCarePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRadioBtbBradley() {
        return getElementByXpath("//span[contains(text(), 'Vera Bradley')]");
    }

    public boolean checkUrlBradley() {
        return driver.getCurrentUrl().contains("Vera-Bradley");
    }

    public WebElement clickBtnSort() {
        return getElementByXpath("//span[@id='a-autoid-0-announce']");
    }

    public WebElement clickBtnPriceLowToHigh() {
        return getElementByXpath("//a[@id='s-result-sort-select_1']");
    }
}


