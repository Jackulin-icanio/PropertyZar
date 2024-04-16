package utils.listeners;

import java.awt.Desktop;
//import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import helper.globalProperties;
import utils.logs.Log;

public class TestListener  implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Log.info("I am in onStart method " + iTestContext.getName());
        iTestContext.setAttribute("Unified and admin portal", "Automation testing");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Log.info("I am in onFinish method " + iTestContext.getName());
        // Do tier down operations for ExtentReports reporting!
        globalProperties.extentReports.flush();
		/*try {
			Desktop.getDesktop().browse(new File("ExtentSparkReport.html").toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " test is starting.");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " test is succeed.");
        // ExtentReports log operation for passed tests.
        // getTest().log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " test is failed.");

        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            try {
                globalProperties.etTest.log(Status.FAIL,
                        "Test case is failed at below location " + iTestResult.getThrowable(),
                        MediaEntityBuilder.createScreenCaptureFromPath(capture(globalProperties.driver)).build());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public String getBase64(WebDriver driver) {
        return ((TakesScreenshot) globalProperties.driver).getScreenshotAs(OutputType.BASE64);
    }

    public static String capture(WebDriver driver) throws IOException {

		/*File scrFile = ((TakesScreenshot) globalProperties.driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File( "./test-output/SparkReport/Screenshots/FailureScreenshots_" + System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
*/
        Date d = new Date();
        String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";

        // relative path for storing screenshot
        String filePath = "./Screenshots/" + screenshotFile;
        //Store screenshots in that file

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(".//test-output//SparkReport//" + "Screenshots//" + screenshotFile));
        } catch (IOException e) {
            e.printStackTrace();

        }
        return filePath;
    }


    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " test is skipped.");
        // ExtentReports log operation for skipped tests.
        globalProperties.etLog.log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Log.info("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
}
