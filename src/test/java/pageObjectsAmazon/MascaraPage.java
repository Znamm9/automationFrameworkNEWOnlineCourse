package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.util.List;

public class MascaraPage extends BasePage {
    public MascaraPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSortBtn() {
        return getElementsByXpath("//i[@class='a-icon a-icon-checkbox']");
    }
}
