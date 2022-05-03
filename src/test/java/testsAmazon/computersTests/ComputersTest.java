package testsAmazon.computersTests;

import org.testng.annotations.Test;
import pageObjectsAmazon.ComputersPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class ComputersTest extends TestInit {


    @Test
    public void Test(){
        HomePage homePage = new HomePage(driver);
        ComputersPage computersPage = new ComputersPage(driver);
        homePage.navigate();
        homePage.getBtnAllInHeader().click();
        homePage.getBtnComputersInList().click();
        homePage.getBtnSearch().click();
        computersPage.clickBtnComputerComponents();
        computersPage.clickBtnSamsungInList();
        sleep(2);
    }
}
