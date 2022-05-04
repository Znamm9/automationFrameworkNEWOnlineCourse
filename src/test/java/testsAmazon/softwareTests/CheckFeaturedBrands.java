package testsAmazon.softwareTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.SoftwarePage;
import tests.TestInit;

public class CheckFeaturedBrands extends TestInit {

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
        for (int i=0; i<3; i++) {
            softwarePage.getBtnsCheck().get(i).click();
            sleep(1);
        }
        sleep(3);
        Assert.assertEquals(softwarePage.getBtnsChecked().size(), 4);
    }
}
