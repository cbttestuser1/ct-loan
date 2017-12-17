package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class HomePage_3 {
	public HomePage_3() {
		PageFactory.initElements(Driver.getInstance(), this);

	}

	@FindBy(xpath = "//select[@name='Dropdown']")
	public WebElement title;

	@FindBy(xpath = "//p[@id='error-Dropdown']")
	public WebElement titleError;

	@FindBy(xpath = "//select[@name='Dropdown1']")
	public WebElement department;

	@FindBy(xpath = "//p[@id='error-Dropdown1']")
	public WebElement departmentError;

	@FindBy(xpath = "//select[@name='Dropdown2']")
	public WebElement durationOfElement;

	@FindBy(xpath = "//p[@id='error-Dropdown2']")
	public WebElement durationOfElementError;

	@FindBy(xpath = "//select[@name='Dropdown3']")
	public WebElement purposeOfLoan;

	@FindBy(xpath = "//p[@id='error-Dropdown3']")
	public WebElement purposeOfLoanError;

	@FindBy(xpath = "//select[@name='Dropdown4']")
	public WebElement supervizor;

	@FindBy(xpath = "//p[@id='error-Dropdown4']")
	public WebElement supervizorError;

	@FindBy(xpath = "//p[@id='error-Dropdown4']")
	public WebElement nextButton;
}
