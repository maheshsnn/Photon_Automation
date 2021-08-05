package Auto_IT;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.steadystate.css.util.Output;

public class Auto_It {
	WebDriver d;
	ChromeOptions options;
	@BeforeClass
	public void mahesh() {
		
		 options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 
		 DesiredCapabilities cap=DesiredCapabilities.chrome();
		 cap.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
		 
		System.setProperty("webdriver.chrome.driver", "G:\\lib\\chromedriver.exe");
		d = new ChromeDriver(options);
	
		

		// WebDriverWait wait=new WebDriverWait(d,100);
		// WebElement
		// e=wait.until(ExpectedConditions.elementToBeClickable(d.findElement(By.id(""))));

	}

	@Test
	public void mah() throws Exception

	{
		d.get("https://www.facebook.com");

		d.findElement(By.xpath("//label[.='Email or Phone']/following::input[@id='email']")).sendKeys("maheshsnn");

		d.findElement(By.xpath("//label[.='Password']/following::input[@id='pass']")).sendKeys("Hello2D4y#");

		d.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(500);
		
		 DesiredCapabilities cap=DesiredCapabilities.chrome();
		 cap.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
		// cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
	//StringSelection str=new StringSelection("");
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		
		d.findElement(By.xpath("(//div[@class='_3jk'])[1]")).click();
		
		Thread.sleep(20);

		Runtime.getRuntime().exec("G:\\AUTOIT\\Handleauthentication.exe");
		//ProcessBuilder p=new ProcessBuilder("G:\\AUTOIT\\Auto.exe");
		//p.start();
		Thread.sleep(5000);
		System.out.println("completed");

	}

}
