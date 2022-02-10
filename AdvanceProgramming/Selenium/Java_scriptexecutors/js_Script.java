package Java_scriptexecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class js_Script {

	static WebDriver driver;

	public static void main(String[] args) {

		WebElement element = driver.findElement(By.xpath(""));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("windows.scrollBy(0,200)");
		jse.executeScript("windows.scrolltoTop()");
		jse.executeScript("windows.scrollBy(0,document.body.scrolltoheight())");// to
																				// scroll
																				// to
																				// bottom
																				// of
																				// page
		jse.executeScript("history.go(0)");// refresh one time
		jse.executeScript("return document.title");// get title of the page
		jse.executeScript("return document.getelementByID('').Innerhtml");// get
																			// inner
																			// text
		jse.executeScript("document.getelementBYId('').value=''");// set value
		jse.executeScript("argument[0].click();", element);// click on element
		jse.executeScript("document.getelementByID('').click()");
		jse.executeScript("document.getelementBYId('').scrollintoview");

	}
}
