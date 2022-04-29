package pageObjects;

import org.openqa.selenium.WebDriver;

public class CheckRestaurantsPage extends BasePage{
    public CheckRestaurantsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isBowlingGreenBtn() {
        return getElementByXpath("//a[text()= 'Bowling Green, OH']").isDisplayed();
    }

    public boolean isCincinnati() {
        return getElementByXpath("//a[text()= 'Cincinnati, OH']").isDisplayed();
    }

    public boolean isClevelant() {
        return getElementByXpath("//a[text()= 'Cleveland, OH']").isDisplayed();
    }

    public boolean isColumbus() {
        return getElementByXpath("//a[text()= 'Columbus, OH']").isDisplayed();
    }

    public boolean isToledo() {
        return getElementByXpath("//a[text()= 'Toledo, OH']").isDisplayed();
    }
}
