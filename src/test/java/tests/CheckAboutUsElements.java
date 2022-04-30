package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AboutUsPage;
import pageObjects.HomePage;

public class CheckAboutUsElements extends TestInit {

    @Test
    public void checkElementsInAboutUsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getAboutUsBtn().click();

        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        sleep(2);
        Assert.assertTrue(aboutUsPage.getAboutUsButton().isDisplayed());
        Assert.assertTrue(aboutUsPage.getLeadershipBtn().isDisplayed());
        Assert.assertTrue(aboutUsPage.getInTheNewsBtn().isDisplayed());
        Assert.assertTrue(aboutUsPage.getPreaseReleasesBtn().isDisplayed());
        Assert.assertTrue(aboutUsPage.getConnectBtn().isDisplayed());
        Assert.assertTrue(aboutUsPage.getBlogBtn().isDisplayed());
    }
}
