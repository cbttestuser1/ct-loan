package com.ct.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTeckLoan43ContatInfoHome {

	public CTeckLoan43ContatInfoHome() {

		PageFactory.initElements(Driver.getInstance(), this);

	}

	@FindBy(xpath = "//input[@type='text'][@name='Address_AddressLine1']")
	public WebElement Address1;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement Address2;

	@FindBy(id = "error-Address")
	public WebElement ErrorMassage;

	@FindBy(name = "Address_City")
	public WebElement City;

	@FindBy(name = "Address_Region")
	public WebElement Region;

	@FindBy(name = "Address_ZipCode")
	public WebElement ZipCode;

	@FindBy(id = "Address_Country")
	public WebElement Country;

	@FindBy(xpath = "(//input[@name='countrycode'])[1]")
	public WebElement PersonalPhoneCountryCode;

	@FindBy(xpath = "//input[@name='first']")
	public WebElement PersonalPhoneFirst;

	@FindBy(xpath = "//input[@name='second']")
	public WebElement PersonalPhoneSecond;

	@FindBy(xpath = "(//input[@name='countrycode'])[2]")
	public WebElement WorkPhoneCountryCode;

	@FindBy(xpath = "(//input[@name='first'])[2]")
	public WebElement WorkPhoneFirst;

	@FindBy(xpath = "(//input[@name='second'])[2]")
	public WebElement WorkPhoneSecond;

	@FindBy(xpath = "(//input[@maxlength='18'])[2]")
	public WebElement Extension;

	@FindBy(xpath = "//input[@name='Email']")
	public WebElement PersonalEmail;

	@FindBy(xpath = "//input[@name='Email1']")
	public WebElement WorkEmail;

	@FindBy(xpath = "(//button[@class='fmSmtButton next_previous'])[3]")
	public WebElement NextButton;
}
