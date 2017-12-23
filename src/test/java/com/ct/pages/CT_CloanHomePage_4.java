package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ct.utilities.Driver;

public class CT_CloanHomePage_4 {

	public CT_CloanHomePage_4() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	// Element for Check "Financial Information" Locator, text
	public  final String expFinanInfoText = "Financial Information";
	@FindBy(xpath = "//*[@id='Secti.on3-li']//h2")
	public  WebElement acctualFinancialInfoText;

	/*
	 * Element for question: 'Is this your first application to CT Loan?'
	 */
	// Element for question text
	public  final String expFistApplicaionCTLoanText = "Is this your first application to CT Loan?";
	@FindBy(xpath = "//*[@id='Radio1-li']//label")
	public  WebElement isItFisrtApplicationCTLoanText;

	// Elements for "YES" and "NO" radio buttons, and method
	// for select specific radio button
	@FindBy(id = "Radio1_1")
	public  WebElement firstCTLoan_YES;

	@FindBy(id = "Radio1_2")
	public  WebElement firstCTLoan_NO;

	public  void selectFistCTLoan(String answer) {
		switch (answer.toLowerCase()) {
		case "yes":
			firstCTLoan_YES.click();
			break;
		case "no":
			firstCTLoan_NO.click();
			break;
		}
	}

	// Element for error First Application
	public  final String expErrorFirstApplicationCTLoanText = "Select any choice for this field.";
	@FindBy(css = "#error-Radio1")

	/*
	 * Check text for "What is your annual income?" and input box Element for this
	 */

	public  final String expAnnualIncomeText = "What is your annual income?";

	@FindBy(css = "#SingleLine3-li .labelName")
	public  WebElement annualIncomeText;

	@FindBy(xpath = "//*[@name='SingleLine3']")
	public  WebElement annualIncomeIputBox;

	// Element for ERROR Annual Income Input box
	public  final String errorAnnualIncomeText = "Enter a value for this field.";
	@FindBy(css = "#error-SingleLine3")
	public  WebElement errorAnnualIncome;

	/*
	 * Check text for "Income type" and element for Selection and method for
	 * selection
	 */

	public  final String expIncomeTypeText = "Income type";
	@FindBy(xpath = "//*[@id='Dropdown5-li']/*[@class = 'labelName']")
	public  WebElement incomeTypeText;

	// WebElement for 'Income Type' Selector
	@FindBy(xpath = "//select[@name='Dropdown5']")
	public  WebElement incomeTypeSelector;
	private  Select incomeType = new Select(incomeTypeSelector);

	public  enum IncomeTypeEnum {
		Biweekly, Monthly, Yearly
	}

	// Method for working with 'Income Type' Selector
	// selection by value with ENUM
	public  void selectIncomeTypeByValue(IncomeTypeEnum type) {
		switch (type) {
		case Biweekly:
			incomeType.selectByValue("Biweekly");
			break;
		case Monthly:
			incomeType.selectByValue("Monthly");
			break;
		case Yearly:
			incomeType.selectByValue("Yearly");
			break;
		}
	}

	// Element for ERROR of Income Type
	public  final String errorIncomeTypeText = "Select any choice for this field.";
	@FindBy(css = "#error-Dropdown5")
	public  WebElement errorIncomeType;
	/*
	 * Check text for 'Do you own a house or rent?'* and radio buttons for this
	 * question
	 */

	// Check text of question:
	public  final String expOwnOrRentHouseText = "Do you own a house or rent?";
	@FindBy(xpath = "//li[@id='Radio2-li']//label")
	public  WebElement isOwnOrRentHouseText;

	@FindBy(id = "Radio2_1")
	public  WebElement OwnOrRentHouse_OWN;

	@FindBy(id = "Radio2_2")
	public  WebElement OwnOrRentHouse_RENT;

	public  void selectOwnOrRentHouse(String answer) {
		switch (answer.toLowerCase()) {
		case "yes":
			OwnOrRentHouse_OWN.click();
			break;
		case "no":
			OwnOrRentHouse_RENT.click();
			break;
		}
	}

