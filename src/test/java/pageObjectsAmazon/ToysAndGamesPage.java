package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.util.List;

public class ToysAndGamesPage extends BasePage {
    public ToysAndGamesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultString() {
        return getElementByXpath("//span[text()= 'RESULTS']");
    }

    public WebElement getHurryPoterBtn() {
        return getElementByXpath("//span[text()= 'Harry Potter']");
    }

    public WebElement getLegoBtn() {
        return getElementByXpath("//li[@id='p_89/LEGO']");
    }

    public List<WebElement> isCustomerReviewUpList() {
        return getElementsByXpath("//span[text()= '& Up']");
    }
}
