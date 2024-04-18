package helper;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.gson.Gson;
import common.commonFunctions;
import common.data;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class globalProperties {

    public static String environment;

    public static ExtentReports extentReports;

    public static ExtentTest etSuite;

    public static ExtentTest etTest, etLog;

    //public static final String url = globalProperties.getValueFromInputData("URL", "loginUrl");

    public static HashMap<String, String> getInputJsonValue() {
        return inputJsonValue;
    }

    public static void setInputJsonValue(HashMap<String, String> inputJsonValue) {
        globalProperties.inputJsonValue = inputJsonValue;
    }

    public static HashMap<String, String> inputJsonValue;

    @SuppressWarnings("unchecked")
    private static void getInputJsonData() {

        try {
            if (globalProperties.inputJsonValue == null) {

                JSONParser parser = new JSONParser();

                commonFunctions.getEnvironment();
                FileReader file = new FileReader(data.Common.inputDataPath+"data_"+globalProperties.environment+".json");

                JSONObject jsonObject = (JSONObject) parser.parse(file);

                globalProperties.inputJsonValue = new Gson().fromJson(jsonObject.toString(), HashMap.class);
            }
        } catch (Exception ex) {
            globalProperties.etLog.log(Status.FAIL, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T getValueFromInputData(String... keys) {

        Object value = null;
        try {
            getInputJsonData();

            value = globalProperties.inputJsonValue;
            for (String key : keys) {
                value = ((Map<?, ?>) value).get(key);
            }
        } catch (Exception ex) {
            globalProperties.etLog.log(Status.FAIL, ex.getMessage());
        }
        return (T) value;
    }

    public enum waitType {
        fluent, explicit,
    }

    public enum logStatus {
        pass, fail,info,skip,warning,
    }

    public enum expectedConditions {
        elementToBeClickable, presenceOfElementLocated,
    }

    public static WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver _driver) {
        globalProperties.driver = _driver;
    }

    public ExtentTest getExtentTest() {
        return etSuite;
    }

    public void setExtentTest(ExtentTest _extentTest) {
        globalProperties.etSuite = _extentTest;
    }

}
