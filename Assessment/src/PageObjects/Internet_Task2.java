package PageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Internet_Task2 {

	/*
	 * page object related to shopping cart are placed here and we have created
	 * methods related to to shopping cart page
	 */

	static By dropdown = By.xpath("//li//a[@href='/dropdown']");
	static By dd_list = By.xpath("//select[@id='dropdown']");
	static By Element_selenium = By.xpath("//a[text()='Elemental Selenium']");
	static By Assert_Elementselenium = By.xpath("//*[text()='Elemental Selenium']");

	static By hovers = By.xpath("//a[@href='/hovers']");
	static By profiles = By.xpath("//img[@alt='User Avatar']");
	static By profile_name = By.xpath("(//*[contains(text(),'name:')])");

	public static void profiles(WebDriver driver) {
		driver.findElement(hovers).click();
		List<WebElement> hover_profiles = driver.findElements(profiles);
		for (int i = 1; i <= hover_profiles.size(); i++) {
			Actions AC = new Actions(driver);
			AC.moveToElement(driver.findElement(By.xpath("(//img[@alt='User Avatar'])[" + i + "]"))).perform();
			String profilename = driver.findElement(By.xpath("(//*[contains(text(),'name:')])[" + i + "]")).getText();
			String[] x = profilename.split(":");

			System.out.println("Name Values are  *******" + x[1]);
		}
	}

	public static void Task2(WebDriver driver) {

		driver.findElement(dropdown).click();
		new Select(driver.findElement(dd_list)).selectByValue("2");
		String selectedoptions = new Select(driver.findElement(dd_list)).getFirstSelectedOption().getText();
		Assert.assertEquals(selectedoptions, "Option 2");

		String Parent = driver.getWindowHandle();

		driver.findElement(Element_selenium).click();

		Set<String> allHandles = driver.getWindowHandles();

		Iterator<String> itr = allHandles.iterator();

		while (itr.hasNext()) {
			String childwind = itr.next();

			if (!Parent.equals(childwind)) {
				driver.switchTo().window(childwind);
			}

		}

		String s = driver.findElement(Assert_Elementselenium).getText();

		Assert.assertEquals(s, "Elemental Selenium");

	}

}
