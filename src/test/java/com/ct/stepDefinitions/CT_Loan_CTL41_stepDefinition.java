package com.ct.stepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CT_HomePage3;
import com.ct.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CT_Loan_CTL41_stepDefinition {
	private WebDriver driver = Driver.getInstance();
	// private WebElement iframe =
	// driver.findElement(By.cssSelector(".wpb_text_column.wpb_content_element
	// iframe"));
	// private CT_HomePage2 page2 = new CT_HomePage2();
	CT_HomePage3 page3 = new CT_HomePage3();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Select dd;

	//
	// @When("^I am Enter Personal Information First Name as \"([^\"]*)\"$")
	// public void i_am_Enter_Personal_Information_First_Name_as(String arg1) throws
	// Throwable {
	// driver.switchTo().frame(iframe);
	// driver.findElement(By.xpath("//*[@id='SingleLine-li']//*[@name='SingleLine']")).sendKeys(arg1);
	// }
	//
	// @When("^I am Enter Personal Information Middle Name as \"([^\"]*)\"$")
	// public void i_am_Enter_Personal_Information_Middle_Name_as(String arg1)
	// throws Throwable {
	// driver.findElement(By.xpath("//*[@id='SingleLine1-li']//*[@name='SingleLine1']")).sendKeys(arg1);
	// }
	//
	// @When("^I am Enter Personal Information Last Name \"([^\"]*)\"$")
	// public void i_am_Enter_Personal_Information_Last_Name(String arg1) throws
	// Throwable {
	// driver.findElement(By.xpath("//*[@id='SingleLine2-li']//*[@name='SingleLine2']")).sendKeys(arg1);
	// }
	//
	// @When("^I am Select Personal Information Genger as \"([^\"]*)\"$")
	// public void i_am_Select_Personal_Information_Genger_as(String arg1) throws
	// Throwable {
	// driver.findElement(By.cssSelector("#Radio_1")).click();
	// }
	//
	// @When("^I am Enter Personal Information Date of Birth as \"([^\"]*)\"$")
	// public void i_am_Enter_Personal_Information_Date_of_Birth_as(String arg1)
	// throws Throwable {
	// driver.findElement(By.cssSelector(".tempContDiv #Date-date")).sendKeys(arg1);
	// }
	//
	// @When("^I am Enter Personal Information Personal File ID as \"([^\"]*)\"$")
	// public void i_am_Enter_Personal_Information_Personal_File_ID_as(String arg1)
	// throws Throwable {
	// driver.findElement(By.xpath("//*[@id='Number-li']//*[@name='Number']")).sendKeys(arg1);
	// }
	//
	// @Then("^I am Click on Next Button$")
	// public void i_am_Click_on_Next_Button() throws Throwable {
	// driver.findElement(By.cssSelector(".fmSmtButton.next_previous")).click();
	// }
	//
	// /*
	// * From Here start Script for CTL-44
	// */
	// @Given("^I amd Enter Street Address as \"([^\"]*)\"$")
	// public void i_amd_Enter_Street_Address_as(String streetAddress) throws
	// Throwable {
	// page2.streetAddress.sendKeys(streetAddress);
	// }
	//
	// @When("^I amd Enter Address Line Second as \"([^\"]*)\"$")
	// public void i_amd_Enter_Address_Line_Second_as(String secondLine) throws
	// Throwable {
	// page2.addressLine2.sendKeys(secondLine);
	// }
	//
	// @When("^I amd Enter City as \"([^\"]*)\"$")
	// public void i_amd_Enter_City_as(String city) throws Throwable {
	// page2.city.sendKeys(city);
	// }
	//
	// @When("^I amd Enter State as \"([^\"]*)\"$")
	// public void i_amd_Enter_State_as(String state) throws Throwable {
	// page2.state.sendKeys(state);
	// }
	//
	// @When("^I amd Enter Postal / ZIP Code as \"([^\"]*)\"$")
	// public void i_amd_Enter_Postal_ZIP_Code_as(String zipCode) throws Throwable {
	// page2.zipCode.sendKeys(zipCode);
	// }
	//
	// // rESUABLE METHOD FOR SELECTING COUNTRY
	// @When("^I amd Enter Country as \"([^\"]*)\"$")
	// public void i_amd_Enter_Country_as(String country) throws Throwable {
	// page2.country.sendKeys(country);
	// CT_HomePage2 home = new CT_HomePage2();
	// Select coun = new Select(home.country);
	// int size = home.countryOptions.size();
	// for (int i = 0; i < size; i++) {
	// coun.selectByIndex(i);
	// }
	//
	// }
	//
	// @When("^I amd Enter Personal Phone Number as \"([^\"]*)\"$")
	// public void i_amd_Enter_Personal_Phone_Number_as(String personalPhone) throws
	// Throwable {
	// String[] numbers = personalPhone.split("-");
	// page2.personalNum1.sendKeys(numbers[0]);
	// page2.personalNum2.sendKeys(numbers[1]);
	// page2.personalNum3.sendKeys(numbers[2]);
	// }
	//
	// @When("^I amd Enter Work Phone Number as \"([^\"]*)\"$")
	// public void i_amd_Enter_Work_Phone_Number_as(String workPhone) throws
	// Throwable {
	// String[] numbers = workPhone.split("-");
	//
	// page2.workNum1.sendKeys(numbers[0]);
	// page2.workNum2.sendKeys(numbers[1]);
	// page2.workNum3.sendKeys(numbers[2]);
	// }
	//
	// @When("^I amd Enter Extenstion as \"([^\"]*)\"$")
	// public void i_amd_Enter_Extenstion_as(String extantion) throws Throwable {
	// page2.extension.sendKeys(extantion);
	// }
	//
	// @When("^I amd Enter Personal Email as \"([^\"]*)\"$")
	// public void i_amd_Enter_Personal_Email_as(String personEmail) throws
	// Throwable {
	// page2.personalEmail.sendKeys(personEmail);
	// }
	//
	// @When("^I amd Enter Work Email as \"([^\"]*)\"$")
	// public void i_amd_Enter_Work_Email_as(String workEmail) throws Throwable {
	// page2.workEmail.sendKeys(workEmail);
	// }
	//
	// @Then("^I am Click Next Button and verify switch to Employment Information
	// Page$")
	// public void
	// i_am_Click_Next_Button_and_verify_switch_to_Employment_Information_Page()
	// throws Throwable {
	// page2.next.click();
	// Thread.sleep(5000);
	//
	// }
	//
	// @Then("^I am verified that empty Street Address input box shows Error$")
	// public void i_am_verified_that_empty_Street_Address_input_box_shows_Error()
	// throws Throwable {
	// WebElement error = driver
	// .findElement(By.xpath("//*[@name='Address_AddressLine1']/parent::*[@class='addOne
	// error1']"));
	// Assert.assertTrue(error.isDisplayed());
	//
	// }
	//
	// @Then("^I am verified that empty Street AddressTwo input box shows Error$")
	// public void
	// i_am_verified_that_empty_Street_AddressTwo_input_box_shows_Error() throws
	// Throwable {
	// WebElement error = driver
	// .findElement(By.xpath("//*[@name='Address_AddressLine2']/parent::*[@class='addOne
	// error1']"));
	// Assert.assertTrue(error.isDisplayed());
	// }

	/*
	 * From here starts CTL-41 --
	 */

	@Given("^I click select Title option and see content inside the titleOption$")
	public void i_click_select_Title_option_and_see_content_inside_the_titleOption() throws Throwable {

		String[] converted = { "QA", "Manager", "Developer", "Engineer", "Instructor", "Manager", "DevOps", "Analyst",
				"DB Admin" };
		Arrays.sort(converted);

		for (String elements : converted) {
			System.out.println(elements);
		}

		System.out.println("///////////////////");
		ArrayList<WebElement> no = (ArrayList<WebElement>) driver.findElements(By.xpath("//select[@name='Dropdown']"));

		for (WebElement element : no) {
			String text = element.getText();
			System.out.println(text);
		}

	}

	@Given("^I click select Department option and see content inside Department$")
	public void i_click_select_Department_option_and_see_content_inside_Department() throws Throwable {

	}

	@Given("^I click select Duration of Employment and see content inside it$")
	public void i_click_select_Duration_of_Employment_and_see_content_inside_it() throws Throwable {

	}

	@Given("^I click Purpose of Loan and see content inside it$")
	public void i_click_Purpose_of_Loan_and_see_content_inside_it() throws Throwable {

	}

	@Given("^I click Supervisor and see content inside it$")
	public void i_click_Supervisor_and_see_content_inside_it() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I click on next option$")
	public void i_click_on_next_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
