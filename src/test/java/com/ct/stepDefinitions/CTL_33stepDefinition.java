package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ct.pages.CTL_Personal_Information_Page;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL_33stepDefinition {
	CTL_Personal_Information_Page page = new CTL_Personal_Information_Page();

	@Given("^the user is on the personal information page$")
	public void the_user_is_on_the_personal_information_page() throws Throwable {
		Thread.sleep(3000);
		Driver.getInstance().get(CTContstants.QA_URL);
		Driver.getInstance().switchTo().defaultContent();
		Driver.getInstance().switchTo().parentFrame();
		Driver.getInstance().switchTo().frame(1);
	
		//Verify url
		String actualUrl=Driver.getInstance().getCurrentUrl();
	    String expectedUrl="http://cybertekschool.com/ctl.qa";
//	    Assert.assertTrue(actualUrl.equals(expectedUrl));  // verify with assertTrue()
	    Assert.assertEquals(expectedUrl, actualUrl); // verify with assertEqual()
		
		//verify title
		//System.out.println(Driver.getInstance().getTitle());
		String actualTitle=Driver.getInstance().getTitle();
		String title="CT Loan - Cybertek";
	    Assert.assertTrue(title.equals(actualTitle));
	}

	@When("^the user does not fill in the fields marked with an \\*$")
	public void the_user_does_not_fill_in_the_fields_marked_with_an() throws Throwable {

		page.firstName.sendKeys();
		page.lastName.sendKeys();
		page.dob.sendKeys();
		page.dob.isSelected();
		page.id.sendKeys();
	}

	@When("^the user scrolls down$")
	public void the_user_scrolls_down() throws Throwable {

	}

	@When("^clicks on the submit button$")
	public void clicks_on_the_submit_button() throws Throwable {
		page.nextIp.click();

	}

	@Then("^the user should see an error message to enter a value for those fields$")
	public void the_user_should_see_an_error_message_to_enter_a_value_for_those_fields() throws Throwable {
		 String errorMsg= Driver.getInstance().findElement(By.className("errorMessage")).getText();
		 String expectedErrorMsg="Enter a value for this field.";
		 Assert.assertTrue(expectedErrorMsg.equals(errorMsg));
	}

}
