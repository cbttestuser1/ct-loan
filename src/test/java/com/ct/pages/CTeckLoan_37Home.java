package com.ct.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ct.utilities.Driver;

public class CTeckLoan_37Home {	

	public static String errorMesage="Select any choice for this field";
	public static String message="Dropbox in alphabetical order";
	public static String mesageNextPage="Financial Information";
	
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
		   return true ;

	}
	
		
		
	@FindBy(xpath="//select [@name='Dropdown']")
	public  WebElement titleDropDown;
		
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
	
	@FindBy(xpath="Section3-li")
	public WebElement mesageNexPage;
	
	
	public boolean comparison(By element){
		List<WebElement> dropDown= Driver.getInstance().findElements(element);
		ArrayList <String> list= new ArrayList<>();
		for(WebElement e : dropDown){
		    list.add(e.getText());
		}
		List<String> clonelist= (ArrayList<String>)list.clone();
			Collections.sort(list);
			if(list.equals(clonelist)){
				Assert.assertTrue(message, true);		
			}else{
				Assert.assertTrue(message, false);
			}
			return true;
			}
	
	
	
	public static void elementIsClickable(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }
	
	
	
	
  }
}
	


