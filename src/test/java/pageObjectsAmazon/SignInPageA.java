package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class SignInPageA extends BasePage {
    public SignInPageA(WebDriver driver) {
        super(driver);
    }

    public void inputEmail(String email) {
        getElementByXpath("//input[@id='ap_email']").sendKeys(email);
    }

    public void inputPassword(String password) {
        getElementByXpath("//input[@id='ap_password']").sendKeys(password);
    }
}
