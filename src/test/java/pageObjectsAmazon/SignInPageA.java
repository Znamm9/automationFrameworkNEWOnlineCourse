package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class SignInPageA extends BasePage {
    public SignInPageA(WebDriver driver) {
        super(driver);
    }

    public WebElement inputEmail() {
        return getElementByXpath("//input[@id='ap_email']");
    }

    public WebElement inputPassward() {
        return getElementByXpath("//input[@id='ap_password']");
    }
}
