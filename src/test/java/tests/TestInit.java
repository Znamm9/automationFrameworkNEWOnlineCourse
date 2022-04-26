package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class TestInit {
    WebDriver driver;

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }

   int BASIC_TIME = 15;

   public void waitTILLELelementContainsText(String locator, String text) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
       wait.until(textToBePresentInElementLocated(By.xpath(locator), text));
    }
    public WebElement getElementByXpath(String locator) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
       return wait.until(elementToBeClickable(By.xpath(locator)));
    }
}
