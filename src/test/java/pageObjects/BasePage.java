package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class BasePage {

    private static final int BASE_WAIT_TIME = 15;

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEnv() {
        if (System.getProperty("env") == null) {
            return "https://qa2.eatstreet.com";
        } else {
            return "https://" + System.getProperty("env") + ".eatstreet.com";
        }
    }

    public void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement getElementByXpath(String locator) {
        sleep(getSlowMoNum());
        return driver.findElement(By.xpath(locator));
    }

    private int getSlowMoNum() {
        if (System.getProperty("slow_mo") == null) {
            return 0;
        } else {
            return Integer.parseInt(System.getProperty("slow_mo"));
        }
    }

    public void clickElementByXpath(String locator) {
        getElementByXpath(locator).click();
    }

    public List<WebElement> getElementsByXpath(String locator) {
        sleep(getSlowMoNum());
        return driver.findElements(By.xpath(locator));
    }

    public WebElement getLoadMoreBtn() {
        return driver.findElement(By.xpath("//button[@class='btn btn--orange']"));
    }

    public List<String> getTabs() {
        return new ArrayList<>(driver.getWindowHandles());
    }

    public WebDriver switchTabs(String tab) {
        return driver.switchTo().window(tab);
    }

    public WebElement waitElementByXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASE_WAIT_TIME));
        return wait.until(elementToBeClickable(By.xpath(locator)));
    }
}
