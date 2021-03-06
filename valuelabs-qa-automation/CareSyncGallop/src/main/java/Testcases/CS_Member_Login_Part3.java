

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.ActionKeywords;
import com.base.ManageBrowser;
import com.configurations.GridConfiguration;
import com.pageobjects.Appointments;
import com.pageobjects.LoginPage;
import com.pageobjects.Procedure;
import com.pageobjects.Provider;
import com.pageobjects.Related_Health_Condition;
import com.pageobjects.Related_Measurement;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.CommonMethods;

public class CS_Member_Login_Part3 extends ManageBrowser {
	WebDriver driver;
	ActionKeywords performAction;

	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		System.out.println("*******************");
		GridConfiguration gc = new GridConfiguration();
		driver = gc.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://csdev.caresync.com/login");
	}

	/*
	 * @BeforeMethod
	 * 
	 * @Parameters({"browser"}) public void setUp(String browser) throws
	 * Exception { System.out.println("*******************"); GridConfiguration
	 * gc=new GridConfiguration(); driver=gc.getDriver(browser);
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
	 * driver.get("https://csdev.caresync.com/login"); }
	 */

	@Test(groups = { "Regression", "Smoke" })
	public void MemberLogin_part3() throws Exception {
		logger = reports.startTest("CS_MemberLogin_part3");
		System.out.println("Executing testcase  CS_MemberLogin_part3");
		performAction = new ActionKeywords(driver);

		// Login
		LoginPage login = new LoginPage(driver);
		login.loginpage(pro.HAusernameAlt(), pro.HAPasswordalt());

		// Appointment member login part3
		Appointments appointment = new Appointments(driver);
		appointment.addAppointment_MandatoryFields();

		// Add provider
		Provider add_provider = new Provider(driver);
		add_provider.add_Provider();

		appointment.selectProvider();
		performAction.wait(2000, "Select provider wait");
		performAction.browserScroll(200, "Browser scroll");
		appointment.selectAppointmentType("Office Visit");
		appointment.enterAppointment_Reason();
		performAction.wait(1000, "Enter appointment reason wait");

		// Related helath conditon
		Related_Health_Condition related_Conditon_Health = new Related_Health_Condition(driver);
		related_Conditon_Health.related_condition_Heath();

		appointment.selectHealth_Condition();
		appointment.selectAppointmentType("Procedure");
		performAction.browserScroll(500, "Browser scroll");
		appointment.enterprimary_procedure();
		appointment.enterOutcome_area();
		performAction.browserScroll(300, "Browser scroll");

		// Add procedure
		Procedure add_procedure = new Procedure(driver);
		add_procedure.add_Procedure();
		appointment.selectRelated_Procedure();
		performAction.browserScroll(1000, "Browser scroll");

		// Related measurement
		Related_Measurement related_measurement = new Related_Measurement(driver);
		related_measurement.measurement();
		performAction.wait(5000, "Measurement wait");

		appointment.enterProvider_Notes();
		performAction.browserScroll(1000, "Browser scroll");
		appointment.clickSave_Appointment();
		performAction.wait(2000, "Save wait");
		performAction.browserScroll(-1300, "Browser scroll");
		appointment.clickAppointment_link();
		appointment.clickView_share();
		appointment.clickGenerate_Report();
		appointment.clickAppointment_link();
		performAction.wait(200, "Appointment link wait");
		appointment.clickPast();
		performAction.wait(2000, "click past wait");
		appointment.clickFirst_Past_appoint();
		performAction.browserScroll(1000, "Browser scroll");
		performAction.wait(2000, "click past appoint wait");
		appointment.clickSave_Appointment();
		performAction.browserScroll(-800, "Browser scroll");
		appointment.clickFirst_Past_appoint();
		appointment.selectApp_staus("Completed");
		performAction.browserScroll(1000, "Browser scroll");
		appointment.clickSave_Appointment();
		performAction.browserScroll(-1000, "Browser scroll");
		appointment.clickFirst_Past_appoint();
		appointment.clearApp_startdate();
		appointment.clickApp_startdate();
		performAction.wait(2000, "Save wait");
		CommonMethods.calenderdatepicker(driver, "2");

		System.out.println("Ended CS_MemberLogin_Part3");
		logger.log(LogStatus.PASS, "Completed CS_MemberLogin_part3");

	}

	@AfterMethod
	public void tearup(ITestResult result) throws Exception {
		CommonMethods.CaptureScreenshot(driver, result);
	}

	@AfterClass
	public void teardown() {
		reports.endTest(logger);
		driver.close();
	}

}
