package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetFedPage extends BasePage {
    public GetFedPage(WebDriver driver) {
        super(driver);
    }

    public WebElement GetFedPage() {
        return getElementByXpath("//a[@id='find-restaurants']");
    }

    public WebElement getCheckGetFedBtn() {
        return getElementByXpath("//a[@class='btn btn-primary float-left']");
    }
}
