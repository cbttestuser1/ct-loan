package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_CloanHomePage_4;
import com.ct.pages.CT_Cloan_FakePerson;
import com.ct.utilities.Driver;
import com.ct.utilities.PageUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CT_CLoanStepDefs_CTL_116 {
	private WebDriver driver = Driver.getInstance();

	@Given("^enter valid personal, contact, employment and financial information$")
	public void enter_valid_personal_contact_employment_and_financial_information() throws Throwable {
		CT_Cloan_FakePerson person = new CT_Cloan_FakePerson();
		person.fillOutAllPersonInfoOn_CT_Cloan();
		// comment
	}

	@When("^I submit the form$")
	public void i_submit_the_form() throws Throwable {
		CT_CloanHomePage_4 p4 = new CT_CloanHomePage_4();
		// p4.submitButton.click();
		Thread.sleep(5000);
	}

	@Then("^I should get an email confirming my application$")
	public void i_should_get_an_email_confirming_my_application() throws Throwable {

		String loanNumber = PageUtils.getId(driver.findElement(By.xpath("//*[@id='richTxtMsgSpan']//div[4]")).getText());
		System.out.println("We got Loan Application Number, it is " + loanNumber);
		String emailContent = EmailChecker.massageText();
		Assert.assertTrue(emailContent.contains(loanNumber));
		System.out.println("Loan Numver " + loanNumber + " and it is contains in email!");
	}

}
