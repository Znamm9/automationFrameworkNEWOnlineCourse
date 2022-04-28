package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HomePageElements {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void setTextSearch(String text) {
        getSearchInput().sendKeys(text);
    }

    public void clickAttempt() {
        getSearchAttempt().click();
    }

    public void clickGotItBtn() {
        getGotItBtn().click();
    }

    public void clickSelectFirstListSearch() {
        selectFirstElement().click();
    }

    public void clickFedBtn() {
        getFedBtn().click();
    }
}
