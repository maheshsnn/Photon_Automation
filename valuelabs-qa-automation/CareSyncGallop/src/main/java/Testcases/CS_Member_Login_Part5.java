
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
import com.pageobjects.Back_Button;
import com.pageobjects.Careplan_tab;
import com.pageobjects.HA_HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.View_Share;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.CommonMethods;

public class CS_Member_Login_Part5 extends ManageBrowser {
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
	public void CS_Memberlogin_part5() throws Exception {
		logger = reports.startTest("CS_MemberLogin_part5");
		System.out.println("Executing testcase  CS_MemberLogin_part5");

		// Login
		LoginPage login = new LoginPage(driver);
		login.loginpage(pro.HAusername(), pro.HAPassword());

		// Click on member image
		HA_HomePage home = new HA_HomePage(driver);
		home.memberimage();

		// Caremanager_Tab
		home.Caremanagertab();

		// Careplan
		Careplan_tab careplan = new Careplan_tab(driver);
		careplan.careplan();
		careplan.task_textarea();
		careplan.procedure();
		careplan.Attach_Tag();
		careplan.calender();
		careplan.addbutton();
		careplan.addComments();
		careplan.commentsDelete();
		careplan.deleteTask();

		// View and share
		View_Share view_share = new View_Share(driver);
		view_share.Viewshare();

		// Backbutton
		Back_Button back_Button = new Back_Button(driver);
		back_Button.backbtn();

		System.out.println("Ended CS_MemberLogin_Part5");
		logger.log(LogStatus.PASS, "Completed CS_MemberLogin_part5");

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
