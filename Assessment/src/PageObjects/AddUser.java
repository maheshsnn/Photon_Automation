package PageObjects;

import java.util.Random;

import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utility.Propertiesfile;

public class AddUser {

	/*
	 * page objects for shopping page is placed in this class and methods related to this page are also created here
	 */
	static Propertiesfile pro;

	
	static By Admin = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	static By user_name = By.xpath("//input[@id='systemUser_userName']");
	static By user_Role = By.xpath("//select[@id='systemUser_userType']");
	static By Employename = By.xpath("//input[@name='systemUser[employeeName][empName]']");
	static By Add = By.xpath("//input[@name='btnAdd']");
	static By password = By.xpath("//input[@id='systemUser_password']");
	static By Save = By.xpath("//input[@name='btnSave']");
	static By confirm_password = By.xpath("//input[@id='systemUser_confirmPassword']");
	static By Banner = By.xpath("//*[text()='Successfully Saved']");

	public static void AddUser_Task1(WebDriver driver) throws Exception {
		pro = new Propertiesfile();
		driver.findElement(Admin).click();
		driver.findElement(Add).click();
		new Select(driver.findElement(user_Role)).selectByVisibleText("Admin");
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		driver.findElement(Employename).sendKeys("Orange Test");
		driver.findElement(user_name).sendKeys("Mahesh"+c+"");
		driver.findElement(password).sendKeys("Bijili@1816"+c+"");
		driver.findElement(confirm_password).sendKeys("Bijili@1816"+c+"");
	   
		driver.findElement(Save).click();
		String Banner_title=driver.findElement(Banner).getText();
		Assert.assertEquals(Banner_title, "Successfully Saved");
		

	}

}
