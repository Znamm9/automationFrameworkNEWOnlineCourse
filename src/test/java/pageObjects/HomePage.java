package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends HomePageElements{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean findMarketingSeo(){
        return getHomeMarketinSeo().isDisplayed();
    }

    public void navigate() {
        driver.get(getEnv());
    }
}
