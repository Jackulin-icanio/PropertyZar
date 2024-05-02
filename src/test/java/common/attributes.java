package common;


import java.io.BufferedReader;
import java.io.FileReader;

import static common.commonFunctions.readValueFromFile;

public class attributes {

    public static class UserInfromation {
        public static final String firstName = "//input[@id='firstName']";
        public static final String lastName = "//input[@id='lastName']";
        public static final String email = "//input[@id='emailId']";
        public static final String verify = "//button[@type='button' and contains(@class, 'MuiButton-outlined') and contains(@class, 'MuiButton-colorPrimary')]\n";

    }

    public static class YopMail {
        public static final String userName = "//input[@placeholder='Enter your inbox here']";
        public static final String button = "//button[@title='Check Inbox @yopmail.com']";
        public static final String switchframe = "//*[@id='ifmail']";
        public static final String OTP = "//input[@id='otpCode']";
        public static final String refresh = "//button[@id='refresh']";
        public static final String password = "//input[@id='password']";
        public static final String confirmPassword = "//input[@id='confirmPassword']";
        public static final String Captcha = "//*[contains(text(), 'not a robot')]";
        public static final String switchframerE = "//iframe[@title='reCAPTCHA']";
        public static final String nextButton = "//button[text()='Next Step']";
    }

    public static class CustomerInformation {
        public static final String companyName = "//input[@id='companyName']";
        public static final String role = "//input[@id='role']";
        public static final String roleData = "//li[contains(text(),'Owner')]";
        public static final String propertyType = "//input[@id='propertyManagement']";
        public static final String propertyTypeData = "//li[contains(text(),'Residential')]";
        public static final String units = "//input[@id='noOfUnits']";
        public static final String howHear = "//input[@id='howHear']";
        public static final String howHearData = "//li[contains(text(),'Podcast - FourandHalf')]";
        public static final String nextStep = "//*[@type='submit']";
        public static final String planNextStep = "/html/body/div[1]/div[2]/div/div/div[3]/div/button[2]";
        public static final String miniIcon = "//button[@id='miniLogo' and @type='button']";
        public static final String fullLogo = "//button[@id='fullLogo' and @type='button']";
        public static final String preview = "//button[contains(text(), 'Preview')]";
        public static final String closePreview = "//div[@data-testid='Dashboard']";
        public static final String privacyPolicy = "//span[contains(@class, 'MuiButtonBase-root')]";
        public static final String Register = "//button[@data-testid='saveBtn']";
    }

