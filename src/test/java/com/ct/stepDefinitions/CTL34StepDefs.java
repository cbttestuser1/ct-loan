package com.ct.stepDefinitions;

import com.ct.pages.CT_HomePage;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Then;

public class CTL34StepDefs {

	CT_HomePage homePage = new CT_HomePage(Driver.getInstance());
		
	@Then("^user must see firstName Error message\\.$")
	public void user_must_see_firstName_Error_message() throws Throwable {
		homePage.firstNameErrorMessageIsPresent();
	}
	
	@Then("^user must see lastName Error message\\.$")
	public void user_must_see_lastName_Error_message() throws Throwable {
	    homePage.lastNameErrorMessageIsPresent();
	}
	
	@Then("^user need to see birthDate error message$")
	public void user_need_to_see_birthDate_error_message() throws Throwable {
	    homePage.birthDateErrorMessageIsPresent();
	}
	
	@Then("^user need to see gender error message$")
	public void user_need_to_see_gender_error_message() throws Throwable {
	    homePage.genderErrorMessageIsPresent();
	}
	
	@Then("^user need to see Personal File ID error message$")
	public void user_need_to_see_Personal_File_ID_error_message() throws Throwable {
	    homePage.ssnErrorMessageIsPresent();
	}

	
}
