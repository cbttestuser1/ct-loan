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
	public WebElement city1;

	@FindBy(css = "input[name='Address_Region']")
	public WebElement state1;

	@FindBy(css = "input[name='Address_ZipCode']")
	public WebElement zipCode;

	@FindBy(id = "Address_Country")
	public WebElement countryField;

	// updated xpath for country dd
	@FindBy(xpath = "//select[@name='Address_Country']//option")
	public List<WebElement> countryOptions;

	// Updated Error Msg Element
	@FindBy(id = "error-Address")
	public WebElement errorAddress;

	@FindBy(xpath = "(//span/input[@name='countrycode'])[2]")
	public WebElement personalNum1;

	@FindBy(xpath = "(//span/input[@name='first'])[2]")
	public WebElement personalNum2;

	@FindBy(xpath = "(//span/input[@name='second'])[2]")
	public WebElement personalNum3;

	// Updated Error msg element
	@FindBy(id = "error-PhoneNumber")
	public WebElement errorPersonalNum;

	@FindBy(xpath = "(//span/input[@name='countrycode'])[1]")
	public WebElement workNum1;

	@FindBy(xpath = "(//span/input[@name='first'])[1]")
	public WebElement workNum2;

	@FindBy(xpath = "(//span/input[@name='second'])[1]")
	public WebElement workNum3;

	// Updated Error Msg element
	@FindBy(id = "error-PhoneNumber1")
	public WebElement errorWorkNum1;

	@FindBy(css = "input[name='Number1']")
	public WebElement extension1;

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
	
	
public void fillOutTheForm1(String address, String address1, String city, String state, String zipcode, String country, String ppnumber, String wpnumber, String extention, String personal_email, String work_email) throws InterruptedException {
		
	streetAddress.sendKeys(address);
	addressLine2.sendKeys(address1);
	city1.sendKeys(city);
	state1.sendKeys(state);
	zipCode.sendKeys(zipcode);
	countryField.sendKeys(country);
	
	
	String[] number=ppnumber.split("-");
	personalNum1.sendKeys(number[0]);
	personalNum2.sendKeys(number[1]);
	personalNum3.sendKeys(number[2]);
	
	// RK - corrected code 
	String[] workNum=wpnumber.split("-");
	workNum1.sendKeys(workNum[0]);
	workNum2.sendKeys(workNum[1]);
	workNum3.sendKeys(workNum[2]);
	
	extension1.sendKeys(extention);
	personalEmail.sendKeys(personal_email);
	workEmail.sendKeys(work_email);
	
		Thread.sleep(1000);
		
		
	}

}
