package common;

import com.aventstack.extentreports.Status;
import com.google.common.base.Strings;
import helper.globalProperties;
import helper.globalProperties.expectedConditions;
import helper.globalProperties.waitType;
import helper.seleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class commonFunctions {
    public WebDriver driver;

//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.save)
//    private WebElement elm_save;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.onBoarding)
//    private WebElement elm_onBoarding;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.basicContinue)
//    private WebElement elm_continue;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.cancel)
//    private WebElement elm_cancel;
//
//    @FindBy(how = How.XPATH, using = attributes.Onboarding.workExperience)
//    private WebElement elm_workExperience;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.school)
//    private WebElement elm_school;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.startDate)
//    private WebElement elm_startDate;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.endDate)
//    private WebElement elm_endDate;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.cgpa)
//    private WebElement elm_cgpa;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.collegeName)
//    private WebElement elm_collegeName;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.universityName)
//    private WebElement elm_universityName;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.diplomaType)
//    private WebElement elm_diplomaType;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.degreeType)
//    private WebElement elm_degreeType;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.fieldOfStudy)
//    private WebElement elm_fieldOfStudy;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.addSemester)
//    private WebElement elm_addSemester;
//
//    @FindBy(how = How.XPATH, using = attributes.Common.fillTheFieldMessage)
//    private WebElement elm_errorMessage;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.endDate1)
//    private WebElement elm_endDate1;
//
//    @FindBy(how = How.XPATH, using = attributes.CommonFunctions.gradeScale)
//    private WebElement elm_gradeScale;
//
//    @FindBy(how = How.XPATH, using = attributes.Onboarding.personalInfo)
//    private WebElement elm_personalInformation;
//
//    @FindBy(how = How.XPATH, using = attributes.Onboarding.academicInfo)
//    private WebElement elm_academicInformation;
//
//    @FindBy(how = How.XPATH, using = attributes.Onboarding.aspirationalDetails)
//    private WebElement elm_aspirationalDetails;
//
//    @FindBy(how = How.XPATH, using = attributes.Onboarding.graduateAdmissionTest)
//    private WebElement elm_graduateAdmissionTest;
//
//    @FindBy(how = How.XPATH, using = attributes.Onboarding.testsAndSurvey)
//    private WebElement elm_testsAndSurvey;
//
//    @FindBy(how = How.XPATH, using = attributes.Onboarding.uploadCv)
//    private WebElement elm_uploadCv;
//
//    @FindBy(how = How.XPATH, using = attributes.Common.unifiedSpinner)
//    private WebElement elm_unifiedSpinner;
//
//    @FindBy(how = How.XPATH, using = attributes.ProfileGapAnalysis.profileGapAnalysis)
//    private WebElement elm_profileGapAnalysis;
//
//    @FindBy(how = How.XPATH, using = attributes.WorkExperience.addRole)
//    private WebElement elm_addRole;
//
//    public commonFunctions(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//
//    public void clickProfileGapAnalysis() {
//
//        elm_profileGapAnalysis = seleniumHelper.waitForElement(attributes.ProfileGapAnalysis.profileGapAnalysis,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.clickElement(elm_profileGapAnalysis, "Profile Gap Analysis",true);
//
//    }
//
//    public void clickOnBoarding() {
//
//        elm_onBoarding = seleniumHelper.waitForElement(attributes.CommonFunctions.onBoarding,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.clickElement(elm_onBoarding, "Onboarding");
//
//    }
//
//    public void clickSave() {
//
//        elm_save = seleniumHelper.waitForElement(attributes.CommonFunctions.save,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.clickElement(elm_save, "Save");
//        seleniumHelper.WaitForPageToLoad(60);
//
//    }
//
//    public WebElement clickContinue() {
//        return elm_continue;
//    }
//
//    public WebElement clickCancel() {
//        return elm_cancel;
//    }
//
//    public void setSchool() {
//
//        elm_school = seleniumHelper.waitForElement(attributes.CommonFunctions.school,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.setText(elm_school, globalProperties.getValueFromInputData("Tenth", "sSlcschool"));
//
//    }
//
//    public void setCgpa() {
//
//        elm_cgpa = seleniumHelper.waitForElement(attributes.CommonFunctions.cgpa,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.setText(elm_cgpa, globalProperties.getValueFromInputData("Marks", "cgpa"));
//
//    }
//
//    public void setPostGradCgpa() {
//
//        elm_cgpa = seleniumHelper.waitForElement(attributes.CommonFunctions.cgpa,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.setText(elm_cgpa, globalProperties.getValueFromInputData("Marks", "cgpa"));
//
//    }
//
//    public void selectUnderGradCollege() {
//
//        elm_collegeName = seleniumHelper.waitForElement(attributes.CommonFunctions.collegeName,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_collegeName, "College Combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.UnderGraduate.college,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "College Name");
//
//    }
//
//    public void selectUniversity() {
//        elm_universityName = seleniumHelper.waitForElement(attributes.CommonFunctions.universityName,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_universityName, "University Combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.Diploma.university,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "University Name");
//
//    }
//
//    public void selectDiploma() {
//
//        elm_diplomaType = seleniumHelper.waitForElement(attributes.CommonFunctions.diplomaType,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_diplomaType, "Diploma Combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.Diploma.diploma,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Diploma Type");
//
//    }
//
//    public void selectFieldOfStudy() {
//
//        elm_fieldOfStudy = seleniumHelper.waitForElement(attributes.CommonFunctions.fieldOfStudy,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_fieldOfStudy, "Field of study combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.Diploma.fieldOfStudy,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Field of study name");
//
//    }
//
//    public void clickAddSemester() {
//
//        elm_addSemester = seleniumHelper.waitForElement(attributes.CommonFunctions.addSemester,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_addSemester, "Add semester");
//
//    }
//
//    public void selectGradeScale() {
//
//        elm_gradeScale = seleniumHelper.waitForElement(attributes.CommonFunctions.gradeScale,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_gradeScale, "Cgpa combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.Diploma.gradeScale,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Cgpa score");
//
//    }
//
//    public void setStartDate() {
//
//        elm_startDate = seleniumHelper.waitForElement(attributes.CommonFunctions.startDate,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.setText(elm_startDate, globalProperties.getValueFromInputData("Diploma", "diplomaStartDate"));
//    }
//
//    public void setExpStartDate() {
//
//        elm_startDate = seleniumHelper.waitForElement(attributes.CommonFunctions.startDate,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.setText(elm_startDate, globalProperties.getValueFromInputData("Company", "workStartDate"));
//    }
//
//    public void setExpEndDate() {
//
//        elm_endDate = seleniumHelper.waitForElement(attributes.CommonFunctions.endDate,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.setText(elm_endDate, globalProperties.getValueFromInputData("Company", "workEndDate"));
//    }
//
//    public void setEndDate() {
//        elm_endDate = seleniumHelper.waitForElement(attributes.CommonFunctions.endDate,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.setText(elm_endDate, globalProperties.getValueFromInputData("Diploma", "diplomaEndDate"));
//    }
//
//    public void setPostGradStartDate() {
//        elm_startDate = seleniumHelper.waitForElement(attributes.CommonFunctions.startDate,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.setText(elm_startDate,
//                globalProperties.getValueFromInputData("Postgraduate", "postGradStartDate"));
//    }
//
//    public void setPostGradEndDate() {
//        elm_endDate = seleniumHelper.waitForElement(attributes.CommonFunctions.endDate,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.setText(elm_endDate, globalProperties.getValueFromInputData("Postgraduate", "postGradEndDate"));
//    }
//
//    public void setUnderGradStartDate() {
//        elm_startDate = seleniumHelper.waitForElement(attributes.CommonFunctions.startDate,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.setText(elm_startDate,
//                globalProperties.getValueFromInputData("Undergraduate", "underGradstartDate"));
//    }
//
//    public void setUnderGradEndDate() {
//        elm_endDate = seleniumHelper.waitForElement(attributes.CommonFunctions.endDate,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.setText(elm_endDate,
//                globalProperties.getValueFromInputData("Undergraduate", "underGradEndDate"));
//    }
//
//    public void selectPostGradCollegeDegree() {
//
//        elm_degreeType = seleniumHelper.waitForElement(attributes.CommonFunctions.degreeType,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.clickElement(elm_degreeType, "Degree Combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.PostGraduate.degree,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Degree Type");
//
//    }
//
//    public void selectPostGradCollege() {
//
//        elm_collegeName = seleniumHelper.waitForElement(attributes.CommonFunctions.collegeName,
//                globalProperties.waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_collegeName, "College Combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.PostGraduate.college,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(elm_collegeName, "College Name");
//
//    }
//
//    public void selectPostGradUniversity() {
//
//        elm_universityName = seleniumHelper.waitForElement(attributes.CommonFunctions.universityName,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_universityName, "University combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.PostGraduate.university,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "University name");
//
//    }
//
//    public void selectPostGradFieldOfStudy() {
//
//        elm_fieldOfStudy = seleniumHelper.waitForElement(attributes.CommonFunctions.fieldOfStudy,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_fieldOfStudy, "Field of study combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.PostGraduate.course,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Field of study name");
//
//    }
//
//    public void selectPostGradGradeScale() {
//
//        elm_gradeScale = seleniumHelper.waitForElement(attributes.CommonFunctions.gradeScale,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_gradeScale, "Grade scale combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.PostGraduate.gradeScale,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Grade scale score");
//
//    }
//
//    public void verifyMandatoryField() {
//        WebElement element;
//        element = null;
//
//        try {
//            try {
//                element = seleniumHelper.waitForElement(attributes.Common.fillTheFieldMessage,
//                        waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//            } catch (Exception e) {
//                globalProperties.etLog.log(Status.FAIL, e.getMessage());
//            }
//            Assert.assertNotNull(element, "Please fill the required field is not displayed");
//
//        } catch (Exception ex) {
//            globalProperties.etLog.log(Status.FAIL, ex.getMessage());
//        }
//    }
//
//    public void selectDiplomaCollege() {
//
//        elm_collegeName = seleniumHelper.waitForElement(attributes.CommonFunctions.collegeName,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_collegeName, "College Combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.Diploma.college,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(elm_collegeName, "College Name");
//
//    }
//
//    public void selectUnderGradUniversity() {
//
//        elm_universityName = seleniumHelper.waitForElement(attributes.CommonFunctions.universityName,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_universityName, "University combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.UnderGraduate.university,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "University name");
//
//    }
//
//    public void selectUnderGradFieldOfStudy() {
//
//        elm_fieldOfStudy = seleniumHelper.waitForElement(attributes.CommonFunctions.fieldOfStudy,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_fieldOfStudy, "Field of study combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.UnderGraduate.fieldOfStudy,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Field of study name");
//    }
//
//    public void selectUnderGradGradeScale() {
//
//        elm_gradeScale = seleniumHelper.waitForElement(attributes.CommonFunctions.gradeScale,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_gradeScale, "Grade scale combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.UnderGraduate.gradeScale,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Grade scale score");
//    }
//
//    public void setUnderGradCgpa() {
//        elm_cgpa = seleniumHelper.waitForElement(attributes.CommonFunctions.cgpa,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.setText(elm_cgpa, globalProperties.getValueFromInputData("Marks", "cgpa"));
//    }
//
//    public void selectUnderGradCollegeDegree() {
//
//        elm_degreeType = seleniumHelper.waitForElement(attributes.CommonFunctions.degreeType,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//
//        seleniumHelper.clickElement(elm_degreeType, "Degree combo");
//
//        WebElement element = seleniumHelper.waitForElement(attributes.UnderGraduate.degree,
//                waitType.explicit, expectedConditions.elementToBeClickable, 60, 2);
//        seleniumHelper.clickElement(element, "Degree Type");
//
//    }
//
//
//    public void clickPersonalInformation() {
//
//        elm_personalInformation = seleniumHelper.waitForElement(attributes.Onboarding.personalInfo,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_personalInformation, "Personal Information", true);
//        seleniumHelper.WaitForPageToLoad(60);
//
//    }
//
//    public void clickAcademicInformation() {
//        seleniumHelper.waitForSpinnerToDisappear(elm_unifiedSpinner, 60);
//        seleniumHelper.WaitForPageToLoad(60);
//        elm_academicInformation = seleniumHelper.waitForElement(attributes.Onboarding.academicInfo,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_academicInformation, "Academic Information", true);
//        seleniumHelper.WaitForPageToLoad(60);
//
//    }
//
//    public void clickWorkExperience() {
//
//        elm_workExperience = seleniumHelper.waitForElement(attributes.Onboarding.workExperience,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_workExperience, "Work Experience", true);
//        seleniumHelper.WaitForPageToLoad(60);
//
//
//    }
//
//    public void clickAspirationalDetails() {
//
//        elm_aspirationalDetails = seleniumHelper.waitForElement(attributes.Onboarding.aspirationalDetails,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_aspirationalDetails, "Aspirational Details");
//        seleniumHelper.waitForSpinnerToDisappear(elm_unifiedSpinner, 60);
//        seleniumHelper.WaitForPageToLoad(60);
//
//    }
//
//    public void clickGraduateAdmissionTest() {
//
//        elm_graduateAdmissionTest = seleniumHelper.waitForElement(attributes.Onboarding.graduateAdmissionTest,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_graduateAdmissionTest, "Graduate Admission Test", true);
//        seleniumHelper.WaitForPageToLoad(60);
//
//
//    }
//
//    public void clickTestsAndSurvey() {
//
//        elm_testsAndSurvey = seleniumHelper.waitForElement(attributes.Onboarding.testsAndSurvey,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_testsAndSurvey, "Tests and survey");
//        seleniumHelper.WaitForPageToLoad(60);
//
//
//    }
//
//    public void clickUploadCv() {
//
//        elm_uploadCv = seleniumHelper.waitForElement(attributes.Onboarding.uploadCv,
//                waitType.explicit, expectedConditions.presenceOfElementLocated, 60, 2);
//        seleniumHelper.clickElement(elm_uploadCv, "Upload CV", true);
//        seleniumHelper.WaitForPageToLoad(60);
//
//    }


//    public void clearAll() {
//
//        seleniumHelper.clearExistingText(elm_collegeName);
//        seleniumHelper.clearExistingText(elm_universityName);
//        //  seleniumHelper.clearExistingText(elm_fieldOfStudy);
//        seleniumHelper.clearExistingText(elm_diplomaType);
//        seleniumHelper.clearExistingText(elm_gradeScale);
//
//    }
//
//    public void clearAllFields() {
//
//        seleniumHelper.clearExistingText(elm_collegeName);
//        seleniumHelper.clearExistingText(elm_universityName);
//        seleniumHelper.clearExistingText(elm_degreeType);
//        seleniumHelper.clearExistingText(elm_fieldOfStudy);
//        seleniumHelper.clearExistingText(elm_gradeScale);
//
//    }
//
//    public void clearDiplomaType() {
//        seleniumHelper.clearExistingText(elm_diplomaType);
//
//    }
//
//    public void clearUnderGradDegreeType() {
//        seleniumHelper.clearExistingText(elm_degreeType);
//
//    }
//
//    public void clearPostGradDegreeType() {
//        seleniumHelper.clearExistingText(elm_degreeType);
//
//    }
//
//    public void validateWorkExperience() {
//
//        elm_addRole = seleniumHelper.waitForElement(attributes.WorkExperience.addRole, waitType.fluent,
//                expectedConditions.presenceOfElementLocated, 60, 10);
//
//        String addRole = elm_addRole.getText();
//
//        if (addRole != null) {
//           seleniumHelper.clickElement(elm_cancel, "Cancel");
//            Assert.fail("Work experience test got failed");
//            globalProperties.etLog.log(Status.FAIL, "Work Experience got failed");
//
//        }
//        else {
//            globalProperties.etLog.log(Status.PASS, "Work Experience got success");
//        }
//    }

    public static void getEnvironment()
    {
        globalProperties.environment = System.getProperty("environment");
        if( Strings.isNullOrEmpty(globalProperties.environment ))
            globalProperties.environment = data.Common.defaultEnv;
    }


}
