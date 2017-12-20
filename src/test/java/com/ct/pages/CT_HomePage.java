package com.ct.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ct.utilities.Driver;


public class CT_HomePage {
	
	public CT_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String initialsErrorText = "Enter a value for this field.";
	public String dateOfBirthErrorMsg = "Select a date for this field.";
	public String genderErrorText = "Select any choice for this field.";
	
	
	/**
	 * Personal Information Page WebElements.
	 */
	
	@FindBy(xpath="//div[@class='qodef-content']//iframe")
	public WebElement iframe;
	
	@FindBy(xpath = "//input[@name='SingleLine']")
	public WebElement firstNameField;
	 
	@FindBy(xpath = "//input[@name='SingleLine1']")
	public WebElement middleNameField;
	
	@FindBy(xpath = "//input[@name='SingleLine2']")
	public WebElement lastNameField;
	
	@FindBy (xpath = "//input[@id='Date-date']")
	public WebElement dateOfBirthField;
	
	@FindBy(xpath = "//*[@id='Radio_1']")
	public WebElement maleGender;
	
	@FindBy(xpath = "//*[@id='Radio_2']")
	public WebElement femaleGender;
	
	@FindBy(xpath="//label[contains(text(), 'Personal File ID')]/following::input")
	public WebElement SSN_Field;
	
	@FindBy(xpath= "(//button[@class='fmSmtButton next_previous'])[1]")
	public WebElement nextButton;
	
	@FindBy(css = "#Section1-li")
	public WebElement personalText;
	
	@FindBy(xpath ="//p[@id='error-SingleLine']")
	public WebElement firstNameErrorMsg;
	
	@FindBy(xpath ="//p[@id='error-SingleLine2']")
	public WebElement lastNameErrorMsg;
	
	@FindBy(xpath ="//p[@id='error-Date']")
	public WebElement birthDateErrorMsg;
	
	@FindBy(xpath ="//p[@id='error-Radio']")
	public WebElement genderErrorMsg;
	
	@FindBy(xpath ="//p[@id='error-Number']")
	public WebElement ssnErrorMsg;
	
	
	

	/**
	 * Sends initials to first name field.
	 * @param String firstName
	 */
	public void sendFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}
	
	/**
	 * Sends initials to last name field.
	 * @param String lastName
	 */
	public void sendLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	
	/**
	 * Sends initials to middle name field.
	 * @param String middleName
	 */
	public void sendMiddleName(String middleName) {
		middleNameField.sendKeys(middleName);
	}
	
	
	/**
	 * clicks on next button
	 */
	public void clickOnNextButton() {
		nextButton.click();
	}
	
	/**
	 * checks if Contact Information text is displayed in Contact Information page
	 * @param WebElement text
	 * @return boolean
	 */
	public boolean assertIsTextDisplayed(WebElement text) {
		if (text.isDisplayed()) {
			return true;
		}
		return false;
	}	
	
	/**
	 * Checks if first name error message is displayed
	 * @return boolean.
	 */
	public boolean firstNameErrorMessageIsPresent() {
		boolean s=firstNameErrorMsg.isDisplayed();
		System.out.println("firstNAme "+s);
		return firstNameErrorMsg.isDisplayed();
	}
	
	/**
	 * Checks if last name error message is displayed
	 * @return boolean.
	 */
	public boolean lastNameErrorMessageIsPresent() {
		boolean l =lastNameErrorMsg.isDisplayed();
		System.out.println("lastName "+l);
		return lastNameErrorMsg.isDisplayed();
	}
	
	/**
	 * Checks if birth date error message is displayed
	 * @return boolean.
	 */
	public boolean birthDateErrorMessageIsPresent() {
		boolean b = birthDateErrorMsg.isDisplayed();
		System.out.println("birthDate "+b);
		return birthDateErrorMsg.isDisplayed();
	}
	
	/**
	 * Checks if gender error message is displayed
	 * @return boolean.
	 */
	public boolean genderErrorMessageIsPresent() {
		boolean b = genderErrorMsg.isDisplayed();
		System.out.println("Gender "+b);
		System.out.println(genderErrorMsg.getText());
		return genderErrorMsg.isDisplayed();
	}
	
	/**
	 * Checks if ssn error message is displayed
	 * @return boolean.
	 */
	public boolean ssnErrorMessageIsPresent() {
		boolean ssn = ssnErrorMsg.isDisplayed();
		System.out.println("SSN "+ssn);
		System.out.println(ssnErrorMsg.getText());
		return ssnErrorMsg.isDisplayed();
	}
	
	/**
	 * checks radio button on Gender field
	 */
	public void chosseGender() {
		boolean isSelected = maleGender.isSelected();
		if (!isSelected) {
			maleGender.click();
		} else {
			System.out.println("Gender option is already selected");
		}
	}
	
	
	public void genderSelector(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			maleGender.click();
		}else if(gender.equalsIgnoreCase("female")) {
			femaleGender.click();
		}
	}
	
	public static void elementIsClickable(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }
    }	
	
}