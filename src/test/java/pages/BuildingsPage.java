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

public class BuildingsPage {

    @FindBy(how = How.XPATH, using = attributes.Buildings.buildingsTab)
    private WebElement elm_buildingsTab;
    @FindBy(how = How.XPATH, using = attributes.Buildings.newBuilding)
    private WebElement elm_newBuilding;
    @FindBy(how = How.XPATH, using = attributes.Buildings.buildingName)
    private WebElement elm_buildingName;
    @FindBy(how = How.XPATH, using = attributes.Buildings.buildingType)
    private WebElement elm_buildingType;
    @FindBy(how = How.XPATH, using = attributes.Buildings.buildingTypeValue)
    private WebElement elm_buildingTypeValue;
    @FindBy(how = How.XPATH, using = attributes.Buildings.buildingStatus)
    private WebElement elm_buildingStatus;
    @FindBy(how = How.XPATH, using = attributes.Buildings.buildingStatusValue)
    private WebElement elm_buildingStatusValue;
    @FindBy(how = How.XPATH, using = attributes.Buildings.marketRent)
    private WebElement elm_marketRent;
    @FindBy(how = How.XPATH, using = attributes.Buildings.deposit)
    private WebElement elm_deposit;
    @FindBy(how = How.XPATH, using = attributes.Buildings.availableOn)
    private WebElement elm_availableOn;
    @FindBy(how = How.XPATH, using = attributes.Buildings.description)
    private WebElement elm_description;
    @FindBy(how = How.XPATH, using = attributes.Buildings.salePrice)
    private WebElement elm_salePrice;
    @FindBy(how = How.XPATH, using = attributes.Buildings.leaseTerms)
    private WebElement elm_leaseTerms;
    @FindBy(how = How.XPATH, using = attributes.Buildings.leaseTermsValue)
    private WebElement elm_leaseTermsValue;
    @FindBy(how = How.XPATH, using = attributes.Buildings.petsAllowed)
    private WebElement elm_petsAllowed;
    @FindBy(how = How.XPATH, using = attributes.Buildings.mustBe55)
    private WebElement elm_mustBe55;
    @FindBy(how = How.XPATH, using = attributes.Buildings.handicapAccessible)
    private WebElement elm_handicapAccessible;
    @FindBy(how = How.XPATH, using = attributes.Buildings.comments)
    private WebElement elm_comments;
    @FindBy(how = How.XPATH, using = attributes.Buildings.managerName)
    private WebElement elm_managerName;
    @FindBy(how = How.XPATH, using = attributes.Buildings.managerPhone)
    private WebElement elm_managerPhone;
    @FindBy(how = How.XPATH, using = attributes.Buildings.purchaseDate)
    private WebElement elm_purchaseDate;
    @FindBy(how = How.XPATH, using = attributes.Buildings.purchasePrice)
    private WebElement elm_purchasePrice;
    @FindBy(how = How.XPATH, using = attributes.Buildings.downPayment)
    private WebElement elm_downPayment;
    @FindBy(how = How.XPATH,using = attributes.Buildings.saveOwner)
    private WebElement elm_saveOwner;
    @FindBy(how = How.XPATH, using = attributes.Buildings.Save)
    private WebElement elm_Save;

