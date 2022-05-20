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
        BooksPage booksPage = new BooksPage(driver);
        BooksInSpanishPage booksInSpanishPage = new BooksInSpanishPage(driver);
        BasketAmazonPage basketAmazonPage = new BasketAmazonPage(driver);
        homePage.navigate();
        homePage.getBtnAllInHeader().click();
        homePage.getBtnBooks().click();
        homePage.getBtnSearch().click();

        Assert.assertEquals("Popular in Books", booksPage.getHeaderText().getText());

        booksPage.getLinkBooksInSpanish().click();

        waitTILLELelementContainsText("//b[text()='Libros en Español']", "Libros en Español");
        Assert.assertEquals("Libros en Español", booksInSpanishPage.getHeaderText().getText());
        Assert.assertTrue(driver.getTitle().contains("Libros"));

        booksInSpanishPage.getBasketBtn().click();

        Assert.assertTrue(basketAmazonPage.getImg().isDisplayed());
        Assert.assertEquals("Sell", basketAmazonPage.getBtnSell().getText());
        waitTILLELelementContainsText("//a[@class='nav_a nav-swm-text nav-progressive-attribute nav-progressive-content']", "Shop Father's Day Gifts");
        Assert.assertEquals("Shop Father's Day Gifts", basketAmazonPage.getBtnShopMothersDayGifts().getText());
    }
}
