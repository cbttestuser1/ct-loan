package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class FinancialInfoPage {

	public FinancialInfoPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(id = "Radio1_1")
	public WebElement firstAppYes;

	@FindBy(id = "Radio1_2")
	public WebElement firstAppNo;

	@FindBy(name = "Number2")
	public WebElement applications;

	@FindBy(name = "SingleLine3")
	public WebElement annualIncome;

	@FindBy(name = "Dropdown5")
	public WebElement incomeType;

	@FindBy(id = "Radio2_1")
	public WebElement ownHouse;

	@FindBy(id = "Radio2_2")
	public WebElement rentHouse;

	@FindBy(name = "Number3")
	public WebElement montlyRent;

	@FindBy(name = "Number4")
	public WebElement dependents;

	@FindBy(name = "Number5")
	public WebElement savingAmount;

	@FindBy(name = "Dropdown6")
	public WebElement loanTerm;

	@FindBy(id = "DecisionBox")
	public WebElement decisionBox;

	@FindBy(name = "SingleLine4")
	public WebElement fullName;

	@FindBy(name = "SingleLine5")
	public WebElement singleLine;

	@FindBy(id = "Date1-date")
	public WebElement calender;

	@FindBy(xpath = "//button[@class='fmSmtButton submitColor fmSmtButtom']")
	public WebElement submitButton;

	@FindBy(xpath = "//*[@id='richTxtMsgSpan']/label/span")
	public WebElement confirmation;

}
