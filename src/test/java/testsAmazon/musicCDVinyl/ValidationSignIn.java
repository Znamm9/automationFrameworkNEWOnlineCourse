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
        sleep(3);
        signInPageA.inputEmail("18cherniak.yuriy18@gmail.com\n");
        sleep(3);
        signInPageA.inputPassword("qwerty123\n");
        sleep(2);

        Assert.assertTrue(homePage.isHelloYuriyBtn().isDisplayed());
    }
}
