package com.ct.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ct.utilities.Driver;

public class CTeckLoan_37Home {	

	public static String errorMesage="Select any choice for this field";
	
	public CTeckLoan_37Home(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	// checking
	
	public void selectDropDown(WebElement element, String str){
		Select selection = new Select(element);
		selection.selectByVisibleText(str);
		}
	
	
	public boolean isDisplyed(WebElement element){
		  
		    if (element.isDisplayed() ) {
		   	Assert.assertTrue(errorMesage, true);
		   	
		    } else {
		    	Assert.assertTrue(errorMesage, false);
		    }
		   return true;

	}
	
		
	@FindBy(xpath="//select [@name='Dropdown']")
	public WebElement titleDropDown;
		
	@FindBy(xpath="//select [@name='Dropdown1']")
	public WebElement departmentDropDown;
	
	@FindBy(xpath="//select [@name='Dropdown2']")
	public WebElement durationOfEmploymentDropDown;
	
	@FindBy(xpath="//select [@name='Dropdown3']")
	public WebElement PurposeOfLoanDropDown;
	
	@FindBy(xpath ="//select [@name='Dropdown4']")
	public WebElement  SupervisorDropDown;
	
	@FindBy(xpath="(//button[@elname='next'])[3]")
	public WebElement nextButton;
	
	@FindBy(xpath="//p[@id='error-Dropdown4']")
	public  WebElement errorUnderSupervisor;
	
	@FindBy(xpath="//p[@id='error-Dropdown3']")
	public  WebElement errorUnderPurposeOfLoan;
	
	@FindBy(xpath="//p[@id='error-Dropdown2']")
	public  WebElement errorUnderDurationOfEmployment;
	
	@FindBy(xpath="//p[@id='error-Dropdown1']")
	public  WebElement errorUnderDepartment;
	
	@FindBy(xpath="//p[@id='error-Dropdown']")
	public  WebElement errorUnderTitle;
	
	
	
	
	
}

	


