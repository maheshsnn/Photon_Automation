package java_Practice;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Order_of_TestngAnnotaions {
	
static	WebDriver driver;

	@BeforeTest
	public void bt()
	{
		//System.out.println("bf test");
	}
	@BeforeSuite
	public void bf()
	{
		//System.out.println("bf  suite");
	}
	@BeforeMethod
	public void bm()
	{
		//System.out.println("bf  method");
	}
	@BeforeClass
	public void bc()
	{
		//System.out.println("bf class");
	}
	
	@Test(enabled=false)
	public void mm()
	{
		//System.out.println("test");
	}
	
	@Test(invocationCount=1)
	public void mms()
	{
		//System.out.println("mms");
		//Assert.assertEquals(true, false);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='emai']")).click();
		
		System.out.println("Screenshot taken");
	}
	
}
