package pages;

import common.attributes;
import helper.globalProperties;
import helper.seleniumHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.FileWriter;
import java.io.IOException;

import static common.RandomUtils.RandomUsernameGenerator.generateRandomUsername;


public class OwnerPage {


    @FindBy(how = How.XPATH, using = attributes.Owner.ownerTab)
    private WebElement elm_ownerTab;
    @FindBy(how = How.XPATH, using = attributes.Owner.newOwner)
    private WebElement elm_newOwner;
    @FindBy(how = How.XPATH, using = attributes.Owner.firstName)
    private WebElement elm_firstName;
    @FindBy(how = How.XPATH, using = attributes.Owner.lastName)
    private WebElement elm_lastName;
    @FindBy(how = How.XPATH, using = attributes.Owner.primaryEmail)
    private WebElement elm_primaryEmail;
    @FindBy(how = How.XPATH, using = attributes.Owner.alternateEmail)
    private WebElement elm_alternateEmail;
    @FindBy(how = How.XPATH, using = attributes.Owner.homePhone)
    private WebElement elm_homePhone;
    @FindBy(how = How.XPATH, using = attributes.Owner.mobilePhone)
    private WebElement elm_mobilePhone;
    @FindBy(how = How.XPATH, using = attributes.Owner.fax)
    private WebElement elm_fax;
    @FindBy(how = How.XPATH, using = attributes.Owner.workPhone)
    private WebElement elm_workPhone;
    @FindBy(how = How.XPATH, using = attributes.Owner.extension)
    private WebElement elm_extension;
    @FindBy(how = How.XPATH, using = attributes.Owner.address2)
    private WebElement elm_address2;
    @FindBy(how = How.XPATH, using = attributes.Owner.address1)
    private WebElement elm_address1;
    @FindBy(how = How.XPATH, using = attributes.Owner.city)
    private WebElement elm_city;
    @FindBy(how = How.XPATH, using = attributes.Owner.state)
    private WebElement elm_state;
    @FindBy(how = How.XPATH, using = attributes.Owner.stateValue)
    private WebElement elm_stateValue;
    @FindBy(how = How.XPATH, using = attributes.Owner.zip)
    private WebElement elm_zip;
    @FindBy(how = How.XPATH, using = attributes.Owner.county)
    private WebElement elm_county;
    @FindBy(how = How.XPATH, using = attributes.Owner.comments)
    private WebElement elm_comments;
    @FindBy(how = How.XPATH, using = attributes.Owner.displayName)
    private WebElement elm_displayNName;
    @FindBy(how = How.XPATH, using = attributes.Owner.businessType)
    private WebElement elm_businessType;
    @FindBy(how = How.XPATH, using = attributes.Owner.businessTypeValue)
    private WebElement elm_businessTypeValue;
    @FindBy(how = How.XPATH, using = attributes.Owner.agreementStart)
    private WebElement elm_agreementStart;
    @FindBy(how = How.XPATH, using = attributes.Owner.agreementEnd)
    private WebElement elm_agreementEnd;
    @FindBy(how = How.XPATH, using = attributes.Owner.taxPayerId)
    private WebElement elm_taxPayerId;
    @FindBy(how = How.XPATH, using = attributes.Owner.ownerPortalAccess)
    private WebElement elm_ownerPortalAccess;
    @FindBy(how = How.XPATH, using = attributes.Owner.canAccessApp)
    private WebElement elm_canAccessApp;
    @FindBy(how = How.XPATH, using = attributes.Owner.save)
    private WebElement elm_save;
    @FindBy(how = How.XPATH, using = attributes.Owner.popup)
    private WebElement elm_popUp;

