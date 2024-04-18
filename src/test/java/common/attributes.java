package common;

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
}
