package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageElementsAmazon.petSuppliesElements;

public class petSuppliesPage extends petSuppliesElements {

    public petSuppliesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCarouselBlock() {
        return carouselBlock();
    }

    public WebElement getCarouselTitle() {
        return carouselTitle();
    }

    public int getCarouselItems() {
        if (carouselItems().size() > 0){
            return 1;
        }
        return 0;
    }

    public WebElement getMenuBlock() {
        return menuSidebar();
    }

    public WebElement getMenuItem() {
        return menuSidebarItem();
    }

    public WebElement getCategoryBlock() {
        return categoryBlock();
    }
}
