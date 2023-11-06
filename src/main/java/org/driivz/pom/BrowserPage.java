package org.driivz.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class BrowserPage extends AbstractPage {

    public BrowserPage() {
        PageFactory.initElements(chromeDriver, this);
    }

    public boolean openPage(String url) {
        try {
            chromeDriver.get(url);
            chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