    public void newBuilding() throws IOException {

        elm_buildingsTab = seleniumHelper.waitForElement(attributes.Buildings.buildingsTab, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_buildingsTab.click();

        elm_newBuilding = seleniumHelper.waitForElement(attributes.Buildings.newBuilding, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_newBuilding.click();

        elm_buildingName = seleniumHelper.waitForElement(attributes.Buildings.buildingName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        String RandombuildingName = generateRandomUsername();
        seleniumHelper.setText(elm_buildingName, RandombuildingName);

        FileWriter writer =new FileWriter("BuildingName.txt");
        writer.write(RandombuildingName);
        writer.close();

        elm_buildingType = seleniumHelper.waitForElement(attributes.Buildings.buildingType, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_buildingType.click();

        elm_buildingTypeValue = seleniumHelper.waitForElement(attributes.Buildings.buildingTypeValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_buildingTypeValue.click();
    }

        public void initializeAndClickElement(String element, String value) {
            WebElement elm = seleniumHelper.waitForElement(element, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm.click();

            String memberValueLocator = "//li[contains(text(),'" + value + "')]";
            WebElement elmValue = seleniumHelper.waitForElement(memberValueLocator, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elmValue.click();
    }

        public void initializeAndClickPropertyValue() {
            initializeAndClickElement(attributes.Buildings.propertyType, attributes.Buildings.propertyTypeValue);

            elm_buildingStatus = seleniumHelper.waitForElement(attributes.Buildings.buildingStatus, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_buildingStatus.click();

            elm_buildingStatusValue = seleniumHelper.waitForElement(attributes.Buildings.buildingStatusValue, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_buildingStatusValue.click();

            elm_marketRent = seleniumHelper.waitForElement(attributes.Buildings.marketRent, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_marketRent, globalProperties.getValueFromInputData("Buildings", "MarketRent"));

            elm_deposit = seleniumHelper.waitForElement(attributes.Buildings.deposit, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_deposit, globalProperties.getValueFromInputData("Buildings", "Deposit"));

            elm_availableOn = seleniumHelper.waitForElement(attributes.Buildings.availableOn, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_availableOn, globalProperties.getValueFromInputData("Buildings", "AvailableOn"));

            elm_description = seleniumHelper.waitForElement(attributes.Buildings.description, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_description, globalProperties.getValueFromInputData("Buildings", "Description"));

            elm_salePrice = seleniumHelper.waitForElement(attributes.Buildings.salePrice, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_salePrice, globalProperties.getValueFromInputData("Buildings", "SalePrice"));

            elm_leaseTerms = seleniumHelper.waitForElement(attributes.Buildings.leaseTerms, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_leaseTerms.click();

            elm_leaseTermsValue = seleniumHelper.waitForElement(attributes.Buildings.leaseTermsValue, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_leaseTermsValue.click();

            elm_handicapAccessible = seleniumHelper.waitForElement(attributes.Buildings.handicapAccessible, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_handicapAccessible.click();

            elm_mustBe55 = seleniumHelper.waitForElement(attributes.Buildings.mustBe55, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_mustBe55.click();

            elm_petsAllowed = seleniumHelper.waitForElement(attributes.Buildings.petsAllowed, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_petsAllowed.click();

            elm_comments = seleniumHelper.waitForElement(attributes.Buildings.comments, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_comments, globalProperties.getValueFromInputData("Buildings", "Comments"));

            elm_managerName = seleniumHelper.waitForElement(attributes.Buildings.managerName, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_managerName, globalProperties.getValueFromInputData("Buildings", "ManagerName"));

            elm_managerPhone = seleniumHelper.waitForElement(attributes.Buildings.managerPhone, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_managerPhone, globalProperties.getValueFromInputData("Buildings", "ManagerNumber"));

            elm_purchaseDate = seleniumHelper.waitForElement(attributes.Buildings.purchaseDate, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_purchaseDate, globalProperties.getValueFromInputData("Buildings", "DatePurchased"));

            elm_purchasePrice = seleniumHelper.waitForElement(attributes.Buildings.purchasePrice, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_purchasePrice, globalProperties.getValueFromInputData("Buildings", "PurchasePrice"));

            elm_downPayment = seleniumHelper.waitForElement(attributes.Buildings.downPayment, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            seleniumHelper.setText(elm_downPayment, globalProperties.getValueFromInputData("Buildings", "DownPayment"));
        }
        public void initializeAndClickOwnerValue() throws InterruptedException {
            initializeAndClickElement(attributes.Buildings.owner, attributes.Buildings.ownervalue);
            Thread.sleep(3000);

            elm_saveOwner = seleniumHelper.waitForElement(attributes.Buildings.saveOwner, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_saveOwner.click();

            elm_Save = seleniumHelper.waitForElement(attributes.Buildings.Save, globalProperties.waitType.explicit,
                    globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
            elm_Save.click();
        }
}