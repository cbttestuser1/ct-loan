package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.ct.utilities.Driver.highLightElement;
import static com.ct.utilities.Driver.unHighLightElement;
import com.ct.pages.CTL_Contact_InfoPage;
import com.ct.pages.CT_HomePage_Pesonal_info;
import com.ct.utilities.BrowserUtilities;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL20_personal_info {
	
	CT_HomePage_Pesonal_info personalInfo = new CT_HomePage_Pesonal_info();
	CTL_Contact_InfoPage contactInfo = new CTL_Contact_InfoPage();

	@Given("^I am on the home page of CT-Loan$")
	public void i_am_on_the_home_page_of_CT_Loan() throws Throwable {
		Driver.getInstance().get(CTContstants.QA_URL);
		Driver.getInstance().manage().window().maximize();
		WebElement n = Driver.getInstance().findElement(By.xpath("(//iframe)[2]"));
		Driver.getInstance().switchTo().frame(n);

	}

	@Then("^I add first name  \"([^\"]*)\"$")
	public void i_add_first_name(String FirstName) throws Throwable {
	highLightElement(Driver.driver, personalInfo.firstNameField);
		personalInfo.firstNameField.sendKeys(FirstName+" "+BrowserUtilities.getCurrentTime());
		unHighLightElement(Driver.driver, personalInfo.firstNameField);
	}

	@Then("^I add middle name \"([^\"]*)\"$")
	public void i_add_middle_name(String MiddleName) throws Throwable {
		highLightElement(Driver.driver, personalInfo.middleNameField);
		personalInfo.middleNameField.sendKeys(MiddleName);
		unHighLightElement(Driver.driver, personalInfo.middleNameField);
	}

	@Then("^I add last name \"([^\"]*)\"$")
	public void i_add_last_name(String LastName) throws Throwable {
		highLightElement(Driver.driver, personalInfo.lastNameField);
		personalInfo.lastNameField.sendKeys(LastName);
		unHighLightElement(Driver.driver, personalInfo.lastNameField);
	}

	@Then("^I choose my gender$")
	public void i_choose_my_gender() throws Throwable {
		highLightElement(Driver.driver, personalInfo.genderFemale);
		personalInfo.genderFemale.click();
		unHighLightElement(Driver.driver, personalInfo.genderFemale);
	}

	@Then("^I add date of birth \"([^\"]*)\"$")
	public void i_add_date_of_birth(String DateOfBirth) throws Throwable {
		highLightElement(Driver.driver, personalInfo.dateField);
		personalInfo.dateField.sendKeys(DateOfBirth);
		unHighLightElement(Driver.driver, personalInfo.dateField);
		
	}

	@Then("^I  add SSN \"([^\"]*)\"$")
	public void i_add_SSN(String SSN) throws Throwable {		
		highLightElement(Driver.driver, personalInfo.SSNField);
		personalInfo.SSNField.sendKeys(SSN);
		unHighLightElement(Driver.driver, personalInfo.SSNField);
	}

	@When("^I click on Next button$")
	public void i_click_on_Next_button() throws Throwable {
		highLightElement(Driver.driver, personalInfo.nextButton);
		personalInfo.nextButton.click();
		unHighLightElement(Driver.driver, personalInfo.nextButton);
	}

	@Then("^I have to end up in contact information page\\.$")
	public void i_have_to_end_up_in_contact_information_page() throws Throwable {
		Assert.assertTrue(contactInfo.contactInformationText.getText().equals("Contact Information"));

	}

}