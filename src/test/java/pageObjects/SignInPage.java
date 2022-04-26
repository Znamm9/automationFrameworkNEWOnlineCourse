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
    public WebElement signInBtn(){
        return getElementByXpath("//button[@id='signin']");
    }
    public WebElement messageError(){
        return getElementByXpath("//div[@id='email-validation-tag']");
    }
}
