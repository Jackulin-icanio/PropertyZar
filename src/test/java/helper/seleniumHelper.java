package helper;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.base.Strings;
import common.data;
import helper.globalProperties.expectedConditions;
import helper.globalProperties.logStatus;
import helper.globalProperties.waitType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;


public class seleniumHelper {


    public static void initializeDriver() throws IOException {

        String browserName = data.Common.browser;

        if (browserName.contains("Chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--proxy-server='direct://'", "--proxy-bypass-list=*");
            chromeOptions.addArguments("--disable-gpu");

            ChromeOptions options = chromeOptions.setHeadless(false);
            chromeOptions.addArguments("--remote-allow-origins=*");
            globalProperties.driver = new ChromeDriver(chromeOptions);
        }
    }

    public static boolean WaitForPageToLoad(int timeoutSecs) {
        boolean status = false;
        try {
            status = new WebDriverWait(globalProperties.driver, Duration.ofSeconds(timeoutSecs))
                    .until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
                            .executeScript("return document.readyState").equals("complete"));

            globalProperties.etLog.log(Status.PASS, "Document is in ready state");
/*
            status = new WebDriverWait(globalProperties.driver, Duration.ofSeconds(timeoutSecs))
                    .until((ExpectedCondition<Boolean>) x -> ((JavascriptExecutor) x)
                            .executeScript("return jQuery.active == 0").equals(true));*/

        } catch (Exception ex) {
            globalProperties.etLog.log(Status.FAIL, ex.getMessage());
        }
        return status;
    }

    public static void waitForSpinnerToDisappear(WebElement element, int timeoutSeconds) {
        if (isSpinnerElementDisplayed(element)) {
            new WebDriverWait(globalProperties.driver, Duration.ofSeconds(timeoutSeconds)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
        }
    }

    public static boolean isSpinnerElementDisplayed(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(globalProperties.driver, Duration.ofSeconds(1));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException
                | org.openqa.selenium.StaleElementReferenceException
                | org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }

    public static boolean waitForNewWindow(int timeout) {

        boolean flag = false;

        int counter = 0;
        String currentHandle = globalProperties.driver.getWindowHandle();

        while (!flag) {

            try {

                Set<String> handles = globalProperties.driver.getWindowHandles();

                if (handles.size() > 1) {

                    flag = true;

                    for (String actual : handles) {

                        if (!actual.equalsIgnoreCase(currentHandle)) {
                            // switching to the opened tab
                            globalProperties.driver = globalProperties.driver.switchTo().window(actual);
                            seleniumHelper.WaitForPageToLoad(60);
                            globalProperties.etLog.log(Status.PASS, "Waited successfully for new tab");
                        }
                    }
                    return flag;
                }

                Thread.sleep(1000);

                counter++;

                if (counter > timeout) {
                    return flag;
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());

                return false;

            }
        }
        return flag;
    }

    public static WebDriver FocusDriver(WebDriver driver, String windowName) {
        WebDriver returnDriver = null;
        try {
            returnDriver = driver.switchTo().window(windowName);
            globalProperties.etLog.log(Status.INFO, "Focused to the new window");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return returnDriver;
    }

    public static void Highlight(WebDriver driver, WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style',arguments[1])", element,
                    "border: 3px solid blue;");
            ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style',arguments[1])", element, "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static WebElement waitForElement(String xPath, waitType wType, expectedConditions expConditions, int timeOut,
                                            int pollingInterval) {
        FluentWait<WebDriver> fWait = null;
        WebDriverWait webDriverwait = null;
        WebElement element = null;
        String innerText;
        try {
            switch (wType) {
                case fluent:
                    fWait = new FluentWait<WebDriver>(globalProperties.driver).withTimeout(Duration.ofSeconds(timeOut))
                            .pollingEvery(Duration.ofSeconds(pollingInterval))
                            .ignoring(NoSuchElementException.class, TimeoutException.class);
                    break;
                case explicit:
                    webDriverwait = new WebDriverWait(globalProperties.driver, Duration.ofSeconds(timeOut));
                    break;

            }

            switch (expConditions) {
                case elementToBeClickable:
                    if (wType == waitType.fluent)
                        element = fWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
                    else
                        element = webDriverwait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
                    break;
                case presenceOfElementLocated:
                    if (wType == waitType.fluent)
                        element = fWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
                    else
                        element = webDriverwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
                    break;
            }
            innerText = Strings.isNullOrEmpty(getInnerText(element)) ? xPath : getInnerText(element);
            writeLog("[" + innerText + "] element appeared successfully", logStatus.pass);

        } catch (Exception ex) {
            element = null;
           // writeLog("Exception in waitforelement :: " + ex.getMessage(), logStatus.fail);
        }
        return element;
    }

  /*  public static void writeLog(String message, globalProperties.loggerType logType) {

        switch (logType) {
            case extentLog:
                globalProperties.etLog.log(Status.PASS, message);
                break;

            case testNgLog:
                Reporter.log(message, 1);
                break;

        }

    }*/

    public static void clearExistingText(WebElement element) {
        if (element != null) {
            element.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in textbox
            element.sendKeys(Keys.BACK_SPACE); // delete it
        }
    }


    public static void setText(WebElement element, String text) {
        try {
          /*
              ((JavascriptExecutor) globalProperties.driver).executeScript("return arguments[0].value;", element);
            globalProperties.etLog.log(Status.PASS, "Successfully entered the text : " + text);
            */

            element.sendKeys(text);
            writeLog("[" + text + "] is  entered ", logStatus.pass);

        } catch (Exception ex) {
            writeLog("Failed to enter text :: " + ex.getMessage(), logStatus.fail);
        }

    }

    public static void clickElement(WebElement element, String elmName, boolean... shouldUsejsClick) {
        try {
            if (shouldUsejsClick.length > 0)
                ((JavascriptExecutor) globalProperties.driver).executeScript("arguments[0].click();", element);
            else
                element.click();
            writeLog("[" + elmName.toUpperCase() + "] clicked ", logStatus.pass);

        } catch (Exception ex) {
            writeLog("Failed to click :: " + ex.getMessage(), logStatus.fail);
        }

    }


    public static String getInnerText(WebElement element) {
        String text = "";
        try {
            text = element.getText();
            if (Strings.isNullOrEmpty(text)) {
                text = element.getAttribute("value");
                if (Strings.isNullOrEmpty(text)) {
                    text = element.getAttribute("innerHTML");

                }
            }
        } catch (Exception ex) {

        }
        return text;
    }

  /*  public static boolean waitForSpinnerToDisappear(waitType wType, expectedConditions expConditions, int timeOut,
                                                    int pollingInterval) {
        FluentWait<WebDriver> fWait = null;
        WebDriverWait webDriverwait = null;
        boolean status = false;

        try {
            switch (wType) {
                case fluent:
                    fWait = new FluentWait<WebDriver>(globalProperties.driver).withTimeout(Duration.ofSeconds(timeOut))
                            .pollingEvery(Duration.ofSeconds(pollingInterval))
                            .ignoring(NoSuchElementException.class, TimeoutException.class);
                    break;
                case explicit:
                    webDriverwait = new WebDriverWait(globalProperties.driver, Duration.ofSeconds(timeOut));
                    break;

            }

            switch (expConditions) {
                case visibilityOfElementLocated:
                    if (wType == waitType.fluent)
                        status = fWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.xpath(attributes.Common.unifiedSpinner))));
                    else
                        status = webDriverwait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.xpath(attributes.Common.unifiedSpinner))));
                    break;
            }
        } catch (Exception ex) {

        }
        return status;
    }*/

    //            status = webDriverWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.xpath(attributes.Common.unifiedSpinner))));
    public static void writeLog(String logMessage, logStatus lStatus) {

        switch (lStatus) {
            case pass:
                globalProperties.etTest.log(Status.PASS, logMessage);
                Reporter.log(logMessage, true);
                break;
            case fail:
                globalProperties.etTest.log(Status.FAIL, logMessage);
                Reporter.log(logMessage, true);
                break;
            case info:
                globalProperties.etTest.log(Status.INFO, logMessage);
                Reporter.log(logMessage, true);
                break;
            case skip:
                globalProperties.etTest.log(Status.SKIP, logMessage);
                Reporter.log(logMessage, true);
                break;
            case warning:
                globalProperties.etTest.log(Status.WARNING, logMessage);
                Reporter.log(logMessage, true);
                break;
        }
    }

    public static void initializeExtentReport() throws IOException {

        globalProperties.extentReports = new ExtentReports();
        ExtentSparkReporter reporter = new ExtentSparkReporter(data.Common.sparkReportPath);
        reporter.loadXMLConfig(new File(data.Common.extentConfig));
        reporter.config().setJs("var firstElem = document.evaluate('//h6[text()='Test'] //following::div', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;var text = document.evaluate('//a[@id = 'nav-test', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;firstElem.addEventListener('click', function() {text.focus();});");
/*

        reporter.config().setJs("var firstElem =
        document.evaluate(\"//*[text()='Tests']\", document,
        null,XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;var text =
        document.getElementsByClassName('test-wrapper row view test-view
        d-none')[0];firstElem.addEventListener('click', function()
         {text.focus();});");
*/
        // String jsCode =  "var firstElem = document.evaluate('//h6[text()='Test'] //following::div', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;var text = document.evaluate('//a[@id = 'nav-test', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;firstElem.addEventListener('click', function() {text.focus();});";
        //   //h6[text()='Test'] //following::div
        //   //a[@id = 'nav-test

        /* -- [ attr ] -- *//*
        $('.test-content').click(function(evt) {
            var t = $(evt.target);
            if (t.is('.linked')) {
                var testId = t.attr('test-id');
                var id = t.attr('id');
                $('#nav-test').click();
                $('.test-item').filter(function() {
                    return $(this).attr('test-id') == testId;
                }).click();
                setTimeout(function() {
                    var card = $('.test-content-detail .node').filter(function() {
                        return $(this).attr('id') == id;
                    }).closest('.card');
                    card.addClass('border-dark');
                    card.find('.card-header').next().removeClass('collapse');
                    setTimeout(function() {
                        card.removeClass('border-dark');
                    }, 1000);
                }, 200);
            }
        });
*/

        globalProperties.extentReports.attachReporter(reporter);
        globalProperties.extentReports.setAnalysisStrategy(AnalysisStrategy.SUITE);

    }

}
