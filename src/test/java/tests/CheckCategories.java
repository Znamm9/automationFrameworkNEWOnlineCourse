package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchPage;

public class CheckCategories extends TestInit {

    @Test
    public void checkCategories() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);

        homePage.navigate();
        homePage.getGotItBtn().click();
        searchPage.getSearchField();
        searchPage.setNewYork();
        sleep(1);
        homePage.getFedBtn().click();
        sleep(2);

        int a = searchPage.amountOfCheckBtns();
        searchPage.clickCheckBtns();
        String b = searchPage.getAmountOfRestourants();

        Assert.assertEquals(a, 53);
        Assert.assertFalse(b.contains("No available restaurants"));
    }
}
