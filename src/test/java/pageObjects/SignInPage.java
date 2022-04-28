package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignUpBtn() {
        return getElementByXpath("//a[contains(text(), 'Sign Up')]");
    }

    public WebElement getSignInGoogleBtn() {
        return getElementByXpath("//div[@id='uniqueid']");
    }

    public WebElement getEmailInput() {
        return getElementByXpath("//input[@id='email']");
    }

    public WebElement getPasswordInput() {
        return getElementByXpath("//input[@id='password']");
    }

    public WebElement getResetPasswordBtn() {
        return getElementByXpath("//span[@id='forgot-password']");
    }

    public WebElement getSignInFB() {
        return getElementByXpath("//a[@ng-click='signinCtrl.fbsignin()']");
    }

    public WebElement getSignBtn() {
        return getElementByXpath("//button[@id='signin']");
    }
    public WebElement messageError(){
        return getElementByXpath("//div[@id='email-validation-tag']");
    }

    public WebElement signInBtn() {
        return getElementByXpath("//button[@id='signin']");
    }
}
