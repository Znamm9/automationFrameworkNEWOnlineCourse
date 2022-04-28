package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage {
    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRecentPostsField() {
        return driver.findElement(By.xpath("//h2[contains(text(), 'Recent Posts')]"));
    }
}
