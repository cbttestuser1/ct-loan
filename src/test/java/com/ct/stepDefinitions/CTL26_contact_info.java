package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import static com.ct.utilities.Driver.highLightElement;
import static com.ct.utilities.Driver.unHighLightElement;
import com.ct.pages.CTL_Contact_InfoPage;
import com.ct.pages.CTL_Employment_info_page;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL26_contact_info {

	CTL_Contact_InfoPage contactInfo = new CTL_Contact_InfoPage();
	CTL_Employment_info_page employmentPage = new CTL_Employment_info_page();
	
	@Then("^I add Address Line first  \"([^\"]*)\"$")
	public void i_add_Address_Line_first(String addressOne) throws Throwable {
//		WebElement n=Driver.getInstance().findElement(By.xpath("(//iframe)[2]"));
//		Driver.getInstance().switchTo().frame(n);
		highLightElement(Driver.driver, contactInfo.StreetAddressField);
		contactInfo.StreetAddressField.sendKeys(addressOne);
		unHighLightElement(Driver.driver, contactInfo.StreetAddressField);
	}

	@Then("^I add Address Line second  \"([^\"]*)\"$")
	public void i_add_Address_Line_second(String addressTwo) throws Throwable {
		highLightElement(Driver.driver, contactInfo.AddressLineTwo);
		contactInfo.AddressLineTwo.sendKeys(addressTwo);
		unHighLightElement(Driver.driver, contactInfo.AddressLineTwo);
	}

	@Then("^I add City \"([^\"]*)\"$")
	public void i_add_City(String city) throws Throwable {
		highLightElement(Driver.driver, contactInfo.City);
		contactInfo.City.sendKeys(city);
		unHighLightElement(Driver.driver, contactInfo.City);
	}

	@Then("^I add State \"([^\"]*)\"$")
	public void i_add_State(String state) throws Throwable {
		highLightElement(Driver.driver, contactInfo.State);
		contactInfo.State.sendKeys(state);
		unHighLightElement(Driver.driver, contactInfo.State);
	}

	@Then("^I  add Zipcode \"([^\"]*)\"$")
	public void i_add_Zipcode(String zip) throws Throwable {
		highLightElement(Driver.driver, contactInfo.ZipCode);
		contactInfo.ZipCode.sendKeys(zip);
		unHighLightElement(Driver.driver, contactInfo.ZipCode);
	}
	@Then("^I select country$")
	public void i_select_country() throws Throwable {
		highLightElement(Driver.driver, contactInfo.Country);
		Select country = new Select(contactInfo.Country); 
		country.selectByVisibleText("United States");
		unHighLightElement(Driver.driver, contactInfo.Country);
	}

	@Then("^I  add Personal Phone \"([^\"]*)\"$")
	public void i_add_Personal_Phone(String cellPhone) throws Throwable {
		highLightElement(Driver.driver, contactInfo.PersonalPhoneCountryCode);
		contactInfo.PersonalPhoneCountryCode.sendKeys(cellPhone);
		unHighLightElement(Driver.driver, contactInfo.PersonalPhoneCountryCode);
	}

	@Then("^I  add Work Phone \"([^\"]*)\"$")
	public void i_add_Work_Phone(String workPhone) throws Throwable {
		highLightElement(Driver.driver, contactInfo.WorkPhoneCountryCode);
		contactInfo.WorkPhoneCountryCode.sendKeys(workPhone);
		unHighLightElement(Driver.driver, contactInfo.WorkPhoneCountryCode);
	}
	@Then("^I add an Ext\\. \"([^\"]*)\"$")
	public void i_add_an_Ext(String ext) throws Throwable {
		highLightElement(Driver.driver, contactInfo.Extension);
		contactInfo.Extension.sendKeys(ext);
		unHighLightElement(Driver.driver, contactInfo.Extension);
	}

	@Then("^I  add Email_Work \"([^\"]*)\"$")
	public void i_add_Email_Work(String emailWork) throws Throwable {
		highLightElement(Driver.driver, contactInfo.WorkEmail);
		contactInfo.WorkEmail.sendKeys(emailWork);
		unHighLightElement(Driver.driver, contactInfo.WorkEmail);
	}

	@Then("^I  add Email_Personal \"([^\"]*)\"$")
	public void i_add_Email_Personal(String email) throws Throwable {
		highLightElement(Driver.driver, contactInfo.PersonalEmail);
		contactInfo.PersonalEmail.sendKeys(email);
		unHighLightElement(Driver.driver, contactInfo.PersonalEmail);
	}
	@When("^I click on Next button contact page$")
	public void i_click_on_Next_button_contact_page() throws Throwable {
		highLightElement(Driver.driver, contactInfo.NextButton);
		contactInfo.NextButton.click();
		unHighLightElement(Driver.driver, contactInfo.NextButton);
	}

	@Then("^I have to end up in employment information page\\.$")
	public void i_have_to_end_up_in_employment_information_page() throws Throwable {
		Assert.assertTrue(employmentPage.employmentInformationSign.getText().equals("Employment Information"));
	}

}
