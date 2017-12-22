package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.ct.utilities.Driver.unHighLightElement;
import com.ct.pages.CTL_BasePage;
import com.ct.pages.CTL_FinancialInfoPage;
import com.ct.utilities.Driver;
import com.ct.utilities.Screen2image;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.ct.utilities.Driver.highLightElement;

public class CTL_FinancialInfo {
	
	

	CTL_FinancialInfoPage page= new CTL_FinancialInfoPage();
	CTL_BasePage basePage= new CTL_BasePage();
	static String myApplicationId;
	@When("^user is on the last financial info page$")
	public void user_is_on_the_last_financial_info_page() throws Throwable {
		
	}

	@And("^user checks the button for loan application$")
	public void user_checks_the_button_for_loan_application() throws Throwable {
		page.CTLoanYesButton.click();
		page.aplicantrsCount.sendKeys("2");
	}

	@And("^user enter anual income$")
	public void user_enter_anual_income() throws Throwable {
		highLightElement(Driver.driver, page.AnnualIncomeField);
		page.AnnualIncomeField.sendKeys("10000");
		unHighLightElement(Driver.driver, page.AnnualIncomeField);
	}

	@And("^user selects income type$")
	public void user_selects_income_type() throws Throwable {
		highLightElement(Driver.driver, page.IncomeTypeSelect);
		Select select=new Select(page.IncomeTypeSelect);
		select.selectByIndex(1);
		unHighLightElement(Driver.driver, page.IncomeTypeSelect);
	}

	@And("^user checks button about rent/own a house$")
	public void user_checks_button_about_rent_own_a_house() throws Throwable {
		highLightElement(Driver.driver, page.HomeOwnButton);
		page.HomeOwnButton.click();
		unHighLightElement(Driver.driver, page.HomeOwnButton);
		
	}

	@And("^user enters amount about monthly expanse$")
	public void user_enters_amount_about_monthly_expanse() throws Throwable {
		highLightElement(Driver.driver, page.MonthlyExpanseField);
		page.MonthlyExpanseField.sendKeys("300");
		unHighLightElement(Driver.driver, page.MonthlyExpanseField);
	}
	
	@And("^user enters a data into dependence field$")
	public void user_enters_a_data_into_dependence_field() throws Throwable {
		highLightElement(Driver.driver, page.dependenceField);
		page.dependenceField.sendKeys("2");
		unHighLightElement(Driver.driver, page.dependenceField);
	}

	@And("^user enter a data into saving field$")
	public void user_enter_a_data_into_saving_field() throws Throwable {
		highLightElement(Driver.driver, page.savingField);
		page.savingField.sendKeys("100");
		unHighLightElement(Driver.driver, page.savingField);
	}

	@And("^user selects desired loan term$")
	public void user_selects_desired_loan_term() throws Throwable {
		highLightElement(Driver.driver, page.desiredLoanTermSelect);
		Select select=new Select(page.desiredLoanTermSelect);
		select.selectByVisibleText("24 months");
		unHighLightElement(Driver.driver, page.desiredLoanTermSelect);
	}

	@And("^user checks the button to confirm about all information above$")
	public void user_checks_the_button_to_confirm_about_all_information_above() throws Throwable {
		highLightElement(Driver.driver, page.confirmDecisionCheckButton);
		page.confirmDecisionCheckButton.click();
		unHighLightElement(Driver.driver, page.confirmDecisionCheckButton);
	}
	
	@Then("^user enters full name \"([^\"]*)\"$")
	public void user_enters_full_name(String fullName) throws Throwable {
		highLightElement(Driver.driver, page.fullName);
		page.fullName.sendKeys(fullName); 
		unHighLightElement(Driver.driver, page.fullName);
	}
	@Then("^user enters single line \"([^\"]*)\"$")
	public void user_enters_single_line(String singleLine) throws Throwable {
		highLightElement(Driver.driver, page.singleLineField);
		page.singleLineField.sendKeys(singleLine); 
		unHighLightElement(Driver.driver, page.singleLineField);
	}


	@And("^user enters the date in mm/dd/yyyy format$")
	public void user_enters_the_date_in_mm_dd_yyyy_format() throws Throwable {
		highLightElement(Driver.driver, page.date);
		page.date.sendKeys("12/25/2017");
		unHighLightElement(Driver.driver, page.date);
	}

	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		highLightElement(Driver.driver, page.submitButton);
		page.submitButton.click();
		unHighLightElement(Driver.driver, page.submitButton);
	}
	@Then("^you should see succesfull message \"([^\"]*)\"$")
	public void you_should_see_succesfull_message(String successMessage) throws Throwable {
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(),5);
		wait.until(ExpectedConditions.visibilityOf(basePage.successMessage));
		Assert.assertTrue(basePage.successMessage.getText().equals(successMessage));
		myApplicationId=basePage.applicationID.getText().substring(28, 33);
		System.out.println(myApplicationId);
	}
	
}
