package Base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import Utility.CommonMethods;

public class Actionclass extends TestNgAnnotations {

	static WebDriver driver;

	public static void CLICK(By locator, String loggers) throws Exception {
		driver.findElement(locator).click();
		logger.log(LogStatus.INFO, loggers);
		CommonMethods.ScreenshotonStep(driver, loggers);
		System.out.println("Outside try and catch");
	}

	public static void Select(By locator, String loggers) throws Exception {
		new org.openqa.selenium.support.ui.Select(driver.findElement(locator)).selectByVisibleText("Admin");
		logger.log(LogStatus.INFO, loggers);
		CommonMethods.ScreenshotonStep(driver, loggers);
		System.out.println("Outside try and catch");
	}

	public static void Switch_to_window(By locator)

	{
		String Parent = driver.getWindowHandle();

		driver.findElement(locator).click();

		Set<String> allHandles = driver.getWindowHandles();

		Iterator<String> itr = allHandles.iterator();

		while (itr.hasNext()) {

			String childwind = itr.next();

			if (!Parent.equals(childwind)) {

				driver.switchTo().window(childwind);
			}

		}
	}

	public static void mousehover(By locator) {
		Actions AC = new Actions(driver);
		AC.moveToElement(driver.findElement(locator)).click().build().perform();
	}
}
