package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.ManageBrowser;
import Base.TestNgAnnotations;
import PageObjects.Login;
import PageObjects.Payment_Page;
import PageObjects.Shopping_Books;
import PageObjects.Shoppingcart_;
import Utility.CommonMethods;

public class Demo_Web_Shop extends TestNgAnnotations {
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
		logger = reports.startTest("WebShop_Demo");
		Login.Loginto(driver);
		Shoppingcart_.Shoppingcart(driver);
		Shopping_Books.Shop_Books(driver);
		Payment_Page.payment(driver);
		Payment_Page.shipping(driver);
		System.out.println("Ended CS_CCM_Login");
		logger.log(LogStatus.PASS, "Completed CS_CCM_Login");
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

	}

}
