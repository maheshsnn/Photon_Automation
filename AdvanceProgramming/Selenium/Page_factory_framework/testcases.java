package Page_factory_framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import propertiesfile_loadind.Properties_file;



public class testcases {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "G:\\Photon_Automation\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Pob s = PageFactory.initElements(driver, Pob.class);

		s.Login();
		
	

		

	}

}
