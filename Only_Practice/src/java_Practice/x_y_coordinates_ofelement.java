package java_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class x_y_coordinates_ofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;

		WebElement el = driver.findElement(By.xpath(""));

		Point z = el.getLocation();

		int x = z.getX();

		int y = z.getY();

		new Select(driver.findElement(By.xpath(""))).getAllSelectedOptions();

		new Select(driver.findElement(By.xpath(""))).getFirstSelectedOption();

	}

}
