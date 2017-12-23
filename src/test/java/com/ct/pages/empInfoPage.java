package com.ct.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class empInfoPage {
	private WebDriver driver;

	public empInfoPage() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//h2[.='Employment Information']")
	public WebElement EmpInformationSign;

	// ----------dropdown--selectors---------------------
	@FindBy(xpath = "//select[@name='Dropdown']")
	public WebElement Title;

	@FindBy(xpath = "//select[@name='Dropdown1']")
	public WebElement Department;

	@FindBy(xpath = "//select[@name='Dropdown2']")
	public WebElement durationOfEmp;

	@FindBy(xpath = "//select[@name='Dropdown3']")
	public WebElement purposeOfLoan;

	@FindBy(xpath = "//select[@name='Dropdown4']")
	public WebElement supervisor;
	// ----------------dorpdown-- errormessage-------
	@FindBy(xpath = "//p[@id='error-Dropdown']")
	public WebElement titleErrorMessage;

	@FindBy(xpath = "//p[@id='error-Dropdown1']")
	public WebElement departmentErrorMessage;

	@FindBy(xpath = "//p[@id='error-Dropdown2']")
	public WebElement durOfEmpErrorMessage;

	@FindBy(xpath = "//p[@id='error-Dropdown3']")
	public WebElement purOfLoanErrorMessage;

	@FindBy(xpath = "//p[@id='error-Dropdown4']")
	public WebElement superviserErrorMessage;
	
	@FindBy(xpath="(//ul/li[@id='formAccess']/div/div/div/button[@class='fmSmtButton next_previous'])[3]")
	public WebElement nextButton;
	
}
