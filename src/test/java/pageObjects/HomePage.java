package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public CareersPage getCareersPage() {
        return new CareersPage(driver);
    }

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

    public boolean getAnnArborBtn() {
        return getElementByXpath("//a[text()= 'Ann Arbor, MI']").isDisplayed();
    }

    public boolean getDetroitBtn() {
        return getElementByXpath("//a[text()= 'Detroit, MI']").isDisplayed();
    }

    public boolean getEastLansingBtn() {
        return getElementByXpath("//a[text()= 'East Lansing, MI']").isDisplayed();
    }

    public boolean getGrandRapBtn() {
        return getElementByXpath("//a[text()= 'Grand Rapids, MI']").isDisplayed();
    }

    public boolean getKalamazooBtb() {
        return getElementByXpath("//a[text()= 'Kalamazoo, MI']").isDisplayed();
    }

    public WebElement getAddressField() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public WebElement getFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public WebElement checkAndClosePopUpWindow() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement getAlbanyButton() {
        return getElementByXpath("//a[contains(text(), 'Albany')]");
    }

    public WebElement getCorvallisButton() {
        return getElementByXpath("//a[contains(text(), 'Corvallis')]");
    }

    public WebElement getPortlandButton() {
        return getElementByXpath("//a[contains(text(), 'Portland, OR')]");
    }

    public WebElement getSalemButton() {
        return getElementByXpath("//a[contains(text(), 'Salem, OR')]");
    }

    public WebElement getWilsonvilleButton() {
        return getElementByXpath("//a[contains(text(), 'Wilsonville')]");
    }

    public boolean getAlbanyBnt() {
        return getElementByXpath("//a[text()= 'Albany']").isDisplayed();
    }

    public boolean getCorvallisBtn() {
        return getElementByXpath("//a[text()= 'Corvallis']").isDisplayed();
    }

    public boolean getPortlandBtn() {
        return getElementByXpath("//a[text()= 'Portland, OR']").isDisplayed();
    }

    public boolean getSalemBtb() {
        return getElementByXpath("//a[text()= 'Salem, OR']").isDisplayed();
    }

    public WebElement getGooglePlayBtn() {
        return getElementByXpath("//a[@class='app-btn-android']");
    }

    public WebElement googlePlayLinkEatSt() {
        return getElementByXpath("//a[@href='/store/apps/developer?id=EatStreet']");
    }

    public WebElement getAppStoryBtn() {
        return getElementByXpath("//a[@class='app-btn-iphone']");
    }

    public boolean getWilsonvilleBtn() {
        return getElementByXpath("//a[text()= 'Wilsonville']").isDisplayed();
    }

    public WebElement getAlexandriaBtn() {
        return getElementByXpath("//a[contains(text(), 'Alexandria, VA')]");
    }

    public WebElement getArlingtonBtn() {
        return getElementByXpath("//a[contains(text(), 'Arlington, VA')]");
    }

    public WebElement getCharlottesvilleBtn() {
        return getElementByXpath("//a[contains(text(), 'Charlottesville, VA')]");
    }

    public WebElement getFairfaxBtn() {
        return getElementByXpath("//a[contains(text(), 'Fairfax, VA')]");
    }

    public WebElement getNorfolkBtn() {
        return getElementByXpath("//a[contains(text(), 'Norfolk, VA')]");
    }

    public WebElement appStoryLinkEatSt() {
        return driver.findElement(By.xpath("//a[@href='https://apps.apple.com/us/developer/eatstreet/id664697936']"));
    }

    public WebElement getRichmondBtn() {
        return getElementByXpath("//a[contains(text(), 'Richmond, VA')]");
    }

    public WebElement getLifeChatBtn() {
        return driver.findElement(By.xpath("//span[text()='Live Chat']"));
    }

    public WebElement getCheckGetFedBtn() {
        return getElementByXpath("//a[@class='btn btn-primary float-left']");
    }

    public boolean getApplyNowBtn() {
        return getElementByXpath("//a[@href = '/driver-careers']").isDisplayed();
    }

    public boolean getButtonApplyNowInYourCity() {
        return getElementByXpath("//select[@onchange = 'location = this.value;']").isDisplayed();
    }

    public WebElement getDeliveryBtn() {
        return getElementByXpath("//label[contains(text(), 'Delivery')]");
    }

    public WebElement getOklahomaCityBtn() {
        return getElementByXpath("//a[contains(text(), 'Oklahoma City, OK')]");
    }

    public WebElement getStillwaterBtn() {
        return getElementByXpath("//a[contains(text(), 'Stillwater, OK')]");
    }

    public WebElement getEnterAddress() {
        return getElementByXpath("//a[@id='enter-address-btn']");
    }

    public WebElement getFacebookBtn() {
        return getElementByXpath("//a[@class='es-footer__icon es-footer__icon--facebook']");
    }

    public WebElement getTwitterBtn() {
        return getElementByXpath("//a[@class='es-footer__icon es-footer__icon--twitter']");
    }

    public WebElement getLasVegasBtn() {
        return getElementByXpath("//a[text()= 'Las Vegas, NV']");
    }

    public WebElement getBurgerOptionBtn() {
        return getElementByXpath("//button[contains(text(), 'View all Burger options')]");
    }

    public WebElement checklv() {
        return getElementByXpath("//h1[contains(text(), 'Las Vegas Restaurants That Deliver & Takeout')]");
    }

    public WebElement getCart() {
        return getElementByXpath("//div[@role='button']//img[contains(@alt, 'cart')]");
    }

    public WebElement getCartPopUp() {
        return getElementByXpath("//div[@es-cart]");
    }

    public List<WebElement> cartPopUp() {
        return getElementsByXpath("//div[@es-cart]");
    }

    public WebElement getSignIn() {
        return getElementByXpath("//a[@id='menu-signin']");
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public WebElement getPartnerWithUs() {
        return getElementByXpath("//a[contains(@class, 'partners')]");
    }
}