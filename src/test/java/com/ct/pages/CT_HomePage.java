package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;



public class CT_HomePage {

	public CT_HomePage(){
		
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	
	@FindBy(css=".tempHeadContBdr")
	public WebElement ct_Loan;
	
	
	@FindBy(name="SingleLine")
	public WebElement firstName;
	
	@FindBy(name="SingleLine1")
	public WebElement middleName;
	
	@FindBy(name="SingleLine2")
	public WebElement lastName;
	
	
}
