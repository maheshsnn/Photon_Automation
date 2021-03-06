
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class CS_Member_Login_Part1 extends ManageBrowser {
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
	public void CS_MemberLogin_Part1() throws Exception {
		logger = reports.startTest("CS_MemberLogin_part1");
		System.out.println("Executing testcase  CS_MemberLogin_part1");
		performAction = new ActionKeywords(driver);
		// Createanaccount//
		Create_Account newaccount = new Create_Account(driver);
		newaccount.CreateAccount(CommonMethods.randaomstring(6),CommonMethods.randaomstring(6),"caresyncc+"+CommonMethods.randominteger(90000, 10000)+"@gmail.com","SAMEpassword@123");
		performAction.wait(3000, "Wait time");
		String parentwindow = driver.getWindowHandle();

		// Opening the new G mail window
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_N);
		R.keyRelease(KeyEvent.VK_N);
		R.keyRelease(KeyEvent.VK_CONTROL);
		
		performAction.wait(3000, "Wait time");
		// switching from parent to child window
		Set<String> ch = driver.getWindowHandles();
		for (String childwindow : ch) {
			if (!parentwindow.equals(childwindow)) {
				System.out.println("focus moved to child window");
				driver.switchTo().window(childwindow);
			}
		}

		// Gmail verification
		performAction.wait(2000, "Wait time");
		driver.get(pro.GmailURL());
		Gmail_AccountVerification Gmail = new Gmail_AccountVerification(driver);
		Gmail.Gmail_login("caresyncc@gmail.com", "SAMEpassword@123", "SAMEpassword@123");

		// caresync buy banner//
		Caresync_buybanner buy = new Caresync_buybanner(driver);
		buy.buyplusBanner();
		buy.Caresync_buybanneraccount();
		buy.letsgo();

		// Familymembers assignment
		Assign_Membership family = new Assign_Membership(driver);
		// family.CreateFamilyAccount();
		family.memberprofile();
		family.assign();
		family.Next();
		family.sendRequest();
		performAction.wait(3000, "wait time");
		family.sendRequestpopup();
		family.familymembersecondpicture();
		family.buycaresyncbanner();
		family.healthHistoryplan();
		family.familypromocode();
		family.letsgo();
		family.memberprofile_two();
		family.assign();
		performAction.browserScroll(200, "window is scrolled down");
		family.Next();
		family.sendRequest();
		performAction.wait(2000, "wait time");
		family.sendRequestpopup();
		performAction.browserScroll(-300, "window is scrolled up");
		
		// familymember deletion
		Familymember_Deletion delete = new Familymember_Deletion(driver);
		delete.familymember_Deletion();

		// Gift caresync
		Gift_caresync gift = new Gift_caresync(driver);
		gift.gift_caresync();

		// caresync buy banner
		buy.Caresync_buybanneraccount();
		buy.letsgo_two();

		End_Steps end = new End_Steps(driver);
		end.signout();

		System.out.println("Ended CS_MemberLogin_part1");
		logger.log(LogStatus.PASS, "Completed CS_MemberLogin_part1");

	}

	@AfterMethod
	public void tearup(ITestResult result) throws Exception {
		CommonMethods.CaptureScreenshot(driver, result);
	}

	@AfterClass
	public void teardown() {
		reports.endTest(logger);
		driver.quit();
	}
}