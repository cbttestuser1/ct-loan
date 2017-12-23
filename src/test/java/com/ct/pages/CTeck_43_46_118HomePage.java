package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ct.utilities.Driver;

public class CTeck_43_46_118HomePage {

	public CTeck_43_46_118HomePage() {

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

	@FindBy(css = "#Section2-li")
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

	@FindBy(xpath = "//*[@id='formAccess']/div[1]/div[2]/div/button/em")
	public WebElement NextButton;

	@FindBy(id = "Radio1_1")
	public WebElement FirstAppQ;

	@FindBy(xpath = "//input[@name='Number2']")
	public WebElement ApplicationNumber;

	@FindBy(xpath = "//input[@name='SingleLine3']")
	public WebElement Income;

	@FindBy(xpath = "//select [@name='Dropdown5']")
	public WebElement SelectDropDown;

	@FindBy(id = "Radio2_2")
	public WebElement OwnOrRent;

	@FindBy(xpath = "//input[@name='Number3']")
	public WebElement SpentByMonth;

	@FindBy(xpath = "//input[@name='Number4']")
	public WebElement Dependents;

	@FindBy(xpath = "//input[@name='Number5']")
	public WebElement Savings;

	@FindBy(xpath = "//select[@name='Dropdown6']")
	public WebElement SelectDropDown2;

	@FindBy(id = "DecisionBox")
	public WebElement Decision;

	@FindBy(xpath = "//input[@name='SingleLine4']")
	public WebElement FirstMLast;

	@FindBy(id = "Date1-date")
	public WebElement Date;

	@FindBy(xpath = "//input[@name='SingleLine5']")
	public WebElement SingleLine;

	@FindBy(xpath = "//button[@elname='submit']")
	public WebElement SubmitLastPage;

	@FindBy(xpath = "//span[contains(text(),'Your application was successfully submitted!')]")
	public WebElement confirmationMessage;

	public void cclickOnNextButton() {
		NextButton.click();
	}

	public boolean assertIsTextDisplayed(WebElement text) {
		if (text.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void selectFromDropDown(WebElement country, String value) {
		Select dropdown = new Select(country);
		dropdown.selectByVisibleText(value);

	}

}
