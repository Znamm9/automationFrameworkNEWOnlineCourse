package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage {
    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextRecentPosts() {
      return   getElementByXpath("//h2[contains(text(), 'Recent Posts')]");
    }
}
