package pages;

import common.attributes;
import helper.globalProperties;
import helper.seleniumHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OnboardingPage {
    @FindBy(how = How.XPATH, using = attributes.Login.emailID)
    private WebElement elm_Email;
    @FindBy(how = How.XPATH, using = attributes.Login.password)
    private WebElement elm_Password;
    @FindBy(how = How.XPATH, using = attributes.Login.hideIcon)
    private WebElement elm_HideIcon;

    public void Login() {

        elm_Email = seleniumHelper.waitForElement(attributes.Login.emailID, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_Email, globalProperties.getValueFromInputData("Onboarding", "Email"));

        elm_Password = seleniumHelper.waitForElement(attributes.Login.password, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_Password, globalProperties.getValueFromInputData("Onboarding", "Email"));
        elm_HideIcon = seleniumHelper.waitForElement(attributes.Login.hideIcon, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_HideIcon.click();    }

}
