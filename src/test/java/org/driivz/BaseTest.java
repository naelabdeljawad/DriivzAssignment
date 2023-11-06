package org.driivz;

import org.driivz.infra.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public WebDriver chromeDriver;

    protected BaseTest() {
        createDriver();
    }

    public WebDriver createDriver() {
        try {
            this.chromeDriver = WebDriverFactory.createChromeDriver();
            return this.chromeDriver;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeDriver() {
        try {
            WebDriverFactory.closeDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
