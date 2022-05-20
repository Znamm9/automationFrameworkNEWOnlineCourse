package pageObjectsVans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public static final String PRODUCT_NAME = "//h1[contains(@class, 'product')]";
    public static final String PRODUCT_PRICE = "//*[contains(@*, 'price-container')]//*[contains(@*, 'offer-price')]";
    public static final String PRODUCT_COLOR = "//*[contains(@*, 'selected-color')]";
    public static final String SELECT_A_SIZE = "//select[@id='attr-size']";
    public static final String PRODUCT_SIZE_OPTION = "//option[@value='%s']";
    public static final String ADD_TO_CART = "//button[@data-add-to-cart-text='add to cart']";
    public static final String PROCEED_TO_CHECKOUT_BTN = "//*[@class='mini-cart-actions cart-actions']//a[contains(text(), 'Proceed to checkout')]";

    //constant
    private String testedName;
    private String testedColor;
    private String testedPrice;

    public String getTestedNameS() {
        return this.testedName;
    }

    public void getProductNameText() {
        testedName = getElementByXpath(PRODUCT_NAME).getText();
    }

    public String getTestedPriceS() {
        return this.testedPrice;
    }

    public void getProductPriceText() {
        testedPrice = getElementByXpath(PRODUCT_PRICE).getText();
    }

    public String getTestedColorS() {
        return this.testedColor;
    }

    public void getProductColorText() {
        testedColor = getElementByXpath(PRODUCT_COLOR).getText();
    }

    public WebElement getSizeSelector() {
        return getElementByXpath(SELECT_A_SIZE);
    }

    public WebElement getAddToCart() {
        return getElementByXpath(ADD_TO_CART);
    }

    public WebElement getSize(String testedSize) {
        return getElementByXpath(String.format(PRODUCT_SIZE_OPTION, testedSize));
    }

    public WebElement getProceedToCheckoutBtn() {
        return getElementByXpath(PROCEED_TO_CHECKOUT_BTN);
    }
}
