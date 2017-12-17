package com.ct.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getInstance() {
		if (driver == null) {
			switch (ConfigurationReader.getProperty("browser")) {
			case "firefox.mac":
				System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("gecko.driver.mac"));
				driver = new FirefoxDriver();
				break;
			case "chrome.mac":
				System.setProperty("webdriver.chrome.driver", ConfigurationReader.getProperty("chrome.driver.mac"));
				driver = new ChromeDriver();
				break;
			case "firefox.window":
				System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("gecko.driver.windows"));
				driver = new FirefoxDriver();
				break;
			case "chrome.window":
				System.setProperty("webdriver.chrome.driver", ConfigurationReader.getProperty("chrome.driver.windows"));
				driver = new ChromeDriver();
				break;
			
			default:
				System.setProperty("webdriver.chrome.driver", ConfigurationReader.getProperty("chrome.driver.mac"));
				driver = new ChromeDriver();
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}

}
