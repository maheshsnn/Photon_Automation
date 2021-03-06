package com.configurations;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.utility.Propertiesfile;

public class GridConfiguration {
	/**
	 * @Grid configuration
	 * @param browser
	 * @return
	 * @throws Exception
	 */
	public RemoteWebDriver getDriver(String browser) throws Exception {
		Propertiesfile pro = new Propertiesfile();
		return new RemoteWebDriver(new URL(pro.gridnodepath()), getBrowserCapabilities(browser));
	}

	/**
	 * 
	 * @param browser
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	public DesiredCapabilities getBrowserCapabilities(String browser) throws Exception {
		// TODO Auto-generated method stub
		Propertiesfile pro = new Propertiesfile();
		System.out.println("Before method executing");
		switch (browser) {
		case "firefox":
			System.out.println("Opening firefox driver");
			return DesiredCapabilities.firefox();

		case "chrome":
			System.out.println("Opening chrome driver");
			System.setProperty("java.awt.headless", "false");
			return DesiredCapabilities.chrome();

		case "IE":
			System.out.println("Opening IE driver");
			return DesiredCapabilities.internetExplorer();
		default:
			System.out.println("browser : " + browser + " is invalid, Launching Firefox as browser of choice..");
			return DesiredCapabilities.firefox();
		}
	}
}
