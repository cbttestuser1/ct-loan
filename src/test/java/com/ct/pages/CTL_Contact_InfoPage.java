package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL_Contact_InfoPage {

	public CTL_Contact_InfoPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(xpath = "//h2[.='Contact Information']")
	public WebElement contactInformationText;

	@FindBy(xpath = "//input[@type='text'][@name='Address_AddressLine1']")
	public WebElement StreetAddressField;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement AddressLineTwo;

	@FindBy(id = "error-Address")
	public WebElement ErrorMassage;

	@FindBy(name = "Address_City")
	public WebElement City;

	@FindBy(name = "Address_Region")
	public WebElement State;

	@FindBy(name = "Address_ZipCode")
	public WebElement ZipCode;

	@FindBy(id = "Address_Country")
	public WebElement Country;

	@FindBy(xpath = "(//input[@name='countrycode'])[1]")
	public WebElement PersonalPhoneCountryCode;

	@FindBy(xpath = "(//input[@name='countrycode'])[2]")
	public WebElement WorkPhoneCountryCode;

	@FindBy(id = "error-PhoneNumber1")
	public WebElement errorMassageForPhoneNumber;

	@FindBy(xpath = "(//input[@maxlength='18'])[2]")
	public WebElement Extension;

	@FindBy(xpath = "//input[@name='Email']")
	public WebElement PersonalEmail;

	@FindBy(xpath = "//input[@name='Email1']")
	public WebElement WorkEmail;

	@FindBy(id = "error-Email")
	public WebElement errorMassageForEmail;

	@FindBy(xpath = "(//button[@elname='next'])[2]")
	public WebElement NextButton;

}
