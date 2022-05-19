package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class CameraPhotoPage extends BasePage {
    public CameraPhotoPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWyzeCamV3() {
        return getElementByXpath("//span[contains(text(), 'Wyze Cam v3 with Color Night Vision')]");
    }

    public boolean isUrlContainsCameraAssistant() {
        return driver.getCurrentUrl().contains("Outdoor-Camera-Assistant");

    }
}
