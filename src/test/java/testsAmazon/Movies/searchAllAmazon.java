package testsAmazon.Movies;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.SearchAllPageElements;
import tests.TestInit;

public class searchAllAmazon extends TestInit {

    @Test
    public void searchAllAmazon() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/");
        SearchAllPageElements searchAllPageElements = new SearchAllPageElements(driver);

        searchAllPageElements.getsearchDropdownBox().click();
        searchAllPageElements.getsearchMovies().click();
        searchAllPageElements.getsearchInput().click();
        searchAllPageElements.getsearchFilm().sendKeys("it\n");

        Assert.assertTrue(searchAllPageElements.getsearchMovies().isDisplayed());
        searchAllPageElements.searchText().click();
        Assert.assertTrue(searchAllPageElements.checkAnotation().isDisplayed());
        Assert.assertTrue(searchAllPageElements.checkRentButton().isDisplayed());
    }
}
