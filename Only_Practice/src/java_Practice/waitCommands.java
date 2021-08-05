package java_Practice;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=null;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MICROSECONDS);
		
		
		
		WebDriverWait wait=new WebDriverWait(driver	,5000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		
		Wait rr=new FluentWait(driver).withTimeout(300, TimeUnit.SECONDS).ignoring(Exception.class).pollingEvery(500, TimeUnit.SECONDS);
		
		

	}

}
