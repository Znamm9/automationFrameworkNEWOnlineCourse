package pageElementsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.util.List;

public class petSuppliesElements extends BasePage {

    public petSuppliesElements(WebDriver driver) {
        super(driver);
    }

    public WebElement carouselBlock(){
        return waitElementByXpath("//div[@id='sobe_d_b_5-container']");
    }

    public WebElement carouselTitle(){
        return waitElementByXpath("//div[@id='sobe_d_b_5-carousel']/div/h2");
    }

    public List<WebElement> carouselItems(){
        return getElementsByXpath("//ol[@class='sl-sobe-carousel-viewport-row-inner']");
    }

    public WebElement menuSidebar(){
        return waitElementByXpath("//div[@id='s-refinements']");
    }

    public WebElement menuSidebarItem(){
        return waitElementByXpath("//span[@class='a-list-item']/a");
    }

    public WebElement categoryBlock(){
        return waitElementByXpath("//div[@class = 'a-column a-span12 aok-float-right apb-browse-col-pad-left apb-browse-two-col-center-margin-right']/div[3]");
    }
}
