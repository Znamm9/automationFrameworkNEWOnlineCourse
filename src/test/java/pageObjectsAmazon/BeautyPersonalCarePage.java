package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class BeautyPersonalCarePage extends BasePage {
    public BeautyPersonalCarePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRadioBtbBradley() {
        return getElementsByXpath("//i[@class='a-icon a-icon-checkbox']").get(0);
    }

    public boolean checkUrlBradley() {
        return driver.getCurrentUrl().contains("AVera+Bradley");
    }
}
