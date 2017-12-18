package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CLoanPersonalInfoPage;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;

public class CLoanPersonalInfo {

	
	CLoanPersonalInfoPage cLoanPersonalInfoPage = new CLoanPersonalInfoPage();
	WebDriver driver = Driver.getInstance();
	private JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^the customer is on the personal information form$")
	public void the_customer_is_on_the_personal_information_form() throws Throwable {
		
		driver.get(CTContstants.QA_URL);   //https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame(1);
		
		js.executeScript("window.scrollBy(0, 700);");
		
		
	    
	}

	@Given("^the customer enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_customer_enters(String firstName, String middleName, String lastName, String dateOfBirth, String idNum) throws Throwable {
	    
		cLoanPersonalInfoPage.fillOutTheForm(firstName, middleName, lastName, dateOfBirth, idNum);
	
	}

	
	@Given("^the customer selects the gender$")
	public void the_customer_selects_the_gender() throws Throwable {
	    
boolean isChecked = cLoanPersonalInfoPage.maleBtn.isSelected();
		
		if (!isChecked){
			cLoanPersonalInfoPage.maleBtn.click();
		}else{
			System.out.println( "Gender option is already selected");
		}
			
		
		cLoanPersonalInfoPage.nextBtnP1.click();
	    
	}


	
}
