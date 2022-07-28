package Drag_Drop;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Drag_Drop_Demo {
	WebDriver d;

	@Test
	public void dragNDrop() throws Exception {
		d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		d.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://jqueryui.com/droppable/");
		assertEquals("Droppable | jQuery UI", d.getTitle());
		d.switchTo().frame(0);
		Actions a = new Actions(d);
		a.dragAndDrop(d.findElement(By.id("draggable")), d.findElement(By.id("droppable"))).perform();

		Thread.sleep(4000);
	}

	@BeforeMethod
	public void setUp() {
		d = new FirefoxDriver();
	}

	@AfterMethod
	public void tearDown() {
		d.quit();
	}

}
