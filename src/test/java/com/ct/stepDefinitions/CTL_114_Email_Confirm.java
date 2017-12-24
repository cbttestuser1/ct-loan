package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.CTL_Contact_Information_Page;
import com.ct.pages.CTL_Personal_Information_Page;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL_114_Email_Confirm {
	CTL_Personal_Information_Page page = new CTL_Personal_Information_Page();
	CTL_Contact_Information_Page page2=new CTL_Contact_Information_Page();

	@Given("^I am on the CT Loan application$")
	public void i_am_on_the_CT_Loan_application() throws Throwable {
		Thread.sleep(3000);
		Driver.getInstance().get(CTContstants.QA_URL);

	}

	@Given("^enter valid personal, contact, employment and financial information$")
	public void enter_valid_personal_contact_employment_and_financial_information() throws Throwable {
		
		//personal info page
		Driver.getInstance().switchTo().defaultContent();
		Driver.getInstance().switchTo().parentFrame();
		Driver.getInstance().switchTo().frame(1);
		
		page.firstName.sendKeys("mike");
		Thread.sleep(2000);
		page.lastName.sendKeys("abraham");
		Thread.sleep(2000);
		Select date = new Select(Driver.getInstance().findElement(By.id("Date-date")));
		date.selectByVisibleText("12/21/1994");
		Thread.sleep(2000);
		Select gender= new Select(Driver.getInstance().findElement(By.id("Radio_1")));
		gender.selectByValue("M");
		Thread.sleep(2000);
		page.id.sendKeys("520426494");
		Thread.sleep(2000);
		page.nextIp.click();
		
		//contact info page
		page2.addressInputField.sendKeys("098123 cybertek lane");
		
		
		
		
		throw new PendingException();
		
		
		
		
		
	}

	@When("^I submit the form$")
	public void i_submit_the_form() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should get an email confirming my application$")
	public void i_should_get_an_email_confirming_my_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
