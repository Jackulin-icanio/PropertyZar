package pages;

import common.attributes;
import helper.globalProperties;
import helper.seleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;

import static helper.globalProperties.driver;

public class OnboardingPage {

    @FindBy(how = How.XPATH, using = attributes.Login.emailID)
    private WebElement elm_Email;
    @FindBy(how = How.XPATH, using = attributes.Login.password)
    private WebElement elm_Password;
    @FindBy(how = How.XPATH, using = attributes.Login.hideIcon)
    private WebElement elm_HideIcon;
    @FindBy (how = How.XPATH, using = attributes.Login.keepmeSign)
    private WebElement elm_KeepmeSign;
    @FindBy (how = How.XPATH,using = attributes.Login.loginbtn)
    private WebElement elm_Login;

    //Yopmail
    @FindBy(how = How.XPATH, using = attributes.YopMail.userName)
    private WebElement elm_userName;
    @FindBy(how = How.XPATH, using = attributes.YopMail.button)
    private WebElement elm_button;
    @FindBy(how = How.XPATH, using = attributes.YopMail.switchframe)
    private WebElement elm_switchframe;
    @FindBy(how = How.XPATH, using = attributes.YopMail.OTP)
    private WebElement elm_otp;
    @FindBy(how = How.XPATH, using = attributes.YopMail.refresh)
    private WebElement elm_refresh;

    @FindBy (how = How.XPATH,using = attributes.Login.otp)
    private WebElement elm_OTP;
    @FindBy (how = How.XPATH,using = attributes.Login.submit)
    private WebElement elm_Submit;


    public void Login() {

        elm_Email = seleniumHelper.waitForElement(attributes.Login.emailID, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_Email, globalProperties.getValueFromInputData("Onboarding", "Email"));

        elm_Password = seleniumHelper.waitForElement(attributes.Login.password, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_Password, globalProperties.getValueFromInputData("Onboarding", "Password"));

        elm_HideIcon = seleniumHelper.waitForElement(attributes.Login.hideIcon, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_HideIcon.click();

        elm_KeepmeSign = seleniumHelper.waitForElement(attributes.Login.keepmeSign, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_KeepmeSign.click();

        elm_Login = seleniumHelper.waitForElement(attributes.Login.loginbtn, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_Login.click();
    }

    public void OnboardingYopMail() throws InterruptedException {

        elm_userName = seleniumHelper.waitForElement(attributes.YopMail.userName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_userName, globalProperties.getValueFromInputData("Onboarding", "Email"));
//      seleniumHelper.setText(elm_userName, randomEmail+"@yopmail.com");

        elm_button = seleniumHelper.waitForElement(attributes.YopMail.button, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_button.click();

        elm_refresh = seleniumHelper.waitForElement(attributes.YopMail.refresh, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_refresh.click();

        elm_switchframe = seleniumHelper.waitForElement(attributes.YopMail.switchframe, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        driver.switchTo().frame(elm_switchframe);

        WebElement OTP = driver.findElement(By.xpath("//h2"));
        String otpText = OTP.getText();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));

        elm_OTP = seleniumHelper.waitForElement(attributes.Login.otp, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_OTP, otpText);

        elm_Submit = seleniumHelper.waitForElement(attributes.Login.submit, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_Submit.click();

        Thread.sleep(3000);
    }
}