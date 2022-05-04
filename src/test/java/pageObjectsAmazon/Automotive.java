package pageObjectsAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.util.List;

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
    public WebElement getTiresWheels(){
        return getElementByXpath("//span[text()='Tires & Wheels']");
    }
    public WebElement getSortTriLynx(){
        return getElementByXpath("//span[text()='Tri-Lynx']");
    }
    public List<WebElement> elementsProducts(){
       return getElementsByXpath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
    }
}
