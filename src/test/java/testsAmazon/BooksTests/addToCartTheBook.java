package testsAmazon.BooksTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.BooksPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class addToCartTheBook extends TestInit {

    @Test
    public void checkTheBookInCart(){
        HomePage homePage = new HomePage(driver);
        VerityPage verityPage = new VerityPage(driver);
        BooksPage booksPage = new BooksPage(driver);
        VerityHooverPage verityHooverPage = new VerityHooverPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        homePage.navigate();
        homePage.getBtnAllInHeader().click();
        homePage.getCategoryBook().click();
        homePage.getBtnSearch().click();
        booksPage.getInputInHeader().sendKeys("Verity\n");
        verityPage.getLinkVerityBook().click();
        verityHooverPage.getBtnAddToCart().click();
        verityHooverPage.getBtnGoToCart().click();

        Assert.assertEquals("Subtotal (1 item):", shoppingCartPage.getInfoForCustumer().getText());


    }
}
