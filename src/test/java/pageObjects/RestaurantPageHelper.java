package pageObjects;

import org.openqa.selenium.WebDriver;

public class RestaurantPageHelper extends RestaurantPageElements{
    public RestaurantPageHelper(WebDriver driver) {
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
