package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class ComputersPage extends BasePage {
    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    public void clickBtnComputerComponents(){
        getElementByXpath("//span[contains(text(), 'Computer Components')]").click();
    }

    public void clickBtnSamsungInList() {
        getElementByXpath("//li[@id='p_89/SAMSUNG']").click();
    }
}
