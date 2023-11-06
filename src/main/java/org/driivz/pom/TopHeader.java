package org.driivz.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopHeader extends AbstractPage {

    @FindBy(xpath = "//a[@data-remodal-target='consultation']")
    private WebElement talkToUs;

    public TopHeader() {
        PageFactory.initElements(chromeDriver, this);
    }

    public void clickOnTalkWithUs() {
        talkToUs.click();
    }
}
