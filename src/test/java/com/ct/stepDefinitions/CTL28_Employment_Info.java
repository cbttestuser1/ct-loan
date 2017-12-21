package com.ct.stepDefinitions;

import org.junit.Assert;

import com.ct.pages.CTL_Employment_info_page;
import com.ct.pages.CTL_FinancialInfoPage;
import com.ct.utilities.Driver;
import static com.ct.utilities.Driver.unHighLightElement;
import static com.ct.utilities.Driver.highLightElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL28_Employment_Info {
	
	CTL_Employment_info_page empInfo = new CTL_Employment_info_page();
	CTL_FinancialInfoPage financeInfo = new CTL_FinancialInfoPage();
	
	@Then("^I select title$")
	public void i_select_title() throws Throwable {
		highLightElement(Driver.driver, empInfo.title);
		empInfo.titleSel.get(1).click();
		unHighLightElement(Driver.driver, empInfo.title);
	}

	@Then("^I select department$")
	public void i_select_department() throws Throwable {
		highLightElement(Driver.driver, empInfo.department);
		empInfo.departmentSel.get(2).click();
		unHighLightElement(Driver.driver, empInfo.department);
	}

	@Then("^I select Duration of Employment$")
	public void i_select_Duration_of_Employment() throws Throwable {
		highLightElement(Driver.driver, empInfo.durationOfElement);
		empInfo.durationOfElemForIndex.get(2).click();
		unHighLightElement(Driver.driver, empInfo.durationOfElement);
	}

	@Then("^I select Purpose of Loan$")
	public void i_select_Purpose_of_Loan() throws Throwable {
		highLightElement(Driver.driver, empInfo.purposeOfLoan);
		empInfo.selectPurpose.get(1).click();  
		unHighLightElement(Driver.driver, empInfo.purposeOfLoan);
	}

	@Then("^I select Supervisor$")
	public void i_select_Supervisor() throws Throwable {
		highLightElement(Driver.driver, empInfo.supervizor);
		empInfo.supervizorSelect.get(1).click();
		unHighLightElement(Driver.driver, empInfo.supervizor);
	}

	@When("^I click on Next button employment page$")
	public void i_click_on_Next_button_employment_page() throws Throwable {
		highLightElement(Driver.driver, empInfo.nextButton);
		empInfo.nextButton.click();
		unHighLightElement(Driver.driver, empInfo.nextButton);
	}

	@Then("^I have to end up in financial information page\\.$")
	public void i_have_to_end_up_in_financial_information_page() throws Throwable {
		Assert.assertTrue(financeInfo.financialInformationSign.getText().equals("Financial Information"));

	}


}
