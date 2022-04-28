package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RestoranPageHelper extends RestaurantPageElements{
    public RestoranPageHelper(WebDriver driver) {
        super(driver);
    }

    public void setTextSearchHeader(String text){
        searchHeaderInput().sendKeys(text);
    }

    public void clickContainsTextByElemen(String element, String name){
        searchContainsTextByElemen(element, name).click();
    }

    public boolean isRestorantByName(String element, String name){
        return searchContainsTextByElemen(element, name).isDisplayed();
    }

    public boolean isMenuRestorant(){
        return getMenuRestoranBlock().isDisplayed();
    }

}