	/*
	 * Check Text for question: 'How much do you spent in one month?' and input box
	 * for text
	 */

	public  final String expSpendingInMonthText = "How much do you spent in one month?";

	@FindBy(xpath = "//li[@id='Number3-li']//label")
	public  WebElement SpendingInMonthText;

	@FindBy(xpath = "//li[@id='Number3-li']//*[@name='Number3']")
	public  WebElement SpendingInMonthInputBox;

	// Element for ERROR Spending in One Month
	public  final String errorSpendingInMonthText = "Enter a value for this field.";
	@FindBy(css = "#error-Number3")
	public  WebElement errorSpendingInMonth;

	/*
	 * Check Text for question: 'How many dependents do you have?' and input box for
	 * text
	 */

	public  final String expDependentsText = "How many dependents do you have?";

	@FindBy(xpath = "//li[@id='Number4-li']//label")
	public  WebElement DependentsText;

	@FindBy(xpath = "//li[@id='Number4-li']//*[@name='Number4']")
	public  WebElement DependentsInputBox;

	// Element for ERROR Dependents do you have
	public  final String errorDependentsText = "Enter a value for this field.";
	@FindBy(css = "#error-Number4")
	public  WebElement errorDependents;

	/*
	 * Check Text for question: 'How much savings do you have?' and input box for
	 * text
	 */

	public  final String expSavingText = "How much savings do you have?";

	@FindBy(xpath = "//li[@id='Number5-li']//label")
	public  WebElement SavingText;

	@FindBy(xpath = "//li[@id='Number5-li']//*[@name='Number5']")
	public  WebElement SavingInputBox;

	// Element for ERROR Saving do you have
	public  final String errorSavingText = "Enter a value for this field.";
	@FindBy(css = "#error-Number5")
	public  WebElement errorSaving;

	/*
	 * Check text for "Desired Loan Term?" and element for Selection and method for
	 * selection
	 */

	public  final String expDesiredLoanTermText = "Income type";
	@FindBy(xpath = "//li[@id='Dropdown6-li']//label")
	public  WebElement DesiredLoanTermText;

	// WebElement for 'Income Type' Selector
	@FindBy(css = ".Dropdown6")
	public  WebElement DesiredLoanTermSelector;
	private  Select DesiredLoanTerm = new Select(DesiredLoanTermSelector);

	public  enum DesiredLoanType {
		Months_12, Months_18, Months_24, Months_36,
	}

	// Method for working with 'Desired Loan Term' Selector
	// selection by value with ENUM
	public   void selectDesiredLoanTermByValue(DesiredLoanType type) {
		switch (type) {
		case Months_12:
			DesiredLoanTerm.selectByValue("12 months");
			break;
		case Months_18:
			DesiredLoanTerm.selectByValue("18 months");
			break;
		case Months_24:
			DesiredLoanTerm.selectByValue("24 months");
			break;
		case Months_36:
			DesiredLoanTerm.selectByValue("36 months");
			break;
		}
	}

	// Element for ERROR "Desired Loan Term?
	public   final String errorDesiredLoanTermText = "Select any choice for this field.";
	@FindBy(css = "#error-Dropdown6")
	public   WebElement errorDesiredLoanTerm;

	/*
	 * Check "Term Agreement" Text and CheckBox Element
	 */

	public   final String expTermAgreementText = "By checking this checkbox I confirm that all information I entered is correct and I agree to all terms and conditions.";

	@FindBy(xpath = "//li[@id='DecisionBox-li']//label")
	public   WebElement TermAgreementText;

	@FindBy(css = "DecisionBox")
	public   WebElement TermAgreemenCheckBox;

	// Element for ERROR TermAgreement Check
	public   final String errorTermAgreementText = "Check this field.";
	@FindBy(css = "#error-DecisionBox")
	public   WebElement errorTermAgreement;

	/*
	 * Input box for 'Single Line"
	 */

	@FindBy(css = "#SingleLine5")
	public   WebElement singleLineInputBox;

	/*
	 * "Submit" button
	 */

	@FindBy(css = ".fmSmtButton.submitColor.fmSmtButtom em")
	public   WebElement submitButton;
}
