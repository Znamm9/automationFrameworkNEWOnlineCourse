package testsAmazon.BeautyPersonalCare;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.HomePage;
import pageObjectsAmazon.MascaraPage;
import tests.TestInit;

public class SortMascaraForMascaraShade extends TestInit {
    @Test
    public void sortMascaraForMascaraShade() {
        HomePage homePage = new HomePage(driver);
        MascaraPage mascaraPage = new MascaraPage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getSearchField().sendKeys("mascara in All Department\n");
        for (int i = 4; i <= 10; i += 4) {
            mascaraPage.getSortBtn().get(i).click();
        }
    }
}
