package tests;

import helper.globalProperties;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.OnboardingPage;
import pages.RegistrationPage;

import java.io.IOException;

import static helper.globalProperties.driver;

public class OnboardingTest {

    String baseUrl = globalProperties.getValueFromInputData("environment", "QABase");
    OnboardingPage onboardingPage;

    @Test(priority = 1)
    public void Login() throws IOException {

        driver.switchTo().newWindow(WindowType.TAB);

        String regUrl = globalProperties.getValueFromInputData("environment", "LoginURL");
        String userURL = baseUrl + regUrl;
        globalProperties.etTest = globalProperties.etSuite.createNode("Login");
        globalProperties.driver.navigate().to(userURL);
        onboardingPage = new OnboardingPage();
        onboardingPage.Login();
    }
}
