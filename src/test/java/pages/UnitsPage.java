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

public class UnitsPage {

    @FindBy(how = How.XPATH, using = attributes.Units.propertiesTab)
    private WebElement elm_propertiesTab;
    @FindBy(how = How.XPATH, using = attributes.Units.unitsTab)
    private WebElement elm_unitsTab;
    @FindBy(how = How.XPATH, using = attributes.Units.newUnit)
    private WebElement elm_newUnit;
    @FindBy(how = How.XPATH, using = attributes.Units.unitName)
    private WebElement elm_unitName;
    @FindBy(how = How.XPATH, using = attributes.Units.marketRent)
    private WebElement elm_marketRent;
    @FindBy(how = How.XPATH, using = attributes.Units.deposit)
    private WebElement elm_deposit;
    @FindBy(how = How.XPATH, using = attributes.Units.availableOn)
    private WebElement elm_availableOn;
    @FindBy(how = How.XPATH, using = attributes.Units.salePrice)
    private WebElement elm_salePrice;
    @FindBy(how = How.XPATH, using = attributes.Units.leaseTerms)
    private WebElement elm_leaseTerms;
    @FindBy(how = How.XPATH, using = attributes.Units.leaseTermsValue)
    private WebElement elm_leaseTermsValue;
    @FindBy(how = How.XPATH, using = attributes.Units.description)
    private WebElement elm_description;
    @FindBy(how = How.XPATH, using = attributes.Units.squareFoot)
    private WebElement elm_squareFoot;
    @FindBy(how = How.XPATH, using = attributes.Units.units)
    private WebElement elm_units;
    @FindBy(how = How.XPATH, using = attributes.Units.lockBoxCode)
    private WebElement elm_lockBoxCode;
    @FindBy(how = How.XPATH, using = attributes.Units.yearBuilt)
    private WebElement elm_yearBuilt;
    @FindBy(how = How.XPATH, using = attributes.Units.bedRooms)
    private WebElement elm_bedRooms;
    @FindBy(how = How.XPATH, using = attributes.Units.bathRooms)
    private WebElement elm_bathRooms;
    @FindBy(how = How.XPATH, using = attributes.Units.lotSize)
    private WebElement elm_lotSize;
    @FindBy(how = How.XPATH, using = attributes.Units.unitStatus)
    private WebElement elm_unitStatus;
    @FindBy(how = How.XPATH, using = attributes.Units.unitStatusValue)
    private WebElement elm_unitStatusValue;
    @FindBy(how = How.XPATH, using = attributes.Units.unitType)
    private WebElement elm_unitType;
    @FindBy(how = How.XPATH, using = attributes.Units.unitTypeValue)
    private WebElement elm_unitTypeValue;
    @FindBy(how = How.XPATH, using = attributes.Units.unitSubType)
    private WebElement elm_unitSubType;
    @FindBy(how = How.XPATH, using = attributes.Units.unitSubTypeValue)
    private WebElement elm_unitSubTypeValue;
    @FindBy(how = How.XPATH, using = attributes.Units.unitStyle)
    private WebElement elm_unitStyle;
    @FindBy(how = How.XPATH, using = attributes.Units.unitStyleValue)
    private WebElement elm_unitStyleValue;
    @FindBy(how = How.XPATH, using = attributes.Units.parking)
    private WebElement elm_parking;
    @FindBy(how = How.XPATH, using = attributes.Units.parkingValue)
    private WebElement elm_parkingValue;
    @FindBy(how = How.XPATH, using = attributes.Units.heating)
    private WebElement elm_heating;
    @FindBy(how = How.XPATH, using = attributes.Units.heatingValue)
    private WebElement elm_heatingValue;
    @FindBy(how = How.XPATH, using = attributes.Units.airConditioning)
    private WebElement elm_airConditioning;
    @FindBy(how = How.XPATH, using = attributes.Units.airConditioningValue)
    private WebElement elm_airConditioningValue;
    @FindBy(how = How.XPATH, using = attributes.Units.flooring)
    private WebElement elm_flooring;
    @FindBy(how = How.XPATH, using = attributes.Units.flooringValue)
    private WebElement elm_flooringValue;
    @FindBy(how = How.XPATH, using = attributes.Units.parkingSpotNumber)
    private WebElement elm_parkingSpotNumber;
    @FindBy(how = How.XPATH, using = attributes.Units.storageNumber)
    private WebElement elm_storageNumber;
    @FindBy(how = How.XPATH, using = attributes.Units.amenities)
    private WebElement elm_amenities;
    @FindBy(how = How.XPATH, using = attributes.Units.amenitiesValue1)
    private WebElement elm_amenitiesValue1;
    @FindBy(how = How.XPATH, using = attributes.Units.amenitiesValue2)
    private WebElement elm_amenitiesValue2;
    @FindBy(how = How.XPATH, using = attributes.Units.amenitiesValue3)
    private WebElement elm_amenitiesValue3;
    @FindBy(how = How.XPATH, using = attributes.Units.outer)
    private WebElement elm_outer;
    @FindBy(how = How.XPATH, using = attributes.Units.rvCamperMaxLength)
    private WebElement elm_rvCamperMaxLength;
    @FindBy(how = How.XPATH, using = attributes.Units.comments)
    private WebElement elm_comments;
    @FindBy(how = How.XPATH, using = attributes.Units.handicapAccessible)
    private WebElement elm_handicapAccessible;
    @FindBy(how = How.XPATH, using = attributes.Units.mustBe55)
    private WebElement elm_mustBe55;
    @FindBy(how = How.XPATH, using = attributes.Units.petsAllowed)
    private WebElement elm_petsAllowed;
    @FindBy(how = How.XPATH, using = attributes.Units.datePurchased)
    private WebElement elm_datePurchased;
    @FindBy(how = How.XPATH, using = attributes.Units.purchasePrice)
    private WebElement elm_purchasePrice;
    @FindBy(how = How.XPATH, using = attributes.Units.downPayment)
    private WebElement elm_downPayment;
    @FindBy(how = How.XPATH, using = attributes.Units.financingTerms)
    private WebElement elm_financingTerms;
    @FindBy(how = How.XPATH, using = attributes.Units.financingRate)
    private WebElement elm_financingRate;
    @FindBy(how = How.XPATH, using = attributes.Units.currentValue)
    private WebElement elm_currentValue;
    @FindBy(how = How.XPATH, using = attributes.Units.mortgageBalance)
    private WebElement elm_mortgageBalance;
    @FindBy(how = How.XPATH, using = attributes.Units.contractStart)
    private WebElement elm_contractStart;
    @FindBy(how = How.XPATH, using = attributes.Units.contractEnd)
    private WebElement elm_contractEnd;
    @FindBy(how = How.XPATH, using = attributes.Units.subDivision)
    private WebElement elm_subDivision;
    @FindBy(how = How.XPATH, using = attributes.Units.otherInformation)
    private WebElement elm_otherInformation;
    @FindBy(how = How.XPATH, using = attributes.Units.electricCompany)
    private WebElement elm_electricCompany;
    @FindBy(how = How.XPATH, using = attributes.Units.cableCompany1)
    private WebElement elm_cableCompany1;
    @FindBy(how = How.XPATH, using = attributes.Units.cableCompany2)
    private WebElement elm_cableCompany2;
    @FindBy(how = How.XPATH, using = attributes.Units.waterSewage)
    private WebElement elm_waterSewage;
    @FindBy(how = How.XPATH, using = attributes.Units.trashPickup)
    private WebElement elm_trashPickup;
    @FindBy(how = How.XPATH, using = attributes.Units.gasCompany)
    private WebElement elm_gasCompany;
    @FindBy(how = How.XPATH, using = attributes.Units.schoolDistrict)
    private WebElement elm_schoolDistrict;
    @FindBy(how = How.XPATH, using = attributes.Units.elementarySchoolZone)
    private WebElement elm_elementarySchoolZone;
    @FindBy(how = How.XPATH, using = attributes.Units.middleSchoolZone)
    private WebElement elm_middleSchoolZone;
    @FindBy(how = How.XPATH, using = attributes.Units.highSchoolZone)
    private WebElement elm_highSchoolZone;
    @FindBy(how = How.XPATH, using = attributes.Units.saveOwner)
    private WebElement elm_saveOwner;
    @FindBy(how = How.XPATH, using = attributes.Units.save)
    private WebElement elm_save;

