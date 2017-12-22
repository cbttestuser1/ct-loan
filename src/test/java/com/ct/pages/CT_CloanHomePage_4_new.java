package com.ct.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CT_CloanHomePage_4_new {
	
	public CT_CloanHomePage_4_new() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	
	/*

	* Financial Application

	*/



	@FindBy(xpath="//input[@id='Radio1_1']")

	public WebElement yesRadio;



	@FindBy(xpath="//input[@id='Radio1_2']")

	public WebElement noRadio;



	@FindBy(xpath="//input[@name='Number2']")

	public WebElement previousApps;





	@FindBy(xpath="//select[@name='Dropdown5']")

	public WebElement incomeType;

	@FindBy(xpath="//select[@name='Dropdown5']/option")

	public List<WebElement> incomeTypeList;



	@FindBy(xpath="//input[@id='Radio2_1']")

	public WebElement ownHouse;



	@FindBy(xpath="//input[@id='Radio2_2']")

	public WebElement rentHouse;



	@FindBy(xpath="//input[@name='Number3']")

	public WebElement monthlyRent;



	@FindBy(xpath="//input[@name='Number4']")

	public WebElement numberOfDep;



	@FindBy(xpath="//input[@name='Number5']")

	public WebElement savingAmount;



	@FindBy(xpath="//select[@name='Dropdown6']")

	public WebElement loanTerm;

	@FindBy(xpath="//select[@name='Dropdown6']/option")

	public List<WebElement> loanTermList;



	@FindBy(xpath="//input[@id='DecisionBox']")

	public WebElement checkBox;



	@FindBy(xpath="//input[@name='SingleLine5']")

	public WebElement signature;



	@FindBy(xpath="//input[@id='Date1-date']")

	public WebElement dateOfSign;



	@FindBy(xpath="//button[@elname='submit']")

	public WebElement button;

}
