package org.driivz;

import org.driivz.pom.BrowserPage;
import org.driivz.pom.ResultsPage;
import org.driivz.pom.SearchComponent;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    private BrowserPage browserPage;

    @Test
    public void searchItemByText() {
        browserPage = new BrowserPage();
        browserPage.openPage("https://www.amazon.com/");

        SearchComponent searchComponent = new SearchComponent();
        searchComponent.searchAnItemByName("EV Battery");

        ResultsPage resultsPage = new ResultsPage();
        Assert.assertTrue(resultsPage.isResultsPageDisplayed(), "Results page is not displayed!");
        Assert.assertTrue(resultsPage.areItemsDisplayed(), "No results found!");
    }

    @AfterClass
    public void closeBrowser() {
        closeDriver();
    }
}
