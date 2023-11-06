package org.driivz.pom;

import org.driivz.infra.ThreadDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class AbstractPage {
    protected WebDriver chromeDriver = ThreadDriver.getDriver();

    protected FluentWait<WebDriver> wait = new FluentWait<>(chromeDriver).withTimeout(Duration.ofSeconds(15))
            .ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofSeconds(2));
}
