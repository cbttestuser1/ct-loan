package com.ct.stepDefinitions;


import org.openqa.selenium.WebDriver;

//table/tbody/tr/td[contains(text(),'Unique ID')]

import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CTeck_43_46_118HomePage;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Then;

public class CTeckLoan118ConfirmationEmail {
	WebDriver driver = Driver.getInstance();

	CTeck_43_46_118HomePage pages = new CTeck_43_46_118HomePage();
	CTContstants url = new CTContstants();
	WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 10);

	@Then("^the user pick is it the first application to CTLoan \"([^\"]*)\"$")
	public void the_user_pick_is_it_the_first_application_to_CTLoan(String arg1) throws Throwable {
		pages.FirstAppQ.click();

	}

	@Then("^the user select how many application you submited \"([^\"]*)\"$")
	public void the_user_select_how_many_application_you_submited(String arg1) throws Throwable {
		pages.ApplicationNumber.sendKeys(arg1);
	}

	@Then("^the user select the annual income \"([^\"]*)\"$")
	public void the_user_select_the_annual_income(String arg1) throws Throwable {
		pages.Income.sendKeys(arg1);
	}

	@Then("^the user select the income type \"([^\"]*)\"$")
	public void the_user_select_the_income_type(String Yearly) throws Throwable {
		pages.selectFromDropDown(pages.SelectDropDown, Yearly);
	}

	@Then("^the user select to rent a house \"([^\"]*)\"$")
	public void the_user_select_to_own_a_house(String arg1) throws Throwable {
		pages.OwnOrRent.click();

	}

	@Then("^the user select Monthly rent \"([^\"]*)\"$")
	public void the_user_select_Monthly_rent(String arg1) throws Throwable {
		pages.SpentByMonth.sendKeys(arg1);
	}

	@Then("^the user select Number of dependents \"([^\"]*)\"$")
	public void the_user_select_Number_of_dependents(String arg1) throws Throwable {
		pages.Dependents.sendKeys(arg1);
	}

	@Then("^the user select Savings amount \"([^\"]*)\"$")
	public void the_user_select_Savings_amount(String arg1) throws Throwable {
		pages.Savings.sendKeys(arg1);
	}

	@Then("^the user select Loan term \"([^\"]*)\"$")
	public void the_user_select_Loan_term(String months) throws Throwable {
		pages.selectFromDropDown(pages.SelectDropDown2, months);
	}

	@Then("^the user select the checkbox to confirm all the info$")
	public void the_user_select_the_checkbox_to_confirm_all_the_info() throws Throwable {
		pages.Decision.click();
	}

	@Then("^the user enter full name to submit application \"([^\"]*)\"$")
	public void the_user_enter_full_name_to_submit_application(String arg1) throws Throwable {
		pages.FirstMLast.sendKeys(arg1);
	}

	@Then("^the user enter Single Line \"([^\"]*)\"$")
	public void the_user_enter_Single_Line(String arg1) throws Throwable {
		pages.SingleLine.sendKeys(arg1);
	}

	@Then("^the user the Date \"([^\"]*)\"$")
	public void the_user_the_Date(String arg1) throws Throwable {
		pages.Date.sendKeys(arg1);
		Thread.sleep(3000);
	}

	@Then("^the user on the submit button$")
	public void the_user_on_the_submit_button() throws Throwable {
		pages.SubmitLastPage.click();

		Thread.sleep(3000);
	}

	@Then("^I should get an email confirming my application$")
	public void i_should_get_an_email_confirming_my_application() throws Throwable {

		System.out.println(pages.confirmationMessage.isDisplayed());
	}

}
