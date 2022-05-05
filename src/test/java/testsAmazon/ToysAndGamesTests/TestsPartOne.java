package testsAmazon.ToysAndGamesTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.SignInPageA;
import pageObjectsAmazon.ToysAndGamesPage;
import tests.TestInit;

public class TestsPartOne extends TestInit {

    @Test
    public void LoginAtAmazon() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getSignInBtn().click();

        SignInPageA signInPageA = new SignInPageA(driver);
        signInPageA.inputEmail("bodya.nazaruk409@gmail.com\n");
        signInPageA.inputPassword("1237894560Bohdan\n");

        Assert.assertTrue(homePage.getBohdanHelloBtn().isDisplayed());
    }

    @Test
    public void searchBuildingToys() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getSignInBtn().click();

        SignInPageA signInPageA = new SignInPageA(driver);
        signInPageA.inputEmail("bodya.nazaruk409@gmail.com\n");
        signInPageA.inputPassword("1237894560Bohdan\n");

        homePage.getBtnAllBurgerMenu().click();
        sleep(2);
        homePage.getSeeAllBtn().click();
        sleep(2);
        homePage.getToysAndGamesBtn().click();
        homePage.getBuildingToysBtn().click();

        ToysAndGamesPage toysAndGamesPage = new ToysAndGamesPage(driver);
        Assert.assertTrue(toysAndGamesPage.getResultString().isDisplayed());
    }
}
