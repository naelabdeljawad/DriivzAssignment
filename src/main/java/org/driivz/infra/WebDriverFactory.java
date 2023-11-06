package org.driivz.infra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class WebDriverFactory {

    private static ChromeDriver chromeDriver;

    private static ChromeOptions getChromeCapabilities() {
        /**
         * Webdriver caps with chrome options
         */
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-cookies");
        chromeOptions.setBinary(System.getProperty("user.dir").concat(File.separator)
                .concat("resources").concat(File.separator).concat("drivers").concat(File.separator).concat("chromedriverMac.app/Contents/MacOS/chromedriver"));
        return chromeOptions;
    }

    /**
     * Create chrome browser instance
     *
     * @return chromeDriver
     */
    public static WebDriver createChromeDriver() {
        chromeDriver = new ChromeDriver(getChromeCapabilities());
        ThreadDriver.setDriver(chromeDriver);
        return chromeDriver;
    }

    /**
     * Close driver and stop service if running
     */
    public static void closeDriver() {
        chromeDriver.quit();
    }
}
