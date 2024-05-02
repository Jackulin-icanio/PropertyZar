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


public class HOAPage {

    @FindBy(how = How.XPATH, using = attributes.HOA.hoaTab)
    private WebElement elm_hoaTab;
    @FindBy(how = How.XPATH, using = attributes.HOA.newHOA)
    private WebElement elm_newHOA;
    @FindBy(how = How.XPATH, using = attributes.HOA.hoaName)
    private WebElement elm_hoaName;
    @FindBy(how = How.XPATH, using = attributes.HOA.address1)
    private WebElement elm_address1;
    @FindBy(how = How.XPATH, using = attributes.HOA.address2)
    private WebElement elm_address2;
    @FindBy(how = How.XPATH, using = attributes.HOA.city)
    private WebElement elm_city;
    @FindBy(how = How.XPATH, using = attributes.HOA.state)
    private WebElement elm_state;
    @FindBy(how = How.XPATH, using = attributes.HOA.stateValue)
    private WebElement elm_stateValue;
    @FindBy(how = How.XPATH, using = attributes.HOA.zip)
    private WebElement elm_zip;
    @FindBy(how = How.XPATH, using = attributes.HOA.countyName)
    private WebElement elm_county;
    @FindBy(how = How.XPATH, using = attributes.HOA.member)
    private WebElement elm_member;

    private WebElement elm_memberValue;

    @FindBy(how = How.XPATH, using = attributes.HOA.memberType)
    private WebElement elm_membeType;
    @FindBy(how = How.XPATH, using = attributes.HOA.memberTypeValue)
    private WebElement elm_memberTypeValue;
    @FindBy(how = How.XPATH, using = attributes.HOA.Save)
    private WebElement elm_Save;



    public void newHOA() throws IOException {

        elm_hoaTab = seleniumHelper.waitForElement(attributes.HOA.hoaTab, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_hoaTab.click();

        elm_newHOA = seleniumHelper.waitForElement(attributes.HOA.newHOA, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_newHOA.click();

        elm_hoaName = seleniumHelper.waitForElement(attributes.HOA.hoaName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        String RandomhoaName = generateRandomUsername();
        seleniumHelper.setText(elm_hoaName, RandomhoaName);

        FileWriter writer =new FileWriter("HOAname.txt");
        writer.write(RandomhoaName);
        writer.close();

        elm_address1 = seleniumHelper.waitForElement(attributes.HOA.address1, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_address1, globalProperties.getValueFromInputData("HOA", "Address1"));

        elm_address2 = seleniumHelper.waitForElement(attributes.HOA.address2, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_address2, globalProperties.getValueFromInputData("HOA", "Address2"));

        elm_city = seleniumHelper.waitForElement(attributes.HOA.city, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        seleniumHelper.setText(elm_city, globalProperties.getValueFromInputData("HOA", "City"));

        elm_state = seleniumHelper.waitForElement(attributes.HOA.state, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_state.click();

        elm_stateValue = seleniumHelper.waitForElement(attributes.HOA.stateValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_stateValue.click();

        elm_zip = seleniumHelper.waitForElement(attributes.HOA.zip, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_zip, globalProperties.getValueFromInputData("HOA", "Zip"));

        elm_county = seleniumHelper.waitForElement(attributes.HOA.countyName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_county, globalProperties.getValueFromInputData("HOA", "County"));

        elm_membeType = seleniumHelper.waitForElement(attributes.HOA.memberType, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_membeType.click();

        elm_memberTypeValue = seleniumHelper.waitForElement(attributes.HOA.memberTypeValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_memberTypeValue.click();

        elm_member = seleniumHelper.waitForElement(attributes.HOA.member, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_member.click();

    }
    public void initializeMemberValue() {
        String memberValueLocator = "//li[contains(text(),'" + attributes.HOA.value + "')]";
        this.elm_memberValue = seleniumHelper.waitForElement(memberValueLocator, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
    }
    public void clickMemberValue() {
        if (this.elm_memberValue == null) {
            initializeMemberValue();
        }
        this.elm_memberValue.click();
        elm_Save = seleniumHelper.waitForElement(attributes.HOA.Save, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_Save.click();
    }
}