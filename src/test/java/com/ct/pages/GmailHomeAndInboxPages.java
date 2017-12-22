package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class GmailHomeAndInboxPages {
	
	// email from CT Loan ---> training@cybertekschool.com
	
	public GmailHomeAndInboxPages() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	 @FindBy (xpath ="//*[@id='identifierId']")
	 public WebElement emailField;
	 
	 
	 @FindBy(xpath = "//span[contains(text(),'Next')]")
	 public WebElement nextButton;
	 
	 @FindBy(xpath="//input[@name='password']")
	 public WebElement passwordField;
	 
	 @FindBy( xpath="//a[contains(text(),'Inbox')]")
	 public WebElement inboxButton;

	 @FindBy ( xpath="(//span[@email='training@cybertekschool.com'])[1]")
	 public WebElement emailTable;
	 
	 @FindBy (xpath="//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")
	 public WebElement gmailLogoAfterSignIn;
	 
	 @FindBy (xpath="//*[@id=':3a']/span") 
	 public WebElement ctlEmail;
	 
	 
	 @FindBy ( xpath ="//*[@alt='Attachments']")
	 public WebElement PDFattachment;
	 
	 @FindBy ( xpath ="//table//table//tr[31]//td[3]")
	 public WebElement uniqueID;
	 
	 
	 }