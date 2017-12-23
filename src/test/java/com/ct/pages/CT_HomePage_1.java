package com.ct.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CT_HomePage_1 {
	WebDriver driver;
	
	
	public CT_HomePage_1(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	@FindBy(css="input[name='SingleLine']")
	public WebElement firstNam;
	
	@FindBy(css="input[name='SingleLine1']")
	public WebElement middleNam;
	
	@FindBy(css="input[name='SingleLine2']")
	public WebElement lastNam;
	
	@FindBy(id="Date-date")
	public WebElement date;
	
	@FindBy(css="*[name='Number']")
	public WebElement personalID;

	
	public void fillOutTheForm(String firstName, String middleName, String lastName, String dateOfBirth, String idNum ) {

        firstNam.sendKeys(firstName);
        middleNam.sendKeys(middleName);
        lastNam.sendKeys(lastName);
        date.sendKeys(dateOfBirth);
        personalID.sendKeys(idNum);
	}
	
        public void errorMSG(){
		
		String errorName=driver.findElement(By.id("error-SingleLine")).getText();
		String errorMidName=driver.findElement(By.id("error-SingleLine1")).getText();
		String errorLasName=driver.findElement(By.id("error-SingleLine2")).getText();
		String errorDate=driver.findElement(By.id("error-Date")).getText();
		String errorNumber=driver.findElement(By.id("error-Number")).getText(); 
		
	}
}


