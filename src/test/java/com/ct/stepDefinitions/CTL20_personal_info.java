package com.ct.stepDefinitions;

import com.ct.pages.CT_HomePage_Pesonal_info;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL20_personal_info {
	CT_HomePage_Pesonal_info personalInfo = new CT_HomePage_Pesonal_info();

	@Given("^I am on the home page of CT-Loan$")
	public void i_am_on_the_home_page_of_CT_Loan() throws Throwable {
		Driver.getInstance().get(CTContstants.QA_URL);

	}

	@Then("^I add first name  \"([^\"]*)\"$")

	public void i_add_first_name(String FirstName) throws Throwable {
		personalInfo.nameField.sendKeys(FirstName);

	}

	@Then("^I add middle name \"([^\"]*)\"$")
	public void i_add_middle_name(String MiddleName) throws Throwable {
		Thread.sleep(3000);
		personalInfo.nameField.sendKeys(MiddleName);
		Thread.sleep(3000);
	}

	@Then("^I add last name \"([^\"]*)\"$")
	public void i_add_last_name(String LastName) throws Throwable {
		personalInfo.nameField.sendKeys(LastName);
	}

	@Then("^I choose my gender$")
	public void i_choose_my_gender() throws Throwable {
		personalInfo.genderMale.click();
	}

	@Then("^I add date of birth \"([^\"]*)\"$")
	public void i_add_date_of_birth(String DateOfBirth) throws Throwable {
		personalInfo.nameField.sendKeys(DateOfBirth);
	}

	@Then("^I  add SSN \"([^\"]*)\"$")
	public void i_add_SSN(String SSN) throws Throwable {
		personalInfo.nameField.sendKeys(SSN);
	}

	@When("^I click on Next button$")
	public void i_click_on_Next_button() throws Throwable {
		personalInfo.nextButton.click();
	}

	@Then("^I have to end up in contact information page\\.$")
	public void i_have_to_end_up_in_contact_information_page() throws Throwable {

	}

}