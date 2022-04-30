package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class LifeChatPage extends BasePage {
        public LifeChatPage(WebDriver driver) {super(driver);
        }


        public WebElement LifeChatPage() {
            return getElementByXpath("//div[@class ='livechat hidden-tablet']");}
    }
