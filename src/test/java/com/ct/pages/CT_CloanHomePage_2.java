package com.ct.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CT_CloanHomePage_2 {
	public CT_CloanHomePage_2() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(css = "input[name='Address_AddressLine1']")
	public WebElement streetAddress;

	// correct Element Locator (RuslanK)
	@FindBy(css = "input[name='Address_AddressLine2']")
	public WebElement addressLine2;

	@FindBy(css = "input[name='Address_City']")
	public WebElement city;

	@FindBy(css = "input[name='Address_Region']")
	public WebElement state;

	@FindBy(css = "input[name='Address_ZipCode']")
	public WebElement zipCode;

	@FindBy(id = "Address_Country")
	public WebElement country;

	// updated xpath for country dd
	@FindBy(xpath = "//select[@name='Address_Country']//option")
	public List<WebElement> countryOptions;

	// Updated Error Msg Element
	@FindBy(id = "error-Address")
	public WebElement errorAddress;

	@FindBy(xpath = "(//span/input[@name='countrycode'])[1]")
	public WebElement personalNum1;

	@FindBy(xpath = "(//span/input[@name='first'])[1]")
	public WebElement personalNum2;

	@FindBy(xpath = "(//span/input[@name='second'])[1]")
	public WebElement personalNum3;

	// Updated Error msg element
	@FindBy(id = "error-PhoneNumber")
	public WebElement errorPersonalNum;

	@FindBy(xpath = "(//span/input[@name='countrycode'])[2]")
	public WebElement workNum1;

	@FindBy(xpath = "(//span/input[@name='first'])[2]")
	public WebElement workNum2;

	@FindBy(xpath = "(//span/input[@name='second'])[2]")
	public WebElement workNum3;

	// Updated Error Msg element
	@FindBy(id = "error-PhoneNumber1")
	public WebElement errorWorkNum1;

	@FindBy(css = "input[name='Number1']")
	public WebElement extension;

	// Updater Error msg element
	@FindBy(id = "error-Number1")
	public WebElement extendNum;

	@FindBy(css = "input[name='Email']")
	public WebElement personalEmail;

	// Updated Error Msg element
	@FindBy(id = "error-Email")
	public WebElement errorPersonalEmail;

	@FindBy(css = "input[name='Email1']")
	public WebElement workEmail;

	// Updated Erorr Msg element
	@FindBy(id = "error-Email1")
	public WebElement errorWorkEmail;

	@FindBy(xpath = "(//div/button[@elname='next'])[2]")
	public WebElement next;

	@FindBy(xpath = "(//div/button[@elname='back'])[1]")
	public WebElement back;

}
