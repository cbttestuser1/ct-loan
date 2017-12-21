package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTeckLoan43ContatInfoHome {

	public CTeckLoan43ContatInfoHome() {

		PageFactory.initElements(Driver.getInstance(), this);

	}

	@FindBy(xpath = "//div[@class='qodef-content']//iframe")
	public WebElement iframe;

	@FindBy(xpath = "//input[@type='text'][@name='Address_AddressLine1']")
	public WebElement Address1;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement Address2;

	@FindBy(id = "error-Address")
	public WebElement ErrorMassage;

	@FindBy(css = "#Section1-li")
	public WebElement ContactText;

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

	public void clickOnNextButton() {
		NextButton.click();
	}

	public boolean assertIsTextDisplayed(WebElement text) {
		if (text.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void chooseCountry() {
		// TODO Auto-generated method stub

	}

}
