package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class ComputerComponentsPage extends BasePage {
    public ComputerComponentsPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsUrlContainsSAMSUNG(){
        return driver.getCurrentUrl().contains("SAMSUNG");
    }
}
