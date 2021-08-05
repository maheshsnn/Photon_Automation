package Keyboard_Actions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardActions {

	WebDriver d;
	@BeforeMethod
	public void meth1()
	{
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
	}
	@AfterMethod
	public void meth2() 
	{
		d.quit();
		
	}
	@Test
	public void meth3() throws InterruptedException   
	{
		d.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		d.get("https://www.google.co.in/?gws_rd=ssl");
		
		d.findElement(By.id("gbqfq")).sendKeys("selenium");
		WebElement X=d.findElement(By.linkText("Selenium - Web Browser Automation"));
		Actions a=new Actions(d);
		a.moveToElement(X).keyDown(Keys.CONTROL).click(X).perform();
		Thread.sleep(5000);
		
	}
	

}
