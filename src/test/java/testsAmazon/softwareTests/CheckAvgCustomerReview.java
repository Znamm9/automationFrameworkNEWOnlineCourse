package testsAmazon.softwareTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.SoftwarePage;
import tests.TestInit;

public class CheckAvgCustomerReview extends TestInit {

    @Test
    public void checkAvgCustomerReview() {
        HomePage homePage = new HomePage(driver);
        SoftwarePage softwarePage = new SoftwarePage(driver);
        openUrl("https://www.amazon.com/ref=nav_logo");
        homePage.getBtnAll().click();
        homePage.getBtnsSeeAll().get(0).click();
        sleep(1);
        homePage.getBtnSoftware().click();
        softwarePage.getBtnAccountingAndFinance().click();
        sleep(1);
        softwarePage.getAvgCustomerReviews().get(0).click();
        Assert.assertTrue(softwarePage.getChosenAvgCustomerReview().isDisplayed());
    }
}

