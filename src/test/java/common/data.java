package common;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;

import helper.dataInputProvider;

public class data {

    public static class Common {

        public static final String testDataPath = System.getProperty("user.dir")
                + "/src/test/resources/data/TestData.xlsx";

        public static final String defaultEnv ="QA";
        public static final String imageFile = System.getProperty("user.dir") + "/src/test/resources/data/logo.png";
        public static final String fileUpload = "/home/icanio/Documents/Icanio Unified And Admin Portal/unified-automation-test/unified-automation-test/src/test/resources/data/pdf/sample.pdf";
        public static final String inputDataPath = System.getProperty("user.dir")
                + "/src/test/resources/data/";
        public static final String fillTheReqField = "Please fill the required field";
        public static final String fieldDescription = "Please fill the required field message appeared";
        public static final String successMessage = "A popup Message Box Shown Updated Successfully";
        public static final String failureMessage = "Please fill the required field [Popup Detected]";
        public static final String sheet_Name = "Sheet1";
        public static final String sparkReportPath =  System.getProperty("user.dir") + "/test-output/SparkReport/PropertyZar.html";
        public static final String extentConfig =  System.getProperty("user.dir") + "/src/test/resources/extent-config.xml";
        public static final String browser = "Chrome";

    }

    @DataProvider(name = "LoginData")
    public static Object[][] getData() throws IOException {

        dataInputProvider excelDataDrivenFramework = new dataInputProvider(data.Common.testDataPath);

        int totalrows = excelDataDrivenFramework.getRowCount(data.Common.sheet_Name);
        int totalcols = excelDataDrivenFramework.getCellCount(data.Common.sheet_Name, 1);

        String[][] loginData = new String[totalrows][totalcols];

        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                loginData[i - 1][j] = excelDataDrivenFramework.getCellData(data.Common.sheet_Name, i, j);
            }

        }
        return loginData;
    }
}
