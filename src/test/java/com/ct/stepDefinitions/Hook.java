package com.ct.stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.ct.utilities.Driver;
import com.ct.utilities.Screen2image;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hook {

	
	@Before
	public void setUp(){		
		Driver.getInstance().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		Driver.getInstance().manage().window().maximize();
		
	}
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException{
		Screen2image.takeScreenShotNewReport();
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) 
					Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}
	
}
