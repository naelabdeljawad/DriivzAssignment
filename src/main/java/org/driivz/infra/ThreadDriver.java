package org.driivz.infra;

import org.openqa.selenium.WebDriver;

public class ThreadDriver {

    private static final ThreadLocal<WebDriver> tmDriver = new ThreadLocal<>();

    public static void setDriver(WebDriver appiumDriver) {
        tmDriver.set(appiumDriver);
    }

    public static WebDriver getDriver() {
        return tmDriver.get();
    }

    public static void removeDriver() {
        tmDriver.remove();
    }
}
