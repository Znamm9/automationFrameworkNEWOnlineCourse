package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class WebPlayerPage extends BasePage {
    public WebPlayerPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkUrlMusic() {
        return driver.getCurrentUrl().contains("https://music.amazon.com/");
    }
}
