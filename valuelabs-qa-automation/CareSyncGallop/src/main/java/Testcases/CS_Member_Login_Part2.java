

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
import com.pageobjects.Allergies;
import com.pageobjects.Back_Button;
import com.pageobjects.CareManager_Messagestab;
import com.pageobjects.Documents;
import com.pageobjects.End_Steps;
import com.pageobjects.HA_Activity;
import com.pageobjects.HA_HealthCondition;
import com.pageobjects.HA_HomePage;
import com.pageobjects.HA_Personal_Contactinfo;
import com.pageobjects.HA_Personal_EmergencyContacts;
import com.pageobjects.HA_Personal_Enrollmentsources;
import com.pageobjects.HA_Personal_InsuranceInfo;
import com.pageobjects.HA_Personal_Invitations;
import com.pageobjects.HA_Personal_Secondaryinsurance;
import com.pageobjects.HA_Providers;
import com.pageobjects.HA_personal_Shraresettings;
import com.pageobjects.Healthinfotab;
import com.pageobjects.LoginPage;
import com.pageobjects.Medications;
import com.pageobjects.View_Share;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.CommonMethods;

public class CS_Member_Login_Part2 extends ManageBrowser {
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
	
	@Test(priority = 1)
	public void CS_MemberLogin1_part2() throws Exception {
		logger = reports.startTest("CS_MemberLogin_part2");
		System.out.println("Executing testcase  CS_MemberLogin_part2");
		ActionKeywords performAction = new ActionKeywords(driver);
		// Login
		LoginPage login = new LoginPage(driver);
		login.loginpage(pro.HAusername(), pro.HAPassword());

		HA_HomePage HAhomepage = new HA_HomePage(driver);
		HAhomepage.memberimage();

		// personal info
		HA_Personal_Enrollmentsources Enrollmentsources = new HA_Personal_Enrollmentsources(driver);
		Enrollmentsources.member_name();
		Enrollmentsources.member_demographics();
		Enrollmentsources.member_addresses();
		System.out.println("doe enrollment");

		// HAprimaryinsurance
		HA_Personal_InsuranceInfo primaryinsurance = new HA_Personal_InsuranceInfo(driver);
		primaryinsurance.HealthAssistant_PrimaryInsurance();

		// HASecondaryinsurance
		HA_Personal_Secondaryinsurance secondaryinsurance = new HA_Personal_Secondaryinsurance(driver);
		secondaryinsurance.HealthAssistant_Secondaryinsurance();

		// HAContactinfo
		HA_Personal_Contactinfo contactinfo = new HA_Personal_Contactinfo(driver);
		contactinfo.HeatlhAssistant_ContactInfo();

		// HAView and share
		Thread.sleep(3000);
		View_Share vs = new View_Share(driver);
		vs.Viewshare();

		Thread.sleep(3000);
		// Backbutton
		Back_Button BK = new Back_Button(driver);
		BK.backbtn();

		// HAEmergencyContacts addition and deletion
		HA_Personal_EmergencyContacts Emergencycontacts = new HA_Personal_EmergencyContacts(driver);
		Emergencycontacts.HealthassistantPersonal_EmergencyContacts();
		Emergencycontacts.EmergencyContacts_Delete();

		End_Steps end = new End_Steps(driver);
		end.signout();
		System.out.println("Ended");

		// Login LoginPage
		System.out.println("part2 startes");
		login.loginpage(pro.HAusernameAlt(), pro.HAPasswordalt());

		// SharingSettings HealthAssistant2_personalShraresettings
		HA_personal_Shraresettings Sharinggsettings = new HA_personal_Shraresettings(driver);
		Sharinggsettings.SharingSettings();

		Sharinggsettings.Invitationspopup();
		System.out.println("1");

		// Invitations
		HA_Personal_Invitations invitations = new HA_Personal_Invitations(driver);
		invitations.Invitations();

		// Activity
		HA_Activity activity = new HA_Activity(driver);
		activity.Activity();

		// Healthinfotab
		Healthinfotab healthinfo = new Healthinfotab(driver);
		healthinfo.Healthinfo();

		// Providerstab
		HA_Providers providers = new HA_Providers(driver);
		providers.providers();
		providers.nolonger_providercheckbox();
		providers.nolonger_providercheckbox();
		providers.provider_transhicon();

		// Medications
		Medications medication = new Medications(driver);
		medication.medication();

		medication.addhealth_condition();
		medication.add_pharmacy();
		medication.medication_save();
		medication.list_medication_saved();
		medication.acceptance();
		medication.checkbox();
		medication.medication_save();
		medication.list_medication_saved();
		performAction.browserScroll(500, "Scrolled down");
		performAction.wait(2000, "Wait is added");
		medication.medication_trashicon();
		System.out.println("////"); // HAView and share

		// View_Share vs = new View_Share(driver);
		Thread.sleep(3000);
		vs.Viewshare();
		System.out.println("view and shae completye");

		// Backbutton Back_Button BK = new Back_Button(driver);
		Thread.sleep(3000);
		BK.backbtn();
		System.out.println("back button "); // HealthCondition

		HA_HealthCondition Healthconditon = new HA_HealthCondition(driver);
		Healthconditon.health_condition();
		Healthconditon.addmedication();

		Healthconditon.savemedication();
		Healthconditon.trashicon();

		Healthconditon.acceptingdeletion();
		System.out.println("completed health conditon");

		// Allergies
		Allergies allergy = new Allergies(driver);
		allergy.allergyinfo();
		allergy.saveallergybutton();
		allergy.allergylist();
		allergy.allergycheckbox();
		allergy.saveallergybutton();
		allergy.activecheck();
		allergy.saveallergybutton();
		allergy.allergylist();
		allergy.trashicon();
		allergy.allergypopup();
		System.out.println("completed  allergies");

		// Documents
		Documents docs = new Documents(driver);
		docs.Documentss();
		System.out.println("documents completed");
		// Caremanager label message

		CareManager_Messagestab message = new CareManager_Messagestab(driver);
		message.Messagetab();

		System.out.println("Ended CS_MemberLogin_part2");
		logger.log(LogStatus.PASS, "Completed CS_MemberLogin_part2");

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