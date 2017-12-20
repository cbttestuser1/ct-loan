package com.ct.stepDefinitions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.CTeckLoan43ContatInfoHome;
import com.ct.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTeckLoan43ContactInfoNegative {

	WebDriver driver = Driver.getInstance();

	CTeckLoan43ContatInfoHome pages = new CTeckLoan43ContatInfoHome();
	WebElement error = pages.ErrorMassage;

	@Given("^I am on the home page of CT-Loan$")
	public void i_am_on_the_home_page_of_CT_Loan() throws Throwable {

		driver.get("http://cybertekschool.com/ctl.qa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(15000);

		throw new PendingException();

	}

	@When("^user add his Address in CT-Loan having special characters$")
	public void user_add_his_Address_in_CT_Loan_having_special_characters(DataTable arg1) throws Throwable {

		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");
		try {
			Assert.assertTrue(error.isDisplayed());
		} catch (Exception e) {
			System.out.println("The Error Massage Did Not Pop Up");
		}

	}

	@When("^user add his Address Line (2) in CT-Loan having special characters$")
	public void user_add_his_Address_Line_in_CT_Loan_having_special_characters(int arg1, DataTable arg2)
			throws Throwable {
		throw new PendingException();

	}

	@And("^user selects the country$")
	public void user_selects_the_country() throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");
		Select select = new Select(pages.Country);
		select.selectByIndex(1);
	}

	@Then("^user should see the error pop up$")
	public void user_should_see_the_error_pop_up() throws Throwable {
		throw new PendingException();
	}

	@When("^user add his City in CT-Loan having type String$")
	public void user_add_his_City_in_CT_Loan_having_type_String(DataTable arg1) throws Throwable {
		throw new PendingException();

	}

	@When("^user add his City in CT-Loan having special characters$")
	public void user_enters_special_charaters_into_City_field(DataTable usercredentials) throws Throwable {
		List<List<String>> data = usercredentials.raw();
		pages.City.sendKeys(data.get(1).get(2));
	}

	@Then("^user has to receive error massage for City filed$")
	public void user_has_to_receive_error_massage_for_City_filed() throws Throwable {

	}

	@When("^user add his Zip Code in CT-Loan having type Integer$")
	public void user_add_his_Zip_Code_in_CT_Loan_having_type_Integer(DataTable arg1) throws Throwable {
		throw new PendingException();
	}

	@When("^user enters same phone number into this field as Personal Phone number$")
	public void user_enters_same_phone_number_into_this_field_as_Personal_Phone_number(DataTable usercredentials)
			throws Throwable {
		List<List<String>> data = usercredentials.raw();
		pages.WorkPhoneCountryCode.sendKeys(data.get(1).get(6));
		pages.WorkPhoneFirst.sendKeys(data.get(1).get(7));
		pages.WorkPhoneSecond.sendKeys(data.get(1).get(8));

	}

	@Then("^user has to receive error massage for Work Phone Number field$")
	public void user_has_to_receive_error_massage_for_Work_Phone_Number_field() throws Throwable {

	}

	@When("^user enters same personal email as work email into Personal Email field$")
	public void user_enters_same_personal_email_as_work_email_into_Personal_Email_field(DataTable usercredentials)
			throws Throwable {
		List<List<String>> data = usercredentials.raw();
		pages.Address2.sendKeys(data.get(1).get(8));
	}

	@Then("^user has to receive error massage for Personal Email field$")
	public void user_has_to_receive_error_massage_for_Personal_Email_field() throws Throwable {

	}
}
