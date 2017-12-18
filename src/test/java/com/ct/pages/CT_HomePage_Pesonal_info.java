package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CT_HomePage_Pesonal_info {
	public CT_HomePage_Pesonal_info(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//*[@id='SingleLine-li']/div[1]/span/input")
	
	public WebElement nameField;
	
	
	
	@FindBy(xpath="//*[@id='SingleLine2-li']/div[1]/span/input")
	public WebElement lastNameField;
	
	
	
	@FindBy(xpath="//*[@id='SingleLine1-li']/div[1]/span/input")
	public WebElement middleNameField;
	
	
	
	@FindBy(xpath ="//*[@id='Number-li']/div[1]/span/input")
	public WebElement SSNField;
	
	
	@FindBy(id="Radio_1")
	public WebElement genderMale;
	
	
	@FindBy(id="Radio_2")
	public WebElement genderFemale;
	
	@FindBy(id="Date-date")
	public WebElement dateField;
	
	@FindBy(xpath="//*[@id='formAccess']/div[1]/div/div/button")
	public WebElement nextButton;
}
