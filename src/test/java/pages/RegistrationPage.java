package pages;

import common.attributes;
import helper.globalProperties;
import helper.seleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import static helper.globalProperties.driver;

public class RegistrationPage {

    @FindBy(how = How.XPATH, using = attributes.UserInfromation.firstName)
    private WebElement elm_FirstName;
    @FindBy(how = How.XPATH, using = attributes.UserInfromation.lastName)
    private WebElement elm_LastName;
    @FindBy(how = How.XPATH, using = attributes.UserInfromation.email)
    private WebElement elm_Email;
    @FindBy(how = How.XPATH, using = attributes.UserInfromation.verify)
    private WebElement elm_Verify;

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

    //Password
    @FindBy(how = How.XPATH, using = attributes.YopMail.password)
    public WebElement elm_password;
    @FindBy(how = How.XPATH, using = attributes.YopMail.confirmPassword)
    public WebElement elm_confirmPassword;
    @FindBy(how = How.XPATH, using = attributes.YopMail.Captcha)
    public WebElement elm_Captcha;
    @FindBy(how = How.XPATH, using = attributes.YopMail.nextButton)
    public WebElement elm_Next;

    //CustomerInformation
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.companyName)
    private WebElement elm_companyName;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.role)
    private WebElement elm_role;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.roleData)
    private WebElement elm_roleData;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.propertyType)
    private WebElement elm_propertyType;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.propertyTypeData)
    private WebElement elm_propertyTypeData;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.units)
    private WebElement elm_noOfUnits;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.howHear)
    private WebElement elm_howHear;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.howHearData)
    private WebElement elm_howHearData;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.nextStep)
    private WebElement elm_nextStep;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.planNextStep)
    private WebElement elm_nextSteps;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.miniIcon)
    private WebElement elm_miniIcon;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.fullLogo)
    private WebElement elm_fullLogo;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.preview)
    private WebElement elm_preview;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.closePreview)
    private WebElement elm_ClosePreview;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.privacyPolicy)
    private WebElement elm_privacyPolicy;
    @FindBy(how = How.XPATH, using = attributes.CustomerInformation.Register)
    private WebElement elm_register;


    public void userInformation() {

        WebElement elm_FirstName = seleniumHelper.waitForElement(attributes.UserInfromation.firstName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        seleniumHelper.setText(elm_FirstName, globalProperties.getValueFromInputData("UserInformation", "firstName"));


        WebElement elm_LastName = seleniumHelper.waitForElement(attributes.UserInfromation.lastName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        seleniumHelper.setText(elm_LastName, globalProperties.getValueFromInputData("UserInformation", "lastName"));

        WebElement elm_Email = seleniumHelper.waitForElement(attributes.UserInfromation.email, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        seleniumHelper.setText(elm_Email, globalProperties.getValueFromInputData("UserInformation", "email"));

        WebElement elm_Verify = seleniumHelper.waitForElement(attributes.UserInfromation.verify, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        elm_Verify.click();
    }

    public void YopMail() {

        elm_userName = seleniumHelper.waitForElement(attributes.YopMail.userName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_userName, globalProperties.getValueFromInputData("UserInformation", "email"));

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

        elm_otp = seleniumHelper.waitForElement(attributes.YopMail.OTP, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_otp, otpText);

    }

    public void Password() throws InterruptedException {
        elm_password = seleniumHelper.waitForElement(attributes.YopMail.password, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_password, globalProperties.getValueFromInputData("UserInformation", "Password"));

        elm_confirmPassword = seleniumHelper.waitForElement(attributes.YopMail.confirmPassword, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_confirmPassword, globalProperties.getValueFromInputData("UserInformation", "ConfirmPassword"));

        elm_switchframe = seleniumHelper.waitForElement(attributes.YopMail.switchframerE, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        driver.switchTo().frame(elm_switchframe);

        elm_Captcha = seleniumHelper.waitForElement(attributes.YopMail.Captcha, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_Captcha.click();

        driver.switchTo().defaultContent();
        elm_Next = seleniumHelper.waitForElement(attributes.YopMail.nextButton, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        Thread.sleep(2000);
        elm_Next.click();
    }

    public void CustomerInformation() throws InterruptedException, AWTException {

        //CustomerInformation
        elm_companyName = seleniumHelper.waitForElement(attributes.CustomerInformation.companyName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_companyName, globalProperties.getValueFromInputData("CustomerInformation", "CompanyName"));

        elm_role = seleniumHelper.waitForElement(attributes.CustomerInformation.role, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_role.click();

        elm_roleData = seleniumHelper.waitForElement(attributes.CustomerInformation.roleData, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_roleData.click();

        elm_propertyType = seleniumHelper.waitForElement(attributes.CustomerInformation.propertyType, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_propertyType.click();

        elm_propertyTypeData = seleniumHelper.waitForElement(attributes.CustomerInformation.propertyTypeData, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_propertyTypeData.click();

        elm_noOfUnits = seleniumHelper.waitForElement(attributes.CustomerInformation.units, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_noOfUnits, globalProperties.getValueFromInputData("CustomerInformation", "NoOfUnits"));


        elm_howHear = seleniumHelper.waitForElement(attributes.CustomerInformation.howHear, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_howHear.click();

        elm_howHearData = seleniumHelper.waitForElement(attributes.CustomerInformation.howHearData, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_howHearData.click();

        elm_nextStep = seleniumHelper.waitForElement(attributes.CustomerInformation.nextStep, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_nextStep.click();
    }

    public void PlanSelection() throws InterruptedException, AWTException {


        //Plan Selection
        elm_switchframe = seleniumHelper.waitForElement(attributes.YopMail.switchframerE, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        elm_nextSteps = seleniumHelper.waitForElement(attributes.CustomerInformation.planNextStep, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        Thread.sleep(500);
        elm_nextSteps.click();
    }

    public void PlanOverview() throws InterruptedException, AWTException {


        //Plan Overview
        driver.switchTo().frame(elm_switchframe);
        elm_nextStep = seleniumHelper.waitForElement(attributes.CustomerInformation.nextStep, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_nextStep.click();

    }

    public void ApplicationCustomization() throws InterruptedException, AWTException, IOException {

//        Application Customization
        elm_miniIcon = seleniumHelper.waitForElement(attributes.CustomerInformation.miniIcon, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        WebElement fileInputMiniIcon = driver.findElement(By.cssSelector("input[name='miniLogo']"));
        String miniIconPath = globalProperties.getValueFromInputData("ApplicationCustomization", "Icon");
        fileInputMiniIcon.sendKeys(miniIconPath);
        Thread.sleep(1000); // Wait for upload

// Uploading fullLogo
        elm_fullLogo = seleniumHelper.waitForElement(attributes.CustomerInformation.fullLogo, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        WebElement fileInputFullLogo = driver.findElement(By.cssSelector("input[name='fullLogo']"));
        String fullLogoPath = globalProperties.getValueFromInputData("ApplicationCustomization", "Logo");
        fileInputFullLogo.sendKeys(fullLogoPath);
        Thread.sleep(1000); // Wait for upload

        //Reset
        elm_preview = seleniumHelper.waitForElement(attributes.CustomerInformation.preview, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_preview.click();
        elm_ClosePreview = seleniumHelper.waitForElement(attributes.CustomerInformation.closePreview, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_ClosePreview.click();

        elm_privacyPolicy = seleniumHelper.waitForElement(attributes.CustomerInformation.privacyPolicy, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_privacyPolicy.click();

        elm_register = seleniumHelper.waitForElement(attributes.CustomerInformation.Register, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_register.click();

    }
}




