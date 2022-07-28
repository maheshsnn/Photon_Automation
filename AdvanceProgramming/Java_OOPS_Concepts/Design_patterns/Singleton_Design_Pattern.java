package Design_patterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.taobao.gecko.service.SingleRequestCallBackListener;

public class Singleton_Design_Pattern {

	public static void main(String[] args) {

		driverobjclass object2 = driverobjclass.getinstance();

		WebDriver driver = object2.getDriver();

	}

}

class driverobjclass {
	// for singleton class first step is to create a static object
	private static driverobjclass obj = new driverobjclass();

	private WebDriver driver;

	// Create a private constructor
	private driverobjclass() {

		System.out.println("this is a constructor");

		System.setProperty("webdriver.chrome.driver", "G:\\Photon_Automation\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	// create a static method with any name which should return obj
	public static driverobjclass getinstance() {

		// WebDriver driver=new ChromeDriver();

		if (obj == null) {
			obj = new driverobjclass();
		}

		return obj;
	}

	public WebDriver getDriver() {

		return driver;
	}

}