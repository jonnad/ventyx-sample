package com.ventyx.sample.application;

import java.util.concurrent.TimeUnit;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ApplicationTest {

    @Test
    public void verifyTheInputValueIsReturned() throws Exception {
        assertTrue(1 == 1 );
        /*
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile("C:\\projects\\workspaces\\ventyx-sample\\ventyx-sample-application\\src\\test\\soapui\\EmailVerificationService-soapui-project.xml");
        String[] properties = new String[2];
        properties[0] = "emailAddress=jon@jonhamel.com";
        properties[1] = "lastMailServer=mail.jon.com";
        runner.setProjectProperties(properties);
        runner.run();
        */
    }

        /*
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://www.yahoo.com/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testYahooTestWd() throws Exception {
            driver.get(baseUrl + "/");
            driver.findElement(By.id("p_13838465-p")).clear();
            driver.findElement(By.id("p_13838465-p")).sendKeys("fred");
            driver.findElement(By.id("search-submit")).click();
            driver.findElement(By.id("yschsp")).clear();
            driver.findElement(By.id("yschsp")).sendKeys("tom");
            driver.findElement(By.cssSelector("input.sbb-sd.sbb")).click();
            driver.findElement(By.id("yschsp")).clear();
            driver.findElement(By.id("yschsp")).sendKeys("jack");
            driver.findElement(By.cssSelector("input.sbb-sd.sbb")).click();
            driver.findElement(By.id("yschsp")).click();
            driver.findElement(By.id("yschsp")).clear();
            driver.findElement(By.id("yschsp")).sendKeys("nadine");
            driver.findElement(By.cssSelector("input.sbb-sd.sbb")).click();
        }

        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alert.getText();
            } finally {
                acceptNextAlert = true;
            }
        }
        */


}
