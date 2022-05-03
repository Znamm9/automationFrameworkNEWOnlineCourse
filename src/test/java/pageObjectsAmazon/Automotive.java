package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class Automotive extends BasePage {

    public Automotive(WebDriver driver){
        super(driver);
    }
    public WebElement getExteriorAccessories(){
        return getElementByXpath("//span[text()='Exterior Accessories']");
    }
    public WebElement getBtnSort(){
        return getElementByXpath("//span[@id='a-autoid-0-announce']");
    }
    public WebElement getSortNewestArrivals(){
        return getElementByXpath("//a[@id='s-result-sort-select_4']");
    }
}
