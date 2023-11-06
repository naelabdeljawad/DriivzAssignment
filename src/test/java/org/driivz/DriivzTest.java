package org.driivz;

import io.restassured.RestAssured;
import org.driivz.infra.PropertiesReader;
import org.driivz.pom.BrowserPage;
import org.driivz.pom.TalkToUsPopUp;
import org.driivz.pom.TopHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DriivzTest extends BaseTest {

    private BrowserPage browserPage;

    @BeforeClass
    public static void setup() {
    }

    @Test
    public void testMe() {
        browserPage = new BrowserPage();
        browserPage.openPage("https://driivz.com/");

        TopHeader topHeader = new TopHeader();
        topHeader.clickOnTalkWithUs();

        TalkToUsPopUp talkToUsPopUp = new TalkToUsPopUp();
        talkToUsPopUp.fillAndAcceptForm("Tester", "Test", "Driivz", "Corporate");

        Assert.assertTrue(true);
    }

    @AfterClass
    public void afterClass() {
        closeDriver();
    }
}
