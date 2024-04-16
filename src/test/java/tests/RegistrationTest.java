package tests;

import helper.globalProperties;
import helper.seleniumHelper;
import org.openqa.selenium.WindowType;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import java.awt.*;
import java.io.IOException;

import static helper.globalProperties.driver;

public class RegistrationTest {

    String baseUrl = globalProperties.getValueFromInputData("environment", "QABase");
    RegistrationPage regPage;

    @BeforeTest
    public void initDriver() throws IOException {
        seleniumHelper.initializeDriver();
        globalProperties.driver.manage().window().maximize();
        seleniumHelper.initializeExtentReport();
        globalProperties.etSuite = globalProperties.extentReports.createTest("Login suite");
        Reporter.log("Login Test Started");
    }

    @Test(priority = 1)
    public void UserInformation() throws IOException {

        String regUrl = globalProperties.getValueFromInputData("environment", "RegURL");
        String userURL = baseUrl + regUrl;
        globalProperties.etTest = globalProperties.etSuite.createNode("User Information");
        globalProperties.driver.navigate().to(userURL);
        regPage = new RegistrationPage();
        regPage.userInformation();
    }

    @Test(priority = 2)
    public void doLogIn() throws InterruptedException, AWTException, IOException {

        driver.switchTo().newWindow(WindowType.TAB);
        String yopURL = globalProperties.getValueFromInputData("environment", "YopURL");
        globalProperties.driver.navigate().to(yopURL);
        regPage.YopMail();
        regPage.Password();
    }

    @Test(priority = 3)
    public void CustomerInformation() throws InterruptedException, AWTException {
        globalProperties.etTest = globalProperties.etSuite.createNode("Customer Information");

        regPage.CustomerInformation();

    }

    @Test(priority = 4)
    public void PlanSelection() throws InterruptedException, AWTException {
        globalProperties.etTest = globalProperties.etSuite.createNode("Plan Selection");

        regPage.PlanSelection();

    }

    @Test(priority = 5)
    public void PlanOverview() throws InterruptedException, AWTException {
        globalProperties.etTest = globalProperties.etSuite.createNode("Plan Overview");

        regPage.PlanOverview();

    }

    @Test(priority = 6)
    public void ApplicationCustomization() throws InterruptedException, AWTException, IOException {
        globalProperties.etTest = globalProperties.etSuite.createNode("Application Customization");

        regPage.ApplicationCustomization();
    }

    @AfterTest
    public void tearDown() {

    }

}
