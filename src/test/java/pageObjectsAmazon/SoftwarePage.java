package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.util.List;

public class SoftwarePage extends BasePage {
    public SoftwarePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnAccountingAndFinance() {
        return getElementByXpath("//a[text()='Accounting & Finance']");
    }

    public List<WebElement> getAllProducts() {
        return getElementsByXpath("//span[@class='a-size-medium a-color-base a-text-normal']");
    }

    public WebElement getProductDetails() {
        return getElementByXpath("//h2[text()='Product details']");
    }

    public List<WebElement> getBtnsCheck() {
        return getElementsByXpath("//i[@class='a-icon a-icon-checkbox']");
    }
    public List<WebElement> getBtnsChecked() {
        return getElementsByXpath("//input[@checked]");
    }

    public List<WebElement> getAvgCustomerReviews() {
        return getElementsByXpath("//span[@class='a-size-small a-color-base']");
    }

    public WebElement getChosenAvgCustomerReview() {
        return getElementByXpath("//span[@class='a-size-small a-color-base a-text-bold']");
    }
}

