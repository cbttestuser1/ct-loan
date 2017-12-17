package com.ct.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.HomePage_3;
import com.ct.utilities.Driver;

public class StepDefPage3 {
	WebDriver driver = Driver.getInstance();
	HomePage_3 homePage_3 = new HomePage_3();
	Select dd;

	// dd=new Select(homePage_3.durationOfElement);
	// int size = homePage_3.durationOfElemForIndex.size();
	//
	// System.out.println("Size of the list: "+size);
	//
	// for(
	// int i = 0;i<size;i++)
	// {
	//
	// dd.selectByIndex(i);
	//
	// }

}