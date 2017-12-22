package com.ct.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CT_CloanJDBCProject {
	
	/*
	 * Personal Information Page
	 */
	public CT_CloanJDBCProject() {

		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(xpath = "//input[@name='SingleLine']")
	public WebElement firstNameBox;

	@FindBy(xpath = "//input[@name='SingleLine1']")
	public WebElement middleNameBox;

	@FindBy(xpath = "//input[@name='SingleLine2']")
	public WebElement lastNameBox;

	@FindBy(id = "Date-date")
	public WebElement dateOfBirthBox;

	@FindBy(xpath = "//input[@name='Number']")
	public WebElement personalFileIdBox;

	@FindBy(xpath = "//*[@id='Radio_1']")
	public WebElement maleBtn;

	@FindBy(xpath = "//*[@id='Radio_2']")
	public WebElement femaleBtn;

	@FindBy(xpath = "(//div/button[@elname='next'])[1]")
	public WebElement nextBtnP1;

	@FindBy(xpath = "//p[@id='error-SingleLine']")
	public WebElement errorForFirstNameVariable;

	@FindBy(xpath = "//p[@id='error-SingleLine2']")
	public WebElement errorForLastNameVariable;

	@FindBy(xpath = "//p[@id='error-Date']")
	public WebElement errorForBirthDateVariable;

	@FindBy(xpath = "//p[@id='error-Number']")
	public WebElement errorForPersonalFileIDVariable;

	@FindBy(xpath = "//p[@id='error-Radio']")
	public WebElement errorForRadioBtnVariable;

/*
 * Contact Information	
 */
	
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

	/*
	 * Financial Application
	 */
	
	@FindBy(xpath="//input[@id='Radio1_1']")
	public WebElement yesRadio;
	
	@FindBy(xpath="//input[@id='Radio1_2']")
	public WebElement noRadio;
	
	@FindBy(xpath="//input[@name='SingleLine3']")
	public WebElement annualIncome;
	
	
	@FindBy(xpath="//select[@name='Dropdown5']")
	public  WebElement incomeType;
	@FindBy(xpath="//select[@name='Dropdown5']/option")
	public List<WebElement> incomeTypeList;
	
	@FindBy(xpath="//input[@id='Radio2_1']")
	public WebElement ownHouse;
	
	@FindBy(xpath="//input[@id='Radio2_2']")
	public WebElement rentHouse;
	
	@FindBy(xpath="//input[@name='Number3']")
	public WebElement monthlyRent;
	
	@FindBy(xpath="//input[@name='Number4']")
	public WebElement numberOfDep;
	
	@FindBy(xpath="//input[@name='Number5']")
	public WebElement savingAmount;
	
	@FindBy(xpath="//select[@name='Dropdown6']")
	public  WebElement loanTerm;
	@FindBy(xpath="//select[@name='Dropdown6']/option")
	public List<WebElement> loanTermList;
	
	@FindBy(id="DecisionBox")
	public WebElement checkBox;
	
	@FindBy(xpath="//input[@name='SingleLine4']")
	public WebElement fullNameField;
	
	@FindBy(xpath="//input[@name='SingleLine5']")
	public WebElement signature;
	
	
	@FindBy(xpath="//input[@id='Date1-date']")
	public WebElement dateOfSign;
	
	@FindBy(xpath="//button[@elname='submit']")
	public WebElement button;
	
	
	public void fillOutTheForm3(String app_option, String annual_income, String income_type, String house_option,
			String spend_option, String dep_count, String count_of_savings, String term_option) throws InterruptedException {
		
		if(app_option.equalsIgnoreCase("yes")){
		   noRadio.click();
		}else{
			yesRadio.click();
		}
		annualIncome.sendKeys(annual_income);
		incomeType.sendKeys(income_type);
		if(house_option.equalsIgnoreCase("Rent")){
			rentHouse.click();
		}
		monthlyRent.sendKeys(spend_option);
		numberOfDep.sendKeys(dep_count);
		savingAmount.sendKeys(count_of_savings);
		loanTerm.sendKeys(term_option);
		
		
		
	
	}


	public void fillOut(String fullName, String date) {
		
		fullNameField.sendKeys(fullName);
		dateOfSign.sendKeys(date);
	}
	
	
	
	/*
	 * element after SUBMIT
	 */
		
	@FindBy(xpath = "//*[contains(text(), 'Your loan application ID')]")
    public WebElement idMessage;
	
}
