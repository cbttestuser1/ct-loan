package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;



public class CT_59_employmentInfo {
	
	public CT_59_employmentInfo() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy (name="Dropdown")
	public WebElement titleSelect;
	
	@FindBy(name="Dropdown1")
	public WebElement departSelect;
	
	@FindBy(name="Dropdown2")
	public WebElement durationSelect;
	
	@FindBy(name="Dropdown3")
	public WebElement purposeSelect;
	
	@FindBy(name="Dropdown4")
	public WebElement superviseSelect;

}