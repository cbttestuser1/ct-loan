package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ct.pages.GmailSignIn;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailConfirmation {
	WebDriver driver= Driver.getInstance();
	GmailSignIn gmail= new GmailSignIn();
	
	@Given("^I am on the CT Loan application$")
	public void i_am_on_the_CT_Loan_application() throws Throwable {
		System.out.println(driver.getCurrentUrl());
		
	    
	}

	@Given("^enter valid personal, contact, employment and financial information$")
	public void enter_valid_personal_contact_employment_and_financial_information() throws Throwable {
	    
	}

	@When("^I submit the form$")
	public void i_submit_the_form() throws Throwable {
//		WebElement ThankYou=driver.findElement(By.cssSelector("div#templateWrapperDiv.templateWrapper"));
//	    if(ThankYou.isDisplayed()){
//	    	System.out.println("Your application was successfully submitted!");
//	    }else{
//	    	System.out.println("Something went wrong...");
//	    }
	}

	@Then("^I should get an email with an attachment$")
	public void i_should_get_an_email_with_an_attachment() throws Throwable {
		driver.get("http://gmail.com");
		gmail.emailInput.sendKeys("muratbekovazeinep@gmail.com");
		gmail.nextButton.click();
		Thread.sleep(3000);
		gmail.password.sendKeys("muratbekova22");
		gmail.sinInButton.click();
		
		WebElement CTemail=gmail.CTLoan;
		if(CTemail.isDisplayed()){
		CTemail.click();
		System.out.println("Openning the email from CT Loan");
		}else{
			System.out.println("There is no email from CT Loan");
			
			
			WebElement pdfFile= gmail.pdf;
			if(pdfFile.isDisplayed()){
				pdfFile.click();
				System.out.println("Oppening a PDF File from CT Loan");
			}else{
				System.out.println("NO PDF File from CT Loan");
			}
			
		}
		
		
	}

}
