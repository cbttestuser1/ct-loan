package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL_FinancialInfoPage {

	public CTL_FinancialInfoPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(xpath = "//h2[.='Financial Information']")
	public WebElement financialInformationSign;

	@FindBy(xpath = "(//input[@id='Radio1_1'])[1]")
	public WebElement CTLoanYesButton;

	@FindBy(xpath = "(//input[@id='Radio1_2'])[1]")
	public WebElement CTloanNoButton;

	@FindBy(xpath = "//input[@name='SingleLine3'][@type='text']")
	public WebElement AnnualIncomeField;

	@FindBy(xpath = "//select[@name='Dropdown5']")
	public WebElement IncomeTypeSelect;

	@FindBy(xpath = "//input[@id='Radio2_1']")
	public WebElement HomeOwnButton;

	@FindBy(xpath = "//input[@id='Radio2_2']")
	public WebElement HomeRentButton;

	@FindBy(xpath = "//input[@name='Number3']")
	public WebElement MonthlyExpanseField;

	@FindBy(xpath = "//input[@name='Number4']")
	public WebElement dependenceField;

	@FindBy(xpath = "//input[@name='Number5']")
	public WebElement savingField;

	@FindBy(xpath = "//select[@name='Dropdown6']")
	public WebElement desiredLoanTermSelect;

	@FindBy(xpath = "//input[@id='DecisionBox']")
	public WebElement confirmDecisionCheckButton;

	@FindBy(xpath = "//input[@id='Date1-date']")
	public WebElement date;

	@FindBy(css = ".formRelative.inlineBlock.submitWrapper")
	public WebElement submitButton;

	@FindBy(xpath = "//input[@name='SingleLine4']")
	public WebElement fullName;
	
	@FindBy(xpath = "//input[@name='SingleLine5']")
	public WebElement singleLineField;
	
	
	@FindBy(xpath = "//input[@name='Number2']")
	public WebElement aplicantrsCount;
	
	
	
}