    public static class Login {
        public static final String emailID = "//input[@id='emailId']";
        public static final String password = "//input[@id='password']";
        public static final String hideIcon = "//button[@aria-label='toggle password visibility']";
        public static final String keepmeSign = "//input[@name='keepSignInChecked']";
        public static final String loginbtn = "//button[text()='Login']";
        public static final String otp = "//input[@name='otp']";
        public static final String submit = "//button[text()='Submit']";
    }
    public static class Owner{
        public static final String ownerTab = "//span[text()='Owners']";
        public static final String newOwner = "//button[text()='New Owner']";
        public static final String firstName = "//input[@id='firstName']";
        public static final String lastName = "//input[@id='lastName']";
        public static final String primaryEmail = "//input[@id='email']";
        public static final String alternateEmail = "//input[@id='alternativeEmail']";
        public static final String homePhone = "//input[@id='home-phone']";
        public static final String mobilePhone = "//input[@id='mobilePhone']";
        public static final String fax = "//input[@id='fax']";
        public static final String workPhone = "//input[@id='workPhone']";
        public static final String extension = "//input[@id='extension']";
        public static final String address1 = "//input[@id='addressLineOne']";
        public static final String address2 = "//input[@id='addressLineTwo']";
        public static final String county = "//input[@id='county']";
        public static final String comments = "//input[@id='comments']";
        public static final String city = "//input[@id='city']";
        public static final String state = "//input[@id ='state']";
        public static final String stateValue = "//li[contains(text(),'California')]";
        public static final String zip = "//input[@id='zip']";
        public static final String displayName = "//input[@id='displayName']";
        public static final String businessType = "//input[@id='businessType']";
        public static final String businessTypeValue = "//li[contains(text(),'LLC')]";
        public static final String agreementStart = "//input[@id='agreementStart']";
        public static final String agreementEnd = "//input[@id='agreementEnd']";
        public static final String taxPayerId = "//input[@id='taxPayerId']";
        public static final String ownerPortalAccess = "//input[@id='ownerPortalAccess']";
        public static final String canAccessApp = "//input[@id='canAccessApp']";
        public static final String save = "//button[text()='Save']";
        public static final String popup = "//button[text()='No']";
    }
    public static class HOA{
        public static final String hoaTab = "//span[text()='Properties']";
        public static final String newHOA = "//button[text()='New HOA']";
        public static final String hoaName = "//input[@id='hoaName']";
        public static final String address1 = "//input[@id='addressLine1']";
        public static final String address2 = "//input[@id='addressLine2']";
        public static final String city = "//input[@id='city']";
        public static final String state = "//input[@id ='state']";
        public static final String stateValue = "//li[contains(text(),'California')]";
        public static final String zip = "//input[@id='zipCode']";
        public static final String countyName = "//input[@id='countyName']";
        public static final String member = "//input[@id='members[0]']";
        public static final String value = commonFunctions.readValueFromFile("Ownername.txt");
        public static final String memberType = "//input[@id='memberType[0]']";
        public static final String memberTypeValue = "//li[contains(text(),'Treasurer')]";
        public static final String Save = "//button[text()='Save']";
    }
    public static class Properties{
        public static final String propertiesTab = "//div[@class='MuiListItemText-root mui-kswsf4']/span[text()='Properties']";
        public static final String newProperty = "//button[text()='New Property']";
        public static final String propertyName = "//input[@id='propertyName']";
        public static final String propertyType = "//input[@id='propertyType']";
        public static final String hoa = "//input[@id='hoaId']";
        public static final String HOAvalue = commonFunctions.readValueFromFile("HOAname.txt");
        public static final String propertyTypeValue = "//li[contains(text(),'Commercial')]";
        public static final String propertyStatus = "//input[@id='propertyStatus']";
        public static final String propertyStatusValue = "//li[contains(text(),'For Rent')]";
        public static final String marketRent = "//input[@id='marketRent']";
        public static final String deposit = "//input[@id='deposit']";
        public static final String availableOn = "//input[@id='availableOn']";
        public static final String salePrice = "//input[@id='salePrice']";
        public static final String leaseTerms = "//input[@id='leaseTerms']";
        public static final String leaseTermsValue = "//li[contains(text(),'Monthly')]";
        public static final String notes = "//input[@id='notes']";
        public static final String owners = "//input[@id='owners']";
        public static final String ownervalue = commonFunctions.readValueFromFile("Ownername.txt");
        public static final String comments = "//input[@id='comments']";
        public static final String address1 = "//input[@id='addressLine1']";
        public static final String address2 = "//input[@id='addressLine2']";
        public static final String city = "//input[@id='city']";
        public static final String state = "//input[@id ='state']";
        public static final String stateValue = "//li[contains(text(),'California')]";
        public static final String zip = "//input[@id='zipCode']";
        public static final String countyName = "//input[@id='countyName']";
        public static final String saveOwner = "//div[@class='mui-1rq54oh']/button[text()='Save']";
        public static final String Save = "//button[text()='Save']";
    }
    public static class Buildings {
        public static final String buildingsTab = "//span[text()='Buildings']";
        public static final String newBuilding = "//button[text()='New Building']";
        public static final String buildingName = "//input[@id='buildingName']";
        public static final String buildingType = "//input[@id='buildingType']";
        public static final String buildingTypeValue = "//li[contains(text(),'Commercial')]";
        public static final String propertyType = "//input[@id='propertyType']";
        public static final String propertyTypeValue = commonFunctions.readValueFromFile("PropertyName.txt");
        public static final String buildingStatus = "//input[@id='buildingStatus']";
        public static final String buildingStatusValue = "//li[contains(text(),'For Rent')]";
        public static final String marketRent = "//input[@id='marketRent']";
        public static final String deposit = "//input[@id='deposit']";
        public static final String availableOn = "//input[@name='availableOn']";
        public static final String description = "//textarea[@name='listingDescription']";
        public static final String salePrice = "//input[@name='salePrice']";
        public static final String leaseTerms = "//input[@name='leaseTerms']";
        public static final String leaseTermsValue = "//li[contains(text(),'6 Month')]";
        public static final String petsAllowed = "//input[@name='petsAllowed']";
        public static final String mustBe55 = "//input[@name='mustBe55']";
        public static final String handicapAccessible = "//input[@name='handicapAccessible']";
        public static final String comments = "//input[@name='comments']";
        public static final String managerName = "//input[@id='managerName']";
        public static final String managerPhone = "//input[@id='managerPhone']";
        public static final String purchaseDate = "//input[@id='purchaseDate']";
        public static final String purchasePrice = "//input[@id='purchasePrice']";
        public static final String downPayment = "//input[@id='downPayment']";
        public static final String owner = "//input[@name='owners']";
        public static final String ownervalue = commonFunctions.readValueFromFile("Ownername.txt");
        public static final String saveOwner = "//div[@class='mui-1rq54oh']/button[text()='Save']";
        public static final String Save = "//button[text()='Save']";
    }
    public static class Units {
        public static final String propertiesTab = "//span[text()='Properties']";
        public static final String unitsTab = "//button[text()='Units']";
        public static final String newUnit = "//button[text()='New Unit']";
        public static final String unitName = "//input[@name='unitName']";
        public static final String propertyName = "//input[@name='propertyName']";
        public static final String propertyNameValue = commonFunctions.readValueFromFile("PropertyName.txt");
        public static final String buildingName = "//input[@name='buildingName']";
        public static final String buildingNameValue = commonFunctions.readValueFromFile("BuildingName.txt");
        public static final String marketRent = "//input[@name='marketRent']";
        public static final String deposit = "//input[@name='deposit']";
        public static final String availableOn = "//input[@name='availableOn']";
        public static final String salePrice = "//input[@name='salePrice']";
        public static final String leaseTerms = "//input[@name='leaseTerms']";
        public static final String leaseTermsValue = "//li[contains(text(),'3 Month')]";
        public static final String description = "//textarea[@name='listingDescription']";
        public static final String owner = "//input[@name='owners']";
        public static final String ownervalue = commonFunctions.readValueFromFile("Ownername.txt");
        public static final String saveOwner = "//div[@class='mui-1rq54oh']/button[text()='Save']";
        public static final String squareFoot = "//input[@name='squareFoot']";
        public static final String units = "//input[@name='units']";
        public static final String lockBoxCode = "//input[@name='lockBoxCode']";
        public static final String yearBuilt = "//input[@name='yearBuilt']";
        public static final String bedRooms = "//input[@name='bedRooms']";
        public static final String bathRooms = "//input[@name='bathRooms']";
        public static final String lotSize = "//input[@name='lotSize']";
        public static final String unitStatus = "//input[@placeholder='Select Unit Status']";
        public static final String unitStatusValue = "//li[contains(text(),'For Sale')]";
        public static final String unitType = "//input[@placeholder='Select UnitType']";
        public static final String unitTypeValue = "//li[contains(text(),'Residential')]";
        public static final String unitSubType = "//input[@placeholder='Select Unit SubType']";
        public static final String unitSubTypeValue = "//li[contains(text(),'Apartment')]";
        public static final String unitStyle = "//input[@placeholder='Select Unit Style']";
        public static final String unitStyleValue = "//li[contains(text(),'Single Family')]";
        public static final String parking = "//input[@placeholder='Parking']";
        public static final String parkingValue = "//li[contains(text(),'Double Carport')]";
        public static final String heating = "//input[@placeholder='Select Heating']";
        public static final String heatingValue = "//li[contains(text(),'Oil')]";
        public static final String airConditioning = "//input[@placeholder='Select Air Conditioning']";
        public static final String airConditioningValue = "//li[contains(text(),'Window Unit')]";
        public static final String flooring = "//input[@placeholder='Select Flooring List']";
        public static final String flooringValue = "//li[contains(text(),'Carpet/Tile')]";
        public static final String parkingSpotNumber = "//input[@name='parkingSpotNumber']";
        public static final String storageNumber = "//input[@name='storageNumber']";
        public static final String amenities = "//input[@placeholder='Select Amenities']";
        public static final String amenitiesValue1 = "//li[contains(text(),'Balcony')]";
        public static final String amenitiesValue2 = "//li[contains(text(),'BBQ Area')]";
        public static final String amenitiesValue3 = "//li[contains(text(),'Cable')]";
        public static final String outer = "//h3[text()='Purchase Information']";
        public static final String rvCamperMaxLength = "//input[@name='rvCamperMaxLength']";
        public static final String comments = "//input[@name='comments']";
        public static final String handicapAccessible = "//span[text()='Handicap Accessible']";
        public static final String mustBe55 = "//span[text()='55+']";
        public static final String petsAllowed = "//span[text()='Pets Allowed']";
        public static final String datePurchased = "//input[@name='dataPurchased']";
        public static final String purchasePrice = "//input[@id='purchasePrice']";
        public static final String downPayment = "//input[@name='downPayment']";
        public static final String financingTerms = "//input[@name='financingTerms']";
        public static final String financingRate = "//input[@name='financingRate']";
        public static final String currentValue = "//input[@name='currentValue']";
        public static final String mortgageBalance = "//input[@name='balance']";
        public static final String contractStart = "//input[@name='contractStart']";
        public static final String contractEnd = "//input[@name='contractEnd']";
        public static final String subDivision = "//input[@name='subDivision']";
        public static final String otherInformation = "//button[text()='Other Information']";
        public static final String electricCompany = "//input[@name='electricCompany']";
        public static final String cableCompany1 = "//input[@name='cableCompany1']";
        public static final String cableCompany2 = "//input[@name='cableCompany2']";
        public static final String waterSewage = "//input[@name='waterSewage']";
        public static final String trashPickup = "//input[@name='trashPickup']";
        public static final String gasCompany = "//input[@name='gasCompany']";
        public static final String schoolDistrict = "//input[@name='schoolDistrict']";
        public static final String elementarySchoolZone = "//input[@name='elementarySchoolZone']";
        public static final String middleSchoolZone = "//input[@name='middleSchoolZone']";
        public static final String highSchoolZone = "//input[@name='highSchoolZone']";
        public static final String save = "//button[@name='Save']";
    }
}