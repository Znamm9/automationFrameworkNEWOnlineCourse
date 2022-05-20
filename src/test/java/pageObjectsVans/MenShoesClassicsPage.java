package pageObjectsVans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class MenShoesClassicsPage extends BasePage {
    public MenShoesClassicsPage(WebDriver driver) {
        super(driver);
    }

    public static final String SK8_HI_BLACK_WHITE_SHOES = "//div[@data-part-number='VN000D5IB8C']";

    public WebElement getSk8HiBlackWhiteShoes() {
        return getElementByXpath(SK8_HI_BLACK_WHITE_SHOES);
    }

}
