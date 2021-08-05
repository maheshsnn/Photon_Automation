package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class invocation_method {

	WebDriver driver;

	@BeforeClass
	public void mm() {

	}

	@Test(invocationCount = 2)
	public void sh() {
		System.out.println("Test");
		
		List<WebElement> s=new Select(driver.findElement(By.xpath(""))).getOptions();
		for(int i=0;i<s.size();i++)
		{
				new Select(driver.findElement(By.xpath(""))).selectByIndex(0);
				
				
			
		}
	}

	@Test(enabled = true)
	public void shs() {
		System.out.println("ex");

	}

}
