package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;
import testsAmazon.BabyTests.Baby;

public class BabyPage extends BasePage {

    public BabyPage(WebDriver driver) {
        super(driver);
    }

    public WebElement theBabyStore(){ return getElementByXpath("//div[@class='fst-h1-st pageBanner']");}
}
