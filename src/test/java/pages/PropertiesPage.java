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

public class PropertiesPage {
    @FindBy(how = How.XPATH, using = attributes.Properties.propertiesTab)
    private WebElement elm_propertiesTab;
    @FindBy(how = How.XPATH, using = attributes.Properties.newProperty)
    private WebElement elm_newProperty;
    @FindBy(how = How.XPATH, using = attributes.Properties.propertyName)
    private WebElement elm_propertyName;
    @FindBy(how = How.XPATH, using = attributes.Properties.propertyType)
    private WebElement elm_propertyType;
    @FindBy(how = How.XPATH, using = attributes.Properties.propertyTypeValue)
    private WebElement elm_propertyTypeValue;
    @FindBy(how = How.XPATH, using = attributes.Properties.propertyStatus)
    private WebElement elm_propertyStatus;
    @FindBy(how = How.XPATH, using = attributes.Properties.propertyStatusValue)
    private WebElement elm_propertyStatusValue;
    @FindBy(how = How.XPATH, using = attributes.Properties.marketRent)
    private WebElement elm_marketRent;
    @FindBy(how = How.XPATH, using = attributes.Properties.deposit)
    private WebElement elm_deposit;
    @FindBy(how = How.XPATH, using = attributes.Properties.availableOn)
    private WebElement elm_availableOn;
    @FindBy(how = How.XPATH, using = attributes.Properties.salePrice)
    private WebElement elm_salePrice;
    @FindBy(how = How.XPATH, using = attributes.Properties.leaseTerms)
    private WebElement elm_leaseTerms;
    @FindBy(how = How.XPATH, using = attributes.Properties.leaseTermsValue)
    private WebElement elm_leaseTermsValue;
    @FindBy(how = How.XPATH, using = attributes.Properties.notes)
    private WebElement elm_notes;
    @FindBy(how = How.XPATH, using = attributes.Properties.comments)
    private WebElement elm_comments;
    @FindBy(how = How.XPATH, using = attributes.Properties.address1)
    private WebElement elm_address1;
    @FindBy(how = How.XPATH, using = attributes.Properties.address2)
    private WebElement elm_address2;
    @FindBy(how = How.XPATH, using = attributes.Properties.city)
    private WebElement elm_city;
    @FindBy(how = How.XPATH, using = attributes.Properties.state)
    private WebElement elm_state;
    @FindBy(how = How.XPATH, using = attributes.Properties.stateValue)
    private WebElement elm_stateValue;
    @FindBy(how = How.XPATH, using = attributes.Properties.zip)
    private WebElement elm_zip;
    @FindBy(how = How.XPATH, using = attributes.Properties.countyName)
    private WebElement elm_county;
    @FindBy(how = How.XPATH,using = attributes.Properties.saveOwner)
    private WebElement elm_saveOwner;
    @FindBy(how = How.XPATH, using = attributes.Properties.Save)
    private WebElement elm_Save;

    public void newProperty() throws IOException {

        elm_propertiesTab = seleniumHelper.waitForElement(attributes.Properties.propertiesTab, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_propertiesTab.click();

        elm_newProperty = seleniumHelper.waitForElement(attributes.Properties.newProperty, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_newProperty.click();

        elm_propertyName = seleniumHelper.waitForElement(attributes.Properties.propertyName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);

        String RandompropertyName = generateRandomUsername();
        seleniumHelper.setText(elm_propertyName, RandompropertyName);

        FileWriter writer =new FileWriter("PropertyName.txt");
        writer.write(RandompropertyName);
        writer.close();

        elm_propertyType = seleniumHelper.waitForElement(attributes.Properties.propertyType, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_propertyType.click();

        elm_propertyTypeValue = seleniumHelper.waitForElement(attributes.Properties.propertyTypeValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_propertyTypeValue.click();

        elm_propertyStatus = seleniumHelper.waitForElement(attributes.Properties.propertyStatus, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_propertyStatus.click();

        elm_propertyStatusValue = seleniumHelper.waitForElement(attributes.Properties.propertyStatusValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_propertyStatusValue.click();

        elm_marketRent = seleniumHelper.waitForElement(attributes.Properties.marketRent, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_marketRent, globalProperties.getValueFromInputData("Properties", "MarketRent"));

        elm_deposit = seleniumHelper.waitForElement(attributes.Properties.deposit, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_deposit, globalProperties.getValueFromInputData("Properties", "Deposit"));

        elm_availableOn = seleniumHelper.waitForElement(attributes.Properties.availableOn, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_availableOn, globalProperties.getValueFromInputData("Properties", "AvailableOn"));

        elm_salePrice = seleniumHelper.waitForElement(attributes.Properties.salePrice, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_salePrice, globalProperties.getValueFromInputData("Properties", "SalePrice"));

        elm_leaseTerms = seleniumHelper.waitForElement(attributes.Properties.leaseTerms, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_leaseTerms.click();

        elm_leaseTermsValue = seleniumHelper.waitForElement(attributes.Properties.leaseTermsValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_leaseTermsValue.click();

        elm_notes = seleniumHelper.waitForElement(attributes.Properties.notes, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_notes, globalProperties.getValueFromInputData("Properties", "Notes"));

        elm_comments = seleniumHelper.waitForElement(attributes.Properties.comments, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_comments, globalProperties.getValueFromInputData("Properties", "Comments"));

        elm_address1 = seleniumHelper.waitForElement(attributes.Properties.address1, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_address1, globalProperties.getValueFromInputData("Properties", "Address1"));

        elm_address2 = seleniumHelper.waitForElement(attributes.Properties.address2, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_address2, globalProperties.getValueFromInputData("Properties", "Address2"));

        elm_city = seleniumHelper.waitForElement(attributes.Properties.city, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_city, globalProperties.getValueFromInputData("Properties", "City"));

        elm_state = seleniumHelper.waitForElement(attributes.Properties.state, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_state.click();

        elm_stateValue = seleniumHelper.waitForElement(attributes.Properties.stateValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_stateValue.click();

        elm_zip = seleniumHelper.waitForElement(attributes.Properties.zip, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_zip, globalProperties.getValueFromInputData("Properties", "Zip"));

        elm_county = seleniumHelper.waitForElement(attributes.Properties.countyName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_county, globalProperties.getValueFromInputData("Properties", "County"));

    }
    public void initializeAndClickElement(String element, String value) throws InterruptedException {
        WebElement elm = seleniumHelper.waitForElement(element, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm.click();
        Thread.sleep(2000);

        String memberValueLocator = "//li[contains(text(),'" + value + "')]";
        WebElement elmValue = seleniumHelper.waitForElement(memberValueLocator, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elmValue.click();
        Thread.sleep(2000);
    }
    public void initializeAndClickHOAValue() throws InterruptedException {
        initializeAndClickElement(attributes.Properties.hoa, attributes.Properties.HOAvalue);
    }

    public void initializeAndClickOwnerValue() throws InterruptedException {
        initializeAndClickElement(attributes.Properties.owners, attributes.Properties.ownervalue);
        Thread.sleep(2000);

        elm_saveOwner = seleniumHelper.waitForElement(attributes.Properties.saveOwner, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_saveOwner.click();

        elm_Save = seleniumHelper.waitForElement(attributes.Properties.Save, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_Save.click();
    }
}
