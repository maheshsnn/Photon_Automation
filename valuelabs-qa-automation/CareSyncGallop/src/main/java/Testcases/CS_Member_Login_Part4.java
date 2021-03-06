

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.ManageBrowser;
import com.configurations.GridConfiguration;
import com.pageobjects.HA_HomePage;
import com.pageobjects.HA_MemberSearch;
import com.pageobjects.Healthinfotab;
import com.pageobjects.Hippa_Popup;
import com.pageobjects.LoginPage;
import com.pageobjects.Measurementstab;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.CommonMethods;

public class CS_Member_Login_Part4 extends ManageBrowser {
	WebDriver driver;

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

	@Test
	public void CS_Memberlogin_part4() throws Exception {
		logger = reports.startTest("CS_MemberLogin_part4");
		System.out.println("Executing testcase  CS_MemberLogin_part4");

		// Login
		LoginPage login = new LoginPage(driver);
		login.loginpage(pro.UnameHealthAssistant(), pro.PassHealthAssistant());

		// Memeber is searched
		HA_MemberSearch Member = new HA_MemberSearch(driver);
		Member.Membersearch();

		// Member image is clicked
		Member.Memberimage();

		// Hippa cerificate
		Hippa_Popup certificate = new Hippa_Popup(driver);
		certificate.hippacert();

		// Health_info
		HA_HomePage homepage = new HA_HomePage(driver);
		homepage.HealthInfotab();

		// Measurements tab is clicked
		Healthinfotab measurements = new Healthinfotab(driver);
		measurements.Measurements();

		// Journal_AddValue
		Measurementstab measurement = new Measurementstab(driver);
		measurement.JournalAdd_Value();

		// Journal_Graph
		measurement.Journal_Graph();

		// Pain_AddValue
		measurement.Pain_Addvalue();

		// Pain_Graph
		measurement.Pain_Graph();

		// Bloodpressure_AddValue
		measurement.BloodPressure_AddValue();

		// Bloodpressure_Graph
		measurement.BP_Graph();

		// Bloodpressure_ConnectApp
		measurement.BP_ConnectApp();

		// Bloodpressure_Settings
		measurement.BloodPressure_Settings();

		// Heart Rate_AddValue
		measurement.Heartrate_AddValue();

		// Heart Rate_Graph
		measurement.HeartRate_Graph();

		// Heart Rate_ConnectApp
		measurement.Heartrate_ConnectApp();

		// Heart Rate_Settings
		measurement.HeartRate_Settings();

		// Glucose_Add Value
		measurement.Glucose_AddValue();

		// Glucose_Graph
		measurement.Glucose_Graph();

		// Glucose_Connect
		measurement.Glucose_ConnectApp();

		// Glucose_Settings
		measurement.Glucose_Settings();

		// Height_Addvalue
		measurement.Height_AddValue();

		// Height_Graph
		measurement.Height_Graph();

		// Height_Connect
		measurement.Height_ConnectApp();

		// Height_Settings
		measurement.Height_Settings();

		// Weight_Addvalue
		measurement.Weight_AddValue();

		// Weight_Graph
		measurement.Weight_Graph();

		// Weight_Connect
		measurement.Weight_ConnectApp();

		// Weight_Settings
		measurement.Weight_Settings();

		// Temerature_Addvalue
		measurement.Temperature_AddValue();

		// Temerature_Graph
		measurement.Temperature_graph();

		System.out.println("Ended CS_MemberLogin_Part4");
		logger.log(LogStatus.PASS, "Completed CS_MemberLogin_part4");

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