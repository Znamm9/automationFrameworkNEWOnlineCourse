package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public String getEnv(){
        if (System.getProperty("env") == null){
            return "https://qa2.eatstreet.com";
        }else {
            return "https://" + System.getProperty("env") + ".eatstreet.com";
        }
    }

    public void sleep(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement getElementByXpath(String locator){
        sleep(getSlowMoNum());
        return driver.findElement(By.xpath(locator));
    }

    private int getSlowMoNum() {
        if (System.getProperty("slow_mo") == null){
            return 0;
        }else {
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
}
