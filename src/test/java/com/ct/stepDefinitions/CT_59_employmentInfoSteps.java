package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.CT_59_employmentInfo;
import com.ct.utilities.ConfigurationReader;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CT_59_employmentInfoSteps {

	WebDriver driver = Driver.getInstance();

	CT_59_employmentInfo empInfo = new CT_59_employmentInfo();

	@Given("^I am on the home page of CT-Loan employment page$")
	public void i_am_on_the_home_page_of_CT_Loan_employment_page() throws Throwable {

		//driver.get(ConfigurationReader.getProperty("url"));
	}

	@Given("^I am choosing Title as a QA$")
	public void i_am_choosing_Title_as_a_QA() throws Throwable {

		WebElement list = empInfo.titleSelect;
		Select dropdownList = new Select(list);
		dropdownList.selectByValue("QA");

	}

	@Given("^I am choosing Department as a Development$")
	public void i_am_choosing_Department_as_a_Development() throws Throwable {

		WebElement list = empInfo.departSelect;
		Select dropdownList = new Select(list);
		dropdownList.selectByValue("Development");
	}

	@Given("^I am choosing Duration as (\\d+)-(\\d+)$")
	public void i_am_choosing_Duration_as(int arg1, int arg2) throws Throwable {

		WebElement list = empInfo.durationSelect;
		Select dropdownList = new Select(list);
		dropdownList.selectByValue("3-5");
	}

	@Given("^I am choosing Purpose as a Morgage$")
	public void i_am_choosing_Purpose_as_a_Morgage() throws Throwable {

		WebElement list = empInfo.purposeSelect;
		Select dropdownList = new Select(list);
		dropdownList.selectByValue("Mortgage");
	}

	@Given("^I am choosing Superviseras as a Zachary Taylor$")
	public void i_am_choosing_Superviseras_as_a_Zachary_Taylor() throws Throwable {

		WebElement list = empInfo.superviseSelect;
		Select dropdownList = new Select(list);
		dropdownList.selectByValue("Zachary Taylor");
	}

	@When("^I click on the Next button$")
	public void i_click_on_the_Next_button() throws Throwable {
		empInfo.nextButton.click();
	}

	@Then("^I will be able to see the financial page$")
	public void i_will_be_able_to_see_the_financial_page() throws Throwable {
		empInfo.financialInfo.isDisplayed();
	}

}
