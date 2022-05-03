package testsAmazon.musicCDVinyl;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.SignInPageA;
import tests.TestInit;

public class ValidationSignIn extends TestInit {

    @Test
    public void validationSignIn() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/ref=nav_logo");
        homePage.getBtnAllBurgerMenu().click();
        homePage.getBtnHelloSignIn().click();
        SignInPageA signInPageA = new SignInPageA(driver);
        signInPageA.inputEmail().sendKeys("18cherniak.yuriy18@gmail.com\n");
        signInPageA.inputPassward().sendKeys("qwerty123\n");

        Assert.assertTrue(homePage.isHelloYuriyBtn().isDisplayed());
    }
}
