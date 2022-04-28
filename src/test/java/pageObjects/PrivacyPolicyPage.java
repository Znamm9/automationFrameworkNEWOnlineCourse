package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrivacyPolicyPage extends BasePage {
    public PrivacyPolicyPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPrivacyPolicyBtn() {return getElementByXpath("//a[text()= 'Privacy Policy']");
    }
}
