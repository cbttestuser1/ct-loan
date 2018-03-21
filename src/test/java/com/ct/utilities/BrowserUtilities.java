package com.ct.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BrowserUtilities {

	public static String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	public static void switchTabs(String url) {
		String defaultTab = Driver.getInstance().getWindowHandle();
		for (String windowHandle : Driver.getInstance().getWindowHandles()) {
			Driver.getInstance().switchTo().window(windowHandle);
			if (Driver.getInstance().getCurrentUrl().contains(url)) {
				return;
			}
		}
		Driver.getInstance().switchTo().window(defaultTab);
	}
}
