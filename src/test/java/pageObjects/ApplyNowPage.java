package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplyNowPage extends BasePage {

    public ApplyNowPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getApplyNowBtn() {
        return getElementByXpath("//a[@href = '/driver-careers']");
    }

    public WebElement getButtonApplyNowInYourCity() {
        return getElementByXpath("//select[@onchange = 'location = this.value;']");
    }
}
