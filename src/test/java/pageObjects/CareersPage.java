package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CareersPage extends BasePage {
    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreativeBtn() {
        clickElementByXpath("//*[contains(text(),'Marketing & Community Relations Intern - Madison, WI')]");
    }

    public List<WebElement> getListApplyHereBtn() {
        return getElementsByXpath("//*[contains(text(),'Apply Here')]");
    }
}