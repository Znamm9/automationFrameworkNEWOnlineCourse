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
}

