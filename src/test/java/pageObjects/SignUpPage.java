package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebElement inputLoggin() {
        return getElementByXpath("//input[@id='email']");
    }

    public WebElement inputPass() {
        return getElementByXpath("//input[@id='password']");
    }

    public WebElement inputPassAgain() {
        return getElementByXpath("//input[@id='passwordAgain']");
    }

    public WebElement signUpBtn() {
        return getElementByXpath("//button[@id='signup']");
    }
}
