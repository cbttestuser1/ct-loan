package com.ct.stepDefinitions;

import com.ct.pages.CTL55_HomePage;
import com.ct.utilities.ConfigurationReader;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CTL55TestContactInformationstepdefs {
	CTL55_HomePage homePage = new CTL55_HomePage();

	@Given("^the user is on the CT-Loan home page$")
	public void the_user_is_on_the_CT_Loan_home_page() throws Throwable {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		Thread.sleep(30000);
	}

	@Given("^the user enters acceptable streetAddress \"([^\"]*)\"$")
	public void the_user_enters_acceptable_streetAddress(String address1) throws Throwable {
		homePage.switchToIframe(homePage.frame);
		homePage.address.sendKeys(address1);

	}

	@Given("^the user enters  addressLinetwo \"([^\"]*)\"$")
	public void the_user_enters_addressLinetwo(String address2) throws Throwable {
		homePage.addressLineTwo.sendKeys(address2);
	}

	@Given("^the user enters  city \"([^\"]*)\"$")
	public void the_user_enters_city(String city) throws Throwable {
		homePage.city.sendKeys(city);
	}

	@Given("^the user enters  state \"([^\"]*)\"$")
	public void the_user_enters_state(String state) throws Throwable {
		homePage.state.sendKeys(state);
	}

	@Given("^the user enters  zipCode \"([^\"]*)\"$")
	public void the_user_enters_zipCode(String zipCode) throws Throwable {
		homePage.zipCode.sendKeys(zipCode);
	}

	@Given("^the user enters country \"([^\"]*)\"$")
	public void the_user_enters_country(String arg1) throws Throwable {
		homePage.selectFromDropDown(homePage.selectCountry, arg1);
	}

	@Given("^the user enters  personalPhonePartOne \"([^\"]*)\"$")
	public void the_user_enters_personalPhonePartOne(String personalCode) throws Throwable {
		homePage.personalPhoneCountryCode.sendKeys(personalCode);
	}

	@Given("^the user enters  personalPhonePartTwo \"([^\"]*)\"$")
	public void the_user_enters_personalPhonePartTwo(String personalPartOne) throws Throwable {
		homePage.personalPhonePartOne.sendKeys(personalPartOne);
	}

	@Given("^the user enters  personalPhonePartthree \"([^\"]*)\"$")
	public void the_user_enters_personalPhonePartthree(String personalPartTwo) throws Throwable {
		homePage.personalPhonePartTwo.sendKeys(personalPartTwo);
	}

	@Given("^the user enters  workPhonePartOne \"([^\"]*)\"$")
	public void the_user_enters_workPhonePartOne(String workingCode) throws Throwable {
		homePage.workingPhoneCountryCode.sendKeys(workingCode);
	}

	@Given("^the user enters  workPhonePartTwo \"([^\"]*)\"$")
	public void the_user_enters_workPhonePartTwo(String workingPartOne) throws Throwable {
		homePage.workingPhonePartOne.sendKeys(workingPartOne);
	}

	@Given("^the user enters  workPhonePartThree \"([^\"]*)\"$")
	public void the_user_enters_workPhonePartThree(String workingPartTwo) throws Throwable {
		homePage.workingPhonePartTwo.sendKeys(workingPartTwo);
	}

	@Given("^the user enters  extension \"([^\"]*)\"$")
	public void the_user_enters_extension(String extension) throws Throwable {
		homePage.extension.sendKeys(extension);
	}

	@Given("^the user enters  workEmail \"([^\"]*)\"$")
	public void the_user_enters_workEmail(String workEmail) throws Throwable {
		homePage.workingEmail.sendKeys(workEmail);
	}

	@Given("^the user enters  personalEmail \"([^\"]*)\"$")
	public void the_user_enters_personalEmail(String personalEmail) throws Throwable {
		homePage.personalEmail.sendKeys(personalEmail);
	}

	@Given("^the user click on the next button $")
	public void the_user_click_on_the_next_button() throws Throwable {
		homePage.nextButton.click();
	}

	@Then("^the employment information should be displayed \"([^\"]*)\"$")
	public void the_employment_information_should_be_displayed(String text) throws Throwable {
		homePage.textIsPresent(homePage.employmentInfo, text);
	}

}
