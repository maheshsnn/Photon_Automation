package java_Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;

		String s[] = { "Pranay","MAhesh"};
		
	List<WebElement>links=driver.findElements(By.xpath(""));
	
	Iterator it=links.listIterator();
	
	if(it.hasNext())
	{
		//System.out.println(it.next());
	}
		


	}

}
