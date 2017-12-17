package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class ContactInfoPage {

	public ContactInfoPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	// added new code

	@FindBy(name = "Address_AddressLine1")
	public WebElement streetAddress;

	@FindBy(name = "Address_AddressLine2")
	public WebElement addressLine2;

	@FindBy(name = "Address_City")
	public WebElement city;

	@FindBy(name = "Address_Region")
	public WebElement region;

	@FindBy(name = "Address_ZipCode")
	public WebElement zipCode;

	@FindBy(name = "countrycode")
	public WebElement personalPhoneNum1;

	@FindBy(name = "first")
	public WebElement personalPhoneNum2;

	@FindBy(name = "second")
	public WebElement phoneNum3;

	@FindBy(name = "countrycode")
	public WebElement workPhoneNum1;

	@FindBy(name = "first")
	public WebElement workPhoneNum2;

	@FindBy(name = "second")
	public WebElement workPhoneNum3;

	@FindBy(name = "Number1")
	public WebElement extension;

	@FindBy(name = "Email")
	public WebElement personalEmail;

	@FindBy(name = "Email1")
	public WebElement workEmail;

}
