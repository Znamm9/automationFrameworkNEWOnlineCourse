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

    public boolean isTitleRestorant(){
        return getTitleRestaurant().isDisplayed();
    }

    public boolean isMenuRestaurant(){
        return getMenuRestoranBlock().isDisplayed();
    }

    public boolean isReviewsRestaurant(){
        return getReviewsBlock().isDisplayed();
    }

    public void clickFirstElemetSearch(){
        selectFirstElementSearch().click();
    }

    public boolean isListBlockRestaurants(){
        return getListBlockRestaurants().isDisplayed();
    }
}
