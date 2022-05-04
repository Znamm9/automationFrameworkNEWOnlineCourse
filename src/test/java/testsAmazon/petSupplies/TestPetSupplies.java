package testsAmazon.petSupplies;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.petSuppliesPage;
import tests.TestInit;

public class TestPetSupplies extends TestInit {

    String urlPetSupplies = "https://www.amazon.com/pet-shops-dogs-cats-hamsters-kittens/b/ref=dp_bc_aui_C_1?ie=UTF8&node=2619533011";

    @Test
    public void searchCarouselBlock(){
        petSuppliesPage petPage = new petSuppliesPage(driver);
        openUrl(urlPetSupplies);

        Assert.assertTrue(petPage.getCarouselBlock().isDisplayed());
    }

    @Test
    public void searchCarouselTitle(){
        petSuppliesPage petPage = new petSuppliesPage(driver);
        openUrl(urlPetSupplies);

        Assert.assertTrue(petPage.getCarouselTitle().isDisplayed());
    }

    @Test
    public void searchCarouselItems(){
        petSuppliesPage petPage = new petSuppliesPage(driver);
        openUrl(urlPetSupplies);

        Assert.assertTrue(petPage.getCarouselItems() > 0);
    }

    @Test
    public void searchMenuBlock(){
        petSuppliesPage petPage = new petSuppliesPage(driver);
        openUrl(urlPetSupplies);

        Assert.assertTrue(petPage.getMenuBlock().isDisplayed());
    }

    @Test
    public void searchMenuItem(){
        petSuppliesPage petPage = new petSuppliesPage(driver);
        openUrl(urlPetSupplies);

        Assert.assertTrue(petPage.getMenuItem().isDisplayed());
    }

    @Test
    public void searchCategoryBlock(){
        petSuppliesPage petPage = new petSuppliesPage(driver);
        openUrl(urlPetSupplies);

        Assert.assertTrue(petPage.getCategoryBlock().isDisplayed());
    }

}