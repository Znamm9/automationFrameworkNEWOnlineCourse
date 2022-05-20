package pageObjectsVans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public static final String PRODUCT_NAME = "//h3[contains(@class, 'info-name')]";
    public static final String PRODUCT_COLOR = "//dt[contains(text(), 'Color')]//following-sibling::dd[contains(@*, 'detail')]";
    public static final String PRODUCT_PRICE = "//*[contains(@*, 'detail-total')]";
    public static final String PRODUCT_SIZE = "//dt[contains(text(), 'Size')]//following-sibling::dd[contains(@*, 'detail')]";
    public static final String CHECKOUT_SECURELY = "//*[@*='checkout-action-container']//a[contains(@title, 'CHECKOUT')]";

    private String testedName;
    private String testedColor;
    private String testedPrice;
    private String testedSize;

    public WebElement getCheckoutSecurelyBtn() {
        return getElementByXpath(CHECKOUT_SECURELY);
    }

    public String getTestedNameS() {
        return this.testedName;
    }

    public void getProductNameText() {
        testedName = getElementByXpath(PRODUCT_NAME).getText();
    }

    public String getTestedColorS() {
        return this.testedColor;
    }

    public void getProductColorText() {
        testedColor = getElementByXpath(PRODUCT_COLOR).getText();
    }

    public String getTestedPriceS() {
        return this.testedPrice;
    }

    public void getProductPriceText() {
        testedPrice = getElementByXpath(PRODUCT_PRICE).getText();
    }

    public String getTestedSizeS() {
        return this.testedSize;
    }

    public void getProductSizeText() {
        testedSize = getElementByXpath(PRODUCT_SIZE).getText();
    }
}
