package com.ct.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class GmailSignIn {
	private WebDriver driver;
	public GmailSignIn() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	@FindBy(id="identifierId")
	public WebElement emailInput;
	
	@FindBy(id="identifierNext")
	public WebElement nextButton;
	
	@FindBy(xpath="(//input[@class='whsOnd zHQkBf'])[1]")
	public WebElement password;
	
	@FindBy(id="passwordNext")
	public WebElement sinInButton;
	
	@FindBy(xpath="//*[@email='training@cybertekschool.com']")
	public WebElement CTLoan;
	
	@FindBy(xpath="//*[@class='aSH']")
	public WebElement pdf;

}
