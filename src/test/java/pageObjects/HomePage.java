package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return getElementByXpath("//*[@alt='EatStreet Logo']");
    }

    public WebElement getSignInBtn() {
        return getElementByXpath("//*[@id='menu-signin']");
    }

    public WebElement getSearchInput() {
        return getElementByXpath("//*[@id='input-food-search']");
    }

    public void navigate() {
        driver.get(getEnv());
    }

    public WebElement getGotItBtn() {
        return driver.findElement(By.xpath("//button[text()= 'Got it']"));
    }

    public WebElement getAboutUsBtn() {
        return getElementByXpath("//a[text()= 'About Us']");
    }

    public WebElement getContactUsBtn() {
        return getElementByXpath("//a[text()= 'Contact Us']");
    }

    public WebElement getCareersBtn() {
        return getElementByXpath("//a[text()= 'Careers']");
    }

    public WebElement getBlogBtn() {
        return getElementByXpath("//a[text()= 'Blog']");
    }

    public WebElement getBecomeDriverBtn() {
        return getElementByXpath("//a[text()= 'Become a Driver!']");
    }

    public WebElement getForCustomers() {
        return getElementByXpath("//a[text()= 'For Customers']");
    }

    public WebElement getAccessibilityStatementBtn() {
        return getElementByXpath("//a[text()= 'Accessibility Statement']");
    }

    public WebElement getRestaurantDashboard() {
        return getElementByXpath("//a[text()= 'Restaurant Dashboard']");
    }

    public WebElement getApiBtn() {
        return getElementByXpath("//a[text()= 'API']");
    }

    public WebElement getGetEatStreetBtn() {
        return getElementByXpath("//a[text()= 'Get EatStreet']");
    }

    public WebElement getGetHelpBtn() {
        return getElementByXpath("//a[text()= 'Get Help']");
    }

    public WebElement getPrivacyPolicyBtn() {
        return getElementByXpath("//a[text()= 'Privacy Policy']");
    }

    public WebElement getTermsOfUseBtn() {
        return getElementByXpath("//a[text()= 'Terms of Use']");
    }

    public WebElement getRestaurantTerms() {
        return getElementByXpath("//a[text()= 'Restaurant Terms']");
    }

    public boolean getMyAccountBtn() {
        return getElementByXpath("//a[text()= 'My Account']").isDisplayed();
    }
}
