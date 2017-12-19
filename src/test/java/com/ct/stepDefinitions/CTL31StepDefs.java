package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CT_HomePage;
import com.ct.utilities.ConfigurationReader;
import com.ct.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CTL31StepDefs {

	CT_HomePage homePage = new CT_HomePage(Driver.getInstance());
	WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 10);

	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		WebElement iframe = Driver.getInstance().findElement(By.xpath("//div[@class='qodef-content']//iframe"));
		Driver.getInstance().switchTo().frame(iframe);
	}

	@Given("^users adds \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void users_adds(String firstName, String middleName, String lastName) throws Throwable {
		homePage.sendFirstName(firstName);
		homePage.sendMiddleName(middleName);
		homePage.sendLastName(lastName);
	}

	@Given("^user picks a Gender$")
	public void user_picks_a_Gender() throws Throwable {
		homePage.chosseGender();
	}

	@Given("^user enters date of birth \"([^\"]*)\"$")
	public void user_enters_Date_of_birth(String dob) throws Throwable {
		homePage.dateOfBirthField.sendKeys(dob);
	}

	@Given("^user enters SSN/Personal File ID \"([^\"]*)\"$")
	public void user_enters_SSN_Personal_File_ID(String ssn) throws Throwable {
		homePage.SSN_Field.sendKeys(ssn);
	}

	
	@Given("^user should click on Next button$")
	public void user_should_click_on_Next_button() throws Throwable {
		homePage.clickOnNextButton();
	}
	
	
	@Then("^user need to assert that he is in Contact Information Page$")
	public void user_need_to_assert_that_he_is_in_Contact_Information_Page() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(homePage.personalText));
		homePage.assertIsTextDisplayed(homePage.personalText);
		System.out.println(homePage.personalText.getText());
	}

}
