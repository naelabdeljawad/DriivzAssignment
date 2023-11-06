package org.driivz.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TalkToUsPopUp extends AbstractPage {

    @FindBy(id = "input_3_1")
    private WebElement firstName;

    @FindBy(id = "input_3_2")
    private WebElement lastName;

    @FindBy(id = "input_3_3")
    private WebElement companyName;

    @FindBy(id = "input_3_4")
    private WebElement email;

    @FindBy(id = "input_3_6_1")
    private WebElement acceptCheckBox;

    @FindBy(id = "gform_submit_button_3")
    private WebElement talkToUs;

    @FindBy(id = "gform_3")
    private WebElement formContainer;

    public TalkToUsPopUp() {
        PageFactory.initElements(chromeDriver, this);
    }

    public void fillAndAcceptForm(String firstName, String lastName, String companyName, String corporatEmail) {
        wait.until(ExpectedConditions.visibilityOf(formContainer));
        acceptCookies();
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.companyName.sendKeys(companyName);
        this.email.sendKeys(corporatEmail);
        scrollToAccept(acceptCheckBox);
        waitForElement(acceptCheckBox);
        this.acceptCheckBox.click();
        this.talkToUs.click();
    }

    private void acceptCookies() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CybotCookiebotDialogBodyButtonAccept"))).click();
    }

    private void scrollToAccept(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) chromeDriver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    private void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
