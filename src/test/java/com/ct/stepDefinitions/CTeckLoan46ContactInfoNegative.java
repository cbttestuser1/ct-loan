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

public class CTeckLoan46ContactInfoNegative {
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

	@When("^user add his Address having length less and more than expected$")
	public void user_enders_a_data_into_the_Street_Address_field_less_than_minimum_size_required_in_requirement_document(
			DataTable usercredentials) throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");
		List<List<String>> data = usercredentials.raw();
		// get data from second row and first column
		pages.Address1.sendKeys(data.get(1).get(0));
	}

	@And("^user selects the country$")
	public void user_selects_the_country() throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");
		Select select = new Select(pages.Country);
		select.selectByIndex(1);
	}

	@Then("^the error massage for Street Address field should pop up$")
	public void the_error_massage_for_Street_Address_field_should_pop_up() throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");
		try {
			Assert.assertTrue(error.isDisplayed());
		} catch (Exception e) {
			System.out.println("The Error Massage Did Not Pop Up");
		}

	}

	@When("^user add his Address Line (2) having length more than expected$")
	public void user_add_his_Address_Line_having_length_more_than_expected(int arg1, DataTable arg2) throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");

		throw new PendingException();
	}

	@Then("^user has to receive error massage for Address Line Two field$")
	public void user_has_to_receive_error_massage_for_Address_Line_Two_field() throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");
	}

	@When("^user add his City having special length more than expected$")
	public void user_add_his_City_having_special_length_more_than_expected(DataTable arg1) throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");

		throw new PendingException();
	}

	@Then("^user has to receive error massage for City filed$")
	public void user_has_to_receive_error_massage_for_City_filed() throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");
	}

	@When("^user add his Zip Code having length less and more than expected$")
	public void user_add_his_Zip_Code_having_length_less_and_more_than_expected(DataTable arg1) throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");

		throw new PendingException();
	}

	@When("^user add his Ext. having length less and more than expected$")
	public void user_add_his_Ext_having_length_less_and_more_than_expected(DataTable arg1) throws Throwable {

		throw new PendingException();
	}

	@When("^user add his Phone number having length more than expected$")
	public void user_add_his_Phone_number_having_length_more_than_expected(DataTable arg1) throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");

		throw new PendingException();
	}

	@Then("^user has to receive error massage for Work Phone Number field$")
	public void user_has_to_receive_error_massage_for_Work_Phone_Number_field() throws Throwable {
		driver.switchTo().frame(
				"//iframe[@src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']");
	}
}
