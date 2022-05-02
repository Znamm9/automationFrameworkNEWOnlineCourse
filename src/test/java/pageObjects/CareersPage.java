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

    public WebElement getEatStreetDriver() {
        return getElementByXpath("//*[contains(text(),'Apply Now')]");
    }

    public WebElement tabsInfoForDiners() {
        return getElementByXpath("//*[@class='delivery-perks padding-top-40 flex-4 container--fluid margin-right-40']");
    }


    public List<WebElement> getListMadisonWi() {
        return getElementsByXpath("//*[contains(text(),'Marketing & Community Relations Intern - Madison, WI')]");
    }

    public WebElement textTabsBenefits() {
        return getElementByXpath("//*[@class='benefits-container']");
    }

    public WebElement textTabsForJob() {
        return getElementByXpath("//*[@class='records-container']");
    }

    public WebElement getTechBtn() {
        return getElementByXpath("//label[text()= 'Tech']");
    }

    public WebElement getCreativeBtn() {
        return getElementByXpath("//label[text()= 'Creative']");
    }

    public WebElement getCulinaryBtn() {
        return getElementByXpath("//label[text()= 'Culinary']");
    }

    public WebElement getBusinessBtn() {
        return getElementByXpath("//label[text()= 'Business']");
    }

    public WebElement getDeliveryBtn() {
        return getElementByXpath("//label[text()= 'Delivery']");

    }
}