package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigateToCT_LoanHomePage {

	
	@Given("^I am on the home page of \"([^\"]*)\"$")
	public void i_am_on_the_home_page_of(String arg1) throws Throwable {
		Driver.getInstance().get(CTContstants.URL);
	}


	@When("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
	   
	}

	@Then("^I should be able to see text CT-Loan$")
	public void i_should_be_able_to_see_text_CT_Loan() throws Throwable {
	   WebElement ctLoanText = Driver.getInstance().findElement(By.xpath("//span[contains(text(),'CT Loan')]"));
	   ctLoanText.isDisplayed();
	}
}
