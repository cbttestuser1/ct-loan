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
	public WebElement Address1;

	@FindBy(name = "Address_AddressLine2")
	public WebElement Address2;

	@FindBy(name = "Address_City")
	public WebElement City;

	@FindBy(name = "Address_Region")
	public WebElement Region;

	@FindBy(name = "Address_ZipCode")
	public WebElement ZipCode;
	
	@FindBy(xpath = "//select[@name='Address_Country']")
	public WebElement Country;

	@FindBy(name = "countrycode")
	public WebElement Cell1;

	@FindBy(name = "first")
	public WebElement Cell2;

	@FindBy(name = "second")
	public WebElement Cell3;//changed from phoneNum3

	@FindBy(xpath = "(//input[@name='countrycode'])[2]")
	public WebElement WorkNum1;//changed from name to xpath

	@FindBy(xpath = "(//input[@name='first'])[2]")
	public WebElement WorkNum2;//changed from name to xpath

	@FindBy(xpath = "(//input[@name='second'])[2]")
	public WebElement WorkNum3;//changed from name to xpath

	@FindBy(name = "Number1")
	public WebElement Extension;

	@FindBy(name = "Email")
	public WebElement Email;

	@FindBy(name = "Email1")
	public WebElement WorkEmail;

}