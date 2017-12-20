package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import com.ct.pages.CTeckLoan_37Home;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CTeckLoan37EmploymentInfoSteps {
	
	
	CTeckLoan_37Home user = new CTeckLoan_37Home();	
	


	@Given("^the user select field Title \"([^\"]*)\"$")
	public void the_user_select_field_Title(String title) throws Throwable {
	   user.selectDropDown(user.titleDropDown, title);
	   JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
	   js.executeScript("window.scrollBy(0,300)");
	   Thread.sleep(3000);
	   
	}

	@Given("^the user selects field Department \"([^\"]*)\"$")
	public void the_user_selects_field_Department(String department) throws Throwable {
	   user.selectDropDown(user.departmentDropDown, department);
	   Thread.sleep(3000);
	}

	@Given("^the user selects field Duration of Employment \"([^\"]*)\"$")
	public void the_user_selects_field_Duration_of_Employment(String duration) throws Throwable {
	    user.selectDropDown(user.durationOfEmploymentDropDown, duration);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
	}

	@Given("^the user selects field purpose of Loan of \"([^\"]*)\"$")
	public void the_user_selects_field_purpose_of_Loan_of(String purpose_of_loan) throws Throwable {
	    user.selectDropDown(user.PurposeOfLoanDropDown, purpose_of_loan);
	    Thread.sleep(3000);
	}

	@Given("^the user selects field Supervisor \"([^\"]*)\"$")
	public void the_user_selects_field_Supervisor(String supervisor) throws Throwable {
	    user.selectDropDown(user.SupervisorDropDown, supervisor);
	    Thread.sleep(3000);
	}

	@Given("^the user clicks on the next button$")
	public void the_user_clicks_on_the_next_button() throws Throwable {
	    user.nextButton.click();
	    Thread.sleep(3000);
	}

	@Then("^the financial information shud be display$")
	public void the_financial_information_shud_be_display() throws Throwable {
		 user.mesageNexPage.getText().equalsIgnoreCase(CTeckLoan_37Home.mesageNextPage);
		 Thread.sleep(6000);
	}

	@Then("^Error message under Title box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Title_box_should_be_displayed(String arg1) throws Throwable {
	  Assert.assertTrue(user.isDisplyed(user.errorUnderTitle));
	  Thread.sleep(3000);
	}

	@Then("^Error message under Department box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Department_box_should_be_displayed(String arg1) throws Throwable {
	   Assert.assertTrue(user.isDisplyed(user.errorUnderDepartment));
	   Thread.sleep(3000);
	}

	@Then("^Error message under Duration box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Duration_box_should_be_displayed(String arg1) throws Throwable {
	   Assert.assertTrue(user.isDisplyed(user.errorUnderDurationOfEmployment));
	   Thread.sleep(3000);
	}

	@Then("^Error message under Purpose box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Purpose_box_should_be_displayed(String arg1) throws Throwable {
	   Assert.assertTrue(user.isDisplyed(user.errorUnderPurposeOfLoan));
	   Thread.sleep(3000);
	}

	@Then("^Error message under Supervisor box should be displayed \"([^\"]*)\"$")
	public void error_message_under_Supervisor_box_should_be_displayed(String arg1) throws Throwable {
	   Assert.assertTrue(user.isDisplyed(user.errorUnderSupervisor));
	   Thread.sleep(3000);
	}



}
