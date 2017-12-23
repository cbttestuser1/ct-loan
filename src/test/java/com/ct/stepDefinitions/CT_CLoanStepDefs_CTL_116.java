package com.ct.stepDefinitions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_CloanHomePage_1;
import com.ct.pages.CT_CloanHomePage_2;
import com.ct.pages.CT_CloanHomePage_4;
import com.ct.pages.CT_Cloan_FakePerson;
import com.ct.utilities.Driver;
import com.github.javafaker.Faker;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CT_CLoanStepDefs_CTL_116 {
	private WebDriver driver = Driver.getInstance();


	@Given("^enter valid personal, contact, employment and financial information$")
	public void enter_valid_personal_contact_employment_and_financial_information() throws Throwable {
		CT_Cloan_FakePerson p1 = new CT_Cloan_FakePerson();
		p1.fillOutAllPersonInfoOn_CT_Cloan();
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
