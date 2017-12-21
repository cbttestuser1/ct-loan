package com.ct.stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.CT_CloanHomePage_3;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//github.com/cbttestuser1/ct-loan.git
public class CT_CloanStepDefs_3a {

	

	WebDriver driver = Driver.getInstance();
	CT_CloanHomePage_3 page_3 = new CT_CloanHomePage_3();
	Select dd;

	@Given("^I click on title and select \"([^\"]*)\"$")
	public void i_click_on_title_and_select(String titleName) throws Throwable {
		https://github.com/cbttestuser1/ct-loan.git

		dd = new Select(page_3.title);
		int size = page_3.titleSel.size();
		for (int i = 0; i < size; i++) {

			dd.selectByIndex(i);

		}
	}

	@When("^I click on department select \"([^\"]*)\"$")
	public void i_click_on_department_select(String depName) throws Throwable {

		dd = new Select(page_3.department);
		int size = page_3.departmentSel.size();
		for (int i = 0; i < 4; i++) {

			dd.selectByIndex(i);

		}
		System.out.println(page_3.titleSel);
	}

	//
	@When("^I click on duration of employment and select \"([^\"]*)\"$")
	public void i_click_on_duration_of_employment_and_select(String durations) throws Throwable {

		dd = new Select(page_3.durationOfElement);
		int size = page_3.durationOfElemForIndex.size();
		for (int i = 0; i < 5; i++) {

			dd.selectByIndex(i);

		}
	}

	//
	@When("^I click on purpose of loan and select \"([^\"]*)\"$")
	public void i_click_on_purpose_of_loan_and_select(String arg4) throws Throwable {

		dd = new Select(page_3.purposeOfLoan);
		int size = page_3.selectPurpose.size();
		for (int i = 0; i < 7; i++) {

			dd.selectByIndex(i);
		}
	}

	@When("^I click on supervison and select \"([^\"]*)\"$")
	public void i_click_on_supervison_and_select(String arg5) throws Throwable {

		dd = new Select(page_3.supervizor);
		int size = page_3.supervizorSelect.size();
		for (int i = 0; i < 4; i++) {

			dd.selectByIndex(i);
		}
	}

	@When("^click on next button$")
	public void click_on_next_button() throws Throwable {
		page_3.nextButton.click();

	}

	@Then("^I should be on financial information page$")
	public void i_should_be_on_financial_information_page() throws Throwable {
		String actualPage = page_3.FinancialInformation.getText();
		String expectedPage = "Financial Information";
		System.out.println(actualPage);

	}
}