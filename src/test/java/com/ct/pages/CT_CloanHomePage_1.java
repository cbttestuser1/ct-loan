package com.ct.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

//Testing the updates
public class CT_CloanHomePage_1 {

	public CT_CloanHomePage_1() {

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

	public void fillOutTheForm(String firstName, String middleName, String lastName, String dateOfBirth,
			String personalFileID) throws InterruptedException {

		firstNameBox.sendKeys(firstName);
		middleNameBox.sendKeys(middleName);
		lastNameBox.sendKeys(lastName);
		dateOfBirthBox.sendKeys(dateOfBirth);
		personalFileIdBox.sendKeys(personalFileID);
		nextBtnP1.click();
		Thread.sleep(2000);

	}

	public void errorMessage() {

		nextBtnP1.click();

		String errorForFirstName = errorForFirstNameVariable.getText();
		// System.out.println(errorForFirstName);
		assertEquals(errorForFirstName, "Enter a value for this field.");

		String errorForLastName = errorForLastNameVariable.getText();
		// System.out.println(errorForLastName);
		assertEquals(errorForLastName, "Enter a value for this field.");

		String errorForRadioBtn = errorForRadioBtnVariable.getText();
		// System.out.println(errorForRadioBtn);
		assertEquals(errorForRadioBtn, "Select any choice for this field.");

		String errorForBirthDate = errorForBirthDateVariable.getText();
		// System.out.println(errorForBirthDate);
		assertEquals(errorForBirthDate, "Select a date for this field.");

		String errorForPersonalFileID = errorForPersonalFileIDVariable.getText();
		// System.out.println(errorForPersonalFileID);
		assertEquals(errorForPersonalFileID, "Enter a value for this field.");

	}

}
