package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CT_HomePage_67 {
		
	public CT_HomePage_67(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	@FindBy(css="select[name='Dropdown']")
	public WebElement title;
	
	@FindBy(css="select[name='Dropdown1']")
	public WebElement department;
	
	@FindBy(css="select[name='Dropdown2']")
	public WebElement durOfEmpl;
	
	@FindBy(css="select[name='Dropdown3']")
	public WebElement aim;
	
	@FindBy(css="select[name='Dropdown4']")
	public WebElement superVisor;
	
	
}
