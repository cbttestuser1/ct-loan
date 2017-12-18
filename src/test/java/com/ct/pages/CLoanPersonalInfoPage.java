package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CLoanPersonalInfoPage {

	public CLoanPersonalInfoPage() {
		
		PageFactory.initElements(Driver.getInstance(), this);		
	}
	

	@FindBy (xpath="//input[@name='SingleLine']")
	public static WebElement firstNameBox;
	
	@FindBy (xpath="//input[@name='SingleLine1']")
	public static WebElement middleNameBox;
	
	@FindBy (xpath="//input[@name='SingleLine2']")
	public static WebElement lastNameBox;
	
	@FindBy (id="Date-date")
	public static WebElement dateOfBirthBox;
	
	@FindBy (xpath="//input[@name='Number']")
	public static WebElement personalFileIdBox;
	
	@FindBy (xpath="//*[@id='Radio_1']")
	public static WebElement maleBtn;
	
	@FindBy (xpath="//*[@id='Radio_2']")
	public static WebElement femaleBtn;
	
	@FindBy (xpath="(//div/button[@elname='next'])[1]")
	public static WebElement nextBtnP1; 
	
	
	public void fillOutTheForm(String firstName, String middleName, String lastName, String dateOfBirth, String idNum ) {
		
		firstNameBox.sendKeys(firstName);
		middleNameBox.sendKeys(middleName);
		lastNameBox.sendKeys(lastName);
		dateOfBirthBox.sendKeys(dateOfBirth);
		personalFileIdBox.sendKeys(idNum);
		
		
	}

	}
