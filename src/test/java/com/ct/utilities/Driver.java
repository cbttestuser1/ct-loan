package com.ct.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
private static WebDriver driver;
	
	

	public static WebDriver getInstance() {
		
		boolean windows =  System.getProperty("os.name").toLowerCase().startsWith("w");
		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
			switch (ConfigurationReader.getProperty("browser")) {
			case "firefox":
				if (windows) {
					System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("firefox.driver.windows"));
				} else{
					System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("firefox.driver.mac"));
	
				}
				driver = new FirefoxDriver();
				break;
			case "chrome":
				if (windows) {
					System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("chrome.driver.windows"));
				} else{
					System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("chrome.driver.mac"));
	
				}	
				driver = new ChromeDriver();
				break;
			case "ie":
				System.setProperty("webdriver.iexplorer.driver", ConfigurationReader.getProperty("ie.driver.path"));
				driver = new InternetExplorerDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			default:
				if (windows) {
					System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("chrome.driver.windows"));
				} else{
					System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("chrome.driver.mac"));
	
				}	
				driver = new ChromeDriver();
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver=null;
		}

	}
	

}
