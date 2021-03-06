

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class CS_CCM_Login extends ManageBrowser {

	WebDriver driver;
	
	@BeforeMethod

	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		System.out.println("*******************");
		GridConfiguration gc = new GridConfiguration();
		driver = gc.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		
		if()
		driver.get("https://csdev.caresync.com/login");
	}

	@Test(groups = { "Regression", "Smoke" })
	public void CCM_Login() throws Exception {
		try {
			logger = reports.startTest("CS_CCM_Login");
			System.out.println("Executing testcase  CS_CCM_Login");
			// Login
			LoginPage login = new LoginPage(driver);
			login.loginpage(pro.Clientservicesusername(), pro.Clientservicespassword());

			// Clicking on a practice
			NavigationMenu Practice = new NavigationMenu(driver);
			Practice.NavigateTo("PracticeImage");

			// Managing a User
			ManageUsers manageuser = new ManageUsers(driver);
			manageuser.ManageUsersRole();

			// Activate and Inactivate theradio button
			ManageUser_ActiveRadio_button ActiveRadio = new ManageUser_ActiveRadio_button(driver);
			ActiveRadio.manageUser_ActiveRadio_button();

			// Enroll Member with Email
			EnrollMember_With_Email EnrollMember_WithEmail = new EnrollMember_With_Email(driver);
			EnrollMember_WithEmail.enrollMember_With_Email();

			// CareGiver
			CareGiver CCM_CareGiver = new CareGiver(driver);
			CCM_CareGiver.caregiver();

			// CareGiver Next
			Caregiver_Next careGiver_next = new Caregiver_Next(driver);
			careGiver_next.careGiver_Next();

			// Enroll Member without Email
			EnrollMember_Without_Email EnrollMember_WithoutEmail = new EnrollMember_Without_Email(driver);
			EnrollMember_WithoutEmail.enrollMember_Without_Email();

			// CareGiver Temp Login

			Caregiver_Temp_Login careGiver_Temp_Login = new Caregiver_Temp_Login(driver);
			careGiver_Temp_Login.careGiver_Temporory_Login();

			// Manage Members
			Manage_Members manageMembers = new Manage_Members(driver);
			manageMembers.manage_Members();

			// Service report
			ServiceReport servicereport = new ServiceReport(driver);
			servicereport.service_Report();

			// CCM Report
			CCM_Report CCm_Report = new CCM_Report(driver);
			CCm_Report.CCm_report();

			// End Steps
			End_Steps end_steps = new End_Steps(driver);
			end_steps.End();

			System.out.println("Ended CS_CCM_Login");
			logger.log(LogStatus.PASS, "Completed CS_CCM_Login");

		} catch (Exception e) {
			throw new RuntimeException("CCM_Login Failed");
		}
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
