package pageObjectsAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class CDsVinylPage extends BasePage {
    public CDsVinylPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getOpenWebPlayer() {
        return getElementByXpath("//img[@alt='Play']");
    }

    public WebElement bestSellersBtn() {
        return getElementByXpath("//a[contains(text(), 'Best Sellers')]");
    }

    public WebElement childrenMusicBtn() {
        return getElementByXpath("//a[@href='/gp/browse.html?rw_useCurrentProtocol=1&node=173425&ref_=mun_bb_childrens']");
    }

    public WebElement artistMerchShopBtn() {
        return getElementByXpath("//a[contains(text(), 'Artist Merch Shop')]");
    }

    public WebElement getVinylBtn() {
        return getElementByXpath("//span[text()= 'Vinyl']");
    }
}
