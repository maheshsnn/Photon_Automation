package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class flipkart {

	  static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//div[@class='go_DOp _2errNR']")).click();

		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("maheshsnn");

		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("xyx");

		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		if (driver.findElement(By.xpath("//*[@class='_2YULOR']")).isDisplayed())

		{

			File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scr, new File("D:" + "mahesh\\" + ".png"));

			System.out.println("done");

		}

	}

}
