package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL52_HomePage {

	public CTL52_HomePage() {

		PageFactory.initElements(Driver.getInstance(), this);

	}
	
	@FindBy(css = "input[name='SingleLine']")
	public WebElement firstName;

	@FindBy(css = "input[name='SingleLine1']")
	public WebElement midleName;

	@FindBy(css = "input[name='SingleLine2']")
	public WebElement lastName;

	@FindBy(id = "#Radio_1")
	public WebElement gender;

	@FindBy(css = "input[name='date']")
	public WebElement dob;

	@FindBy(css = "input[name='Number']")
	public WebElement id;

	@FindBy(css = "button[class='fmSmtButton next_previous']")
	public WebElement nextIp;

	/*
	@FindBy(id = "SingleLine1-li")
	public WebElement middleName;
	
	@FindBy(id = "SingleLine2-li")
	public WebElement lastName;
	
	@FindBy(id = "Radio_2")
	public WebElement genderFemale;
	
	
	@FindBy(id = "Date-date")
	public WebElement date;
	
	
	@FindBy(id = "Number-li")
	public WebElement personalID;
	
	@FindBy(id = "formAccess")
	public WebElement nextButton;*/
	

}
