package com.ct.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CTL_Personal_Information_Page;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL_42_StepDefination {

	CTL_Personal_Information_Page personalInfo = new CTL_Personal_Information_Page();
	private static WebDriver driver = Driver.getInstance();
	WebDriverWait wait = new WebDriverWait(driver, 60);


	@Given("^I filled the Personal Information with valid data$")
	public void i_filled_the_Personal_Information_with_valid_data() throws Throwable {

		driver.switchTo().frame(1);

		personalInfo.firstName.sendKeys("Huseyin");
		personalInfo.midleName.sendKeys("");
		personalInfo.lastName.sendKeys("Silver");
		personalInfo.gender.click();
		personalInfo.dob.sendKeys("1/1/1990");
		personalInfo.id.sendKeys("12345");
		personalInfo.nextIp.click();

	}

	@When("^I do not fill the Contact Information fields with acceptable data type$")
	public void i_do_not_fill_the_Contact_Information_fields_with_acceptable_data_type() throws Throwable {

		

	}

	@When("^I click the Next button$")
	public void i_click_the_Next_button() throws Throwable {

	}

	@Then("^I should be able to see error messages for the field$")
	public void i_should_be_able_to_see_error_messages_for_the_field() throws Throwable {

	}
	
}
