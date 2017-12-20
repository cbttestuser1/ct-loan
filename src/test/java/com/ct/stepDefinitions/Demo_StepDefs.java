package com.ct.stepDefinitions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CTL55_HomePage;
import com.ct.pages.CT_HomePage;
import com.ct.pages.CTeckLoan_37Home;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;

public class Demo_StepDefs {

	CTeckLoan_37Home user = new CTeckLoan_37Home();	
	CT_HomePage homePage = new CT_HomePage(Driver.getInstance());
	CTL55_HomePage home = new CTL55_HomePage();
	WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 10);
	
	@Given("^users adds \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void users_adds(String firstName, String middleName, String lastName) throws Throwable {
	    homePage.firstNameField.sendKeys(firstName);
	    homePage.middleNameField.sendKeys(middleName);
	    homePage.lastNameField.sendKeys(lastName);
	}
	
	
	
}
