package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return getElementByXpath("//input[@ng-model='searchParam']");
    }

    public void setNewYork() {
        getSearchField().sendKeys("New York");
    }

    public List<WebElement> getChecksBtns() {
        return getElementsByXpath("//label[@class='checkbox-input']");
    }

    public void clickCheckBtns() {
        for (int i=0; i<5; i++) {
            getChecksBtns().get(i).click();
        }
    }

    public String getAmountOfRestourants() {
        return getElementByXpath("//p[@ng-if='$ctrl.filteredRestaurants && $ctrl.filteredRestaurants.length > 0']").getText();
    }

    public int amountOfCheckBtns() {
        return getChecksBtns().size();
    }
}

