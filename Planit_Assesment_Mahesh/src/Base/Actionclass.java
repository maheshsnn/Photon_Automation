package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import Utility.CommonMethods;

public class Actionclass extends TestNgAnnotations{
	
	static WebDriver driver;
	
	public static  void CLICK(By locator,String loggers) throws Exception
	{
		driver.findElement(locator).click();
		logger.log(LogStatus.INFO, loggers);
		CommonMethods.ScreenshotonStep(driver, loggers);
		System.out.println("Outside try and catch");
	}
	
}
