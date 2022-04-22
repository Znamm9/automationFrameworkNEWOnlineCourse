package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends BasePage{
    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return getElementByXpath("//*[@alt='EatStreet Logo']");
    }

    public WebElement getSignInBtn(){
        return getElementByXpath("//*[@id='menu-signin']");
    }

    public WebElement getSearchInput(){
        return getElementByXpath("//*[@id='input-food-search']");
    }

    public WebElement getHomeMarketinSeo(){ return getElementByXpath("//h2[contains(text(),'Hungry. Happy')]"); }
}
