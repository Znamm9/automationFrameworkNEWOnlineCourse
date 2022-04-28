package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BarnlysRestoranElements extends BasePage{

    public BarnlysRestoranElements(WebDriver driver) {
        super(driver);
    }

    public WebElement isReviewsBlock(){
        return getElementByXpath("//div[@class='yelp-reviews']");
    }

    public WebElement isDeliveryPriceBlock(){
        return getElementByXpath("//li[@class='restaurant__info__list__item ng-scope']");
    }

    public WebElement getDeliveryPriceBlock(){
        return getElementByXpath("//span[@class='restaurant__info__list__item__detail ng-binding']");
    }


}
