package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestaurantPageElements extends BasePage {
    public RestaurantPageElements(WebDriver driver) {
        super(driver);
    }

    public void searchNameInput() {
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("New York");
    }

    public WebElement searchRestaurants() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Happy Times Cafe')]"));
    }

    public WebElement searchOmelettes() {
        return driver.findElement(By.xpath("//h2[contains(text(), 'Omelettes')]"));
    }

    public WebElement CheckSearchMenu() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Bel Air Omelette')]"));
    }

    public WebElement clickSearchAttempt() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }
}
