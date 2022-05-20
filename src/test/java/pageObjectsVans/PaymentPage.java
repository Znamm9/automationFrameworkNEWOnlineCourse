package pageObjectsVans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public static final String BILLING_ADDRESS_ELEMENTS = "//span[@class='billing-address-part']";

    public List<String> getBillingAddressInfo() {
        List<WebElement> billingAddressInfoWebElements = getElementsByXpath(BILLING_ADDRESS_ELEMENTS);
        List<String> billingAddressInfo = new ArrayList<>();
        for (WebElement billingAddressInfoWebElement : billingAddressInfoWebElements) {
            billingAddressInfo.add(billingAddressInfoWebElement.getText());
        }

        billingAddressInfo.removeIf(Objects::isNull);
        billingAddressInfo.removeIf(String::isEmpty);
        return billingAddressInfo;
    }

}
