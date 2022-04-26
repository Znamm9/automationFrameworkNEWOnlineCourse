package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignUpBtn() {
        return getElementByXpath("//a[contains(text(), 'Sign Up')]");
    }

    public void closeModal() {
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]"));
    }
    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }
    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }
    public WebElement getLoginBtn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }
}
