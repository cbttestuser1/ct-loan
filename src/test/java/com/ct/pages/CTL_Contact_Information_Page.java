package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL_Contact_Information_Page {

	public CTL_Contact_Information_Page() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(xpath = "(//button[@class='fmSmtButton next_previous'])[3]")
	public WebElement nextContInfo;

	@FindBy(id = "error-Address")
	public WebElement errorAdres;

	@FindBy(id = "error-PhoneNumber")
	public WebElement errorPerPhone;

	@FindBy(id = "error-PhoneNumber1")
	public WebElement errorWorkPhone;

	@FindBy(id = "error-Email")
	public WebElement errorPerEmail;

	@FindBy(id = "error-Email1")
	public WebElement errorWorkEmail;
	
	@FindBy(xpath = "//*[contains(@name,'Address_AddressLine1')]")
	public WebElement addressInputField;
	
	@FindBy(xpath = "//*[contains(@name,'Address_AddressLine2')]")
	public WebElement addressInputField2;
	
	@FindBy(xpath = "//*[contains(@name,'Address_City')]")
	public WebElement city;
	
	@FindBy(xpath = "//*[contains(@name,'Address_Region')]")
	public WebElement state;
	
	@FindBy(xpath = "//*[contains(@name,'Address_ZipCode')]")
	public WebElement zip;
	
	@FindBy(id = "Address_Country")
	public WebElement country;
	
	@FindBy(xpath = "//*[contains(@name,'countrycode')]")
	public WebElement code;

	@FindBy(xpath = "//*[contains(@name,'first')]")
	public WebElement firstThreeNums;
	
	@FindBy(xpath = "//*[contains(@name,'second')]")
	public WebElement secondSetNums;
	
	@FindBy(xpath = ".//*[@id='PhoneNumber1-li']/div[1]/div/span[1]/input")
	public WebElement code1;

	@FindBy(xpath = ".//*[@id='PhoneNumber1-li']/div[1]/div/span[3]/input")
	public WebElement firstThreeNums1;
	
	@FindBy(xpath = ".//*[@id='PhoneNumber1-li']/div[1]/div/span[5]/input")
	public WebElement secondSetNums1;
	
	@FindBy(xpath = "//*[contains(@name,'Email')]")
	public WebElement email1;
	
	@FindBy(xpath = "//*[contains(@name,'Email1')]")
	public WebElement email2;


}