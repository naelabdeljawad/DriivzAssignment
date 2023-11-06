package org.driivz.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchComponent extends AbstractPage {

    @FindBy(id = "nav-search-bar-form")
    public WebElement container;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchTxtField;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    public SearchComponent() {
        PageFactory.initElements(chromeDriver, this);
    }

    public void searchAnItemByName(String itemName) {
        wait.until(ExpectedConditions.visibilityOf(container));
        searchTxtField.sendKeys(itemName);
        searchButton.click();
    }

}
