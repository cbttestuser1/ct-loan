package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL_BasePage {

	public CTL_BasePage(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Your application was successfully submitted!')]")
	public WebElement successMessage;

	
	
	
}
