package com.ct.stepDefinitions;

import org.openqa.selenium.support.ui.Select;

import com.ct.pages.FinancialInfoPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FinancialInfoStepDefs {

	FinancialInfoPage finance = new FinancialInfoPage();

	@Given("^I am on the financial information page of CT-Loan$")
	public void i_am_on_the_financial_information_page_of_CT_Loan() throws Throwable {

	}

	@When("^I select first application \"([^\"]*)\"$")
	public void i_select_first_application(String arg1) throws Throwable {
		if (arg1.equals("Yes")) {
			finance.firstAppYes.click();
		} else {
			finance.firstAppNo.click();
		}
	}

	@When("^I enter number of previous applications \"([^\"]*)\"$")
	public void i_enter_number_of_previous_applications(String arg1) throws Throwable {
		finance.applications.sendKeys(arg1);
	}

	@When("^I enter annual income \"([^\"]*)\"$")
	public void i_enter_annual_income(String arg1) throws Throwable {
		finance.annualIncome.sendKeys(arg1);
	}

	@When("^I select income type \"([^\"]*)\"$")
	public void i_select_income_type(String arg1) throws Throwable {
		Select select = new Select(finance.incomeType);
		select.selectByVisibleText(arg1);
	}

	@When("^I click on type of ownership \"([^\"]*)\"$")
	public void i_click_on_type_of_ownership(String arg1) throws Throwable {
		if (arg1.equals("Own")) {
			finance.ownHouse.click();
		} else {
			finance.rentHouse.click();
		}
	}

	@When("^I enter monthly rent \"([^\"]*)\"$")
	public void i_enter_monthly_rent(String arg1) throws Throwable {
		finance.montlyRent.sendKeys(arg1);
	}

	@When("^I enter number of dependents \"([^\"]*)\"$")
	public void i_enter_number_of_dependents(String arg1) throws Throwable {
		finance.dependents.sendKeys(arg1);
	}

	@When("^I enter saving amount \"([^\"]*)\"$")
	public void i_enter_saving_amount(String arg1) throws Throwable {
		finance.savingAmount.sendKeys(arg1);
	}

	@When("^I enter loan term \"([^\"]*)\"$")
	public void i_enter_loan_term(String arg1) throws Throwable {
		Select select = new Select(finance.loanTerm);
		select.selectByVisibleText(arg1);
	}

	@When("^I check the confirmation chechbox$")
	public void i_check_the_confirmation_chechbox() throws Throwable {
		finance.decisionBox.click();
	}

	@When("^I enter the full name \"([^\"]*)\"$")
	public void i_enter_the_full_name(String arg1) throws Throwable {
		finance.fullName.sendKeys(arg1);
	}

	@When("^I enter single line \"([^\"]*)\"$")
	public void i_enter_single_line(String arg1) throws Throwable {
		finance.singleLine.sendKeys(arg1);
	}

	@When("^I enter the date \"([^\"]*)\"$")
	public void i_enter_the_date(String arg1) throws Throwable {
		finance.calender.sendKeys(arg1);
	}

	@When("^I clicked on the submit button$")
	public void i_clicked_on_the_submit_button() throws Throwable {
		Thread.sleep(10000);
		finance.submitButton.click();
	}

	@Then("^I should be able to see confirmation page$")
	public void i_should_be_able_to_see_confirmation_page() throws Throwable {
		finance.confirmation.isDisplayed();
	}

}
