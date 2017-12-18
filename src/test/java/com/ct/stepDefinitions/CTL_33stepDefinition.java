package com.ct.stepDefinitions;

import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL_33stepDefinition {
	@Given("^the user is on the personal information page$")
	public void the_user_is_on_the_personal_information_page() throws Throwable {
	    Driver.getInstance().get(CTContstants.QA_URL);
	}

	@When("^the user does not fill in the fields marked with an \\*$")
	public void the_user_does_not_fill_in_the_fields_marked_with_an() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^the user scrolls down$")
	public void the_user_scrolls_down() throws Throwable {
	    
	}

	@When("^clicks on the submit button$")
	public void clicks_on_the_submit_button() throws Throwable {
	    
	}

	@Then("^the user should see an error message to enter a value for those fields$")
	public void the_user_should_see_an_error_message_to_enter_a_value_for_those_fields() throws Throwable {
	   
	}

}
