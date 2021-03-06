
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
import com.pageobjects.LoginPage;
import com.pageobjects.Member_Login_7;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.CommonMethods;

public class CS_Member_Login_Part7 extends ManageBrowser {
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

	@Test(groups = { "Regression", "Smoke" })
	public void MemberLogin_part7() throws Exception {
		logger = reports.startTest("MemberLogin_part7");
		System.out.println("Executing testcase  CS_MemberLogin_part7");

		// Login
		LoginPage login = new LoginPage(driver);
		login.loginpage(pro.HAusernameAlt(), pro.HAPasswordalt());

		// Member login 7
		Member_Login_7 member_Login_7 = new Member_Login_7(driver);
		CommonMethods.pageload(driver);
		member_Login_7.Personal_Info();
		member_Login_7.care_givers();
		member_Login_7.Sharing_setings();
		member_Login_7.Toggle_All();
		member_Login_7.Toggle_All();
		member_Login_7.Health_Info_Settings();
		member_Login_7.Cancel();
		member_Login_7.Personal_Info_settings();
		member_Login_7.Cancel();
		member_Login_7.Personal_Document_settings();
		member_Login_7.Cancel();
		member_Login_7.Activity();
		CommonMethods.pageload(driver);
		member_Login_7.Activity_Togle();
		CommonMethods.pageload(driver);
		member_Login_7.Save();
		member_Login_7.Toggle_All();
		member_Login_7.Toggle_All();
		member_Login_7.Dashboard();
		member_Login_7.Not_Confirming();
		member_Login_7.Dashboard();
		member_Login_7.Task_List();
		member_Login_7.Help();
		member_Login_7.Caresync_101();
		member_Login_7.Parent_child();
		member_Login_7.Settings();
		member_Login_7.Account_Info();
		member_Login_7.Manage_MemberShips();
		member_Login_7.Notification_Settings();
		member_Login_7.CareSync_calender();
		member_Login_7.Share();
		member_Login_7.Tell_A_Friend();
		member_Login_7.Tell_A_Friend_popup();
		member_Login_7.Share();
		member_Login_7.Gift();

		System.out.println("Ended CS_MemberLogin_Part7");
		logger.log(LogStatus.PASS, "Completed CS_MemberLogin_part7");

	}

	@AfterMethod
	public void tearup(ITestResult result) throws Exception {
		CommonMethods.CaptureScreenshot(driver, result);
	}

	@AfterClass
	public void teardown() {

		reports.endTest(logger);
		// reports.flush();
		driver.quit();
	}

}
