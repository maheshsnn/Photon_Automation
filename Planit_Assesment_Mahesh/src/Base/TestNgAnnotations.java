package Base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Propertiesfile;

public class TestNgAnnotations {

	public static ExtentReports reports;
	public static ExtentTest logger;
	static Propertiesfile pro;

	@BeforeSuite
	public void setup() throws Exception {
		
		new SimpleDateFormat("ddMMyyyyHHmmss");
		new Date();

		pro = new Propertiesfile();
		String path = System.getProperty("user.dir") + System.getProperty("file.separator") + pro.ExtentPath();
		System.out.println("report path : " + path);
		reports = new ExtentReports(path);
		
		System.out.println("Before Suite Executed");
	}

	/**
	 * 
	 */
	@AfterSuite
	public void tearup() {

		reports.flush();
		System.out.println("After suite executed");
	}

}
