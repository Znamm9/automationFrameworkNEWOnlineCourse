package pageObjectsVans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.util.ArrayList;
import java.util.List;

public class DeliveryDetailsPage extends BasePage {
    public DeliveryDetailsPage(WebDriver driver) {
        super(driver);
    }

    public static final String INPUT_FIRST_NAME = "//input[@id='first-name']";
    public static final String INPUT_LAST_NAME = "//input[@id='last-name']";
    public static final String INPUT_ADDRESS_1 = "//input[@id='address-1']";
    public static final String INPUT_CITY = "//input[@id='city-name']";
    public static final String INPUT_POST_CODE = "//input[@id='zipcode']";
    public static final String INPUT_PHONE = "//input[@id='phone-1']";
    public static final String INPUT_EMAIL = "//input[@id='email-1']";
    public static final String TERMS_AND_CONDITIONS_CHECKBOX = "//input[contains(@id, 'TermsAndConditions')]";
    public static final String PROCEED_TO_PAYMENT_BTN = "//a[@title='Proceed to Payment']";

    // Test User
    public static final String FIRST_NAME = "Andrii";
    public static final String LAST_NAME = "Brown";
    public static final String ADDRESS_1 = "Javelin street";
    public static final String CITY = "London";
    public static final String POST_CODE = "CF40 1NN";
    public static final String PHONE = "380660001111";
    public static final String EMAIL = "testVans@gmail.com";

    ArrayList<String> testUserInfo = new ArrayList<>();

    public List<String> addingInfo() {
        testUserInfo.add(FIRST_NAME + " " + LAST_NAME);
        testUserInfo.add(ADDRESS_1);
        testUserInfo.add(CITY);
        testUserInfo.add(POST_CODE);
        testUserInfo.add(PHONE);
        testUserInfo.add(EMAIL);
        return testUserInfo;
    }

    public WebElement getInputFirstName() {
        return getElementByXpath(INPUT_FIRST_NAME);
    }

    public WebElement getInputLastName() {
        return getElementByXpath(INPUT_LAST_NAME);
    }

    public WebElement getInputAddress1() {
        return getElementByXpath(INPUT_ADDRESS_1);
    }

    public WebElement getInputCity() {
        return getElementByXpath(INPUT_CITY);
    }

    public WebElement getInputPostCode() {
        return getElementByXpath(INPUT_POST_CODE);
    }

    public WebElement getInputPhone() {
        return getElementByXpath(INPUT_PHONE);
    }

    public WebElement getInputEmail() {
        return getElementByXpath(INPUT_EMAIL);
    }

    public WebElement getTermsAndConditionsCheckbox() {
        return getElementByXpath(TERMS_AND_CONDITIONS_CHECKBOX);
    }

    public WebElement getProceedToPaymentBtn() {
        return getElementByXpath(PROCEED_TO_PAYMENT_BTN);
    }
}
