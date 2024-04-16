package utils.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import helper.globalProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * extentTestMap holds the information of thread ids and ExtentTest instances.
 * ExtentReports instance created by calling createExtentReports() method from
 * ExtentManager. At startTest() method, an instance of ExtentTest created and
 * put into extentTestMap with current thread id. At getTest() method, return
 * ExtentTest instance in extentTestMap by using current thread id.
 */
public class ExtentTestManager {
	static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
	static ExtentReports extent = ExtentManager.createExtentReports();

	public static synchronized ExtentTest getTest() {
		ExtentTest extentTest =  extentTestMap.get((int) Thread.currentThread().getId());
		if(extentTest == null) {
			//extentTest = globalProperties.extentTest;
			extentTest = ExtentTestManager.startTest(" ", " ");
		}
        return extentTest;	
	}

	public static synchronized ExtentTest startTest(String testName, String desc) {
		ExtentTest extentTest = extent.createTest(testName, desc);
		globalProperties.etSuite = extentTest;

		extentTestMap.put((int) Thread.currentThread().getId(), extentTest);
		return extentTest;
	}
}