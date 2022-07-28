package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.ManageBrowser;
import Base.TestNgAnnotations;
import PageObjects.AddUser;
import PageObjects.Internet_Task2;
import PageObjects.Login;
import Utility.CommonMethods;

public class Task2  extends TestNgAnnotations{

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "URL" })
	public void setup(String browser, String URL) throws Exception {
	driver = ManageBrowser.browserInstances(browser).getdriver();
	driver.get(URL);
	}

	@Test
	public void WebShop_Demo() throws Exception {
		System.out.println("*************   @Test started");
		logger = reports.startTest("Assessment2");
		Internet_Task2.Task2(driver);
		System.out.println("Ended Task2");
		logger.log(LogStatus.PASS, "Completed Task2");
	}

	@AfterMethod
	public void teardown(ITestResult result) throws Exception {
		CommonMethods.Takescreenshot(driver, result);
		System.out.println("AfterMethod Executed");
	
	}

	@AfterClass
	public void teardown() {
		reports.endTest(logger);
		driver.close();
		driver.close();

	}}