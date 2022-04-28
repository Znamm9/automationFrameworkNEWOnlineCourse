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

    public WebElement getEatSteetDriver() {
        return getElementByXpath("//*[contains(text(),'Apply Now')]");
    }

    public WebElement tabsInfoForDiners() {
        return getElementByXpath("//*[@class='delivery-perks padding-top-40 flex-4 container--fluid margin-right-40']");
    }
}