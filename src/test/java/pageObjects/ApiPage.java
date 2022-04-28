package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApiPage extends BasePage{

    public ApiPage(WebDriver driver) {
        super(driver);
    }

    public void goToIframe() {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/e/1FAIpQLSct2JE5-tkmeqE7j8sUY-_jJPm5gZBZ-_1McCglDL4_qa_Ifw/viewform?embedded=true']"));
        driver.switchTo().frame(iframe);
    }

    public WebElement inputName(){
       return getElementsByXpath("//input[@class='whsOnd zHQkBf']").get(0);
    }

    public WebElement inputEmail(){
        return getElementsByXpath("//input[@class='whsOnd zHQkBf']").get(1);
    }

    public WebElement inputBussinesName(){
        return getElementsByXpath("//input[@class='whsOnd zHQkBf']").get(2);
    }

    public WebElement inputDescriptionOfUsage(){
        return getElementByXpath("//textarea[@class='KHxj8b tL9Q4c']");
    }

    public WebElement clearAllList(){
        return getElementByXpath("//span[contains(text(), 'Очистити форму')]");
    }

    public WebElement sendAllList(){
        return getElementByXpath("//span[contains(text(), 'Надіслати')]");
    }

    public WebElement getTextClearAllList(){
        return getElementByXpath("//div[@class='Shk6y bEd2J']");
    }
}
