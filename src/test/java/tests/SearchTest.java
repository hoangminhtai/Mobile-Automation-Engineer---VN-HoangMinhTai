package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

public class SearchTest extends BaseTest {

    @DataProvider(name = "searchData")
    public Object[][] getData(){
        return new Object[][]{
            {"Ho Chi Minh City"},
            {"///become.outlooks.rising"},
            {"///viết chữ.âm nhạc.an nhàn"}
        };
    }

    @Test(dataProvider = "searchData")
    public void verifySearch(String keyword){
        HomePage home = new HomePage(driver);
        SearchPage search = new SearchPage(driver);
        ResultPage result = new ResultPage(driver);

        home.openSearch();
        search.search(keyword);

        Assert.assertTrue(result.isResultDisplayed());
    }

    @Test
    public void verifyInvalidSearch(){
        HomePage home = new HomePage(driver);
        SearchPage search = new SearchPage(driver);
        ResultPage result = new ResultPage(driver);

        home.openSearch();
        search.search("abc.def");

        Assert.assertEquals(result.getErrorMessage(), "Invalid what3words address");
    }
}