package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver; 

import com.ct.pages.CTL_30_Personal_Information;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL_129 {
	
	private static WebDriver driver;

	CTL_30_Personal_Information hp = new CTL_30_Personal_Information();
	
	
	@Given("^User on the CT Loan application to complete personal information$")
	public void user_on_the_CT_Loan_application_to_complete_personal_information() throws Throwable {
		
		Thread.sleep(3000);
		Driver.getInstance().get(CTContstants.QA_URL);
		Driver.getInstance().switchTo().defaultContent();
		Driver.getInstance().switchTo().parentFrame();
		Driver.getInstance().switchTo().frame(1);
		
				// verify title
				// System.out.println(Driver.getInstance().getTitle());
				String actualTitle = Driver.getInstance().getTitle();
				String title = "CT Loan – Cybertek";
				Assert.assertTrue(title.equals(actualTitle));
	}
	  

	@Given("^I enter valid personal, contact, employment and financial information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_enter_valid_personal_contact_employment_and_financial_information(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
 
		hp.firstName.sendKeys(arg1);
		hp.middleName.sendKeys(arg2);
		hp.lastName.sendKeys(arg3);
		Thread.sleep(1000);
		hp.male.click();
		hp.dateOfBirth.sendKeys(arg4);
		hp.sSN.sendKeys(arg5);
		
	}

	@When("^User submit the personal information form$")
	public void user_submit_the_personal_information_form() throws Throwable {
		Thread.sleep(500);
		hp.next.click();
	  
	}

	@Then("^The personal information should be saved in person table$")
    public void the_personal_information_should_be_saved_in_person_table() throws Throwable {
	}
	
}

