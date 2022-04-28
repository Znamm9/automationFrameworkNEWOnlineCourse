package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BarnlysRestoranHelper extends BarnlysRestoranElements{
    public BarnlysRestoranHelper(WebDriver driver) {
        super(driver);
    }

    public void navigateParams(String paramsUrl) {
        char firstChart = paramsUrl.charAt(0);
        if (firstChart == '/'){
            driver.get(getEnv() + paramsUrl);
        }else {
            driver.get(getEnv() + "/" + paramsUrl);
        }
    }

    public WebElement isReviews(){
        return isReviewsBlock();
    }

    public WebElement isDeliveryPrice(){
        return isDeliveryPriceBlock();
    }

    public double getDeliveryPrice(){
        String priceText = getDeliveryPriceBlock().getText().substring(1);
        double priceDelivery = Double.parseDouble(priceText);
        return priceDelivery;
    }

}
