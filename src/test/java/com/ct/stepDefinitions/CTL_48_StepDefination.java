package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CTL_Contact_Information_Page;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL_48_StepDefination {
	
	CTL_Contact_Information_Page contInfo=new CTL_Contact_Information_Page();
	private static WebDriver driver = Driver.getInstance();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	
	@When("^I do not fill the Contact Information fields$")
	public void i_do_not_fill_the_Contact_Information_fields() throws Throwable {
	   
		// I do not fill the Contact Information fields
		contInfo.nextContInfo.click();
		
	}

	@Then("^I should be able to see error messages for mandatory fields$")
	public void i_should_be_able_to_see_error_messages_for_mandatory_fields() throws
	 Throwable {
		
		Assert.assertEquals("Enter a value for this field.", contInfo.errorAdres.getText());
		Assert.assertEquals("Enter a value for this field.", contInfo.errorPerPhone.getText());
		Assert.assertEquals("Enter a value for this field.", contInfo.errorWorkPhone.getText());
		Assert.assertEquals("Enter a value for this field.", contInfo.errorPerEmail.getText());
		Assert.assertEquals("Enter a value for this field.", contInfo.errorWorkEmail.getText());
	    
	}

}
