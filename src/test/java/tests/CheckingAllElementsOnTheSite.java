package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class CheckingAllElementsOnTheSite extends TestInit {

    @Test
    public void checkingAllElements() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        homePage.getGotItBtn().click();

        Assert.assertTrue(homePage.getPictureAboveInput().isDisplayed());
        Assert.assertTrue(homePage.getTextPathnerWithUs().isDisplayed());
        Assert.assertTrue(homePage.getImgCart().isDisplayed());
        Assert.assertTrue(homePage.getTextTakeOut().isDisplayed());
        Assert.assertTrue(homePage.getTextLabel().getText().contains("Delivery"));
    }
}
