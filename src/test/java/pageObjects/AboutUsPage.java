package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends BasePage {

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAboutUsBtn() {
        return getElementByXpath("//a [@ui-sref='about-us']");
    }

    public WebElement getAboutUsButton() {
        return getElementByXpath("//button[text()= 'About Us']");
    }

    public WebElement getLeadershipBtn() {
        return getElementByXpath("//button[text()= 'Leadership']");
    }

    public WebElement getInTheNewsBtn() {
        return getElementByXpath("//button[text()= 'In the news']");
    }

    public WebElement getPreaseReleasesBtn() {
        return getElementByXpath("//button[text()= 'Press Releases']");
    }

    public WebElement getConnectBtn() {
        return getElementByXpath("//button[text()= 'Connect']");
    }

    public WebElement getBlogBtn() {
        return getElementsByXpath("//a[text()= 'Blog']").get(0);
    }
}

