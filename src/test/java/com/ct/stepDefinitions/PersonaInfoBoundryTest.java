package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CT_HomePage;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PersonaInfoBoundryTest {
	CT_HomePage homePage;

	@Given("^I go to CT-Loan web page$")
	public void i_go_to_CT_Loan_web_page() throws Throwable {
		Driver.getInstance().get(CTContstants.QA_URL);
	}

	@When("^I enter First Name and Last Name$")
	public void i_enter_First_Name_and_Last_Name() throws Throwable {
		homePage = new CT_HomePage();
		Driver.getInstance().switchTo().defaultContent();
		Driver.getInstance().switchTo().parentFrame();
		Driver.getInstance().switchTo().frame(1);
		homePage.firstName.sendKeys("toCheckCharactersDoNotExceedTheBoundryLimit");
		homePage.middleName.sendKeys("ShouldNotExceedMoreThanThirtyFiveCharacters");
		homePage.lastName.sendKeys("ThisIsTheLastBoundryTest");
	}

	@Then("^I should verify it is not null$")
	public void i_should_verify_it_is_not_null() throws Throwable {
		Assert.assertNotNull(homePage.firstName);
	}

}
