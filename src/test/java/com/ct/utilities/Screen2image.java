package com.ct.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import com.cucumber.listener.Reporter;

public class Screen2image {
	static SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");

	public static void screenShot() {
		File file = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.FILE);
		// calling getScreenshotAs method with output paramater as File
		// File file = screenshot.getScreenshotAs(OutputType.FILE);
		Calendar now = Calendar.getInstance();
		// creating a destination file
		File destination = new File("/Users/bogdanlutsenko/Desktop/screenShot" + formatter.format(now.getTime()));
		try {
			FileUtils.copyFile(file, destination);
		} catch (Exception e) {

		}
	}

	public static void screenShot(String filePath) {
		TakesScreenshot screenshot = (TakesScreenshot) Driver.getInstance();
		// calling getScreenshotAs method with output paramater as File
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		Calendar now = Calendar.getInstance();
		// creating a destination file
		File destination = new File(filePath + formatter.format(now.getTime()));
		try {
			FileUtils.copyFile(file, destination);
		} catch (Exception e) {

		}
	}

	public static String createScreenShot() {
		try {
			File file = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.FILE);
			File destination = null;
			String timeStamp = LocalDate.now().toString().replaceAll(",", "-").replaceAll("T", "-Time");
			String filePath = System.getProperty("user.dir") + File.separator + "output/screenshot"
					+ System.currentTimeMillis() + ".png";
			destination = new File(filePath);
			FileUtils.copyFile(file, new File(filePath));
			return String.valueOf(destination.getAbsolutePath());

		} catch (WebDriverException unsupportedPlatform) {
			System.out.println("Unsupported Platform Exception occured");
			unsupportedPlatform.printStackTrace();
			return null;
		} catch (ClassCastException cce) {
			System.out.println("ClassCastException occured");
			cce.printStackTrace();
			return null;
		} catch (Exception e) {
			System.out.println("No screenshot found");
			e.printStackTrace();
			return null;
		}
	}

	public static void takeScreenShotNewReport() throws InterruptedException {
		Thread.sleep(1000);
		try {
			
			Reporter.addScreenCaptureFromPath((createScreenShot()), Driver.getInstance().getTitle());
		} catch (IOException e) {
			System.out.println("No ScreenShot Taken");
			e.printStackTrace();
		}
	}
}
