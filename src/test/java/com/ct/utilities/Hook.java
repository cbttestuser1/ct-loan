package com.ct.utilities;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hook {

	
	@Before
	public void setUp(){
		Driver.getInstance().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(Scenario scenario){
		if (scenario.isFailed()) {
			Screen2image.takeScreenShotNewReport();
			final byte[] screenshot = ((TakesScreenshot) 
					Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}
	
}
