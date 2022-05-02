package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BlogPage;
import pageObjects.HomePage;

import java.util.ArrayList;

public class TestBlog extends TestInit{

    @Test
    public void testBlogBtn(){
        HomePage homePage = new HomePage(driver);
        BlogPage blogPage = new BlogPage(driver);

        homePage.navigate();
        homePage.getGotItBtn().click();
        homePage.getBlogBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(blogPage.getTextRecentPosts().isDisplayed());
    }
}
