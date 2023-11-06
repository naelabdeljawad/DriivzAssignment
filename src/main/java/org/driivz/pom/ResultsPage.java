package org.driivz.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ResultsPage extends AbstractPage {

    @FindBy(id = "search")
    public WebElement resultsContainer;

    @FindBy(className = "s-product-image-container")
    public List<WebElement> itemsList;

    public ResultsPage() {
        PageFactory.initElements(chromeDriver, this);
    }

    public boolean isResultsPageDisplayed() {
        return resultsContainer.isDisplayed();
    }

    public boolean areItemsDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(itemsList)).size() > 0;
    }

}
