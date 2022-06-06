package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class FathersDayPage extends BasePage {
    public FathersDayPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getImgFathersDay() {
        return getElementByXpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Events/2021/FathersDay/Fuji_LPHero_FD21_en_US.jpg']");
    }
}
