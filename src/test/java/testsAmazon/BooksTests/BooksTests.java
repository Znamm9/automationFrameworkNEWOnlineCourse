package testsAmazon.BooksTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.BasketAmazonPage;
import pageObjectsAmazon.BooksInSpanishPage;
import pageObjectsAmazon.BooksPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class BooksTests extends TestInit {

    @Test
    public void checkAllElementsBooks() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getBtnAllInHeader().click();
        homePage.getBtnBooks().click();
        homePage.getBtnSearch().click();
        BooksPage booksPage = new BooksPage(driver);

        sleep(3);
        Assert.assertTrue(booksPage.getHeaderText().getText().contains("Popular in Books"));

        booksPage.getLinkBooksInSpanish().click();
        BooksInSpanishPage booksInSpanishPage = new BooksInSpanishPage(driver);

        sleep(3);
        Assert.assertTrue(booksInSpanishPage.getHeaderText().getText().contains("Libros en Español"));
        sleep(3);
        Assert.assertTrue(driver.getTitle().contains("Libros"));

        booksInSpanishPage.getBasketBtn().click();
        BasketAmazonPage basketAmazonPage = new BasketAmazonPage(driver);

        Assert.assertTrue(basketAmazonPage.getImg().isDisplayed());
        Assert.assertTrue(basketAmazonPage.getBtnSell().getText().contains("Sell"));
        waitTILLELelementContainsText("//a[@class='nav_a nav-swm-text nav-progressive-attribute nav-progressive-content']", "Shop Mother's Day Gifts");
        Assert.assertTrue(basketAmazonPage.getBtnShopMothersDayGifts().getText().contains("Shop Mother's Day Gifts"));
    }
}
