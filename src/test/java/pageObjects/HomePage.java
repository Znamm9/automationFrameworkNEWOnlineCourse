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

    public WebElement getBerkeleyBtn() {
        return getElementByXpath("//a[text()= 'Berkeley, CA']");
    }
    public WebElement getIrvineBtn() {
        return getElementByXpath("//a[text()= 'Irvine, CA']");
    }
    public WebElement getLosAngelesBtn() {
        return getElementByXpath("//a[text()= 'Los Angeles, CA']");
    }
    public WebElement getOaklandBtn() {
        return getElementByXpath("//a[text()= 'Oakland, CA']");
    }
    public WebElement getPaloAltoBtn() {
        return getElementByXpath("//a[text()= 'Palo Alto, CA']");
    }
    public WebElement getRiversideBtn() {
        return getElementByXpath("//a[text()= 'Riverside, CA']");
    }
    public WebElement getSacramentoBtn() {
        return getElementByXpath("//a[text()= 'Sacramento, CA']");
    }
    public WebElement getSanDiegoBtn() {
        return getElementByXpath("//a[text()= 'San Diego, CA']");
    }
    public WebElement getSanFranciscoBtn() {
        return getElementByXpath("//a[text()= 'San Francisco, CA']");
    }
    public WebElement getSanJoseBtn() {
        return getElementByXpath("//a[text()= 'San Jose, CA']");
    }
    public WebElement getSantaMariaBtn() {
        return getElementByXpath("//a[text()= 'Santa Maria, CA']");
    }

    public WebElement getDaytonaBtn() {
        return getElementByXpath("//a[contains(text(), 'Daytona Beach, FL')]");
    }

    public WebElement getFortLauderdaleBtn() {
        return getElementByXpath("//a[contains(text(), 'Fort Lauderdale, FL')]");
    }

    public WebElement getGainesvilleBtn() {
        return getElementByXpath("//a[contains(text(), 'Gainesville, FL')]");
    }

    public WebElement getJacksonvilleBtn() {
        return getElementByXpath("//a[contains(text(), 'Jacksonville, FL')]");
    }

    public WebElement getMiamiBtn() {
        return getElementByXpath("//a[contains(text(), 'Miami, FL')]");
    }

    public WebElement getOrlandoBtn() {
        return getElementByXpath("//a[contains(text(), 'Orlando, FL')]");
    }

    public WebElement getPortBtn() {
        return getElementByXpath("//a[contains(text(), 'Port St. Lucie, FL')]");
    }

    public WebElement getTallahasseeBtn() {
        return getElementByXpath("//a[contains(text(), 'Tallahassee, FL')]");
    }

    public WebElement getTampaBtn() {
        return getElementByXpath("//a[contains(text(), 'Tampa, FL')]");
    }
}
