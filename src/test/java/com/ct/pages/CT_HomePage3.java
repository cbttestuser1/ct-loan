package com.ct.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.ct.utilities.Driver;

public class CT_HomePage {
	

	public CT_HomePage() {
		PageFactory.initElements(Driver.getInstance(), this);

	}
//================1 selector========================================
	@FindBy(xpath = "//select[@name='Dropdown']")
	public static WebElement title;
	private static Select titleNames = new Select(title);

	public static enum nameOfTitle {
		QA, Manager, Developer, Engineer, Instructor, DevOps, Analyst, DB_Admin
	}

	public static void selectNameByValue(nameOfTitle type) {
		switch (type) {
		case QA:
			titleNames.selectByValue("QA");
			break;
		case Manager:
			titleNames.selectByValue("Manager");
			break;
		case Developer:
			titleNames.selectByValue("Developer");
			break;
		case Engineer:
			titleNames.selectByValue("Engineer");
			break;
		case Instructor:
			titleNames.selectByValue("Instructor");
			break;
		case DevOps:
		    titleNames.selectByValue("DevOps");
		    break;
		case Analyst:
			titleNames.selectByValue("Analyst");
			break;
		case DB_Admin:
			titleNames.selectByValue("DB_Admin");
			break;
	
		}
		
		}
//error message for title
	@FindBy(xpath = "//p[@id='error-Dropdown']")
	public WebElement titleError;
	
	
	
//===========================2 selector==========================================
	@FindBy(xpath = "//select[@name='Dropdown1']")
	public static WebElement department;
	private static Select departmentNames = new Select(department);
	
	public static enum selectDepartName{
		HR,Development,Tech_Support,Fuculty
	}
	public static void selectNameByValue(selectDepartName type) {
		switch (type) {
		case HR:
			departmentNames.deselectByValue("HR");
			break;
		case Development:
			departmentNames.selectByValue("Development");
			break;
		case Tech_Support:
			departmentNames.selectByValue("Tech_Suppor");
			break;
		case Fuculty:
			departmentNames.selectByValue("Fuculty");
			break;
		
		}
		}
	
//department error message
	@FindBy(xpath = "//p[@id='error-Dropdown1']")
	public WebElement departmentError;
	
	
	
//================================3 selector=======================================================
	@FindBy(xpath = "//select[@name='Dropdown2']")
	public static WebElement durationOfElement;
	
	@FindBy(xpath="/option[@id='Dropdown2-li']/div[1]/div[1]/select/option")
	public static WebElement durationOfElemForIndex;
	
	private static Select numOfElem = new Select(durationOfElement);
	
//	public static enum selectDurationOfElement{
//		
//	}
//	public static void selectElementByIndex(selectDurationOfElement type) {
//		switch (type) {
//		
//		}
//		
//	}
//durationOfElementError
	@FindBy(xpath = "//p[@id='error-Dropdown2']")
	public WebElement durationOfElementError;
	
	
	
//========================4 selector=========================================
	@FindBy(xpath = "//select[@name='Dropdown3']")
	public static WebElement purposeOfLoan;
private static Select numOfPurpose = new Select(purposeOfLoan);
	
	public static enum elementOfPurpose{
		Personal,Education,Health,Mortgage,Travel,Auto,Other
		
	}
	public static void selestOfPurpose(elementOfPurpose type) {
		switch (type) {
		case Personal:
			numOfPurpose.selectByValue("Personal");
			break;
		case Education:
			numOfPurpose.selectByValue("Education");
			break;
		case Health:
			numOfPurpose.selectByValue("Health");
			break;
		case Mortgage:
			numOfPurpose.selectByValue("Mortgage");
			break;
		case Travel:
			numOfPurpose.selectByValue("Travel");
			break;
		case Auto:
			numOfPurpose.selectByValue("Auto");
			break;
		case Other:
			numOfPurpose.selectByValue("Other");
			break;
			
		}
		}
		
//purposeOfLoanError
	@FindBy(xpath = "//p[@id='error-Dropdown3']")
	public WebElement purposeOfLoanError;
	
	
	
//====================5 selector=============================================================
	@FindBy(xpath = "//select[@name='Dropdown4']")
	public static WebElement supervizor;
	private static Select selectSupervizor=new Select(supervizor);
	
	public static enum numOfSupervizor{
		Zachary_Taylor,Kimberly_Ann_Hart,William_Cranston,Katherine_Hillard
	}
	public static void selestOfSupervizor( numOfSupervizor type) {
		switch (type) {
		case Zachary_Taylor:
			selectSupervizor.selectByValue("Zachary_Taylo");
			break;
		case Kimberly_Ann_Hart:
			selectSupervizor.selectByValue("Kimberly_Ann_Hart");
			break;
		case William_Cranston:
			selectSupervizor.selectByValue("William_Cranston");
			break;
		case Katherine_Hillard:
			selectSupervizor.selectByValue("Katherine_Hillard");
			break;
			
		}
		}
	
    //supervizorError
	@FindBy(xpath = "//p[@id='error-Dropdown4']")
	public WebElement supervizorError;

	@FindBy(xpath = "(//button[@elname='next'])[3]")
	public WebElement nextButton;

	// @FindBy(xpath = "(//button[@elname='back'])[3]")
	// public WebElement backButton;
	// public WebElement back;
}