package testsAmazon.musicCDVinyl;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsAmazon.CDsVinylPage;
import pageObjectsAmazon.HomePage;
import tests.TestInit;

import java.util.Arrays;

public class CheckDepartmentOfChildrenMusic______PLUS_____TEST extends TestInit {

    @Test
    public void checkDepartmentOfChildrenMusic() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/ref=nav_logo");
        homePage.getBtnAllInHeader().click();
        homePage.getBtnMusicCDsVinyl().click();
        homePage.getBtnSearch().click();
        CDsVinylPage cDsVinylPage = new CDsVinylPage(driver);
        cDsVinylPage.childrenMusicBtn().click();

        Assert.assertTrue(checkUrlTrue("childrens"));
    }

    @Test
    public void checkW3SchoolTasks() {
        int length = 8;
        String result = (length == 8) ? "твердження вірне" : "твердження не вірне";
        System.out.println(result);
    }

    public static void main(String[] args) {
        String name = "Julia Kulyk";
        int l = name.length();
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

        String a = name.substring(0,5);
        String b = name.substring(5);
        String c = String.valueOf(a.equals(b));
        System.out.println("\n" + c);
        System.out.println(a + b);

//        StringBuilder name2 = new StringBuilder(name);
//        System.out.println(name2.reverse());
    }

    @Test
    public void Trykutnik() {
        String a = "\\";
        String b = "*";

        for (int c = 0; c < 10; c++) {
            System.out.println(a);
            for (int d = c; d > -1; d--) {
                System.out.print(b);
            }
        }
    }

    @Test
    public void MaxMin() {
        int[] name = {5, 2, 2, 3, 4, 7, 5};
        System.out.println(Arrays.stream(name).max());
        System.out.println(Arrays.stream(name).min());
        int sum = Arrays.stream(name).sum();
        System.out.println(sum / name.length);
    }

    @Test
    public void Reverse() {
        String name = "Yuriy Cherniak";
        String name1 = name.substring(0,5);
        String name2 = name.substring(5);

        for (int a = name1.length() - 1; a >= 0; a--) {
            System.out.print(name1.charAt(a));
        }
        System.out.println("\n" + name2);
    }
}

