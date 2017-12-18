package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL_Personal_Information_Page {

	public CTL_Personal_Information_Page() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(css = "input[name='SingleLine']")
	public WebElement firstName;

	@FindBy(css = "input[name='SingleLine1']")
	public WebElement midleName;

	@FindBy(css = "input[name='SingleLine2']")
	public WebElement lastName;

	@FindBy(css="label[for='Radio_1']")
	public WebElement gender;

	@FindBy(css = "input[name='date']")
	public WebElement dob;

	@FindBy(css = "input[name='Number']")
	public WebElement id;

	@FindBy(css = "button[class='fmSmtButton next_previous']")
	public WebElement nextIp;

}
