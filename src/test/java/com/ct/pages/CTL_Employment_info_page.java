package com.ct.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ct.utilities.Driver;

public class CTL_Employment_info_page {

	public CTL_Employment_info_page() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(xpath = "//h2[.='Employment Information']")
	public WebElement employmentInformationSign;

	@FindBy(xpath = "//select[@name='Dropdown']")
	public static WebElement title;

	@FindBy(xpath = "//select[@name='Dropdown']/option")
	public static List<WebElement> titleSel;

	@FindBy(xpath = "//p[@id='error-Dropdown']")
	public WebElement titleError;

	@FindBy(xpath = "//select[@name='Dropdown1']")
	public static WebElement department;

	@FindBy(xpath = "//select[@name='Dropdown1']/option")
	public static List<WebElement> departmentSel;

	//
	// // department error message
	@FindBy(xpath = "//p[@id='error-Dropdown1']")
	public WebElement departmentError;

	// selector=======================================================
	@FindBy(xpath = "//select[@name='Dropdown2']")
	public static WebElement durationOfElement;

	@FindBy(xpath = "//select[@name='Dropdown2']/option")
	public static List<WebElement> durationOfElemForIndex;
	//
	// private static Select numOfElem = new Select(durationOfElement);
	//
	@FindBy(xpath = "//p[@id='error-Dropdown2']")
	public WebElement durationOfElementError;

	// // ========================4
	// // selector=========================================
	@FindBy(xpath = "//select[@name='Dropdown3']")
	public static WebElement purposeOfLoan;

	@FindBy(xpath = "//select[@name='Dropdown3']/option")
	public static List<WebElement> selectPurpose;

	// // purposeOfLoanError
	@FindBy(xpath = "//p[@id='error-Dropdown3']")
	public WebElement purposeOfLoanError;
	//
	// // ====================5
	// // selector=============================================================
	@FindBy(xpath = "//select[@name='Dropdown4']")
	public static WebElement supervizor;
	@FindBy(xpath = "//select[@name='Dropdown4']/option")
	public static List<WebElement> supervizorSelect;

	// // supervizorError
	@FindBy(xpath = "//p[@id='error-Dropdown4']")
	public WebElement supervizorError;
	//
	@FindBy(xpath = "(//button[@elname='next'])[3]")
	public WebElement nextButton;

	// @FindBy(xpath = "(//button[@elname='back'])[3]")
	// public WebElement backButton;
	// public WebElement back;

	@FindBy(xpath = "//*[@id='navigBar']/tbody/tr[2]/td[4]")
	public WebElement FinancialInformation;
}
