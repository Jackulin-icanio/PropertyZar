package tests;

import helper.globalProperties;
import helper.seleniumHelper;
import org.openqa.selenium.WindowType;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.OnboardingPage;
import java.io.IOException;

import static helper.globalProperties.driver;

public class OnboardingTest {

    String baseUrl = globalProperties.getValueFromInputData("environment", "QABase");
    OnboardingPage onboardingPage = new OnboardingPage();

    @BeforeTest
    public void initDriver() throws IOException {
        seleniumHelper.initializeDriver();
        globalProperties.driver.manage().window().maximize();
        seleniumHelper.initializeExtentReport();
        globalProperties.etSuite = globalProperties.extentReports.createTest("Login suite");
        Reporter.log("Login Test Started");
    }
    @Test(priority = 1)
    public void Login() throws IOException {

//        driver.switchTo().newWindow(WindowType.TAB);

        String regUrl = globalProperties.getValueFromInputData("environment", "LoginURL");
        String userURL = baseUrl + regUrl;
        globalProperties.etTest = globalProperties.etSuite.createNode("Login");
        globalProperties.driver.navigate().to(userURL);
        onboardingPage.Login();
    }
    @Test(priority = 2)
    public void doLogIn() throws InterruptedException {

        driver.switchTo().newWindow(WindowType.TAB);
        String yopURL = globalProperties.getValueFromInputData("environment", "YopURL");
        globalProperties.driver.navigate().to(yopURL);
        onboardingPage.OnboardingYopMail();
    }
}
