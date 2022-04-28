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
        if (getSearchAttempt() != null) {
            getSearchAttempt().click();
        }
    }

    public void clickGotItBtn() {
        if (getGotItBtn() != null) {
            getGotItBtn().click();
        }
    }

    public void clickSelectFirstListSearch() {
        selectFirstElement().click();
    }

    public void clickFedBtn() {
        getFedBtn().click();
    }
}
