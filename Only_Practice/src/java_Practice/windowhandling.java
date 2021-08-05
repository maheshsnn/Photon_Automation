package java_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;

		String Parent = driver.getWindowHandle();

		Set<String> allwind = driver.getWindowHandles();
		// using for loop
		for (String child : allwind) {
			if (!Parent.equals(child)) {

			}
		}

		// using iterator

		Iterator<String> itr = allwind.iterator();

		while (itr.hasNext()) {
			String child = itr.next();
			if (!Parent.equals(child)) {

			}
		}

	}

}
