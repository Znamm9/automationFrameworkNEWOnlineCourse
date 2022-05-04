package pageObjectsAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class SearchAllPageElements extends BasePage {
    public SearchAllPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement checkAnotation() {
        return driver.findElement(By.xpath("//div[@dir='auto']"));
    }

    public WebElement getsearchDropdownBox() {
        return driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    }

    public WebElement getsearchMovies() {
        return driver.findElement(By.xpath("//option[@value='search-alias=movies-tv-intl-ship']"));
    }

    public WebElement getsearchInput() {
        return driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']"));
    }

    public WebElement getsearchFilm() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    public WebElement searchText() {
        return driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
    }

    public WebElement checkRentButton() {
        return driver.findElement(By.xpath("//button[@class='_1ovr-S _15Ikr8 _20uSE4 _2X_Irl tvod-button av-button']"));
    }

    public WebElement getsearchButton() {
        return driver.findElement( By.xpath("//input[@id='nav-search-submit-button']"));
    }

    public WebElement checkFeatureddeals() {
        return driver.findElement( By.xpath("//span[@class='a-size-extra-large a-color-base a-text-bold']"));
    }
}
