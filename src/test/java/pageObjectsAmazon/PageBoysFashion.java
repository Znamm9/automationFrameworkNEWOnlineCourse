package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;
import pageObjects.BasePage;

public class PageBoysFashion extends BasePage {

    public PageBoysFashion(WebDriver driver) {
        super(driver);
    }
    public WebElement getJecket(){
        return getElementByXpath("//span[normalize-space()='Gildan Youth Hooded Sweatshirt, Style G18500B']");
    }
    public WebElement checkSizeBtn(){
        return getElementByXpath("//span[@class='a-dropdown-prompt'][normalize-space()='Select']");
    }
    public WebElement getMediumSize(){
        return getElementByXpath("//a[@id='native_dropdown_selected_size_name_3']");
    }
    public  WebElement clickSelectNevy(){
        return getElementByXpath("//img[@alt='Navy']");
    }
    public WebElement getBeltDouble(){
        return getElementByXpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_10']//span[@class='a-size-base-plus a-color-base a-text-normal']");
    }
    public WebElement checkSelectBlack(){
        return getElementByXpath("//img[@alt='Black/Brown']");
    }
    public WebElement getJamperMan(){
        return getElementByXpath("//span[normalize-space()='Nike Air Jordan Jumpman Backpack (One Size, Black)']");
    }
    public WebElement getSelectCarbon(){
        return getElementByXpath("//span[@class='a-size-mini olpMessageWrapper'][normalize-space()='5 options from$52.99']");
    }
}
