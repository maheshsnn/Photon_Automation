package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class EnrollMember_With_Email {

	WebDriver driver;
	ActionKeywords performAction;

	public EnrollMember_With_Email(WebDriver driver) {
		this.driver = driver;
	}

	By AddMember = By.id("add-members");
	By Member_Firstname = By.name("firstName");
	By Member_lastname = By.name("lastName");
	By Member_DOb = By.id("dob");
	By Gender = By.xpath("//*[@name='gender']");
	By Member_Homephonenumber = By.name("homePhone");
	By Member_Mobilenumber = By.name("mobilePhone");
	By Member_Email = By.name("email");
	By PrimaryInsurence = By.name("primaryIns");
	By InsurenceID = By.xpath("(//input[@value=''])[10]");
	By Providers = By.name("providers");
	By Location = By.name("locations");
	By Program = By.name("program");
	By Consenttype = By.name("signFormsMethod");
	By Enroll_list = By.name("enrollment_list");
	By Relatedpatient = By.xpath("//div[@id='inviteFormsContainer']/div/div/div[2]/form/div/div[2]/button");

	public void enrollMember_With_Email() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(AddMember, "Clicked on Add member");
			performAction.enter(Member_Firstname,"profirstname"+CommonMethods.randaomstring(10),"Entered Member first name");
			performAction.enter(Member_lastname,"prolasname"+CommonMethods.randaomstring(10),"Entered member last name");
			performAction.enter(Member_DOb, "01/11/1986", "Entered DOB");
			performAction.select(Gender, "Male", "Selected Gender");
			performAction.clickandwait(Member_Homephonenumber, "Clicked on Homephnone number");
			performAction.enter(Member_Homephonenumber,CommonMethods.randominteger(900000000,1000000000),"Entered Home phone number");
			performAction.enter(Member_Mobilenumber,CommonMethods.randominteger(900000000, 1000000000),"Entered Mobile number");
			performAction.enter(Member_Email, "Vishal.dhanala+" + CommonMethods.randaomstring(16) + "@gmail.com",
					"Entered Email");
			performAction.enter(PrimaryInsurence, CommonMethods.randominteger(900, 100), "Entered primary Insurence");
			performAction.enter(InsurenceID, CommonMethods.randominteger(90, 10), "Entered Insurence ID");
			performAction.select(Providers, 1, "Selected Providers");
			performAction.select(Location, 1, "Selected location");
			performAction.selectandwait(Program, 0, "Selected program");
			performAction.select(Consenttype, 1, "Selected Consent Type");
			performAction.select(Enroll_list, 1, "Selected Enroll list");
			performAction.click(Relatedpatient, "Clicked on Related patient");
		} catch (Exception e) {
			throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}
}