    public void newOwner() throws IOException {

        String RandomfirstName;
        String RandomlastName;
        String RandomEmail;
        String RandomAlternateEmail;

        elm_ownerTab = seleniumHelper.waitForElement(attributes.Owner.ownerTab, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_ownerTab.click();

        elm_newOwner = seleniumHelper.waitForElement(attributes.Owner.newOwner, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_newOwner.click();

        elm_firstName = seleniumHelper.waitForElement(attributes.Owner.firstName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        RandomfirstName = generateRandomUsername();
        seleniumHelper.setText(elm_firstName, RandomfirstName);

        elm_lastName = seleniumHelper.waitForElement(attributes.Owner.lastName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        RandomlastName = generateRandomUsername();
        seleniumHelper.setText(elm_lastName, RandomlastName);

        FileWriter writer =new FileWriter("Ownername.txt");
        writer.write(RandomfirstName+" "+RandomlastName);
        writer.close();

        elm_primaryEmail = seleniumHelper.waitForElement(attributes.Owner.primaryEmail, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        RandomEmail = generateRandomUsername();
        seleniumHelper.setText(elm_primaryEmail, RandomEmail + "@yopmail.com");

        elm_alternateEmail = seleniumHelper.waitForElement(attributes.Owner.alternateEmail,globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);

        RandomAlternateEmail = generateRandomUsername();
        seleniumHelper.setText(elm_alternateEmail, RandomAlternateEmail + "@yopmail.com");

        elm_homePhone = seleniumHelper.waitForElement(attributes.Owner.homePhone,globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_homePhone, globalProperties.getValueFromInputData("Owner", "HomePhone"));

        elm_mobilePhone = seleniumHelper.waitForElement(attributes.Owner.mobilePhone,globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_mobilePhone, globalProperties.getValueFromInputData("Owner", "MobilePhone"));

        elm_fax = seleniumHelper.waitForElement(attributes.Owner.fax,globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_fax, globalProperties.getValueFromInputData("Owner", "Fax"));

        elm_workPhone = seleniumHelper.waitForElement(attributes.Owner.workPhone,globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_workPhone, globalProperties.getValueFromInputData("Owner", "WorkPhone"));

        elm_extension = seleniumHelper.waitForElement(attributes.Owner.extension,globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_extension, globalProperties.getValueFromInputData("Owner", "Extension"));

        elm_address1 = seleniumHelper.waitForElement(attributes.Owner.address1, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_address1, globalProperties.getValueFromInputData("Owner", "Address1"));

        elm_address2 = seleniumHelper.waitForElement(attributes.Owner.address2, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_address2, globalProperties.getValueFromInputData("Owner", "Address2"));

        elm_city = seleniumHelper.waitForElement(attributes.Owner.city, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_city, globalProperties.getValueFromInputData("Owner", "City"));

        elm_state = seleniumHelper.waitForElement(attributes.Owner.state, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_state.click();

        elm_stateValue = seleniumHelper.waitForElement(attributes.Owner.stateValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_stateValue.click();

        elm_zip = seleniumHelper.waitForElement(attributes.Owner.zip, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_zip, globalProperties.getValueFromInputData("Owner", "Zip"));

        elm_county = seleniumHelper.waitForElement(attributes.Owner.county, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_county, globalProperties.getValueFromInputData("Owner", "County"));

        elm_comments = seleniumHelper.waitForElement(attributes.Owner.comments, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_comments, globalProperties.getValueFromInputData("Owner", "Comments"));

        elm_displayNName = seleniumHelper.waitForElement(attributes.Owner.displayName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_displayNName, globalProperties.getValueFromInputData("Owner", "DisplayName"));

        elm_businessType = seleniumHelper.waitForElement(attributes.Owner.businessType, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_businessType.click();

        elm_businessTypeValue = seleniumHelper.waitForElement(attributes.Owner.businessTypeValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_businessTypeValue.click();

        elm_agreementStart = seleniumHelper.waitForElement(attributes.Owner.agreementStart, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_agreementStart, globalProperties.getValueFromInputData("Owner", "AgreementStart"));

        elm_agreementEnd = seleniumHelper.waitForElement(attributes.Owner.agreementEnd, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_agreementEnd, globalProperties.getValueFromInputData("Owner", "AgreementEnd"));

        elm_taxPayerId = seleniumHelper.waitForElement(attributes.Owner.taxPayerId, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_taxPayerId, globalProperties.getValueFromInputData("Owner", "TaxPayerId"));

        elm_ownerPortalAccess = seleniumHelper.waitForElement(attributes.Owner.ownerPortalAccess, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_ownerPortalAccess.click();

        elm_canAccessApp = seleniumHelper.waitForElement(attributes.Owner.canAccessApp, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_canAccessApp.click();

        elm_save = seleniumHelper.waitForElement(attributes.Owner.save, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_save.click();

        elm_popUp = seleniumHelper.waitForElement(attributes.Owner.popup, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_popUp.click();
    }
}
