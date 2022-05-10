package testsAmazon.electronicsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.CameraPhotoPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

public class TestCameraOpenInSite extends TestInit {

    @Test
    public void openCameraWyzeInSite(){

        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getBtnAllBurgerMenu().click();
        homePage.getBtnElectronics().click();
        sleep(4);
        homePage.getBtnCameraPhoto().click();

        CameraPhotoPage cameraPhotoPage = new CameraPhotoPage(driver);
        cameraPhotoPage.getWyzeCamV3().click();

        Assert.assertTrue(cameraPhotoPage.isUrlContainsCameraAssistant());


    }
}
