package testsAmazon.computersTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.ComputerComponentsPage;
import pageObjectsAmazon.ComputersPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class ComputersTest extends TestInit {


    @Test
    public void computerComponentsSamsungTest(){
        HomePage homePage = new HomePage(driver);
        ComputersPage computersPage = new ComputersPage(driver);
        ComputerComponentsPage computerComponentsPage = new ComputerComponentsPage(driver);
        homePage.navigate();
        homePage.getBtnAllInHeader().click();
        homePage.getBtnComputersInList().click();
        homePage.getBtnSearch().click();
        computersPage.clickBtnComputerComponents();
        computersPage.clickBtnSamsungInList();
        Assert.assertTrue(computerComponentsPage.IsUrlContainsSAMSUNG());
    }
}
