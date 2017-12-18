package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.ct.pages.CTeckLoan_37Home;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CTeckLoan37EmploymentInfoSteps {
	
	// checking
	CTeckLoan_37Home user = new CTeckLoan_37Home();	

	@Given("^User is on the Employment Information Page$")
	public void user_is_on_the_Employment_Information_Page() throws Throwable {
	Assert.assertTrue(Driver.getInstance().getCurrentUrl().equals("CT Loan – Cybertek"));  
	}

	@Given("^the user select field Title \"([^\"]*)\"$")
	public void the_user_select_field_Title(String title) throws Throwable {
	   user.selectDropDown(user.titleDropDown, title);
	}

	@Given("^the user selects field Department \"([^\"]*)\"$")
	public void the_user_selects_field_Department(String department) throws Throwable {
	   user.selectDropDown(user.departmentDropDown, department);
	}

	@Given("^the user selects field Duration of Employment \"([^\"]*)\"$")
	public void the_user_selects_field_Duration_of_Employment(String duration) throws Throwable {
	  user.selectDropDown(user.durationOfEmploymentDropDown, duration);
	}

	@Given("^the user selects field purpose of Loan of \"([^\"]*)\"$")
	public void the_user_selects_field_purpose_of_Loan_of(String purpose_of_loan) throws Throwable {
	   user.selectDropDown(user.PurposeOfLoanDropDown, purpose_of_loan);
	}

	@Given("^the user selects field Supervisor \"([^\"]*)\"$")
	public void the_user_selects_field_Supervisor(String supervisor) throws Throwable {
	   user.selectDropDown(user.SupervisorDropDown, supervisor);
	}

	@Given("^the user clicks on the next button$")
	public void the_user_clicks_on_the_next_button() throws Throwable {
	   user.nextButton.click();
	}

	@Then("^the financial information shud be display$")
	public void the_financial_information_shud_be_display() throws Throwable {
		Driver.getInstance().getCurrentUrl().equals("CT Loan – Cybertek");
	}

	@Then("^Error message under Title box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Title_box_should_be_displayed(String arg1) throws Throwable {
	  Assert.assertTrue(user.isDisplyed(user.errorUnderTitle));
	}

	@Then("^Error message under Department box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Department_box_should_be_displayed(String arg1) throws Throwable {
	   Assert.assertTrue(user.isDisplyed(user.errorUnderDepartment));
	}

	@Then("^Error message under Duration box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Duration_box_should_be_displayed(String arg1) throws Throwable {
	   Assert.assertTrue(user.isDisplyed(user.errorUnderDurationOfEmployment));
	}

	@Then("^Error message under Purpose box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Purpose_box_should_be_displayed(String arg1) throws Throwable {
	   Assert.assertTrue(user.isDisplyed(user.errorUnderPurposeOfLoan));
	}

	@Then("^Error message under Supervisor box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Supervisor_box_should_be_displayed(String arg1) throws Throwable {
	   Assert.assertTrue(user.isDisplyed(user.errorUnderSupervisor));
	}



}
