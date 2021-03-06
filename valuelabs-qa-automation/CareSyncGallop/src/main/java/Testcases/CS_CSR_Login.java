

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CS_CSR_Login extends ManageBrowser {
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
	@Test
	public void CSR_login() throws Exception {
		logger = reports.startTest("CSR_Login");
		System.out.println("Executing testcase  CSR_Login");

		// Login
		LoginPage login = new LoginPage(driver);
		login.loginpage(pro.CSRUsername(), pro.CSRPassword());

		// Member_Search
		HealthAssistant_MemberSearch Members = new HealthAssistant_MemberSearch(driver);
		Members.Membersearch();

		// Member_Image
		Members.Memberimage();

		// Hippa pop up handling
		Hippa_Popup popup = new Hippa_Popup(driver);
		popup.hippacert();

		// CSR_Searchmembers
		CSR_Homepage Homepage = new CSR_Homepage(driver);
		Homepage.Searchmember();

		// Service_Report_Click
		Homepage.ServiceReport();

		// Services_Report
		CSR_ServicesReport Services = new CSR_ServicesReport(driver);
		Services.ServicesReport();

		// CSR_Searchmembers
		Homepage.Searchmember();

		// Member selection image
		Members.Memberimage();

		// Hippa pop up
		popup.hippacert();

		// Add_Caregiver
		CSRlogin_Caregiver Caregiver = new CSRlogin_Caregiver(driver);
		Caregiver.CSR_careGiver();
		System.out.println("completed ");

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