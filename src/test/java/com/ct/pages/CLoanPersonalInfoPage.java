package com.ct.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CLoanPersonalInfoPage {

	public CLoanPersonalInfoPage() {
		
		PageFactory.initElements(Driver.getInstance(), this);		
	}
	

	@FindBy (xpath="//input[@name='SingleLine']")
	public  WebElement firstNameBox;
	
	@FindBy (xpath="//input[@name='SingleLine1']")
	public  WebElement middleNameBox;
	
	@FindBy (xpath="//input[@name='SingleLine2']")
	public  WebElement lastNameBox;
	
	@FindBy (id="Date-date")
	public  WebElement dateOfBirthBox;
	
	@FindBy (xpath="//input[@name='Number']")
	public  WebElement personalFileIdBox;
	
	@FindBy (xpath="//*[@id='Radio_1']")
	public  WebElement maleBtn;
	
	@FindBy (xpath="//*[@id='Radio_2']")
	public  WebElement femaleBtn;
	
	@FindBy (xpath="(//div/button[@elname='next'])[1]")
	public  WebElement nextBtnP1; 
	
	@FindBy (xpath="//p[@id='error-SingleLine']")
	public  WebElement errorForFirstName; 
	
	@FindBy (xpath="//p[@id='error-SingleLine2']")
	public  WebElement errorForLastName; 
	
	@FindBy (xpath="//p[@id='error-Date']")
	public  WebElement errorForBirthDate; 
	
	@FindBy (xpath="//p[@id='error-Number']")
	public  WebElement errorForPersonalFileID; 
	
	@FindBy (xpath="//p[@id='error-Radio']")
	public  WebElement errorForRadioBtn; 
	
	
	
	
	public void fillOutTheForm(String firstName, String middleName, String lastName, String dateOfBirth, String personalFileID) throws InterruptedException {
		
		firstNameBox.sendKeys(firstName);
		middleNameBox.sendKeys(middleName);
		lastNameBox.sendKeys(lastName);
		dateOfBirthBox.sendKeys(dateOfBirth);
		personalFileIdBox.sendKeys(personalFileID);
		nextBtnP1.click();
		Thread.sleep(2000);
		
		
	}

	
	}
