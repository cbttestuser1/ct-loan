package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigateToCT_LoanHomePage {

	
	
//	@Given("^I go to CT-Loan web page$")
//	public void i_go_to_CT_Loan_web_page() throws Throwable {
//	   Driver.getInstance().get(CTContstants.URL);
//	}

	@When("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String arg1) throws Throwable {
		Driver.getInstance().get(CTContstants.URL);	   
	}

	@Then("^I should be able to see text CT-Loan$")
	public void i_should_be_able_to_see_text_CT_Loan() throws Throwable {
	   WebElement ctLoanText = Driver.getInstance().findElement(By.xpath("//span[contains(text(),'CT Loan')]"));
	   ctLoanText.isDisplayed();
	}
}
