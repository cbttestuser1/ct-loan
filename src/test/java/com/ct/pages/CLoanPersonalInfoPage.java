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
	
	
	public void fillOutTheForm(String firstName, String middleName, String lastName, String dateOfBirth, String idNum ) {
		
		firstNameBox.sendKeys(firstName);
		middleNameBox.sendKeys(middleName);
		lastNameBox.sendKeys(lastName);
		dateOfBirthBox.sendKeys(dateOfBirth);
		personalFileIdBox.sendKeys(idNum);
		
		
	}

	}
