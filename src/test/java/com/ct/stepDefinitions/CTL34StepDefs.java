package com.ct.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.ct.pages.CT_HomePage;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Then;

public class CTL34StepDefs {

	CT_HomePage homePage = new CT_HomePage(Driver.getInstance());
	
	@Then("^user must see firstName Error message\\.$")
	public void user_must_see_firstName_Error_message() throws Throwable {
		homePage.firstNameErrorMessageIsPresent();
		assertEquals(homePage.initialsErrorText, homePage.firstNameErrorMsg.getText());
	}
	
	@Then("^user must see lastName Error message\\.$")
	public void user_must_see_lastName_Error_message() throws Throwable {
	    homePage.lastNameErrorMessageIsPresent();
	    assertEquals(homePage.initialsErrorText, homePage.lastNameErrorMsg.getText());
	}
	
	@Then("^user need to see birthDate error message$")
	public void user_need_to_see_birthDate_error_message() throws Throwable {
	    homePage.birthDateErrorMessageIsPresent();
	    assertEquals(homePage.dateOfBirthErrorMsg, homePage.birthDateErrorMsg.getText());
	}
	
	@Then("^user need to see gender error message$")
	public void user_need_to_see_gender_error_message() throws Throwable {
	    homePage.genderErrorMessageIsPresent();
	    assertEquals(homePage.genderErrorText, homePage.genderErrorMsg.getText());
	}
	
	@Then("^user need to see Personal File ID error message$")
	public void user_need_to_see_Personal_File_ID_error_message() throws Throwable {
	    homePage.ssnErrorMessageIsPresent();
	    assertEquals(homePage.initialsErrorText, homePage.ssnErrorMsg.getText());
	}

	
}
