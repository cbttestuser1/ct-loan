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
	public static final String expFinanInfoText = "Financial Information";
	@FindBy(xpath = "//*[@id='Secti.on3-li']//h2")
	public static WebElement acctualFinancialInfoText;

	/*
	 * Element for question: 'Is this your first application to CT Loan?'
	 */
	// Element for question text
	public static final String expFistApplicaionCTLoanText = "Is this your first application to CT Loan?";
	@FindBy(xpath = "//*[@id='Radio1-li']//label")
	public static WebElement isItFisrtApplicationCTLoanText;

	// Elements for "YES" and "NO" radio buttons, and method
	// for select specific radio button
	@FindBy(id = "Radio1_1")
	public static WebElement firstCTLoan_YES;

	@FindBy(id = "Radio1_2")
	public static WebElement firstCTLoan_NO;

	public static void selectFistCTLoan(String answer) {
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
	public static final String expErrorFirstApplicationCTLoanText = "Select any choice for this field.";
	@FindBy(css = "#error-Radio1")

	/*
	 * Check text for "What is your annual income?" and input box Element for this
	 */

	public static final String expAnnualIncomeText = "What is your annual income?";

	@FindBy(css = "#SingleLine3-li .labelName")
	public static WebElement annualIncomeText;

	@FindBy(xpath = "//*[@name='SingleLine3']")
	public static WebElement annualIncomeIputBox;

	// Element for ERROR Annual Income Input box
	public static final String errorAnnualIncomeText = "Enter a value for this field.";
	@FindBy(css = "#error-SingleLine3")
	public static WebElement errorAnnualIncome;

	/*
	 * Check text for "Income type" and element for Selection and method for
	 * selection
	 */

	public static final String expIncomeTypeText = "Income type";
	@FindBy(xpath = "//*[@id='Dropdown5-li']/*[@class = 'labelName']")
	public static WebElement incomeTypeText;

	// WebElement for 'Income Type' Selector
	@FindBy(xpath = "//select[@name='Dropdown5']")
	public static WebElement incomeTypeSelector;
	private static Select incomeType = new Select(incomeTypeSelector);

	public static enum IncomeTypeEnum {
		Biweekly, Monthly, Yearly
	}

	// Method for working with 'Income Type' Selector
	// selection by value with ENUM
	public static void selectIncomeTypeByValue(IncomeTypeEnum type) {
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
	public static final String errorIncomeTypeText = "Select any choice for this field.";
	@FindBy(css = "#error-Dropdown5")
	public static WebElement errorIncomeType;
	/*
	 * Check text for 'Do you own a house or rent?'* and radio buttons for this
	 * question
	 */

	// Check text of question:
	public static final String expOwnOrRentHouseText = "Do you own a house or rent?";
	@FindBy(xpath = "//li[@id='Radio2-li']//label")
	public static WebElement isOwnOrRentHouseText;

	@FindBy(id = "Radio2_1")
	public static WebElement OwnOrRentHouse_OWN;

	@FindBy(id = "Radio2_2")
	public static WebElement OwnOrRentHouse_RENT;

	public static void selectOwnOrRentHouse(String answer) {
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

	public static final String expSpendingInMonthText = "How much do you spent in one month?";

	@FindBy(xpath = "//li[@id='Number3-li']//label")
	public static WebElement SpendingInMonthText;

	@FindBy(xpath = "//li[@id='Number3-li']//*[@name='Number3']")
	public static WebElement SpendingInMonthInputBox;

	// Element for ERROR Spending in One Month
	public static final String errorSpendingInMonthText = "Enter a value for this field.";
	@FindBy(css = "#error-Number3")
	public static WebElement errorSpendingInMonth;

	/*
	 * Check Text for question: 'How many dependents do you have?' and input box for
	 * text
	 */

	public static final String expDependentsText = "How many dependents do you have?";

	@FindBy(xpath = "//li[@id='Number4-li']//label")
	public static WebElement DependentsText;

	@FindBy(xpath = "//li[@id='Number4-li']//*[@name='Number4']")
	public static WebElement DependentsInputBox;

	// Element for ERROR Dependents do you have
	public static final String errorDependentsText = "Enter a value for this field.";
	@FindBy(css = "#error-Number4")
	public static WebElement errorDependents;

	/*
	 * Check Text for question: 'How much savings do you have?' and input box for
	 * text
	 */

	public static final String expSavingText = "How much savings do you have?";

	@FindBy(xpath = "//li[@id='Number5-li']//label")
	public static WebElement SavingText;

	@FindBy(xpath = "//li[@id='Number5-li']//*[@name='Number5']")
	public static WebElement SavingInputBox;

	// Element for ERROR Saving do you have
	public static final String errorSavingText = "Enter a value for this field.";
	@FindBy(css = "#error-Number5")
	public static WebElement errorSaving;

	/*
	 * Check text for "Desired Loan Term?" and element for Selection and method for
	 * selection
	 */

	public static final String expDesiredLoanTermText = "Income type";
	@FindBy(xpath = "//li[@id='Dropdown6-li']//label")
	public static WebElement DesiredLoanTermText;

	// WebElement for 'Income Type' Selector
	@FindBy(css = ".Dropdown6")
	public static WebElement DesiredLoanTermSelector;
	private static Select DesiredLoanTerm = new Select(DesiredLoanTermSelector);

	public static enum DesiredLoanType {
		Months_12, Months_18, Months_24, Months_36,
	}

	// Method for working with 'Desired Loan Term' Selector
	// selection by value with ENUM
	public static void selectDesiredLoanTermByValue(DesiredLoanType type) {
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
	public static final String errorDesiredLoanTermText = "Select any choice for this field.";
	@FindBy(css = "#error-Dropdown6")
	public static WebElement errorDesiredLoanTerm;

	/*
	 * Check "Term Agreement" Text and CheckBox Element
	 */

	public static final String expTermAgreementText = "By checking this checkbox I confirm that all information I entered is correct and I agree to all terms and conditions.";

	@FindBy(xpath = "//li[@id='DecisionBox-li']//label")
	public static WebElement TermAgreementText;

	@FindBy(css = "DecisionBox")
	public static WebElement TermAgreemenCheckBox;

	// Element for ERROR TermAgreement Check
	public static final String errorTermAgreementText = "Check this field.";
	@FindBy(css = "#error-DecisionBox")
	public static WebElement errorTermAgreement;

	/*
	 * Input box for 'Single Line"
	 */

	@FindBy(css = "#SingleLine5")
	public static WebElement singleLineInputBox;

	/*
	 * "Submit" button
	 */

	@FindBy(css = ".fmSmtButton.submitColor.fmSmtButtom em")
	public static WebElement submitButton;
}