    public void newUnit() throws InterruptedException, IOException {

        elm_propertiesTab = seleniumHelper.waitForElement(attributes.Units.propertiesTab, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_propertiesTab.click();

        elm_unitsTab = seleniumHelper.waitForElement(attributes.Units.unitsTab, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_unitsTab.click();

        elm_newUnit = seleniumHelper.waitForElement(attributes.Units.newUnit, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm_newUnit.click();
        Thread.sleep(2000);

        elm_unitName = seleniumHelper.waitForElement(attributes.Units.unitName, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);

        Thread.sleep(3000);

        String RandomUnitName = generateRandomUsername();
        seleniumHelper.setText(elm_unitName, RandomUnitName);

        FileWriter writer =new FileWriter("UnitName.txt");
        writer.write(RandomUnitName);
        writer.close();
    }
    public void initializeAndClickElement(String element, String value) throws InterruptedException {
        WebElement elm = seleniumHelper.waitForElement(element, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elm.click();

        String memberValueLocator = "//li[contains(text(),'" + value + "')]";
        WebElement elmValue = seleniumHelper.waitForElement(memberValueLocator, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated, 60, 2);
        elmValue.click();
    }
    public void initializeAndClickPropertyValue() throws InterruptedException {
        initializeAndClickElement(attributes.Units.propertyName, attributes.Units.propertyNameValue);
    }

    public void initializeAndClickBuildingValue() throws InterruptedException {
        initializeAndClickElement(attributes.Units.buildingName, attributes.Units.buildingNameValue);

        elm_marketRent = seleniumHelper.waitForElement(attributes.Units.marketRent, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_marketRent, globalProperties.getValueFromInputData("Units", "MarketRent"));

        elm_deposit = seleniumHelper.waitForElement(attributes.Units.deposit, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_deposit, globalProperties.getValueFromInputData("Units", "Deposit"));

        elm_availableOn = seleniumHelper.waitForElement(attributes.Units.availableOn, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_availableOn, globalProperties.getValueFromInputData("Units", "AvailableOn"));

        elm_salePrice = seleniumHelper.waitForElement(attributes.Units.salePrice, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_salePrice, globalProperties.getValueFromInputData("Units", "SalePrice"));

        elm_leaseTerms = seleniumHelper.waitForElement(attributes.Units.leaseTerms, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_leaseTerms.click();

        elm_leaseTermsValue = seleniumHelper.waitForElement(attributes.Units.leaseTermsValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_leaseTermsValue.click();

        elm_description = seleniumHelper.waitForElement(attributes.Units.description, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_description, globalProperties.getValueFromInputData("Units", "Description"));
    }
    public void initializeAndClickOwnerValue() throws InterruptedException {

        initializeAndClickElement(attributes.Units.owner, attributes.Units.ownervalue);
        Thread.sleep(2000);

        elm_saveOwner = seleniumHelper.waitForElement(attributes.Units.saveOwner, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_saveOwner.click();

        elm_squareFoot = seleniumHelper.waitForElement(attributes.Units.squareFoot, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_squareFoot, globalProperties.getValueFromInputData("Units", "SquareFoot"));

        elm_units = seleniumHelper.waitForElement(attributes.Units.units, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_units, globalProperties.getValueFromInputData("Units", "Unit"));

        elm_lockBoxCode = seleniumHelper.waitForElement(attributes.Units.lockBoxCode, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_lockBoxCode, globalProperties.getValueFromInputData("Units", "LockBoxCode"));

        elm_yearBuilt = seleniumHelper.waitForElement(attributes.Units.yearBuilt, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_yearBuilt, globalProperties.getValueFromInputData("Units", "YearBuild"));

        elm_bedRooms = seleniumHelper.waitForElement(attributes.Units.bedRooms, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_bedRooms, globalProperties.getValueFromInputData("Units", "Bedrooms"));

        elm_bathRooms = seleniumHelper.waitForElement(attributes.Units.bathRooms, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_bathRooms, globalProperties.getValueFromInputData("Units", "Bathrooms"));

        elm_lotSize = seleniumHelper.waitForElement(attributes.Units.lotSize, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_lotSize, globalProperties.getValueFromInputData("Units", "LotSize"));

        Thread.sleep(2000);

        elm_unitStatus = seleniumHelper.waitForElement(attributes.Units.unitStatus, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_unitStatus.click();

        elm_unitStatusValue = seleniumHelper.waitForElement(attributes.Units.unitStatusValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_unitStatusValue.click();

        elm_unitType = seleniumHelper.waitForElement(attributes.Units.unitType, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_unitType.click();

        elm_unitTypeValue = seleniumHelper.waitForElement(attributes.Units.unitTypeValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_unitTypeValue.click();

        elm_unitSubType = seleniumHelper.waitForElement(attributes.Units.unitSubType, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_unitSubType.click();

        elm_unitSubTypeValue = seleniumHelper.waitForElement(attributes.Units.unitSubTypeValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_unitSubTypeValue.click();

        elm_unitStyle = seleniumHelper.waitForElement(attributes.Units.unitStyle, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_unitStyle.click();

        elm_unitStyleValue = seleniumHelper.waitForElement(attributes.Units.unitStyleValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_unitStyleValue.click();

        elm_parking = seleniumHelper.waitForElement(attributes.Units.parking, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_parking.click();

        elm_parkingValue = seleniumHelper.waitForElement(attributes.Units.parkingValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_parkingValue.click();

        elm_heating = seleniumHelper.waitForElement(attributes.Units.heating, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_heating.click();

        elm_heatingValue = seleniumHelper.waitForElement(attributes.Units.heatingValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_heatingValue.click();

        elm_airConditioning = seleniumHelper.waitForElement(attributes.Units.airConditioning, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_airConditioning.click();

        elm_airConditioningValue = seleniumHelper.waitForElement(attributes.Units.airConditioningValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_airConditioningValue.click();

        elm_flooring = seleniumHelper.waitForElement(attributes.Units.flooring, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_flooring.click();

        elm_flooringValue = seleniumHelper.waitForElement(attributes.Units.flooringValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_flooringValue.click();

        elm_parkingSpotNumber = seleniumHelper.waitForElement(attributes.Units.parkingSpotNumber, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_parkingSpotNumber, globalProperties.getValueFromInputData("Units", "ParkingSpotNumber"));

        elm_storageNumber = seleniumHelper.waitForElement(attributes.Units.storageNumber, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_storageNumber, globalProperties.getValueFromInputData("Units", "StorageNumber"));

        elm_amenities = seleniumHelper.waitForElement(attributes.Units.amenities, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_amenities.click();

        elm_amenitiesValue1 = seleniumHelper.waitForElement(attributes.Units.amenitiesValue1, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_amenitiesValue1.click();

        elm_amenitiesValue2 = seleniumHelper.waitForElement(attributes.Units.amenitiesValue2, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_amenitiesValue2.click();

        elm_amenitiesValue3 = seleniumHelper.waitForElement(attributes.Units.amenitiesValue3, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_amenitiesValue3.click();

        elm_outer = seleniumHelper.waitForElement(attributes.Units.outer, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_outer.click();

        elm_rvCamperMaxLength = seleniumHelper.waitForElement(attributes.Units.rvCamperMaxLength, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_rvCamperMaxLength, globalProperties.getValueFromInputData("Units", "RV/CamperMaxLength"));

        elm_comments = seleniumHelper.waitForElement(attributes.Units.comments, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_comments, globalProperties.getValueFromInputData("Units","Comments"));

        elm_handicapAccessible = seleniumHelper.waitForElement(attributes.Units.handicapAccessible, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_handicapAccessible.click();

        elm_mustBe55 = seleniumHelper.waitForElement(attributes.Units.mustBe55, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_mustBe55.click();

        elm_petsAllowed = seleniumHelper.waitForElement(attributes.Units.petsAllowed, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_petsAllowed.click();

        elm_datePurchased = seleniumHelper.waitForElement(attributes.Units.datePurchased, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_datePurchased, globalProperties.getValueFromInputData("Units","DatePurchased"));

        elm_purchasePrice = seleniumHelper.waitForElement(attributes.Units.purchasePrice, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_purchasePrice, globalProperties.getValueFromInputData("Units","PurchasePrice"));

        elm_downPayment = seleniumHelper.waitForElement(attributes.Units.downPayment, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_downPayment, globalProperties.getValueFromInputData("Units","DownPayment"));

        elm_financingTerms = seleniumHelper.waitForElement(attributes.Units.financingTerms, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_financingTerms, globalProperties.getValueFromInputData("Units","FinancingTerms"));

        elm_financingRate = seleniumHelper.waitForElement(attributes.Units.financingRate, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_financingRate, globalProperties.getValueFromInputData("Units","Rate"));

        elm_currentValue = seleniumHelper.waitForElement(attributes.Units.currentValue, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_currentValue, globalProperties.getValueFromInputData("Units","CurrentValue"));

        elm_mortgageBalance = seleniumHelper.waitForElement(attributes.Units.mortgageBalance, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_mortgageBalance, globalProperties.getValueFromInputData("Units","MortgageBalance"));

        elm_contractStart = seleniumHelper.waitForElement(attributes.Units.contractStart, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_contractStart, globalProperties.getValueFromInputData("Units","ContractStartDate"));

        elm_contractEnd = seleniumHelper.waitForElement(attributes.Units.contractEnd, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_contractEnd, globalProperties.getValueFromInputData("Units","ContractEndDate"));

        elm_subDivision = seleniumHelper.waitForElement(attributes.Units.subDivision, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_subDivision, globalProperties.getValueFromInputData("Units","SubDivision"));

        elm_otherInformation = seleniumHelper.waitForElement(attributes.Units.otherInformation, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_otherInformation.click();

        elm_electricCompany = seleniumHelper.waitForElement(attributes.Units.electricCompany, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_electricCompany, globalProperties.getValueFromInputData("Units","ElectricCompany"));

        elm_cableCompany1 = seleniumHelper.waitForElement(attributes.Units.cableCompany1, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_cableCompany1, globalProperties.getValueFromInputData("Units","CableCompany1"));

        elm_cableCompany2 = seleniumHelper.waitForElement(attributes.Units.cableCompany2, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_cableCompany2, globalProperties.getValueFromInputData("Units","CableCompany2"));

        elm_waterSewage = seleniumHelper.waitForElement(attributes.Units.waterSewage, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_waterSewage, globalProperties.getValueFromInputData("Units","WaterSewage"));

        elm_trashPickup = seleniumHelper.waitForElement(attributes.Units.trashPickup, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_trashPickup, globalProperties.getValueFromInputData("Units","TrashPickup"));

        elm_gasCompany = seleniumHelper.waitForElement(attributes.Units.gasCompany, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_gasCompany, globalProperties.getValueFromInputData("Units","GasCompany"));

        elm_schoolDistrict = seleniumHelper.waitForElement(attributes.Units.schoolDistrict, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_schoolDistrict, globalProperties.getValueFromInputData("Units","SchoolDistrict"));

        elm_elementarySchoolZone = seleniumHelper.waitForElement(attributes.Units.elementarySchoolZone, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_elementarySchoolZone, globalProperties.getValueFromInputData("Units","ElementarySchoolZone"));

        elm_middleSchoolZone = seleniumHelper.waitForElement(attributes.Units.middleSchoolZone, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_middleSchoolZone, globalProperties.getValueFromInputData("Units","MiddleSchoolZone"));

        elm_highSchoolZone = seleniumHelper.waitForElement(attributes.Units.highSchoolZone, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        seleniumHelper.setText(elm_highSchoolZone, globalProperties.getValueFromInputData("Units","HighSchoolZone"));

        elm_save = seleniumHelper.waitForElement(attributes.Units.save, globalProperties.waitType.explicit,
                globalProperties.expectedConditions.presenceOfElementLocated,60,2);
        elm_save.click();
    }
}